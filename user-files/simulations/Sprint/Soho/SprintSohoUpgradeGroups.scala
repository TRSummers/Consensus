import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import scala.util.Random
import akka.util._

object SprintSohoUpgradeGroups {

  val default_header = Map(
    "Content-Type" -> "application/json",
    "X-PAM-CLIENT-ID" -> "4bc2c1c7af8c461ca06f25b0a5066629",
    "X-PAM-CLIENT-SECRET" -> "9010247FC29246ccB16632FB6D321B39",
    "ESB-CARRIER-RESPONDER" -> "ON"
  )

  //'x-pam-sessionid': "1995111",

  val device = group("Device"){
    exec(http("")
      .post("/pam/v2/device")
      .body(ElFileBody("Sprint/Soho/Upgrade/1device.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("SPRINT").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("CC_PLANS_MISSING").notExists)
      .check(regex("\"sessionId\":\"(.+?)\",").saveAs("p_sessionId"))
      .check(regex("ESB_UNAVAILABLE").notExists))
  }

  val accountAccountLookup = group("Account") {
    exec(http("AccountLookup")
      .post("/pam/v2/account/accountLookup")
      .body(ElFileBody("Sprint/Soho/Upgrade/2accountLookup.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
  }

  val deviceTradein = group("Device") {
    exec(http("TradeIn")
      .post("/pam/v2/device/tradein")
      .body(ElFileBody("Sprint/Soho/Upgrade/3deviceTradeIn.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("TRADE_IN_ELIGIBLE").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
  }

  val customer = group("Customer") {
    exec(http("")
      .post("/pam/v2/customer")
      .body(ElFileBody("Sprint/Soho/Upgrade/4customer.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("APPROVED").exists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists)
    )
  }

  val supportAccesscode = group("Support"){
    exec(http("AccessCode")
      .post("/pam/v2/support/accesscode")
      .body(ElFileBody("Sprint/Soho/Upgrade/5accessCode.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("accessCode").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
  }

  val customerDevicePaymentPlansRequest = group("Customer / Device") {
    exec(http("PaymentPlansRequest")
      .post("/pam/v2/customer/device/paymentPlansRequest")
      .body(ElFileBody("Sprint/Soho/Upgrade/6paymentPlansRequest.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("productPlans").exists)
      .check(regex("null").notExists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists))
  }

  val catalogPlansRequest = group("Catalog") {
    exec(http("PlansRequest")
      .post("/pam/v2/catalog/plansRequest")
      .body(ElFileBody("Sprint/Soho/Upgrade/7plansRequest.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("plans").exists)
      .check(regex("null").notExists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists))
  }

  val addonFeaturesRequest = group("Catalog / Plans") {
    exec(http("AddonFeaturesRequest")
      .post("/pam/v2/catalog/plans/addonfeaturesrequest")
      .body(ElFileBody("Sprint/Soho/Upgrade/8addonFeaturesRequest.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("${carrier}").exists))
  }

  val orderPost = group("Order") {
    exec(http("Post")
      .post("/pam/v2/order")
      .body(ElFileBody("Sprint/Soho/Upgrade/9orderPost.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("\"sessionId\": \"(.+?)\",").saveAs("p_sessionid")))
  }

  val orderPut = group("Order") {
    exec(http("Put")
      .put("/pam/v2/order")
      .body(ElFileBody("Sprint/Soho/Upgrade/10orderPut.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("ESB_UNAVAILABLE").notExists))
  }

  val orderValidation = group("Account") {
    exec(http("Lookup")
      .put("/pam/v2/account/accountLookup")
      .body(ElFileBody("Sprint/Soho/Upgrade/11accountLookup.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("ESB_UNAVAILABLE").notExists))
  }

  val accountConnection = group("Account") {
    exec(http("Connection")
      .patch("/pam/v2/account/connection")
      .body(ElFileBody("Sprint/Soho/Upgrade/12accountConnection.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("true").exists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists)
    )
  }

  val orderValidation2 = group("Account") {
    exec(http("Lookup")
      .put("/pam/v2/account/accountLookup")
      .body(ElFileBody("Sprint/Soho/Upgrade/13accountLookup.json")).asJSON
      .headers(default_header)
      .check(status.is(200))
      .check(regex("ESB_UNAVAILABLE").notExists))
  }
}
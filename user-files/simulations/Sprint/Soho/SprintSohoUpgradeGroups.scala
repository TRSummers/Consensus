import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import scala.util.Random

import akka.util._

object SprintSohoUpgradeGroups {

  val PAMV1 = "/PAM/api/pam/v1/"
  val PAMV2 = "/PAM/api/pam/v2/"
  
  val accountLookupGroupTestData = Iterator.continually(
    Map(
      "phoneNumber" -> "2489779052",
      "accountNumber" -> "287637228",
      "carrier"     -> Random.shuffle(Array("SPRINT").toList).head
    )
  )
  val accountLookupGroup = group("Account Lookup") {
    exec(http("${carrier}" + "_accountLookup_api")
      .post(PAMV2 + "/account/accountlookup")
      .body(ElFileBody("account/accountlookup/${carrier}_accountLookup_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.account_headers_json)
      .check(status.is(200))
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("\"sessionId\":\"(.+?)\",").saveAs("p_accountlookup_sessionId"))
      .check(regex("ESB_UNAVAILABLE").notExists))
  }



  val AurusPayment = group("Aurus_payment") {
    exec(http("Aurus_transaction")
      .post(PAMV1 + "/payment")
      .body(ElFileBody("Aurus_transaction_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.default_header)
      .check(status.is(200))
      .check(regex("SUCCESS").exists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists))
  }




  val checkTradeInGroupUsers = Iterator.continually(
    Map(
      "carrier" -> "SPRINT",
      "userId" -> Random.alphanumeric.take(10).mkString
    )
  )
  val checkTradeInGroup = group("Check Trade In") {
    exec(http("${carrier}" + "_tradeIn")
      .post(PAMV1 + "/device/tradein")
      .body(ElFileBody("checkTradeIn_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.validateDeviceHeaders)
      .check(status.is(200))
      .check(regex("TRADE_IN_ELIGIBLE").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
  }




  val createUserTokenUsers = Iterator.continually(
    Map(
      "carrier" -> "SPRINT",
      "userId" -> Random.alphanumeric.take(10).mkString
    )
  )
  val createUserToken = group("Create User Token"){
    exec(http("${carrier}" + "_createUserToken")
      .post(PAMV2 + "/support/accesscode")
      .body(ElFileBody("createUserToken_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.validateDeviceHeaders)
      .check(status.is(200))
      .check(regex("accessCode").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
  }



  val SprintCreateCustomer = group("create customer") {
    exec(http("Sprint Create Customer")
      .post(PAMV2 + "/customer")
      .body(ElFileBody("customer/SprintCreateCustomer_transaction_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.creditCheck_headers)
      .check(status.is(200))
      .check(regex("APPROVED").exists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists)
    )
  }



  val creditCheckTestData = Iterator.continually(
    Map(
      "firstName" -> Random.shuffle(Array("James", "John", "Abraham", "George").toList).head,
      "lastName" -> Random.shuffle(Array("Madison", "Adams", "Lincoln", "Washington").toList).head,
      "nationalId" -> (110000000 + Random.nextInt(1000000)).toString
    )
  )
  val SprintcreditCheck = group("credit check") {
    exec(http("Sprint Credit Check")
      .post(PAMV2 + "/customer/creditcheck")
      .body(ElFileBody("creditcheck/SprintCreditCheck_transaction_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.creditCheck_headers)
      .check(status.is(200))
      .check(regex("APPROVED").exists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists)
    )
  }



  val numberPortPhoneNumbers = Iterator.continually(
    Map(
      "phoneNumber" -> "3113822050",
      "carrier"     -> Random.shuffle(Array("SPRINT").toList).head
    )
  )
  val numberPort = group("number port") {
    exec(http("${carrier}" + "_numberport_api")
      .post(PAMV1 + "/numberport")
      .body(ElFileBody("numberport_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.default_header)
      .check(status.is(200))
      .check(regex("${carrier}").exists)
      .check(regex("CC_PHONENUMBER_INVALID").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
  }



  val orderPostAndPutTestData = Iterator.continually(
    Map(
      "phoneNumber" -> "3034690344",
      "carrier"     -> Random.shuffle(Array("SPRINT").toList).head
    )
  )
  val orderPostAndPut = scenario("PAM Scenario - AccountLookup Request").repeat(100){
    exec(http("${carrier}_OrderPost_API")
      .post(PAMV1 + "/order")
      .body(ElFileBody("/PAM/Sprint_OrderPost.json")).asJSON
      .check(regex("sessionId\":\"(.+?)\",").saveAs("p_sessionid"))
      .headers(SprintSohoUpgradeHeaders.postputheaders)
      .check(status.is(200))
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
      .exec(http("SPRINT" + "_OrderPut_API")
        .put(PAMV1 + "order")
        .body(ElFileBody("/PAM/Sprint_OrderPut.json")).asJSON
        //.check(regex("sessionId\":(.+?)\",").saveAs("p_sessionid"))
        .headers(SprintSohoUpgradeHeaders.postputheaders)
        .check(status.is(200))
        .check(regex("PAM_INTERNAL_ERROR").notExists)
        .check(regex("ESB_UNAVAILABLE").notExists))
      .feed(orderPostAndPutTestData)
  }



  val order_post_call = group("Orders") {
    exec(http("sprint_create_order")
      .post(PAMV1 + "/order")
      .body(ElFileBody("sprint_createOrder_scenario1.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.default_header)
      .check(status.is(200))
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("\"sessionId\": \"(.+?)\",").saveAs("p_sessionid")))
  }



  val order_put_call = group("Orders") {
    exec(http("sprint_submit_order_${p_sessionid}")
      .put(PAMV1 + "/order")
      .body(ElFileBody("sprint_submitOrder_scenario1.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.default_header)
      .check(status.is(200))
      .check(regex("ESB_UNAVAILABLE").notExists))
  }



  val SubmitReturn = group("submit return") {
    exec(http("Sprint submit return")
      .patch(PAMV2 + "/account/connection")
      .body(ElFileBody("account/connection/SPRINT_submitReturn_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.submit_headers_json)
      .check(status.is(200))
      .check(regex("true").exists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists)
    )
  }



  val validateDeviceTestData = Array(
    Map(
      "carrier" -> "SPRINT",
      "device" -> f"${Random.nextInt(Integer.MAX_VALUE)}%10d"
    )
  ).random
  val validateDevice = group("Validate Device"){
    exec(http("${carrier}" + "_validateDevice")
      .post(PAMV2 + "/device")
      .body(ElFileBody("validateDevice_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.validateDeviceHeaders)
      .check(status.is(200))
      .check(regex("${carrier}").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("CC_PLANS_MISSING").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
  }


  val planAddonsTestData = Array(
    Map(
      "carrier" -> "SPRINT",
      "device" -> "99000273662027",
      "planCode" -> "LSD91AB",
      "sessionId" -> "4e399038-c735-4bfa-9419-2d57ce688df8"
    )
  ).random
  val planAddons = group("PAM Scenario - planAddons Request") {
    exec(http("${carrier}" + "_plan_addons_request")
      .post(PAMV1 + "/catalog/plans/addonfeaturesrequest")
      .body(ElFileBody("planAddonsRequest.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.planaddons_headers_json)
      .check(status.is(200))
      .check(regex("${carrier}").exists))
      .feed(planAddonsTestData)
  }



  val SprintpaymentPlans = group("retrieve Payment") {
    exec(http("Sprint paymentPlansRequest")
      .post(PAMV1 + "/customer/device/paymentPlansRequest")
      .body(ElFileBody("paymentplans/SprintretrievePaymentPrograms_transaction_request.json")).asJSON
      .headers(SprintSohoUpgradeHeaders.payment_headers)
      .check(status.is(200))
      .check(regex("productPlans").exists)
      .check(regex("null").notExists)
      .check(substring("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists)
      .check(regex("FAILURE").notExists)
      .check(regex("PAM_INTERNAL_ERROR").notExists)
      .check(regex("PAM_SESSIONID_NOT_FOUND").notExists))
  }
}
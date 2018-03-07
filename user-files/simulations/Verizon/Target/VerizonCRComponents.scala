package Verizon.Target

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import CarrierResponder.CRExpectationManager

object VerizonCRComponents {

  val expectation1 = "expectations/aurus/encryption"
  val expectation2 = "expectations/aurus/get-encryption-key"
  val expectation3 = "expectations/aurus/process-transaction"

  val expectation5 = "expectations/fedex/address-validation"

  val expectation23 = "expectations/squaretrade/commit-warranty"
  val expectation24 = "expectations/squaretrade/create-warranty"
  val expectation25 = "expectations/squaretrade/oauth"

  val expectation6 = "expectations/verizon/generate-installment"
  val expectation4 = "expectations/verizon/features-lookup"
  val expectation7 = "expectations/verizon/retrieve-credit-application"
  val expectation9 = "expectations/verizon/retrieve-customer-details"
  val expectation11 = "expectations/verizon/retrieve-installment-contract-approval-status"
  val expectation12 = "expectations/verizon/retrieve-existing-customer-installment-details"
  val expectation13 = "expectations/verizon/retrieve-installment-details-for-device"
  val expectation15 = "expectations/verizon/retrieve-mobile-usage"
  val expectation16 = "expectations/verizon/retrieve-npanxx"
  val expectation18 = "expectations/verizon/retrieve-order-details"
  val expectation20 = "expectations/verizon/retrieve-price-plans-new"
  val expectation21 = "expectations/verizon/retrieve-prorate"
  val expectation22 = "expectations/verizon/save-installment-details"
  val expectation26 = "expectations/verizon/submit-activation"
  val expectation27 = "expectations/verizon/submit-credit-application-new"
  val expectation28 = "expectations/verizon/submit-credit-application-upgrade"
  val expectation29 = "expectations/verizon/submit-installment-agreement-signature"
  val expectation30 = "expectations/verizon/submit-order"
  val expectation31 = "expectations/verizon/submit-receipt"
  val expectation32 = "expectations/verizon/submit-service-details"
  val expectation33 = "expectations/verizon/validate-port-eligibility"
  val expectation34 = "expectations/verizon/wireless-analysis-acocunt-details"

  val gatlingData = sys.env("GATLING_DATA")
  val expectationPath = Array(
    Map("expectationPath" -> expectation1, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation1 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation2, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation2 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation3, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation3 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation4, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation4 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation5, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation5 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation6, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation6 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation7, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation7 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation9, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation9 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation11, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation11 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation12, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation12 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation13, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation13 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation15, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation15 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation16, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation16 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation18, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation18 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation20, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation20 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation21, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation21 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation22, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation22 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation23, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation23 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation24, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation24 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation25, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation25 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation26, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation26 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation27, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation27 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation28, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation28 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation29, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation29 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation30, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation30 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation31, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation31 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation32, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation32 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation33, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation33 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation34, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation34 + "-payload.xml").mkString))
  )

  //the number of times this scenario is repeated is NOT related to the variable name of the highest numbered expectation
  //it can be different if expectations have been added/removed
  val SetUpExpectations = scenario("Verizon CR").repeat(29) {
    group("Verizon CR") {
      exec(feed(expectationPath))
        .exec(CRExpectationManager.createAndLoadExpectation)
    }
  }
}

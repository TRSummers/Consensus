import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object VerizonCarrierResponderComponents {

  val expectation1 = "expectations/verizon/new-activation/aurus-expectation"
  val expectation2 = "expectations/verizon/new-activation/aurus-get-encryption-key-expectation"
  val expectation3 = "expectations/verizon/new-activation/aurus-process-transaction-response-expectation"
  val expectation4 = "expectations/verizon/new-activation/features-lookup-expectation"
  val expectation5 = "expectations/verizon/new-activation/fedex-address-validation-expectation"
  val expectation6 = "expectations/verizon/new-activation/generate-installment-expectation"
  val expectation7 = "expectations/verizon/new-activation/retrieve-credit-application-expectation"
  val expectation8 = "expectations/verizon/new-activation/retrieve-customer-details-expectation"
  val expectation9 = "expectations/verizon/new-activation/retrieve-customer-details-upgrade-expectation"
  val expectation10 = "expectations/verizon/new-activation/retrieve-existing-customer-details-expectation"
  val expectation11 = "expectations/verizon/new-activation/retrieve-installment-contract-approval-status-2-expectation"
  val expectation12 = "expectations/verizon/new-activation/retrieve-installment-contract-approval-status-expectation"
  val expectation13 = "expectations/verizon/new-activation/retrieve-installment-details-for-device-2-expectation"
  val expectation14 = "expectations/verizon/new-activation/retrieve-installment-details-for-device-expectation"
  val expectation15 = "expectations/verizon/new-activation/retrieve-mobile-usage-expectation"
  val expectation16 = "expectations/verizon/new-activation/retrieve-npanxx-expectation"
  val expectation17 = "expectations/verizon/new-activation/retrieve-order-details-expectation"
  val expectation18 = "expectations/verizon/new-activation/retrieve-order-details-new-expectation"
  val expectation19 = "expectations/verizon/new-activation/retrieve-price-plans-expectation"
  val expectation20 = "expectations/verizon/new-activation/retrieve-price-plans-new-expectation"
  val expectation21 = "expectations/verizon/new-activation/retrieve-prorate-expectation"
  val expectation22 = "expectations/verizon/new-activation/save-installment-details-expectation"
  val expectation23 = "expectations/verizon/new-activation/square-commit-warranty-expectation"
  val expectation24 = "expectations/verizon/new-activation/square-create-warranty-expectation"
  val expectation25 = "expectations/verizon/new-activation/square-trade-oauth-expectation"
  val expectation26 = "expectations/verizon/new-activation/submit-activation-expectation"
  val expectation27 = "expectations/verizon/new-activation/submit-credit-application-new-expectation"
  val expectation28 = "expectations/verizon/new-activation/submit-credit-application-upgrade-expectation"
  val expectation29 = "expectations/verizon/new-activation/submit-installment-agreement-signature-expectation"
  val expectation30 = "expectations/verizon/new-activation/submit-order-expectation"
  val expectation31 = "expectations/verizon/new-activation/submit-receipt-expectation"
  val expectation32 = "expectations/verizon/new-activation/submit-service-details-expectation"
  val expectation33 = "expectations/verizon/new-activation/validate-port-eligibility-expectation"
  val expectation34 = "expectations/verizon/new-activation/wireless-analysis-acocunt-details-expectation"

  val gatlingData = sys.env("GATLING_DATA")
  val expectationPath = Array(
    Map("expectationPath" -> expectation1, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation1 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation2, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation2 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation3, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation3 + "-payload.json").mkString)),
    Map("expectationPath" -> expectation4, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation4 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation5, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation5 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation6, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation6 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation7, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation7 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation8, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation8 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation9, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation9 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation10, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation10 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation11, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation11 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation12, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation12 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation13, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation13 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation14, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation14 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation15, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation15 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation16, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation16 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation17, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation17 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation18, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation18 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation19, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation19 + "-payload.xml").mkString)),
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

  val VerizonCR = scenario("Verizon Upgrade Carrier Responder").repeat(34) {
    group("Verizon Upgrade Carrier Responder") {
      exec(feed(expectationPath))
        .exec(CRExpectationManager.createAndLoadExpectation)
    }
  }
}
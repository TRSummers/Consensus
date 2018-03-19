package Sprint.Target

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import CarrierResponder.CRExpectationManager

object SprintTargetCRComponents {

  val expectation1 = "expectations/sprint/target/check-loan-eligibility"
  val expectation2 = "expectations/sprint/target/create-lite-esa"
  val expectation3 = "expectations/sprint/target/create-loan-contract"
  val expectation4 = "expectations/sprint/target/query-account-loan-details"
  val expectation5 = "expectations/sprint/target/submit-order"
  val expectation6 = "expectations/sprint/target/validate-account-info"
  val expectation7 = "expectations/sprint/target/account-validation"
  val expectation8 = "expectations/sprint/target/credit-check"
  val expectation9 = "expectations/sprint/target/service-validation"
  val expectation10 = "expectations/sprint/target/activation"
  val expectation11 = "expectations/sprint/target/query-available-plans"
  val expectation12 = "expectations/sprint/target/query-available-options"


  val gatlingData = sys.env("GATLING_DATA")
  val expectationPath = Array(
    Map("expectationPath" -> expectation1, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation1 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation2, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation2 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation3, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation3 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation4, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation4 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation5, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation5 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation6, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation6 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation7, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation7 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation8, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation8 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation9, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation9 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation10, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation10 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation11, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation11 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation12, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation12 + "-payload.xml").mkString))
  )

  val SetUpExpectations = scenario("Sprint Target CR").repeat(12) {
    group("Sprint Target CR") {
      exec(feed(expectationPath))
        .exec(CRExpectationManager.createAndLoadExpectation)
    }
  }
}

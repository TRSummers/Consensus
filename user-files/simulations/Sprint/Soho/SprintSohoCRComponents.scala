package Sprint.Soho

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import CarrierResponder.CRExpectationManager

object SprintSohoCRComponents {

  val expectation1 = "expectations/sprint/soho/checkCreditAndInitiateOrder"
  val expectation2 = "expectations/sprint/soho/checkLoanEligibility1"
  val expectation3 = "expectations/sprint/soho/checkLoanEligibility2"
  val expectation4 = "expectations/sprint/soho/checkLoanEligibility3"
  val expectation5 = "expectations/sprint/soho/createLoanContract"
  val expectation6 = "expectations/sprint/soho/createUserToken"
  val expectation7 = "expectations/sprint/soho/deviceTradeIn"
  val expectation8 = "expectations/sprint/soho/processDeviceReturn"
  val expectation9 = "expectations/sprint/soho/queryAccountBasicInfo"
  val expectation10 = "expectations/sprint/soho/queryAccountLoanInfo"
  val expectation11 = "expectations/sprint/soho/queryAvailableOptions"
  val expectation12 = "expectations/sprint/soho/queryAvailablePlans"
  val expectation13 = "expectations/sprint/soho/queryPlansRequiredServices1"
  val expectation14 = "expectations/sprint/soho/queryPlansRequiredServices2"
  val expectation15 = "expectations/sprint/soho/queryPlansRequiredServices3"
  val expectation16 = "expectations/sprint/soho/queryPlansRequiredServices4"
  val expectation17 = "expectations/sprint/soho/queryPlansRequiredServices5"
  val expectation18 = "expectations/sprint/soho/queryPlansRequiredServices6"
  val expectation19 = "expectations/sprint/soho/submitOrder"
  val expectation20 = "expectations/sprint/soho/validateAccountInfo"
  val expectation21 = "expectations/sprint/soho/validateDevice"

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
    Map("expectationPath" -> expectation12, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation12 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation13, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation13 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation14, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation14 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation15, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation15 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation16, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation16 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation17, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation17 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation18, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation18 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation19, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation19 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation20, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation20 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation21, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation21 + "-payload.xml").mkString))
  )

  val SetUpExpectations = scenario("CR - Soho Sprint Setup").repeat(21) {
    group("CR Soho Sprint") {
      exec(feed(expectationPath))
        .exec(CRExpectationManager.createAndLoadExpectation)
    }
  }
}
import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object SprintSohoCRComponents {

  val expectation1 = "SohoP1GoLiveE2E/checkCreditAndInitiateOrder"
  val expectation2 = "SohoP1GoLiveE2E/checkLoanEligibility1"
//  val expectation3 = "SohoP1GoLiveE2E/checkLoanEligibility2"
//  val expectation4 = "SohoP1GoLiveE2E/checkLoanEligibility3"
//  val expectation5 = "SohoP1GoLiveE2E/checkLoanEligiblity4"
  val expectation6 = "SohoP1GoLiveE2E/createLoanContract1"
//  val expectation7 = "SohoP1GoLiveE2E/createLoanContract2"
  val expectation8 = "SohoP1GoLiveE2E/createUserToken"
  val expectation9 = "SohoP1GoLiveE2E/deviceTradeIn"
  val expectation10 = "SohoP1GoLiveE2E/processDeviceReturn"
  val expectation11 = "SohoP1GoLiveE2E/queryAccountBasicInfo1"
//  val expectation12 = "SohoP1GoLiveE2E/queryAccountBasicInfo2"
  val expectation13 = "SohoP1GoLiveE2E/queryAccountLoanInfo1"
//  val expectation14 = "SohoP1GoLiveE2E/queryAccountLoanInfo2"
  val expectation15 = "SohoP1GoLiveE2E/queryAvailableOptions"
  val expectation16 = "SohoP1GoLiveE2E/queryAvailablePlans"
  val expectation17 = "SohoP1GoLiveE2E/queryPlansRequiredServices1"
//  val expectation18 = "SohoP1GoLiveE2E/queryPlansRequiredServices2"
//  val expectation19 = "SohoP1GoLiveE2E/queryPlansRequiredServices3"
//  val expectation20 = "SohoP1GoLiveE2E/queryPlansRequiredServices4"
//  val expectation21 = "SohoP1GoLiveE2E/queryPlansRequiredServices5"
//  val expectation22 = "SohoP1GoLiveE2E/queryPlansRequiredServices6"
  val expectation23 = "SohoP1GoLiveE2E/submitOrder"
  val expectation24 = "SohoP1GoLiveE2E/validateAccountInfo"

  val gatlingData = sys.env("GATLING_DATA")
  val expectationPath = Array(
    Map("expectationPath" -> expectation1, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation1 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation2, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation2 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation3, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation3 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation4, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation4 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation5, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation5 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation6, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation6 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation7, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation7 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation8, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation8 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation9, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation9 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation10, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation10 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation11, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation11 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation12, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation12 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation13, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation13 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation14, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation14 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation15, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation15 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation16, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation16 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation17, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation17 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation18, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation18 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation19, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation19 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation20, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation20 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation21, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation21 + "-payload.xml").mkString)),
//    Map("expectationPath" -> expectation22, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation22 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation23, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation23 + "-payload.xml").mkString)),
    Map("expectationPath" -> expectation24, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation24 + "-payload.xml").mkString))
  )

  val SetUpExpectations = scenario("Sprint CR").repeat(13) {
    group("Sprint CR") {
      exec(feed(expectationPath))
        .exec(CRExpectationManager.createAndLoadExpectation)
    }
  }
}
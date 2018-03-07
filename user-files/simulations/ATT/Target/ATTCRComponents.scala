package ATT.Target

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import CarrierResponder.CRExpectationManager

object ATTCRComponents {

  val expectation1 = "expectations/att/add-sales-transaction-details"
  val expectation2 = "expectations/att/inquire-account-profile"
  val expectation3 = "expectations/att/inquire-additional-offerings"
  val expectation4 = "expectations/att/inquire-available-devices"
  val expectation5 = "expectations/att/inquire-device-details"
  val expectation6 = "expectations/att/inquire-incompatible-offerings"
  val expectation7 = "expectations/att/inquire-price-plans"
  val expectation8 = "expectations/att/inquire-subscriber-billing-agreement"
  val expectation9 = "expectations/att/post-transaction"
  val expectation10 = "expectations/att/reserve-contract-identifier"
  val expectation11 = "expectations/att/upgrade-equipment"
  val expectation12 = "expectations/att/inquire-donor-subscribers"

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

  //the number of times this scenario is repeated is NOT related to the variable name of the highest numbered expectation
  //it can be different if expectations have been added/removed
  val SetUpExpectations = scenario("ATT CR").repeat(12) {
    group("ATT CR") {
      exec(feed(expectationPath))
        .exec(CRExpectationManager.createAndLoadExpectation)
    }
  }
}

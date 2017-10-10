

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class SprintUpgradeE2ESimulation extends Simulation {

  val httpProtocol = http
    .baseURL(Common.uri_poa_no_port)
    .disableAutoReferer
    .acceptHeader("application/json, text/javascript, */*; q=0.01")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

  val expectation1 = "expectations/sprint/upgrade/loan/insurance/check-loan-eligibility"
  val expectation2 = "expectations/sprint/upgrade/loan/insurance/create-lite-esa"
  val expectation3 = "expectations/sprint/upgrade/loan/insurance/create-loan-contract"
  val expectation4 = "expectations/sprint/upgrade/loan/insurance/query-account-loan-details"
  val expectation5 = "expectations/sprint/upgrade/loan/insurance/submit-order"
  val expectation6 = "expectations/sprint/upgrade/loan/insurance/validate-account-info"
  val expectation7 = "expectations/sprint/upgrade/loan/insurance/account-validation"
  val expectation8 = "expectations/sprint/upgrade/loan/insurance/credit-check"
  val expectation9 = "expectations/sprint/upgrade/loan/insurance/service-validation"
  val expectation10 = "expectations/sprint/upgrade/loan/insurance/activation"

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
    Map("expectationPath" -> expectation10, "payload" -> CRExpectationManager.escapePayload(Source.fromFile(gatlingData + "/" + expectation10 + "-payload.xml").mkString))
  ).queue

  val SprintUpgradeE2ECR = scenario("SPR UPG CR").repeat(1) {
    exec(
      //      CRExpectationManager.removeExpectations
      //    )
      //      .exec(
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation,
      feed(expectationPath),
      CRExpectationManager.createAndLoadExpectation
    )

  }

  val SprintUpgradeE2EFlow = scenario("SPR UPG Flow").repeat(4){
    exec(
      Common.LoginToRetail,                                        Common.CommonPause,
      Common.RetailToChoosePathModule,                             Common.CommonPause,
      Common.Upgrade,                                              Common.CommonPause,
      SprintUpgradeE2EPages.toUpgradeEligbilityCheck,              Common.CommonPause,
      SprintUpgradeE2EPages.toScanDevice,                          Common.CommonPause,
      SprintUpgradeE2EPages.toPaymentOptions,                      Common.CommonPause,
      SprintUpgradeE2EPages.toCreditCheck,                         Common.CommonPause,
      SprintUpgradeE2EPages.toCreditCheckResult,                   Common.CommonPause,
      SprintUpgradeE2EPages.toInstallmentDetails,                  Common.CommonPause,
      SprintUpgradeE2EPages.toPlans,                               Common.CommonPause,
      SprintUpgradeE2EPages.toCart,                                Common.CommonPause,
      SprintUpgradeE2EPages.toFeatures,                            Common.CommonPause,
      SprintUpgradeE2EPages.toDeviceOptions,                       Common.CommonPause,
      SprintUpgradeE2EPages.toOrderConfirm,                        Common.CommonPause,
      SprintUpgradeE2EPages.toTermsAndConditions,                  Common.CommonPause,
      SprintUpgradeE2EPages.toMSS,                                 Common.CommonPause,
      SprintUpgradeE2EPages.toReceiptScan,                         Common.CommonPause,
      SprintUpgradeE2EPages.toActivationScan,                      Common.CommonPause,
      SprintUpgradeE2EPages.toDeviceInstallmentContract,           Common.CommonPause,
      SprintUpgradeE2EPages.toDeviceFinancingInstallmentContract,  Common.CommonPause,
      SprintUpgradeE2EPages.toActivationCompletePage,              Common.CommonPause,
      Common.NewGuest,                                             Common.CommonPause,
      Common.Logout
    )
  }

//  val SprintUpgradeE2E = scenario("Sprint Upgrade E2E").repeat(4) {
//    exec(Setup)
//      .
//        exec(Scenario)
//  }
  setUp(SprintUpgradeE2EFlow.inject(rampUsers(100) over (200 seconds)).protocols(httpProtocol))
}
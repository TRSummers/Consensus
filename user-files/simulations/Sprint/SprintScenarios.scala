import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object SprintScenarios {

  val Upgrade = scenario("Sprint Upgrade").repeat(SimParams.inum) {
    group("SPT UPG") {
      exec(
        feed(Common.CreditCheckData),
                Common.LoginToRetail,              Common.CommonPause,
                Common.RetailToChoosePathModule,   Common.CommonPause,
                SPRLegacy3.Upgrade,Common.CommonPause,
              SPRLegacy3.SelectSprint,Common.CommonPause,
              SPRLegacy3.UEC,Common.CommonPause,
              SPRLegacy3.UECResults,Common.CommonPause,
              SPRLegacy3.Scan,Common.CommonPause,
              SPRLegacy3.PO,Common.CommonPause,
              SprintFlow.CC,Common.CommonPause,
              SPRLegacy4.CCResult,Common.CommonPause,
              SprintFlow.IDP2Plan,Common.CommonPause,
              SPRLegacy4.Plan,Common.CommonPause,
              SPRLegacy4.Cart,Common.CommonPause,
              SPRLegacy4.Features,Common.CommonPause,
              SPRLegacy4.ProtectionPlan,Common.CommonPause,
              SPRLegacy4.OrderReview,Common.CommonPause,
              SPRLegacy4.TC,Common.CommonPause,
              SPRLegacy4.PMSS,Common.CommonPause,
              SPRLegacy4.PV,Common.CommonPause,
              SPRLegacy4.VACT,Common.CommonPause,
              SPRLegacy4.DevFin,Common.CommonPause
      /*  Common.LoginToRetail, Common.CommonPause,
        Common.RetailToChoosePathModule, Common.CommonPause,
        SprintUpgradePages.ChoosePathToUpgradeEligibilityCheck, Common.CommonPause,
        SprintUpgradePages.UpgradeEligibilityCheckToScanDevice, Common.CommonPause,
        SprintUpgradePages.ScanDeviceToPaymentOptions, Common.CommonPause,
        SprintUpgradePages.PaymentOptionsToCreditCheck, Common.CommonPause,
        SprintUpgradePages.CreditCheckToCreditCheckResult, Common.CommonPause,
        SprintUpgradePages.CreditCheckResultToInstallmentDetails, Common.CommonPause,
        SprintUpgradePages.InstallmentDetailsToPlans, Common.CommonPause,
        SprintUpgradePages.PlansToCart, Common.CommonPause,
        SprintUpgradePages.CartToPlanFeatures, Common.CommonPause,
        SprintUpgradePages.PlanFeaturesToDeviceOptions, Common.CommonPause,
        SprintUpgradePages.DeviceOptionsToOrderConfirm, Common.CommonPause,
        SprintUpgradePages.OrderConfirmToTermsAndConditions, Common.CommonPause,
        SprintUpgradePages.TermsAndConditionsToMSS, Common.CommonPause,
        SprintUpgradePages.MSSToScanReceipt, Common.CommonPause,
        SprintUpgradePages.ScanReceiptToActivationScan, Common.CommonPause,
        SprintUpgradePages.ActivationScanToWirelessCustomerAgreement_LEGACY, Common.CommonPause,
        SprintUpgradePages.WirelessCustomerAgreementToDeviceFinancingInstallmentContract_LEGACY, Common.CommonPause,
        SprintUpgradePages.DeviceFinancingInstallmentContractToOrderSummary_LEGACY, Common.CommonPause*/
        //        SprintUpgradePages.TabulateResults, Common.CommonPause,
        //    Common.NewGuest, Common.CommonPause,
        //        Common.Logout
      )
    }
  }
}

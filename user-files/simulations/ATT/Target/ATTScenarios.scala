package ATT.Target

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import ATT.Target.Upgrade.ATTUpgradePages
import CarrierCommon.Target.Common
import Jenkins.SimParams
import CarrierCommon.Target.Common

object ATTScenarios {

  val Upgrade = scenario("Target ATT Upgrade").repeat(SimParams.inum) {
    group("ATT UPG") {
      exec(
        feed(Common.CreditCheckData),

        Common.LoginToRetail, Common.CommonPause,
        Common.RetailToChoosePathModule, Common.CommonPause,

        ATTUpgradePages.ChoosePathToUpgradeEligibilityCheck, Common.CommonPause,
        ATTUpgradePages.UpgradeEligibilityCheckToL_UpgradeEligibilityCheck, Common.CommonPause,
        ATTUpgradePages.L_UpgradeEligibilityCheckToEligibilityResults, Common.CommonPause,
        ATTUpgradePages.EligibilityResultsToScanDevice, Common.CommonPause,
        ATTUpgradePages.ScanDeviceToPaymentOptions, Common.CommonPause,
        ATTUpgradePages.PaymentOptionsToInstallmentDetails, Common.CommonPause,
        ATTUpgradePages.InstallmentDetailsToPlans, Common.CommonPause,
        ATTUpgradePages.PlansToCart, Common.CommonPause,
        ATTUpgradePages.CartToPlanFeatures, Common.CommonPause,
        ATTUpgradePages.PlanFeaturesToDeviceOptions, Common.CommonPause,
        ATTUpgradePages.DeviceOptionsToIdenityCheck, Common.CommonPause,
        ATTUpgradePages.IdenityCheckToOrderConfirm, Common.CommonPause,
        ATTUpgradePages.OrderConfirmToTermsAndConditions, Common.CommonPause,
        ATTUpgradePages.TermsAndConditionsToMSS, Common.CommonPause,
        ATTUpgradePages.MSSToScanReceipt, Common.CommonPause,
        ATTUpgradePages.ScanReceiptToActivationScan, Common.CommonPause,
        ATTUpgradePages.ActivationScanToFinanceContract, Common.CommonPause,
        ATTUpgradePages.DeviceFinancingInstallmentContractToOrderSummary, Common.CommonPause,
        ATTUpgradePages.TabulateResults, Common.CommonPause

        //    Common.NewGuest, Common.CommonPause,
//        Common.Logout
      )
    }
  }
}

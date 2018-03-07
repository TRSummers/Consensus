package Sprint.Target

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Sprint.Target.Upgrade.SprintTargetUpgradeGroups
import Jenkins.SimParams
import CarrierCommon.Target.Common

object SprintTargetScenarios {

  val Upgrade = scenario("Sprint Upgrade").repeat(SimParams.inum) {
    group("SPT UPG") {
      exec(
        feed(Common.CreditCheckData),
        Common.LoginToRetail, Common.CommonPause,
        Common.RetailToChoosePathModule, Common.CommonPause,
        SprintTargetUpgradeGroups.ChoosePathToUpgradeEligibilityCheck, Common.CommonPause,
        SprintTargetUpgradeGroups.UpgradeEligibilityCheckToScanDevice, Common.CommonPause,
        SprintTargetUpgradeGroups.ScanDeviceToPaymentOptions, Common.CommonPause,
        SprintTargetUpgradeGroups.PaymentOptionsToCreditCheck, Common.CommonPause,
        SprintTargetUpgradeGroups.CreditCheckToCreditCheckResult, Common.CommonPause,
        SprintTargetUpgradeGroups.CreditCheckResultToInstallmentDetails, Common.CommonPause,
        SprintTargetUpgradeGroups.InstallmentDetailsToPlans, Common.CommonPause,
        SprintTargetUpgradeGroups.PlansToCart, Common.CommonPause,
        SprintTargetUpgradeGroups.CartToPlanFeatures, Common.CommonPause,
        SprintTargetUpgradeGroups.PlanFeaturesToDeviceOptions, Common.CommonPause,
        SprintTargetUpgradeGroups.DeviceOptionsToOrderConfirm, Common.CommonPause,
        SprintTargetUpgradeGroups.OrderConfirmToTermsAndConditions, Common.CommonPause,
        SprintTargetUpgradeGroups.TermsAndConditionsToMSS, Common.CommonPause,
        SprintTargetUpgradeGroups.MSSToScanReceipt, Common.CommonPause,
        SprintTargetUpgradeGroups.ScanReceiptToActivationScan, Common.CommonPause,
        SprintTargetUpgradeGroups.ActivationScanToWirelessCustomerAgreement_LEGACY, Common.CommonPause,
        SprintTargetUpgradeGroups.WirelessCustomerAgreementToDeviceFinancingInstallmentContract_LEGACY, Common.CommonPause,
        SprintTargetUpgradeGroups.DeviceFinancingInstallmentContractToOrderSummary_LEGACY, Common.CommonPause,
        SprintTargetUpgradeGroups.TabulateResults, Common.CommonPause,
        Common.NewGuest, Common.CommonPause,
        Common.Logout
      )
    }
  }
}

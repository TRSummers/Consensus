import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object VerizonScenarios {

  val NewActivation = scenario("Verizon New").repeat(SimParams.inum) {

    group("VZN NEW") {
      exec(
        feed(Common.VZWCarrierTestData),
        feed(Common.Lname),
        feed(Common.SSN1), feed(Common.SSN2), feed(Common.SSN3), feed(Common.SSN4),
        Common.LoginToRetail, Common.CommonPause,
        Common.RetailToChoosePathModule, Common.CommonPause,
        Common.ChoosePathToScan, Common.CommonPause,
        VerizonNewActivationPages.ScanDeviceToPaymentOptions, Common.CommonPause,
        Common.PaymentOptionsToCartWheel, Common.CommonPause,
        Common.CartwheelToCreditCheck, Common.CommonPause,
        VerizonNewActivationPages.CreditCheckToCreditCheckResult, Common.CommonPause,
        VerizonNewActivationPages.CreditCheckResultToInstallmentDetails, Common.CommonPause,
        VerizonNewActivationPages.InstallmentDetailsToPlans, Common.CommonPause,
        VerizonNewActivationPages.PlansToCart, Common.CommonPause,
        VerizonNewActivationPages.CartToPlanFeatures, Common.CommonPause,
        VerizonNewActivationPages.PlanFeaturesToProtectionPlans, Common.CommonPause,
        VerizonNewActivationPages.L_ProtectionPlansToL_NumberPort, Common.CommonPause,
        VerizonNewActivationPages.L_NumberPortToL_OrderConfirm, Common.CommonPause,
        VerizonNewActivationPages.L_OrderConfirmToL_TermsAndConditions, Common.CommonPause,
        VerizonNewActivationPages.L_TermsandConditionsToL_SwipeCard, Common.CommonPause,
        VerizonNewActivationPages.L_SwipeCardToL_MultiScanSheet, Common.CommonPause,
        VerizonNewActivationPages.L_MultiScanSheetToL_ScanReceipt, Common.CommonPause,
        VerizonNewActivationPages.L_ScanReceiptToL_ActivationScan, Common.CommonPause,
        VerizonNewActivationPages.L_ActivationScanToL_WirelessCustomerAgreement, Common.CommonPause,
        VerizonNewActivationPages.L_WirelessCustomerAgreementToL_DeviceFinancingInstallmentContract, Common.CommonPause,
        VerizonNewActivationPages.L_DeviceFinancingInstallmentContractToL_OrderSummary, Common.CommonPause,
        VerizonNewActivationPages.TabulateResults, Common.CommonPause,
        //    Common.NewGuest,    Common.CommonPause,
        Common.Logout
      )
    }
  }
}

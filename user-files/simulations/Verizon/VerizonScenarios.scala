import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object VerizonScenarios {

  val NewActivation = scenario("Verizon New").repeat(SimParams.inum) {

    group("Verizon New") {
      exec(
        feed(Common.VZWCarrierTestData),
        feed(Common.Lname),
        feed(Common.SSN1), feed(Common.SSN2), feed(Common.SSN3), feed(Common.SSN4),
        Common.LoginToRetail,     Common.CommonPause,
        Common.RetailToChoosePathModule,        Common.CommonPause,
        Common.ChoosePathToScan,        Common.CommonPause,
        VerizonNewActivationPages.VZWScanToPaymentOptions,  Common.CommonPause,
        Common.PaymentOptionsToCartWheel,        Common.CommonPause,
        Common.CartwheelToCreditCheck, Common.CommonPause,
        VerizonNewActivationPages.CreditCheck,       Common.CommonPause,
        VerizonNewActivationPages.CC2IDP,       Common.CommonPause,
        VerizonNewActivationPages.IDP2PlanInCC,   Common.CommonPause,
        VerizonNewActivationPages.SelectPlan, Common.CommonPause,
        VerizonNewActivationPages.YourCart,   Common.CommonPause,
        VerizonNewActivationPages.SelectPlanFeaturesInCC,     Common.CommonPause,
        VerizonNewActivationPages.SelectProtectionPlanInCC,   Common.CommonPause,
        VerizonNewActivationPages.NumberPort,             Common.CommonPause,
        VerizonNewActivationPages.OrderReviewandConfirm,  Common.CommonPause,
        VerizonNewActivationPages.TermsandConditions,     Common.CommonPause,
        //            VerizonNewActivationPages.SwipeCard,              Common.CommonPause,
        VerizonNewActivationPages.PrintMobileScanSheet,   Common.CommonPause,
        VerizonNewActivationPages.ScanReceipt,            Common.CommonPause,
        VerizonNewActivationPages.EnterIMEIandSIM,        Common.CommonPause,
        VerizonNewActivationPages.WirelessCustomerAgreement,  Common.CommonPause,
        VerizonNewActivationPages.DeviceFinancingInstallmentContract,   Common.CommonPause,
        Common.Results, Common.CommonPause,
        //    Common.NewGuest,    Common.CommonPause,
        Common.Logout
      )
    }
  }
}
package Sprint.Soho

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Sprint.Soho.Upgrade.SprintSohoUpgradeGroups
import Jenkins.SimParams

object SprintSohoScenarios{

  val ValidateDeviceToAccountLookupPause = pause(4, 6)
  val AccountLookupToDeviceTradeInPause = pause(9, 11)
  val DeviceTradeInToCreateCustomerPause = pause(4, 6)
  val CreateCustomerToPaymentPlansPause = pause(4, 6)
  val PaymentPlansToPlansPause = pause(4, 6)
  val PlansToOrderPostPause = pause(55, 65)
  val OrderPostToOrderPutPause = pause(55, 65)
  val OrderPutToOrderValidationPause = pause(4, 6)

  val Upgrade = scenario("Soho Sprint Upgrade").repeat(SimParams.inum){

    group("Soho / UPG"){
      exec(
        SprintSohoUpgradeGroups.device,
        ValidateDeviceToAccountLookupPause,
        SprintSohoUpgradeGroups.accountAccountLookup,
        AccountLookupToDeviceTradeInPause,
        SprintSohoUpgradeGroups.deviceTradein,
        DeviceTradeInToCreateCustomerPause,
        SprintSohoUpgradeGroups.customer,
        CreateCustomerToPaymentPlansPause,
        SprintSohoUpgradeGroups.customerDevicePaymentPlansRequest,
        PaymentPlansToPlansPause,
        SprintSohoUpgradeGroups.catalogPlansRequest,
        PlansToOrderPostPause,
        SprintSohoUpgradeGroups.orderPost,
        OrderPostToOrderPutPause,
        SprintSohoUpgradeGroups.orderPut,
        OrderPutToOrderValidationPause,
        SprintSohoUpgradeGroups.orderValidation
      )
    }
  }
}
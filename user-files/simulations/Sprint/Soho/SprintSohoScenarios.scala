package Sprint.Soho

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Sprint.Soho.Upgrade.SprintSohoUpgradeGroups
import Jenkins.SimParams

object SprintSohoScenarios{

  val BetweenOrdersPause = pause(850, 900)

  val ValidateDeviceToAccountLookupPause = pause(2, 3)
  val AccountLookupToDeviceTradeInPause = pause(2, 3)
  val DeviceTradeInToCreateCustomerPause = pause(2, 3)
  val CreateCustomerToPaymentPlansPause = pause(2, 3)
  val PaymentPlansToPlansPause = pause(2, 3)
  val PlansToOrderPostPause = pause(2, 3)
  val OrderPostToOrderPutPause = pause(2, 3)
  val OrderPutToOrderValidationPause = pause(2, 3)

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
        SprintSohoUpgradeGroups.orderValidation,
        BetweenOrdersPause
      )
    }
  }
}
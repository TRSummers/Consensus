import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object SprintSohoScenarios{

  val Upgrade = scenario("SoHo UPG E2E").repeat(SimParams.inum){

    group("SoHo UPG E2E"){
      exec(
        feed(SprintSohoUpgradeGroups.createUserTokenUsers),
        feed(SprintSohoUpgradeGroups.validateDeviceTestData),
        feed(SprintSohoUpgradeGroups.accountLookupGroupTestData),

        SprintSohoUpgradeGroups.accountLookupGroup,
        SprintSohoUpgradeGroups.SprintCreateCustomer,
        SprintSohoUpgradeGroups.validateDevice,
        SprintSohoUpgradeGroups.createUserToken,
        SprintSohoUpgradeGroups.SubmitReturn,

        feed(SprintSohoUpgradeGroups.checkTradeInGroupUsers),
        feed(SprintSohoUpgradeGroups.numberPortPhoneNumbers),

        SprintSohoUpgradeGroups.checkTradeInGroup,
        SprintSohoUpgradeGroups.SprintpaymentPlans,
        SprintSohoUpgradeGroups.numberPort,
        SprintSohoUpgradeGroups.order_post_call,
        SprintSohoUpgradeGroups.order_put_call
      )
    }
  }
}
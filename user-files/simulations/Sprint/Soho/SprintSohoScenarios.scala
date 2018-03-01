import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object SprintSohoScenarios{

  val Upgrade = scenario("SoHo UPG").repeat(SimParams.inum){

    group("SoHo / UPG"){
      exec(
        SprintSohoUpgradeGroups.device,
        SprintSohoUpgradeGroups.accountAccountLookup,
        SprintSohoUpgradeGroups.deviceTradein,
        SprintSohoUpgradeGroups.customer,
        SprintSohoUpgradeGroups.supportAccesscode,
        SprintSohoUpgradeGroups.customerDevicePaymentPlansRequest,
        SprintSohoUpgradeGroups.catalogPlansRequest,
        SprintSohoUpgradeGroups.addonFeaturesRequest,
        SprintSohoUpgradeGroups.orderPost,
        SprintSohoUpgradeGroups.orderPut,
        SprintSohoUpgradeGroups.orderValidation,
        SprintSohoUpgradeGroups.accountConnection,
        SprintSohoUpgradeGroups.orderValidation2
      )
    }
  }
}
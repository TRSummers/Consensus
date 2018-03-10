package Sprint.Soho

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Sprint.Soho.Upgrade.SprintSohoUpgradeGroups
import Jenkins.SimParams

object SprintSohoScenarios{

  val SohoPause=pause(1,2)

  val Upgrade = scenario("SoHo UPG").repeat(SimParams.inum){

    group("SoHo / UPG"){
      exec(
        SprintSohoUpgradeGroups.device, SohoPause,
        SprintSohoUpgradeGroups.accountAccountLookup, SohoPause,
        SprintSohoUpgradeGroups.deviceTradein, SohoPause,
        SprintSohoUpgradeGroups.customer, SohoPause,
        SprintSohoUpgradeGroups.supportAccesscode, SohoPause,
        SprintSohoUpgradeGroups.customerDevicePaymentPlansRequest, SohoPause,
        SprintSohoUpgradeGroups.catalogPlansRequest, SohoPause,
//        SprintSohoUpgradeGroups.addonFeaturesRequest, SohoPause,
        SprintSohoUpgradeGroups.orderPost, SohoPause,
        SprintSohoUpgradeGroups.orderPut, SohoPause,
        SprintSohoUpgradeGroups.orderValidation, SohoPause,
        SprintSohoUpgradeGroups.accountConnection, SohoPause,
        SprintSohoUpgradeGroups.orderValidation2
      )
    }
  }
}
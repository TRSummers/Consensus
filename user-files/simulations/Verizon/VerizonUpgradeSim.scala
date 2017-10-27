import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class VerizonUpgradeSim extends Simulation {

  setUp(VerizonScenarios.Upgrade.inject(atOnceUsers(SimParams.VUG)).protocols(SimParams.httpProtocol))

}

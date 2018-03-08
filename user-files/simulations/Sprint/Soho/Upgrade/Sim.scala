package Sprint.Soho.Upgrade

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Sprint.Soho.SprintSohoScenarios
import Jenkins.SimParams

class Sim extends Simulation {

  setUp(SprintSohoScenarios.Upgrade.inject(atOnceUsers(SimParams.SOHOSUG)).protocols(SimParams.SohoHttpProtocol))

}

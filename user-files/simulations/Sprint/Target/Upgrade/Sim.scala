package Sprint.Target.Upgrade

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Sprint.Target.SprintTargetScenarios
import Jenkins.SimParams

class Sim extends Simulation {

  setUp(SprintTargetScenarios.Upgrade.inject(atOnceUsers(SimParams.TGTSUG)).protocols(SimParams.httpProtocol))

}

package ATT.Target.Upgrade

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import ATT.Target.ATTScenarios
import Jenkins.SimParams

class ATTUpgrade extends Simulation {

  setUp(ATTScenarios.Upgrade.inject(atOnceUsers(SimParams.TGTTUG)).protocols(SimParams.httpProtocol))

}

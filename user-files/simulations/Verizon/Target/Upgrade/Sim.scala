package Verizon.Target.Upgrade

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Verizon.Target.VerizonScenarios
import Jenkins.SimParams

class Sim extends Simulation {

  setUp(VerizonScenarios.Upgrade.inject(atOnceUsers(SimParams.TGTVUG)).protocols(SimParams.httpProtocol))

}

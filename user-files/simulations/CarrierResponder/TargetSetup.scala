package CarrierResponder

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Verizon.Target.VerizonCRComponents
import ATT.Target.ATTCRComponents
import Sprint.Target.SprintTargetCRComponents
import Jenkins.SimParams

class TargetSetup extends Simulation {

  setUp(
    CRExpectationManager.CleanExpectations.inject(atOnceUsers(1)).protocols(SimParams.httpProtocol),
    VerizonCRComponents.SetUpExpectations.inject(nothingFor(15 seconds), atOnceUsers(1)).protocols(SimParams.httpProtocol),
    ATTCRComponents.SetUpExpectations.inject(nothingFor(45 seconds), atOnceUsers(1)).protocols(SimParams.httpProtocol),
    SprintTargetCRComponents.SetUpExpectations.inject(nothingFor(75 seconds), atOnceUsers(1)).protocols(SimParams.httpProtocol)
  )
}

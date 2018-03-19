package Jenkins

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import Verizon.Target.VerizonScenarios
import ATT.Target.ATTScenarios
import Sprint.Target.SprintTargetScenarios
import Sprint.Soho.SprintSohoScenarios
import CarrierResponder.CRExpectationManager
import Verizon.Target.VerizonCRComponents
import ATT.Target.ATTCRComponents
import Sprint.Target.SprintTargetCRComponents
import Sprint.Soho.SprintSohoCRComponents

class ModularSetup extends Simulation {
	setUp(

    // CLEAN CR
    CRExpectationManager.CleanExpectations.inject(atOnceUsers(SimParams.TGTCR + SimParams.SOHOCR)).protocols(SimParams.httpProtocol),

    // TARGET CR
    VerizonCRComponents.SetUpExpectations.inject(nothingFor(15 seconds), atOnceUsers(SimParams.TGTCR)).protocols(SimParams.httpProtocol),
    ATTCRComponents.SetUpExpectations.inject(nothingFor(45 seconds), atOnceUsers(SimParams.TGTCR)).protocols(SimParams.httpProtocol),
    SprintTargetCRComponents.SetUpExpectations.inject(nothingFor(75 seconds), atOnceUsers(SimParams.TGTCR)).protocols(SimParams.httpProtocol),

    // SOHO CR
    SprintSohoCRComponents.SetUpExpectations.inject(nothingFor(15 seconds), atOnceUsers(SimParams.SOHOCR)).protocols(SimParams.SohoHttpProtocol)
	)
}



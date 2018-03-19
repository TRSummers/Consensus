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

class ModularTest extends Simulation {
	setUp(

    // TARGET CR
    CRExpectationManager.CleanExpectations.inject(atOnceUsers(1)).protocols(SimParams.httpProtocol),
    VerizonCRComponents.SetUpExpectations.inject(nothingFor(15 seconds), atOnceUsers(SimParams.TGTCR)).protocols(SimParams.httpProtocol),
    ATTCRComponents.SetUpExpectations.inject(nothingFor(45 seconds), atOnceUsers(SimParams.TGTCR)).protocols(SimParams.httpProtocol),
    SprintTargetCRComponents.SetUpExpectations.inject(nothingFor(75 seconds), atOnceUsers(SimParams.TGTCR)).protocols(SimParams.httpProtocol),

    // TARGET
		SprintTargetScenarios.Upgrade.inject(rampUsers(SimParams.TGTSUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		VerizonScenarios.NewActivation.inject(rampUsers(SimParams.TGTVNA) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		VerizonScenarios.Upgrade.inject(rampUsers(SimParams.TGTVUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		ATTScenarios.Upgrade.inject(rampUsers(SimParams.TGTTUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),

    // SOHO CR
    CRExpectationManager.CleanExpectations.inject(atOnceUsers(SimParams.SOHOCR)).protocols(SimParams.SohoHttpProtocol),
    SprintSohoCRComponents.SetUpExpectations.inject(nothingFor(15 seconds), atOnceUsers(SimParams.SOHOCR)).protocols(SimParams.SohoHttpProtocol),

    // SOHO
    SprintSohoScenarios.Upgrade.inject(rampUsers(SimParams.SOHOSUG) over (SimParams.rampup seconds)).protocols(SimParams.SohoHttpProtocol)
	)
}



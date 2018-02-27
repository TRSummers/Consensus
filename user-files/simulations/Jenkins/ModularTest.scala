import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class ModularTest extends Simulation {
	setUp(
		SprintTargetScenarios.Upgrade.inject(rampUsers(SimParams.TGTSUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		VerizonScenarios.NewActivation.inject(rampUsers(SimParams.TGTVNA) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		VerizonScenarios.Upgrade.inject(rampUsers(SimParams.TGTVUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		ATTScenarios.Upgrade.inject(rampUsers(SimParams.TGTTUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
    SprintSohoScenarios.Upgrade.inject(rampUsers(SimParams.SOHOSUG) over (SimParams.rampup seconds)).protocols(SimParams.SohoHttpProtocol)
	)
}



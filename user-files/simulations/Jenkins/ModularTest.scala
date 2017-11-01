import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class ModularTest extends Simulation {

	setUp(
		SprintScenarios.Upgrade.inject(rampUsers(SimParams.SUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		VerizonScenarios.NewActivation.inject(rampUsers(SimParams.VNA) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		VerizonScenarios.Upgrade.inject(rampUsers(SimParams.VUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol)),
		ATTScenarios.Upgrade.inject(rampUsers(SimParams.TUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol)
}

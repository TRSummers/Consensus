import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class VerizonNewActivationSimulation extends Simulation {

  setUp(VerizonScenarios.NewActivation.inject(atOnceUsers(1)).protocols(SimParams.httpProtocol))
//    setUp(VerizonCarrierResponderComponents.VerizonCR.inject(atOnceUsers(1)).protocols(SimParams.httpProtocol))

}

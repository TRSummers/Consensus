import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class VerizonNewActivation extends Simulation {

  setUp(VerizonScenarios.NewActivation.inject(atOnceUsers(SimParams.TGTVNA)).protocols(SimParams.httpProtocol))

}

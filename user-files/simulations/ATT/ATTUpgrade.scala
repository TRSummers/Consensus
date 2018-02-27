import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class ATTUpgrade extends Simulation {

  setUp(ATTScenarios.Upgrade.inject(atOnceUsers(SimParams.TGTTUG)).protocols(SimParams.httpProtocol))

}

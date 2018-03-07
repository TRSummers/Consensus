import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class SprintTargetUpgrade extends Simulation {

  setUp(SprintTargetScenarios.Upgrade.inject(atOnceUsers(SimParams.TGTSUG)).protocols(SimParams.httpProtocol))

}

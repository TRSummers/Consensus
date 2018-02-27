import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class ATTSetup extends Simulation {

  setUp(ATTCRComponents.SetUpExpectations.inject(atOnceUsers(1)).protocols(SimParams.httpProtocol))

}

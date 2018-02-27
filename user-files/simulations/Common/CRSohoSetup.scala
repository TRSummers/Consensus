import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class CRSohoSetup extends Simulation {

  setUp(
    CRExpectationManager.CleanExpectations.inject(atOnceUsers(1)).protocols(SimParams.SohoHttpProtocol),
    SprintSohoCRComponents.SetUpExpectations.inject(nothingFor(15 seconds), atOnceUsers(1)).protocols(SimParams.SohoHttpProtocol)
  )
}

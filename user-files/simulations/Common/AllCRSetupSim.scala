import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class AllCRSetupSim extends Simulation {

  setUp(
    CRExpectationManager.CleanExpectations.inject(atOnceUsers(1)).protocols(SimParams.httpProtocol),
    VerizonCRComponents.SetUpExpectations.inject(nothingFor(5 seconds), atOnceUsers(1)).protocols(SimParams.httpProtocol),
    ATTCRComponents.SetUpExpectations.inject(nothingFor(10 seconds), atOnceUsers(1)).protocols(SimParams.httpProtocol),
    SprintCRComponents.SetUpExpectations.inject(nothingFor(15 seconds), atOnceUsers(1)).protocols(SimParams.httpProtocol)
  )
}

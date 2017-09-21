import scala.io.Source
import scala.util.Random
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object CRExpectationManager{

    val headers_list = Map("Content-Type" -> "application/json")

    val createAndLoadExpectations = group("createAndLoadExpectations"){
      exec(http("createExpectation")
        .post("/CarrierResponder/expectation")
        .body(ElFileBody("${expectationPath}" + ".json")).asJSON
        .headers(headers_list)
        .check(status.is(200))
        .check(jsonPath("$.expectationId").saveAs("expectationId"))
      )
        .exec(http("loadExpectation")
        .get("/CarrierResponder/mockserver/load?expectationId=" + "${expectationId}")
      )
    }
}



class LoadCRExpectations extends Simulation {


  val httpProtocol = http
    .baseURL("https://localhost:58443")
    .disableAutoReferer
    .acceptHeader("application/json, text/javascript, */*; q=0.01")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

  val expPath = "/Users/z0029p8/Repositories/Gatling-POA/user-files/expectations/sprint/upgrade/loan/insurance/validate-account-info"
  val payloadTemp = Source.fromFile(expPath + ".xml").mkString.replace("\"", "\\\"").replace("\n", "").replace("\r", "")
  val expectationPath = Iterator.continually(Map("expectationPath" -> expPath, "payload" -> payloadTemp))


  val scn = scenario("Load Expectation").feed(expectationPath).repeat(1){
    exec(
      CRExpectationManager.createAndLoadExpectations
    )
  }

  setUp(scn.inject(atOnceUsers(1))).throttle(
    reachRps(10) in (10 minutes),
    holdFor(1 minute),
    jumpToRps(10),
    holdFor(10 minutes)
  ).protocols(httpProtocol)

}
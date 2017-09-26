import scala.io.Source
import scala.util.Random
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object CRExpectationManager{

    val headers_list = Map("Content-Type" -> "application/json")

    val createAndLoadExpectation = group("createAndLoadExpectation"){

      exec(http("Create Expectation")
        .post("/CarrierResponder/expectation?overwriteIfExists=TRUE")
        .body(ElFileBody("${expectationPath}" + "-expectation.json")).asJSON
        .headers(headers_list)
        .check(jsonPath("$.id").saveAs("expectationId")))
        .exec(http("Load Expectation")
        .get("/CarrierResponder/mockserver/load?expectationId=" + "${expectationId}"))
    }
}

class LoadCRExpectations extends Simulation {

  val httpProtocol = http
    .baseURL("https://localhost:7443")
    .disableAutoReferer
    .acceptHeader("application/json, text/javascript, */*; q=0.01")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

  val expec1 = "expectations/sprint/upgrade/loan/insurance/check-loan-eligibility"
  val expec2 = "expectations/sprint/upgrade/loan/insurance/create-lite-esa"
  val expec3 = "expectations/sprint/upgrade/loan/insurance/create-loan-contract"
  val expec4 = "expectations/sprint/upgrade/loan/insurance/query-account-loan-details"
  val expec5 = "expectations/sprint/upgrade/loan/insurance/submit-order"
  val expec6 = "expectations/sprint/upgrade/loan/insurance/validate-account-info"

  val gatlingData = sys.env("GATLING_DATA")
  val expectationPath = Array(
    Map("expectationPath" -> expec1, "payload" -> Source.fromFile(gatlingData + "/" + expec1 + "-payload.xml").mkString.replace("\"", "\\\"").replace("\n", "").replace("\r", "")),
    Map("expectationPath" -> expec2, "payload" -> Source.fromFile(gatlingData + "/" + expec2 + "-payload.xml").mkString.replace("\"", "\\\"").replace("\n", "").replace("\r", "")),
    Map("expectationPath" -> expec3, "payload" -> Source.fromFile(gatlingData + "/" + expec3 + "-payload.xml").mkString.replace("\"", "\\\"").replace("\n", "").replace("\r", "")),
    Map("expectationPath" -> expec4, "payload" -> Source.fromFile(gatlingData + "/" + expec4 + "-payload.xml").mkString.replace("\"", "\\\"").replace("\n", "").replace("\r", "")),
    Map("expectationPath" -> expec5, "payload" -> Source.fromFile(gatlingData + "/" + expec5 + "-payload.xml").mkString.replace("\"", "\\\"").replace("\n", "").replace("\r", "")),
    Map("expectationPath" -> expec6, "payload" -> Source.fromFile(gatlingData + "/" + expec6 + "-payload.xml").mkString.replace("\"", "\\\"").replace("\n", "").replace("\r", ""))
  ).queue

  val scn = scenario("Create and Load CR Expectations").feed(expectationPath).repeat(6){
    exec(
      CRExpectationManager.createAndLoadExpectation
    )
  }

  setUp(scn.inject(atOnceUsers(1))).throttle(
    reachRps(10) in (10 minutes),
    holdFor(1 minute),
    jumpToRps(10),
    holdFor(10 minutes)
  ).protocols(httpProtocol)

}
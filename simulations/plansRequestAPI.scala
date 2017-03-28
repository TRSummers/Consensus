/**
  * Created by z001x4c on 3/14/17.
  */

package consensus.PAM

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import akka.util._

class plansRequestAPI extends Simulation {

  val httpConf = http
    .baseURL("https://perf-scale-pam.consensuscorpdev.com")
    .acceptHeader("application/json;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")

  val headers_json = Map("Content-Type" -> "application/json",
                         "orderKeyInfo" -> "{\"creditApplicationNum\":\"807931050\", \"orderNum\":\"27787\"}",
                         "ESB-CARRIER-RESPONDER" -> "ON")
 
  val sprint_headers_json = Map("Content-Type" -> "application/json",
                         "orderKeyInfo" -> "{\"creditApplicationNum\":\"810001842\", \"orderNum\":\"6576\"}",
                         "ESB-CARRIER-RESPONDER" -> "ON")
                         

  val scn = scenario("PAM Scenario - VZW Plans Request").repeat(25) {
                exec(http("verizon_plans_request")
                  .post("/PAM/api/pam/v1/catalog/plansRequest")
                  .body(ElFileBody("VZWPlansRequest.json")).asJSON
                  .headers(headers_json)
                  .check(status.is(200))
                  .check(regex("VERIZON").exists))
  }
  
    val sprintScn = scenario("PAM Scenario - Sprint Plans Request").repeat(25) {
                exec(http("sprint_plans_request")
                  .post("/PAM/api/pam/v1/catalog/plansRequest")
                  .body(ElFileBody("SprintPlansRequest.json")).asJSON
                  .headers(sprint_headers_json)
                  .check(status.is(200))
                  .check(regex("SPRINT").exists))
  }
  
  setUp(sprintScn.inject(atOnceUsers(400))).throttle(
    reachRps(5) in (10 seconds),
    holdFor(1 minute),
    jumpToRps(10),
    holdFor(45 minutes)
  ).protocols(httpConf)

}
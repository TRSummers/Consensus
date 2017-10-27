/**
  * Created by z001x4c on 3/14/17.
  */

package consensus.PAM

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import akka.util._

class plansAddonFeaturesRequestAPI extends Simulation {

   val httpConf = http
    .baseURL("https://perf-scale-pam.consensuscorpdev.com")
    .acceptHeader("application/json;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")

  val headers_json = Map("Content-Type" -> "application/json",
                         "ESB-CARRIER-RESPONDER" -> "ON",
                         "orderKeyInfo" -> "{\"creditApplicationNum\":\"807931050\", \"orderNum\":\"27787\"}")

  //feeder for carrier , deviceId, sessionId and planCode
  val deviceNumbers = Array(
    Map("carrier" -> "VERIZON", "device" -> "99000088304056", "planCode" -> "86505", "sessionId" -> "4e399038-c735-4bfa-9419-2d57ce688df8"),
    Map("carrier" -> "SPRINT", "device" -> "99000273662027", "planCode" -> "LSD91AB", "sessionId" -> "")
  ).random

  val scn = scenario("PAM Scenario - planAddons Request").repeat(10) {
    exec(http("${carrier}" + "_plan_addons_request")
      .post("/PAM/api/pam/v1/catalog/plans/addonfeaturesrequest")
      .body(ElFileBody("planAddonsRequest.json")).asJSON
      .headers(headers_json)
      .check(status.is(200))
      .check(regex("${carrier}").exists))
      .feed(deviceNumbers)
  }

  setUp(scn.inject(atOnceUsers(400))).throttle(
    reachRps(5) in (10 seconds),
    holdFor(1 minute),
    jumpToRps(10),
    holdFor(45 minutes)
  ).protocols(httpConf)



}
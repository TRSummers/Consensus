/**
  * Created by z001x4c on 3/14/17.
  */

package consensus.PAM

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import akka.util._

class validateDeviceAPI extends Simulation {

   val httpConf = http
    .baseURL("https://perf-scale-pam.consensuscorpdev.com")
    .acceptHeader("application/json;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")

  val headers_json = Map("Content-Type" -> "application/json",
                         "ESB-CARRIER-RESPONDER" -> "ON")

  //feeder for carrier , device serial Number
  val deviceNumbers = Array(
    Map("carrier" -> "SPRINT", "device" -> "1234567")
  ).random

  val scn = scenario("PAM Scenario - validateDevice Request").repeat(10){
    exec(http("${carrier}" + "_validateDevice")
      .post("/PAM/api/pam/v1/device")
      .body(ElFileBody("validateDevice_request.json")).asJSON
      .headers(headers_json)
      .check(status.is(200))
      .check(regex("${carrier}").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("CC_PLANS_MISSING").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
      .feed(deviceNumbers)
  }

  setUp(scn.inject(atOnceUsers(400))).throttle(
    reachRps(5) in (10 seconds),
    holdFor(1 minute),
    jumpToRps(10),
    holdFor(60 minutes)
  ).protocols(httpConf)


}
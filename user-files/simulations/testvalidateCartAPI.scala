package consensus.PAM

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import scala.util.Random

import akka.util._


class testvalidateCartAPI extends Simulation {
    val httpConf = http
    .baseURL("https://perf-scale-pam.consensuscorpdev.com")
    .acceptHeader("application/json;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")

  val headers_json = Map("Content-Type" -> "application/json")


  //feeder for random phone number, iterates continually
  // Random number will be accessible in session under variable "phoneNumber"
  val phoneNumbers = Iterator.continually(
    Map("deviceNumber" -> f"${Random.nextInt(Integer.MAX_VALUE)}%14d",
      "carrier"     -> Random.shuffle(Array("SPRINT").toList).head)
  )

  val scn = scenario("PAM Scenario - validateCart Request").repeat(10){
    exec(http("${carrier}" + "_validateCart")
      .post("/PAM/api/pam/v1/cart")
      .body(ElFileBody("validateCart_request.json")).asJSON
      .headers(headers_json)
      .check(status.is(200))
      .check(regex("${carrier}").exists)
      .check(regex("PAM_SERVICEPROVIDER_ERROR_UNSUPPORTED").notExists)
      .check(regex("ESB_UNAVAILABLE").notExists))
      .feed(phoneNumbers)
  }

  setUp(scn.inject(atOnceUsers(4000))).throttle(
    reachRps(5) in (10 seconds),
    holdFor(1 minute),
    jumpToRps(10),
    holdFor(40 minutes)
  ).protocols(httpConf)

}
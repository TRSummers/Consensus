
package consensus.PAM

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import scala.util.Random

import akka.util._


class NumberPortAPI extends Simulation {

  val httpConf = http
    .baseURL("https://perf-scale-pam.consensuscorpdev.com")
    .acceptHeader("application/json;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")

  val headers_json = Map("Content-Type" -> "application/json")


  //feeder for random phone number, iterates continually
  // Random number will be accessible in session under variable "phoneNumber"
  val phoneNumbers = Iterator.continually(
      Map("phoneNumber" -> f"${Random.nextInt(Integer.MAX_VALUE)}%10d",
          "carrier"     -> Random.shuffle(Array("VERIZON", "SPRINT").toList).head)
  )

  val scn = scenario("PAM Scenario - numberPort Request").repeat(10){
      exec(http("${carrier}" + "_numberport")
        .post("/PAM/api/pam/v1/numberport")
        .body(ElFileBody("numberport_request.json")).asJSON
        .headers(headers_json)
        .check(status.is(200))
        .check(regex("${carrier}").exists)
        .check(regex("CC_PHONENUMBER_INVALID").notExists)
        .check(regex("ESB_UNAVAILABLE").notExists))
        .feed(phoneNumbers)
  }

  setUp(scn.inject(atOnceUsers(1002))).throttle(
    reachRps(5) in (10 seconds),
    holdFor(1 minute),
    jumpToRps(10),
    holdFor(30 minutes)
  ).protocols(httpConf)

}


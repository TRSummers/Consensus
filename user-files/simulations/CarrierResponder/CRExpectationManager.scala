package CarrierResponder

import scala.concurrent.duration._
import scala.reflect.runtime.universe._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import scala.io.Source

object CRExpectationManager {

  def escapePayload( a:String ) : String = {
    val payload = Literal(Constant(a.replace("\n","").replace("\r",""))).toString()
    return payload.substring(1, payload.length-1)
  }

  val headers_list = Map("Content-Type" -> "application/json")

  val tunneled_cr = 				"https://localhost:58443"
  val non_tunneled_cr = 		"https://localhost:7443"

  val createAndLoadExpectation = group("Create & Load") {

    exec(http("Create Expectation")
      .post(tunneled_cr + "/CarrierResponder/expectation?overwriteIfExists=TRUE")
      .body(ElFileBody("${expectationPath}" + "-expectation.json")).asJSON
      .headers(headers_list)
      .check(jsonPath("$.id").saveAs("expectationId")))
      .exec(http("Load Expectation")
        .get(tunneled_cr + "/CarrierResponder/mockserver/load?expectationId=" + "${expectationId}"))
  }

  val CleanExpectations = scenario("Clean CR").repeat(1){
    group("Removing All") {
      exec(
        http("#1")
          .get(tunneled_cr + "/CarrierResponder/mockserver/remove")
      )
    }
  }

}

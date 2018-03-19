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
  val non_tunneled_cr = 		"https://cdsprf0-cccar-le.consensuscorpdev.com"

  val createAndLoadExpectation = group("Create & Load") {

    exec(http("Create Expectation")
      .post(non_tunneled_cr + "/CarrierResponder/expectation?overwriteIfExists=TRUE&createIfDuplicateRequest=TRUE")
      .body(ElFileBody("${expectationPath}" + "-expectation.json")).asJSON
      .headers(headers_list)
      .check(jsonPath("$.id").saveAs("expectationId")))
      .exec(http("Load Expectation")
        .get(non_tunneled_cr + "/CarrierResponder/mockserver/load?expectationId=" + "${expectationId}"))
  }

  val CleanExpectations = scenario("CR - Remove All").repeat(1){
    group("Removing All") {
      exec(
        http("#1")
          .get(non_tunneled_cr + "/CarrierResponder/mockserver/remove")
      )
    }
  }

  //shell script one liner to DELETE all expectations from DB
  //for ((i=1;i<=1000;i++)); do   curl -v --header "Connection: keep-alive" "https://cdsprf0-cccar-le.consensuscorpdev.com/CarrierResponder/expectation/web/remove/id/$i"; done

}

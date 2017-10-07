
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import scala.reflect.runtime.universe._


object CRExpectationManager {

  def escapePayload( a:String ) : String = {
    val payload = Literal(Constant(a.replace("\n","").replace("\r",""))).toString()
    return payload.substring(1, payload.length-1)
  }

  val headers_list = Map("Content-Type" -> "application/json")

  val removeExpectations = group("CR Management") {

    exec(http("Remove All Expectations")
      get(Common.tunneled_cr + "/CarrierResponder/mockserver/remove")
    )
  }

  val createAndLoadExpectation = group("CR Management") {

    exec(http("Create Expectation")
      .post(Common.tunneled_cr + "/CarrierResponder/expectation?overwriteIfExists=TRUE")
      .body(ElFileBody("${expectationPath}" + "-expectation.json")).asJSON
      .headers(headers_list)
      .check(jsonPath("$.id").saveAs("expectationId")))
      .exec(http("Load Expectation")
      .get(Common.tunneled_cr + "/CarrierResponder/mockserver/load?expectationId=" + "${expectationId}"))
  }
}

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


object CRExpectationManager {

  val headers_list = Map("Content-Type" -> "application/json")

  val removeExpectations = group("CR Management") {

    exec(http("Remove All Expectations")
      get("https://localhost:7443/CarrierResponder/mockserver/remove")
    )
  }

  val createAndLoadExpectation = group("CR Management") {

    exec(http("Create Expectation")
      .post("https://localhost:7443/CarrierResponder/expectation?overwriteIfExists=TRUE")
      .body(ElFileBody("${expectationPath}" + "-expectation.json")).asJSON
      .headers(headers_list)
      .check(jsonPath("$.id").saveAs("expectationId")))
      .exec(http("Load Expectation")
      .get("https://localhost:7443/CarrierResponder/mockserver/load?expectationId=" + "${expectationId}"))
  }
}
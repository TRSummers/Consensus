package Jenkins

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object SimParams{

  //GLOBAL
  val rampup = if (System.getenv("RAMP") == null) 1 else System.getenv("RAMP").toInt
  val inum = if (System.getenv("ITERATIONS") == null) 1 else System.getenv("ITERATIONS").toInt



  // TARGET
  val TGTCR = if (System.getenv("TGTCR") == true) 1 else 0

  val TGTVNA = if (System.getenv("TGTVNA") == null) 1 else System.getenv("TGTVNA").toInt
  val TGTSNA = if (System.getenv("TGTSNA") == null) 1 else System.getenv("TGTSNA").toInt
  val TGTTNA = if (System.getenv("TGTTNA") == null) 1 else System.getenv("TGTTNA").toInt
  val TGTVUG = if (System.getenv("TGTVUG") == null) 1 else System.getenv("TGTVUG").toInt
  val TGTSUG = if (System.getenv("TGTSUG") == null) 1 else System.getenv("TGTSUG").toInt
  val TGTTUG = if (System.getenv("TGTTUG") == null) 1 else System.getenv("TGTTUG").toInt
  val TGTVAL = if (System.getenv("TGTVAL") == null) 1 else System.getenv("TGTVAL").toInt
  val TGTSAL = if (System.getenv("TGTSAL") == null) 1 else System.getenv("TGTSAL").toInt
  val TGTTAL = if (System.getenv("TGTTAL") == null) 1 else System.getenv("TGTTAL").toInt

  val httpProtocol = http
    .baseURL("https://poa-perf-scale.consensuscorpdev.com")
    .disableAutoReferer
    .acceptHeader("application/json, text/javascript, */*; q=0.01")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")



  // SOHO
  val SOHOCR = if (System.getenv("SOHOCR") == true) 1 else 0

  val SOHOSNA = if (System.getenv("SOHOSNA") == null) 1 else System.getenv("SOHOSNA").toInt
  val SOHOSUG = if (System.getenv("SOHOSUG") == null) 1 else System.getenv("SOHOSUG").toInt
  val SOHOSAL = if (System.getenv("SOHOSAL") == null) 1 else System.getenv("SOHOSAL").toInt

  val SohoHttpProtocol = http
    .baseURL("https://cdsprf0-api.consensuscorpdev.com")
    .acceptHeader("application/json;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")

}
import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object SimParams{

  val httpProtocol = http
    .baseURL("https://poa-perf-scale.consensuscorpdev.com")
    .disableAutoReferer
    .acceptHeader("application/json, text/javascript, */*; q=0.01")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

  val rampup = if (System.getenv("RAMP") == null) 1 else System.getenv("RAMP").toInt
  val inum = if (System.getenv("ITERATIONS") == null) 10 else System.getenv("ITERATIONS").toInt


  val VNA = if (System.getenv("VNAUSERS") == null) 1 else System.getenv("VNAUSERS").toInt
  val SNA = if (System.getenv("SNAUSERS") == null) 1 else System.getenv("SNAUSERS").toInt
  val TNA = if (System.getenv("TNAUSERS") == null) 1 else System.getenv("TNAUSERS").toInt
  val VUG = if (System.getenv("VUGUSERS") == null) 1 else System.getenv("VUGUSERS").toInt
  val SUG = if (System.getenv("SUGUSERS") == null) 1 else System.getenv("SUGUSERS").toInt
  val TUG = if (System.getenv("TUGUSERS") == null) 1 else System.getenv("TUGUSERS").toInt
  val VAL = if (System.getenv("VALUSERS") == null) 1 else System.getenv("VALUSERS").toInt
  val SAL = if (System.getenv("SALUSERS") == null) 1 else System.getenv("SALUSERS").toInt
  val TAL = if (System.getenv("TALUSERS") == null) 1 else System.getenv("TALUSERS").toInt

}
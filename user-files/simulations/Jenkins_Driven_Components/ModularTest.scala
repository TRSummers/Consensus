import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class E2E extends Simulation {

	setUp(
		SprintUpgradeE2EComponents.SprintUpgradeE2EFlow.inject(rampUsers(SimParams.SUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		build.VZWAAL.inject(rampUsers(SimParams.VAL) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		build.SPRAAL.inject(rampUsers(SimParams.SAL) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		build.ATTAAL.inject(rampUsers(SimParams.TAL) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		build.VZWNA.inject(rampUsers(SimParams.VNA) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
		build.SPRNA.inject(rampUsers(SimParams.SNA) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol))
	//    	        build.ATTNA.inject(rampUsers(SimParams.TNA) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
	//					    build.VZWUG.inject(rampUsers(SimParams.VUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol),
	//					    build.SPRUG.inject(rampUsers(SimParams.SUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol))
	//					    build.ATTUG.inject(rampUsers(SimParams.TUG) over (SimParams.rampup seconds)).protocols(SimParams.httpProtocol)


}

object SimParams{

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("application/json, text/javascript, */*; q=0.01")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

	val rampup = if (System.getenv("RAMP") == null) 1 else System.getenv("RAMP").toInt;
	val inum = if (System.getenv("ITERATIONS") == null) 1 else System.getenv("ITERATIONS").toInt;


	val VNA = if (System.getenv("VNAUSERS") == null) 1 else System.getenv("VNAUSERS").toInt;
	val SNA = if (System.getenv("SNAUSERS") == null) 1 else System.getenv("SNAUSERS").toInt;
	val TNA = if (System.getenv("TNAUSERS") == null) 1 else System.getenv("TNAUSERS").toInt;
	val VUG = if (System.getenv("VUGUSERS") == null) 1 else System.getenv("VUGUSERS").toInt;
	val SUG = if (System.getenv("SUGUSERS") == null) 1 else System.getenv("SUGUSERS").toInt;
	val TUG = if (System.getenv("TUGUSERS") == null) 1 else System.getenv("TUGUSERS").toInt;
	val VAL = if (System.getenv("VALUSERS") == null) 1 else System.getenv("VALUSERS").toInt;
	val SAL = if (System.getenv("SALUSERS") == null) 1 else System.getenv("SALUSERS").toInt;
	val TAL = if (System.getenv("TALUSERS") == null) 1 else System.getenv("TALUSERS").toInt;

}




// Examples of controlling workload
// This example ramps up both VZW and Spr New Activaitons      
// =================================
// setUp(
// VZWNA.inject(
//    atOnceUsers(10), 
//    rampUsers(1) over(10 seconds) // 3
//    constantUsersPerSec(20) during(15 seconds), // 4
//    constantUsersPerSec(20) during(15 seconds) randomized, // 5
//     nothingFor(2 minutes),
//     rampUsers(10) over(10 seconds), // 6
//    nothingFor(100 minutes)
//    rampUsersPerSec(10) to 20 during(10 minutes) randomized, // 7
//    splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy(10 seconds), // 8
//    splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy atOnceUsers(30), // 9
//    heavisideUsers(1000) over(20 seconds) // 10
//   ).protocols(httpProtocol)

// (SprintNA.inject(rampUsers(10) over (10 seconds),
//   nothingFor(5 minutes),
//  rampUsers(10) over(10 seconds)).protocols(httpProtocol))
//)
//  Run multiple NumberOfCarriersarios modularly
//    setUp(Landing.scn.inject(rampUsers(3) over (10 seconds)).protocols(httpProtocol),
//      Login.Login.inject(rampUsers(3) over (10 seconds)).protocols(httpProtocol),
//      SNA.SNA.inject(rampUsers(3) over (10 seconds)).protocols(httpProtocol))

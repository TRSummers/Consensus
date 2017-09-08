import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

class E2E extends Simulation {

	  val httpProtocol = http
		  .baseURL("https://poa-perf-scale.consensuscorpdev.com")
		  .disableAutoReferer
		  .acceptHeader("application/json, text/javascript, */*; q=0.01")
		  .acceptEncodingHeader("gzip, deflate")
		  .acceptLanguageHeader("en-US,en;q=0.5")   
		  .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")
	  	
	  	 val rampup = System.getenv("RAMP").toInt
       val VNA = System.getenv("VNAUSERS").toInt
       val SNA = System.getenv("SNAUSERS").toInt
       val TNA = System.getenv("TNAUSERS").toInt
       val VUG = System.getenv("VUGUSERS").toInt
       val SUG = System.getenv("SUGUSERS").toInt
       val TUG = System.getenv("TUGUSERS").toInt
       val VAL = System.getenv("VALUSERS").toInt
       val SAL = System.getenv("SALUSERS").toInt
       val TAL = System.getenv("TALUSERS").toInt
	  	
    	  setUp(buildDEV.DEVVZWAAL.inject(rampUsers(VAL) over (rampup seconds)).protocols(httpProtocol),
    	        buildDEV.DEVSPRAAL.inject(rampUsers(SAL) over (rampup seconds)).protocols(httpProtocol),
    	        buildDEV.DEVATTAAL.inject(rampUsers(TAL) over (rampup seconds)).protocols(httpProtocol),
    	        buildDEV.DEVVZWNA.inject(rampUsers(VNA) over (rampup seconds)).protocols(httpProtocol),
    	       // buildDEV.DEVVZWNA.inject(splitUsers(VNA) into(rampUsers(5) over(10 seconds)) separatedBy(3 seconds)).protocols(httpProtocol),
    	      //                        splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy(10 seconds),
    	        // Testing ramp up
              //buildDEV.DEVVZWNA.inject(rampUsersPerSec(1) to 5 during(rampup seconds) randomized).protocols(httpProtocol),
    	        buildDEV.DEVSPRNA.inject(rampUsers(SNA) over (rampup seconds)).protocols(httpProtocol),
    	        buildDEV.DEVATTNA.inject(rampUsers(TNA) over (rampup seconds)).protocols(httpProtocol),
    	        buildDEV.DEVVZWUG.inject(rampUsers(VUG) over (rampup seconds)).protocols(httpProtocol),
    	        buildDEV.DEVSPRUG.inject(rampUsers(SUG) over (rampup seconds)).protocols(httpProtocol),
    	        buildDEV.DEVATTUG.inject(rampUsers(TUG) over (rampup seconds)).protocols(httpProtocol))
	  	

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

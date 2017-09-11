import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
// CCOM.scala contains an import of all the objects in this scenario
// including URIs and Headers. 
//import CCOM._


class End_to_End_Scenario extends Simulation {

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("application/json, text/javascript, */*; q=0.01")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

  val Lname = csv("Lname.csv").random
  val SSN1 = csv("SSN1.csv").random
  val SSN2 = csv("SSN2.csv").random
  val SSN3 = csv("SSN3.csv").random
  val SSN4 = csv("SSN4.csv").random

  val VZWCarrierTestData =Iterator.continually(
    Map( "imei" -> "99000088304056",
         "firstName" -> Random.shuffle(Array("James", "John", "Abraham", "George").toList).head,
         "lastName" -> Random.shuffle(Array("Madison", "Adams", "Lincoln", "Washington").toList).head,
         "nationalId" -> (110000000 + Random.nextInt(1000000)).toString,
         "carrier" -> "VerizonNA"))


  val VZWNA= scenario("VZWNA").repeat(1){

    group("VZW_NA_FULL"){
      exec(
        feed(VZWCarrierTestData),
        feed(Lname), feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
        Common.LoginToRetail,     Common.CommonPause,
        Common.RetailToChoosePathModule,        Common.CommonPause,
        Common.ChoosePathToScan,        Common.CommonPause,
        VZWFlow.VZWScanToPaymentOptions,  Common.CommonPause,
        Common.PaymentOptionsToCartWheel,        Common.CommonPause,
        Common.CartwheelToCreditCheck, Common.CommonPause,
        VZWFlow.CreditCheck,       Common.CommonPause,
        VZWFlow.CC2IDP,       Common.CommonPause,
        VZWFlow.IDP2PlanInCC,   Common.CommonPause,
        VZWFlow.SelectPlan, Common.CommonPause,
        VZWFlow.YourCart,   Common.CommonPause,
        VZWFlow.SelectPlanFeaturesInCC,     Common.CommonPause,
        VZWFlow.SelectProtectionPlanInCC,   Common.CommonPause,
        VZWFlow.NumberPort,             Common.CommonPause,
        VZWFlow.OrderReviewandConfirm,  Common.CommonPause,
        VZWFlow.TermsandConditions,     Common.CommonPause,
        VZWFlow.SwipeCard,              Common.CommonPause,
        VZWFlow.PrintMobileScanSheet,   Common.CommonPause,
        VZWFlow.ScanReceipt,            Common.CommonPause,
        VZWFlow.EnterIMEIandSIM,        Common.CommonPause,
        VZWFlow.WirelessCustomerAgreement,  Common.CommonPause,
        VZWFlow.DeviceFinancingInstallmentContract,   Common.CommonPause,
        Common.NewGuest,    Common.CommonPause,
        Common.Logout, Common.CommonPause)
    }
  }
      		
       
//       val VZWAAL= scenario("VZWAAL").repeat(1){
	  
//	  	 val Carrier =Iterator.continually(
//          Map( "imei" -> "99000088304056",
//                "carrier" -> "Verizon"))
	  	       
//       group("VZWAAL"){
//        exec(
//  	    feed(Carrier),
//  	    feed(Lname),
//  	    feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
//        Common.LoginToRetail,    Common.CommonPause,
//        Common.RetailToChoosePathModule,       Common.CommonPause,
//        Common.AddALinetoExistingAccount,  Common.CommonPause,
//       Common.ChoosePathToScan,       Common.CommonPause,
//       VZWFlow.VZWScanToPaymentOptions,  Common.CommonPause,
//       Common.PaymentOptionsToCartWheel,    //    Common.CommonPause,
//        VZWAALIDP17009.SelectVZW, Common.CommonPause,
//        VZWAALIDP17009.VZWAcctLookuptoSelectOption, Common.CommonPause,
//        VZWAALIDP17009.SelectOption, Common.CommonPause,
//        VZWAALIDP17009.ScantoPO, Common.CommonPause,
//        VZWAALIDP17009.POtoCC, Common.CommonPause,
//        VZWAALIDP17009.CartwheeltoCreditcheck, Common.CommonPause, //Common.CommonPause)  }}
//        VZWAALIDP17009.CreditCheck, Common.CommonPause,
//        VZWAALIDP17009.CCtoIDP, Common.CommonPause,
//        VZWAALIDP17009.IDPtoYourCart)}}
	/*    VZWFlow.CreditCheck,       Common.CommonPause, */

      val SprAAL= scenario("SprAAL").repeat(1){
      val Carrier = Iterator.continually(
      Map( "imei" -> "YYZHOPEIMUNIQUE",
           "carrier" -> "Sprint"))
        group("SPR_NA_FULL"){
  	    exec(
  	    feed(Carrier),
  	    feed(Lname),
  	    feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
  	    feed(Carrier),
        Common.LoginToRetail,    Common.CommonPause,
        Common.RetailToChoosePathModule,      Common.CommonPause,
        Common.AddALinetoExistingAccount,  Common.CommonPause,
        SprAALIDP.AccountLookup_Sprint,       Common.CommonPause,
        SprAALIDP.AddALinetoScan,  Common.CommonPause,
        SprAALIDP.Scan,  Common.CommonPause,
        SprAALIDP.PaymentOptions,  Common.CommonPause,
        SprAALIDP.CreditCheck,  Common.CommonPause,
        SprAALIDP.CreditChecktoIDP,  Common.CommonPause,
        SprAALIDP.IDPtoYourCart,  Common.CommonPause)}
//      SprAALIDP_toActivation.YourCarttoSelectPlanandAccessFees,
//      SprAALIDP_toActivation.SelectPlanFeaturesandAccessFees)}
//      SprAALIDP.IDPtoPlan)}
//      SPRIDP.AddALinetoExistingAccount)}
//      SPRIDP.Scan,
//      SPRIDP.PaymentOptions)}
//       Common.NewGuest,                  Common.CommonPause,
//       Common.Logout)}
    }
	
// setUp(
 // VZWNA.inject(
    //atOnceUsers(10), // 2
 //   rampUsers(1) over(10 seconds) // 3
    //constantUsersPerSec(20) during(15 seconds), // 4
    //constantUsersPerSec(20) during(15 seconds) randomized, // 5
   // nothingFor(2 minutes),
   // rampUsers(10) over(10 seconds), // 6
    //nothingFor(100 minutes)
    //rampUsersPerSec(10) to 20 during(10 minutes) randomized, // 7
    //splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy(10 seconds), // 8
    //splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy atOnceUsers(30), // 9
    //heavisideUsers(1000) over(20 seconds) // 10
 // ).protocols(httpProtocol)
  //(SprintNA.inject(rampUsers(10) over (10 seconds),
   //   nothingFor(5 minutes),
    //  rampUsers(10) over(10 seconds)).protocols(httpProtocol))
//)
  
	   setUp(VZWNA.inject(rampUsers(1) over (160 seconds)).protocols(httpProtocol))
	       //  SprintNA.inject(rampUsers(25) over (200 seconds)).protocols(httpProtocol))


//  Verizon Scenario       
//	   setUp(VZWAAL.inject(rampUsers(1) over (200 seconds)).protocols(httpProtocol))
	   
//  Sprint Scenario	   
//  setUp(SprintNA.inject(rampUsers(25) over (200 seconds)).protocols(httpProtocol))

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
//  Run multiple scenarios modularly
//    setUp(Landing.scn.inject(rampUsers(3) over (10 seconds)).protocols(httpProtocol),
//      Login.Login.inject(rampUsers(3) over (10 seconds)).protocols(httpProtocol),
//      SNA.SNA.inject(rampUsers(3) over (10 seconds)).protocols(httpProtocol))

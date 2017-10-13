import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object build{


  //
       // Sprint Add a Line
       //
       val SPRAAL = scenario("SprAAL").repeat(SimParams.inum){
          val Carrier = Iterator.continually(
              Map( "imei" -> "YYZHOPEIMUNIQUE",
                   "carrier" -> "Sprint")
          )
          group("SPRAAL"){
  	          exec(
  	          feed(Carrier),
  	            feed(Common.Lname),
  	            feed(Common.SSN1), feed(Common.SSN2), feed(Common.SSN3), feed(Common.SSN4),
                Common.LoginToRetail,                 Common.CommonPause,
                Common.RetailToChoosePathModule,      Common.CommonPause,
                Common.AddALinetoExistingAccount,     Common.CommonPause,
                SprAALIDP.AccountLookup_Sprint,       Common.CommonPause,
                SprAALIDP.AddALinetoScan,             Common.CommonPause,
                SprAALIDP.Scan,                       Common.CommonPause,
                SprAALIDP.PaymentOptions,             Common.CommonPause,
                SprAALIDP.CreditCheck,                Common.CommonPause,
                SprAALIDP.CreditChecktoIDP,           Common.CommonPause,
                SprAALIDP.IDPtoYourCart,              Common.CommonPause,
                Common.NewGuest,                      Common.CommonPause,
                Common.Logout)
           }
       }
       //
       // Verizon Add a Line
       //
       val VZWAAL= scenario("VZWAAL").repeat(SimParams.inum){
	  	    val Carrier =Iterator.continually(
             Map( "imei" -> "99000088304056",
                  "carrier" -> "Verizon")
          )
          group("VZWAAL"){
             exec(
          	    feed(Carrier),
          	    feed(Common.Lname),
          	    feed(Common.SSN1), feed(Common.SSN2), feed(Common.SSN3), feed(Common.SSN4),
                Common.LoginToRetail,              Common.CommonPause,
                Common.RetailToChoosePathModule,   Common.CommonPause,
                Common.AddALinetoExistingAccount,  Common.CommonPause,
                VZWAALIDP17009.SelectVZW,          Common.CommonPause,
                VZWAALIDP17009.SelectOption,       Common.CommonPause,
                VZWAALIDP17009.ScantoPO,           Common.CommonPause,
                VZWAALIDP17009.POtoCC,             Common.CommonPause,
                VZWAALIDP17009.CreditCheck,        Common.CommonPause,
                VZWAALIDP17009.CCtoIDP,            Common.CommonPause,
                VZWAALIDP17009.IDPtoYourCart,      Common.CommonPause,
                Common.NewGuest,                   Common.CommonPause,
                Common.Logout,                     Common.CommonPause)
	        }
	  	 }


          val ATTAAL= scenario("ATTAAL").repeat(SimParams.inum){
          val Carrier = Iterator.continually(
              Map( "imei" -> "YYZHOPEIMUNIQUE",
                   "carrier" -> "Sprint")
          )
          group("ATTAAL"){
  	          exec(
  	          feed(Carrier),
  	            feed(Common.Lname),
  	            feed(Common.SSN1), feed(Common.SSN2), feed(Common.SSN3), feed(Common.SSN4),
                Common.LoginToRetail,                 Common.CommonPause,
                Common.RetailToChoosePathModule,      Common.CommonPause,
                Common.AddALinetoExistingAccount,     Common.CommonPause,
                Common.NewGuest,                      Common.CommonPause,
                Common.Logout)
           }
       }
  
	
	    //
      // Sprint New Activaiton
      //
      val SPRNA= scenario("SPRNA").repeat(SimParams.inum){
      val Carrier = Iterator.continually(
      Map( "imei" -> "foruday1",
           "carrier" -> "SprintNA"))
        group("SPRNA"){
  	    exec(
  	    feed(Carrier),
  	    feed(Common.Lname),
  	    feed(Common.SSN1), feed(Common.SSN2), feed(Common.SSN3), feed(Common.SSN4),
  	    feed(Carrier),
        Common.LoginToRetail,    Common.CommonPause,
        Common.RetailToChoosePathModule,       Common.CommonPause,
        Common.ChoosePathToScan,       Common.CommonPause,
        SprintFlow.Scan, Common.CommonPause,
        SprintFlow.PO,   Common.CommonPause,
        SprintFlow.CW,   Common.CommonPause,
        SprintFlow.CC,   Common.CommonPause,
        SprintFlow.CC2IDP,     Common.CommonPause,
        SprintFlow.IDP2Plan,   Common.CommonPause,
        SprintFlow.SelectPlan, Common.CommonPause,
        SprintFlow.YourCart,   Common.CommonPause,
        SprintFlow.SelectPlanFeatures,    Common.CommonPause,
        SprintFlow.SelectProtectionPlan,  Common.CommonPause,
        SprintFlow.NumberPort,            Common.CommonPause,
        SprintFlow.SecurityQuestion,      Common.CommonPause,
        SprintFlow.OrderReviewandConfirm, Common.CommonPause,
        SprintFlow.TermsandConditions,    Common.CommonPause,
        SprintFlow.SwipeCard,             Common.CommonPause,
        SprintFlow.PrintMobileScanSheet,  Common.CommonPause,
        SprintFlow.ScanReceipt,           Common.CommonPause,
        SprintFlow.EnterIMEIandSIM,       Common.CommonPause,
        Common.NewGuest,                  Common.CommonPause,
        Common.Logout)}

      }

 }

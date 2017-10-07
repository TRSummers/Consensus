/**********************************************************
  *
  * This will build a simulation
  * Well...it was supposed to, anyway.
  *
  ***********************************************************/



import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.io.Source
import scala.util.Random

object build{

  val Lname = csv("Lname.csv").random
  val SSN1 = csv("SSN1.csv").random
  val SSN2 = csv("SSN2.csv").random
  val SSN3 = csv("SSN3.csv").random
  val SSN4 = csv("SSN4.csv").random
  val inum=System.getenv("ITERATIONS").toInt

  val VZWCarrierTestData =Iterator.continually(
    Map( "imei" -> "99000088304056",
      "firstName" -> Random.shuffle(Array("James", "John", "Abraham", "George").toList).head,
      "lastName" -> Random.shuffle(Array("Madison", "Adams", "Lincoln", "Washington").toList).head,
      "nationalId" -> (110000000 + Random.nextInt(1000000)).toString,
      "carrier" -> "VerizonNA"))





  //
  // Sprint Add a Line
  //
  val SPRAAL = scenario("SprAAL").repeat(inum){
    val Carrier = Iterator.continually(
      Map( "imei" -> "YYZHOPEIMUNIQUE",
        "carrier" -> "Sprint")
    )
    group("SPRAAL"){
      exec(
        feed(Carrier),
        feed(Lname),
        feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
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
<<<<<<< HEAD
  // Verizon Add a Line
  //
  val VZWAAL= scenario("VZWAAL").repeat(inum){
    val Carrier =Iterator.continually(
      Map( "imei" -> "99000088304056",
        "carrier" -> "Verizon")
    )
    group("VZWAAL"){
      exec(
        feed(Carrier),
        feed(Lname),
        feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
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


  val ATTAAL= scenario("ATTAAL").repeat(inum){
    val Carrier = Iterator.continually(
      Map( "imei" -> "YYZHOPEIMUNIQUE",
        "carrier" -> "Sprint")
    )
    group("ATTAAL"){
      exec(
        feed(Carrier),
        feed(Lname),
        feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
        Common.LoginToRetail,                 Common.CommonPause,
        Common.RetailToChoosePathModule,      Common.CommonPause,
        Common.AddALinetoExistingAccount,     Common.CommonPause,
        Common.NewGuest,                      Common.CommonPause,
        Common.Logout)
    }
  }




  //
  // Verizion New Activation Flow
  //
  val VZWNA= scenario("VZWNA").repeat(inum){
    val Carrier =Iterator.continually(
      Map( "imei" -> "99000088304056",
        "carrier" -> "VerizonNA"))

    group("VZWNA"){
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
    }}

  //
  // Sprint New Activaiton
  //
  val SPRNA= scenario("SPRNA").repeat(1){
    val Carrier = Iterator.continually(
=======
       // Sprint Add a Line
       //
       val SPRAAL = scenario("SprAAL").repeat(inum){
          val Carrier = Iterator.continually(
              Map( "imei" -> "YYZHOPEIMUNIQUE",
                   "carrier" -> "Sprint")
          )
          group("SPRAAL"){
  	          exec(
  	          feed(Carrier),
  	            feed(Lname),
  	            feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
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
       val VZWAAL= scenario("VZWAAL").repeat(inum){
	  	    val Carrier =Iterator.continually(
             Map( "imei" -> "99000088304056",
                  "carrier" -> "Verizon")
          )
          group("VZWAAL"){
             exec(
          	    feed(Carrier),
          	    feed(Lname),
          	    feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
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

       
          val ATTAAL= scenario("ATTAAL").repeat(inum){
          val Carrier = Iterator.continually(
              Map( "imei" -> "YYZHOPEIMUNIQUE",
                   "carrier" -> "Sprint")
          )
          group("ATTAAL"){
  	          exec(
  	          feed(Carrier),
  	            feed(Lname),
  	            feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
                Common.LoginToRetail,                 Common.CommonPause,
                Common.RetailToChoosePathModule,      Common.CommonPause,
                Common.AddALinetoExistingAccount,     Common.CommonPause,
                Common.NewGuest,                      Common.CommonPause,
                Common.Logout)
           }
       }

       
       
       
       //
       // Verizion New Activation Flow
       //
       val VZWNA= scenario("VZWNA").repeat(inum){
	    	 val Carrier =Iterator.continually(
           Map( "imei" -> "99000088304056",
                "carrier" -> "VerizonNA"))
	  	       
        group("VZWNA"){
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
//            VZWFlow.SwipeCard,              Common.CommonPause,
            VZWFlow.PrintMobileScanSheet,   Common.CommonPause,
            VZWFlow.ScanReceipt,            Common.CommonPause,
            VZWFlow.EnterIMEIandSIM,        Common.CommonPause,
            VZWFlow.WirelessCustomerAgreement,  Common.CommonPause,
            VZWFlow.DeviceFinancingInstallmentContract,   Common.CommonPause,
            Common.NewGuest,    Common.CommonPause,
            Common.Logout, Common.CommonPause)
	}}
	
	    //
      // Sprint New Activaiton
      //
      val SPRNA= scenario("SPRNA").repeat(1){
      val Carrier = Iterator.continually(
>>>>>>> 95f3687f64ba69dc3c493766f5dc4dde7dcd5cc1
      Map( "imei" -> "foruday1",
        "carrier" -> "SprintNA"))
    group("SPRNA"){
      exec(
        feed(Carrier),
        feed(Lname),
        feed(SSN1), feed(SSN2), feed(SSN3), feed(SSN4),
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
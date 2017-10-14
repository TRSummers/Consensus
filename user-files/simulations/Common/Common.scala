import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object Common{

	val uri_poa = 						"https://poa-perf-scale.consensuscorpdev.com:443"
	val uri_poa_no_port = 		"https://poa-perf-scale.consensuscorpdev.com"
	val uri_dsom = 						"https://perf-scale-dsom.consensuscorpdev.com:443"
	val uri_dsom_no_port = 		"https://perf-scale-dsom.consensuscorpdev.com"
	val uri_ui       = 				"https://perf-scale-ui.consensuscorpdev.com/shopping"
	val uri_ui_no_shopping  = "https://perf-scale-ui.consensuscorpdev.com"
	val uri_dsom_v1  = 				"https://perf-scale-dsom.consensuscorpdev.com/dsom-app/v1"
	val uri_dsom_v1_port = 		"https://perf-scale-dsom.consensuscorpdev.com:443/dsom-app/v1"
	val tunneled_cr = 				"https://localhost:58443"
	val uri_pam  = 						"https://perf-scale-pam.consensuscorpdev.com"


	val uri_gstatic = "https://fonts.gstatic.com/s/lato/v13"
	val uri_google  = "https://fonts.googleapis.com/css"

	val CommonPause=pause(8,45)


	val Lname = csv("Lname.csv").random
	val SSN1 = csv("SSN1.csv").random
	val SSN2 = csv("SSN2.csv").random
	val SSN3 = csv("SSN3.csv").random
	val SSN4 = csv("SSN4.csv").random

	val Carrier =Iterator.continually(
		Map( "imei" -> "99000088304056",
			"carrier" -> "VerizonNA"))

	val VZWCarrierTestData =Iterator.continually(
		Map( "imei" -> "99000088304056",
			"firstName" -> Random.shuffle(Array("James", "John", "Abraham", "George").toList).head,
			"lastName" -> Random.shuffle(Array("Madison", "Adams", "Lincoln", "Washington").toList).head,
			"nationalId" -> (110000000 + Random.nextInt(1000000)).toString,
			"carrier" -> "VerizonNA"))


	val LoginToRetail=group("LoginToRetail"){
		exec(http("Login")
			.get("/retail/login.htm?brandId=731&metaCode=newSession"))
			.pause(155 milliseconds)
			.exec(http("Login_1")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_1))
			.exec(http("Login_2")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_2))
			.exec(http("Login_3")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_2))
			.pause(105 milliseconds)
			.exec(http("Login_4")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013173473")
				.headers(CommonHeaders.headers_4))
			//.pause(12)
			.exec(http("Login_5_findstores")
			.get("/ajax/retail/findstores.php?storeId=")
			.headers(CommonHeaders.headers_4))
			.pause(774 milliseconds)
			.exec(http("Login_6_findstores")
				.get("/ajax/retail/findstores.php?storeId=0")
				.headers(CommonHeaders.headers_4))
			.pause(959 milliseconds)
			.exec(http("Login_7_findstores")
				.get("/ajax/retail/findstores.php?storeId=00")
				.headers(CommonHeaders.headers_4))
			.pause(960 milliseconds)
			.exec(http("Login_8_findstores")
				.get("/ajax/retail/findstores.php?storeId=000")
				.headers(CommonHeaders.headers_4))
			.pause(802 milliseconds)
			.exec(http("Login_9_findstores")
				.get("/ajax/retail/findstores.php?storeId=0003")
				.headers(CommonHeaders.headers_4))
			.pause(3)
			.exec(http("Login_10")
				.post("/retail/login.htm")
				.headers(CommonHeaders.headers_10)
				.formParam("userName", "tadmin2")
				.formParam("userPassword", "target1234")
				.formParam("newStoreId", "0003")
				.formParam("storeId", "0003"))
			.exec(http("Login_11_0_newcustomer")
				.get("/retail/orderassembly/controller/newcustomer.php")
				.headers(CommonHeaders.headers_10))
			.exec(http("Login_11_1_retail")
				.get("/retail/")
				.check(regex("blank'>(.+?)<").saveAs("p_sessionid"))
				.headers(CommonHeaders.headers_10))
			.exec(http("Login_11_2")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_11))
			.exec(http("Login_12")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_12))
			.exec(http("Login_13")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_11))
			.pause(110 milliseconds)
			.exec(http("Login_14")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013197479")
				.headers(CommonHeaders.headers_14))
			.exec(http("Login_15")
				.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489013197573&storeId=0003")
				.headers(CommonHeaders.headers_14))

	}

	val RetailToChoosePathModule=group("RetailToChoosePathModule"){
		exec(http("Retail_0")
			.post(uri_poa + "/retail/")
			.headers(CommonHeaders.poa_headers_0)
			.body(ElFileBody("Common/shopping.txt"))
			//.formParam("redirectUrl", "https%3A%2F%2Fperf-scale-ui.consensuscorpdev.com%2Fshopping%2F")
			//.formParam("userAction", "shopping")
			.resources(http("request_1")
			.get(uri_ui + "/")
			.headers(CommonHeaders.ui_headers_1),
			//        http("request_2")
			//          .get(uri_ui + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js")
			//          .headers(CommonHeaders.ui_headers_1),
			http("ui_request_3_fonts")
				.get(uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin")
				.headers(CommonHeaders.ui_headers_1),
			http("ui_request_4_gif")
				.get(uri_ui + "/assets/img/cloader.gif")
				.headers(CommonHeaders.ui_headers_1),
			http("request_5")
				.get(uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
				.headers(CommonHeaders.ui_headers_5),
			http("request_6")
				.get(uri_ui + "/config.json")
				.headers(CommonHeaders.ui_headers_6),
			http("dsom_start_req_7_options")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_7),
			http("dsom_start_req_8_options")
				.options(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_7),
			http("dsom_start_req_9")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_post_request_001.json"))))
			.exec(http("dsom_start_req_10")
				.post(uri_dsom_v1 + "/getNextState")
				.check(regex("Error retrieving the next state for").find.notExists)
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_nextState_request_002.json")))
			.exec(http("poa_path_req_11_process_php")
				.get(uri_poa + "/retail/orderassembly/controller/process.php")
				.headers(CommonHeaders.poa_headers_11))
			//    .pause(40)
			.exec(http("ui_req_11_shopping")
			.get(uri_ui + "/")
			.headers(CommonHeaders.ui_headers_1)
			//        http("dsom_start_req_12")
			//          .get(uri_ui + "/build/css_d4c30075bc2eb1a8b7a8_min.js"),
			//        http("dsom_start_req_13")
			//          .get(uri_ui + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js"),
			.resources(http("ui_request_14_google_api")
			.get(uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin"),
			http("ui_request_15_fonts")
				.get(uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"),
			http("ui_request_16_gif")
				.get(uri_ui + "/assets/img/cloader.gif"),
			http("ui_request_17_config")
				.get(uri_ui + "/config.json")
				.headers(CommonHeaders.ui_headers_6)))
			.exec(http("dsom_start_req_18")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_content_post_request_003.json")))
			.exec(http("dsom_start_req_19")
				.post(uri_dsom_v1 + "/getNextState")
				.check(regex("Error retrieving the next state for").find.notExists)
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_getNextState_post_request_004.json")))
			.exec(http("dsom_start_req_20_path_content")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.check(regex("Purchase unactivated device at full price").find.exists)
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_content_frame_post_request_005.json"))
				.resources(
					//         http("dsom_start_req_21")
					//          .get(uri_ui + "/build/ch_9afac72ed1aa9ce2cabc_min.js")
					//          .headers(CommonHeaders.ui_headers_1),
					http("dsom_start_req_22")
						.get(uri_ui + "/app/pages/frame/header/header.html")
						.headers(CommonHeaders.ui_headers_22),
					http("ui_request_23")
						.get(uri_ui + "/app/pages/frame/footer/footer.html")
						.headers(CommonHeaders.ui_headers_22),
					http("ui_request_24_choosepath")
						.get(uri_ui + "/app/pages/choosepath/choosepath.html")
						.headers(CommonHeaders.ui_headers_22),
					http("ui_request_25_optionscolumn")
						.get(uri_ui + "/app/pages/choosepath/partials/optionscolumn.html")
						.headers(CommonHeaders.ui_headers_22),
					http("ui_request_26_fonts")
						.get(uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("ui_request_27_fonts")
						.get(uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("ui_request_28_svg")
						.get(uri_ui + "/assets/img/bullseye.svg")
						.headers(CommonHeaders.ui_headers_1),
					http("poa_request_29_svg")
						.get(uri_poa + "/img/brands/target/retail/sign_up_new_red.svg")
						.headers(CommonHeaders.ui_headers_1),
					http("poa_request_30_svg")
						.get(uri_poa + "/img/brands/target/retail/upgrade_new_red.svg")
						.headers(CommonHeaders.ui_headers_1)))

	}

	val ChoosePathToScan=group("ChoosePathToScan"){
		exec(http("dsom_scan_request_0")
			.options(uri_dsom_v1 + "/getNextState")
			.headers(CommonHeaders.dsom_headers_7)
			.resources(http("dsom_scan_request_1")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_10)
				.body(ElFileBody("Common/dsom_Scan_0001_request.json"))))
			.pause(1)
			.exec(http("dsom_scan_request_2")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_7)
				.resources(http("dsom_scan_request_3")
					.post(uri_dsom_v1 + "/getContentForAisle")
					.check(regex("Scan or enter a device's IMEI").find.exists)
					.headers(CommonHeaders.dsom_headers_10)
					.body(ElFileBody("Common/dsom_Scan_0003_request.json")),
					http("dsom_scan_request_4")
						.get(uri_ui + "/app/pages/scan/scan.html")))
	}

	val PaymentOptionsToCartWheel = group("${carrier}_PaymentOptions"){
		exec(http("dsom_po_request_0")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(CommonHeaders.dsom_headers_100))
			.exec(http("dsom_po_request_1")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/VZWPO2Activation_0001_request.json")))
			.exec(http("dsom_po_request_102")
				.options(uri_dsom + "/dsom-app/v1/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_100))
			.exec(http("dsom_po_request_3")
				.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
				.check(substring("download the Cartwheel App"))
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/VZWPO2Activation_0003_request.json")))
			.exec(http("dsom_po_cartwheel_content")
				.get(uri_ui + "/app/pages/cartwheel/cartwheel.html")
				.headers(CommonHeaders.ui_headers_22))
			.exec(http("poa_cartwheel_logo")
				.get(uri_poa + "/img/retail/cartwheel/cartwheel_logo.png")
				.headers(CommonHeaders.poa_headers_11))
	}

	val CartwheelToLegacyCreditCheck = group("${carrier}_Cartwheel"){
		exec(http("dsom_Cartwheel_4")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(CommonHeaders.dsom_headers_100))
			.exec(http("dsom_Cartwheel_4")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/dsom_cartwheel_getNextState_request_001.json"))) //todo: test
			.exec(http("poa_Cartwheel_4")
			.get(uri_poa + "/retail/orderassembly/controller/process.php")
			.check(substring("Your personal information"))
			.headers(CommonHeaders.poa_headers_2))
			.exec(http("poa_Cartwheel_6")
				.get(uri_poa + "/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_107))
			.exec(http("Cartwheel_8")
				.get(uri_poa + "/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_108))
			.exec(http("Cartwheel_9")
				.get(uri_poa + "/js/retail/topnav.php")
				.headers(CommonHeaders.headers_108))
			.exec(http("Cartwheel_10")
				.get(uri_poa + "/js/retail/numport.php?devices=")
				.headers(CommonHeaders.headers_108))
			.exec(http("Cartwheel_11")
				.get(uri_poa + "/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019067082")
				.headers(CommonHeaders.headers_1011))
		//.pause(5, 15)
	}

	val CartwheelToCreditCheck = group("${carrier}_Cartwheel"){
		exec(http("dsom_Cartwheel_4")
			.options(uri_dsom_v1 + "/getNextState")
			.headers(CommonHeaders.dsom_headers_100))
			.exec(http("dsom_Cartwheel_4")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/dsom_cartwheel_getNextState_request_001.json")))
			.exec(http("poa_Cartwheel_4")
				.get(uri_poa + "/retail/orderassembly/controller/process.php")
				.headers(CommonHeaders.headers_106)
				.resources(http("dsom_creditCheck_request_0")
					.get(uri_ui + "/assets/img/cloader.gif")
					.headers(CommonHeaders.ui_headers_4),
					http("ui_request_config")
						.get(uri_ui + "/config.json")
						.headers(CommonHeaders.ui_headers_6)))
			.pause(40)
			.exec(http("dsom_request_6")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_7))
			.exec(http("dsom_creditcheck_request_9")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_cartwheel_to_creditcheck_nextState_request_002.json")))
			.pause(40)
			.exec(http("dsom_creditcheck_request_10")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_creditcheck_getContent_request_003.json")))
			.pause(40)
			.exec(http("dsom_creditcheck_request_11")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.check(substring("Your personal information"))
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_creditcheck_getContent_request_004.json"))
				.resources(
					http("ui_cc_request_13")
						.get(uri_ui + "/app/pages/frame/header/header.html")
						.headers(CommonHeaders.ui_headers_14),
					http("ui_cc_request_14")
						.get(uri_ui + "/app/pages/frame/footer/footer.html")
						.headers(CommonHeaders.ui_headers_14),
					http("ui_cc_request_15")
						.get(uri_ui + "/app/pages/creditcheck/creditcheck.html")
						.headers(CommonHeaders.ui_headers_22),
					http("gstatic_request_16")
						.get(uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("ui_request_17")
						.get(uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("ui_request_18")
						.get(uri_ui + "/assets/img/bullseye.svg")))
	}

	val NewGuest=group("NewGuest"){
		exec(http("NewGuest_38")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(CommonHeaders.headers_22))
			.exec(http("NewGuest_39")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(CommonHeaders.headers_23)
				.body(ElFileBody("Common/Sprint_0039_request.txt")))
			.exec(http("NewGuest_40")
				.get("/retail/orderassembly/controller/newcustomer.php")
				.headers(CommonHeaders.headers_25))
			.exec(http("NewGuest_41")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_12))
			.exec(http("NewGuest_42")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_11))
			.exec(http("NewGuest_43")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_11))
			.exec(http("NewGuest_44")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013252401")
				.headers(CommonHeaders.headers_14))
			.exec(http("NewGuest_45")
				.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489013252483&storeId=0003")
				.headers(CommonHeaders.headers_14))
		//.pause(5, 15)
	}

	val CreditCheck=group("${carrier}_CreditCheck"){
		exec(http("CreditCheck_${SSN1}")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(CommonHeaders.headers_1012)
			.formParam("creditCheckToolArray[1008][newOrExisting]", "new")  //new
			.formParam("creditCheckToolArray[1008][addLineType]", "addNewPlan") //addNewPlan
			.formParam("currentPageCOPId", "439")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "1")
			.formParam("edit", "")
			.formParam("Lines_To_Be_Activated", "1")
			.formParam("creditCheckToolArray[1008][numOfNewLines]", "1")
			.formParam("creditCheckToolArray[1008][numOfExistingLines]", "")
			.formParam("Billing_Address_Radio", "unfinished")
			.formParam("Ecom_BillTo_Postal_Name_First", "Fred")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "${Lname}")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks St")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "GROKKED")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117")
			.formParam("Ecom_BillTo_Telecom_Phone_Number", "2342342345")
			.formParam("Ecom_BillTo_Online_Email", "${p_sessionid}@letstalk.com")
			.formParam("Date_of_Birth[1]", "02")
			.formParam("Date_of_Birth[2]", "20")
			.formParam("Date_of_Birth[3]", "1970")
			.formParam("Social_Security", "${SSN1}${SSN2}${SSN3}${SSN4}")
			.formParam("Identification_Type", "licns")
			.formParam("Identification_State", "CA")
			.formParam("Identification_Number", "123456789")
			.formParam("Identification_Expiration_Month", "12")
			.formParam("Identification_Expiration_Year", "2020")
			.formParam("Drivers_license_Checkbox", "Y")
			.formParam("Agree_To_Credit_Check", "Y")
			.formParam("Agree_To_Credit_Check_Hidden", "Y")
			.formParam("checkoutSubmitType", "continue"))
			.exec(http("CreditCheck_13")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_1013))
			.exec(http("CreditCheck_14")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_1014))
			.exec(http("CreditCheck_15")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_1014))
			.exec(http("CreditCheck_16")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019095749")
				.headers(CommonHeaders.headers_1016))
			.exec(http("CreditCheck_17")
				.get("/retail/creditcheck/controller/runprecreditcheck.php")
				.headers(CommonHeaders.headers_1017))
			.exec(http("CreditCheck_18")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_1013))
			.exec(http("CreditCheck_19")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_1014))
			.exec(http("CreditCheck_20")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_1014))
			.exec(http("CreditCheck_21")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019104573")
				.headers(CommonHeaders.headers_1016))
			.exec(http("CreditCheck_22")
				.get("/retail/creditcheck/controller/runprecreditcheck.php")
				.check(substring("Carrier credit check successful. Continue with Verizon").count.saveAs("Checkcounts"))
				.headers(CommonHeaders.headers_1017))
			.exec(http("CreditCheck_>>${Checkcounts}<<")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_1023))
			.exec(http("CreditCheck_24")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_1024))
			.exec(http("CreditCheck_25")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_1024))
			.exec(http("CreditCheck_26")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019106381")
				.headers(CommonHeaders.headers_1026))
		//.pause(5, 16)
	}

	val AddALinetoExistingAccount = group("AddALinetoExistingAccount") {
		exec(http("AddaLine_67")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(CommonHeaders.AddaLine_headers_43)
			.resources(http("AddaLine_68")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(CommonHeaders.AddaLine_headers_45)
				.body(ElFileBody("Common/dsom_start_nextState_request_003.json")), http("AddaLine_69")
				.get("/retail/orderassembly/controller/process.php?planType=addLine&action=buyTypeChosen")
				.check(substring("Check Your Upgrade Eligibility"))
				.headers(CommonHeaders.AddaLine_headers_47), http("AddaLine_70")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.AddaLine_headers_4), http("AddaLine_71")
				.get("/jslibs/jquery.php?ver=1.8.2")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_72")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.AddaLine_headers_6), http("AddaLine_73")
				.get("/jslibs/jquerymobile.php")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_74")
				.get("/template/public/styles/new.main.css")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_75")
				.get("/template/css/semantic.jqmsafe.min.css")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_76")
				.get("/retail/public/styles/main.css")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_77")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.AddaLine_headers_6), http("AddaLine_78")
				.get("/retail/public/styles/jquery.mobile-1.2.0.css")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_79")
				.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_80")
				.get("/brands/target/retail/public/styles/main.css")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_81")
				.get("/js/retail/eligibility.js")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_82")
				.get("/img/retail/notification-img.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_83")
				.get("/img/retail/corps/plLgs596.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_84")
				.get("/img/retail/corps/plLgs545.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_85")
				.get("/img/retail/corps/plLgs660.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_86")
				.get("/img/retail/ajax-loader.gif"), http("AddaLine_87")
				.get("/img/brands/target/retail/logo-mini.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_88")
				.get("/retail/public/img/alertsprite.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_89")
				.get("/retail/public/img/reservesprite.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_90")
				.get("/img/retail/cart.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_91")
				.get("/img/retail/icons-18-white.png"), http("AddaLine_92")
				.get("/img/retail/setting.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_93")
				.get("/img/retail/home.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_94")
				.get("/img/retail/inventory-management.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_95")
				.get("/img/retail/customer-lookup.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_96")
				.get("/img/retail/save.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_97")
				.get("/img/retail/lock.png")
				.headers(CommonHeaders.AddaLine_headers_2), http("AddaLine_98")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285243318")
				.headers(CommonHeaders.AddaLine_headers_0), http("AddaLine_99")
				.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1499285243749&storeId=0003")
				.headers(CommonHeaders.AddaLine_headers_0)))
	}

	val Logout=group("Logout"){
		exec(http("Logout_0")
			.get("/retail/orderassembly/controller/newcustomer.php?logout=1")
			.headers(CommonHeaders.Logoutheaders_0))
			.exec(http("Logout_1")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.Logoutheaders_1))
			.exec(http("Logout_2")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.Logoutheaders_2))
			.exec(http("Logout_3")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.Logoutheaders_1))
			.exec(http("Completed Flows")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490039628495")
				.headers(CommonHeaders.Logoutheaders_4))
	}

	val VerizonResults = group("Results"){
		exec(http("Shipped Orders")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status")
			.check(substring("INSURANCE_ACTIVATION_NEEDED"))
			.headers(CommonHeaders.status_call))
	}

	val SprintResults = group("Results"){
		exec(http("Shipped Orders")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status")
			.check(substring("COMPLETED"))
			.headers(CommonHeaders.status_call))
	}
}

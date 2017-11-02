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
	val non_tunneled_cr = 		"https://localhost:7443"
	val uri_pam  = 						"https://perf-scale-pam.consensuscorpdev.com"


	val uri_gstatic = "https://fonts.gstatic.com/s/lato/v14"
	val uri_google  = "https://fonts.googleapis.com/css"

	val CommonPause=pause(8,45)
//	val CommonPause=pause(2,5)


	val VZWCarrierTestData =Iterator.continually(
		Map( "imei" -> "99000088304056"))

	val CreditCheckData =Iterator.continually(
		Map(
			"firstName" -> Random.shuffle(Array("James", "John", "Abraham", "George").toList).head,
			"lastName" -> Random.shuffle(Array("Madison", "Adams", "Lincoln", "Washington").toList).head,
			"nationalId" -> (100000000 + Random.nextInt(899999999)).toString,
			"carrier" -> "VerizonNA"))

	val LoginToRetail=group("Login->Retail"){
		exec(http("#0")
			.get("/retail/login.htm?brandId=731&metaCode=newSession"))
			.pause(155 milliseconds)
			.exec(http("#1")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_1))
			.exec(http("#2")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_2))
			.exec(http("#3")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_2))
			.pause(105 milliseconds)
			.exec(http("#4")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013173473")
				.headers(CommonHeaders.headers_4))
			//.pause(12)
			.exec(http("#5")
			.get("/ajax/retail/findstores.php?storeId=")
			.headers(CommonHeaders.headers_4))
			.pause(774 milliseconds)
			.exec(http("#6")
				.get("/ajax/retail/findstores.php?storeId=0")
				.headers(CommonHeaders.headers_4))
			.pause(959 milliseconds)
			.exec(http("#7")
				.get("/ajax/retail/findstores.php?storeId=00")
				.headers(CommonHeaders.headers_4))
			.pause(960 milliseconds)
			.exec(http("#8")
				.get("/ajax/retail/findstores.php?storeId=000")
				.headers(CommonHeaders.headers_4))
			.pause(802 milliseconds)
			.exec(http("#9")
				.get("/ajax/retail/findstores.php?storeId=0003")
				.headers(CommonHeaders.headers_4))
			.pause(3)
			.exec(http("#10")
				.post("/retail/login.htm")
				.headers(CommonHeaders.headers_10)
				.formParam("userName", "tadmin2")
				.formParam("userPassword", "target1234")
				.formParam("newStoreId", "0003")
				.formParam("storeId", "0003"))
			.exec(http("#11")
				.get("/retail/orderassembly/controller/newcustomer.php")
				.headers(CommonHeaders.headers_10))
			.exec(http("#12")
				.get("/retail/")
				.check(regex("blank'>(.+?)<").saveAs("p_sessionid"))
				.headers(CommonHeaders.headers_10))
			.exec(http("#13")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_11))
			.exec(http("#14")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_12))
			.exec(http("#15")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_11))
			.pause(110 milliseconds)
			.exec(http("#16")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013197479")
				.headers(CommonHeaders.headers_14))
			.exec(http("#17")
				.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489013197573&storeId=0003")
				.headers(CommonHeaders.headers_14))

	}

	val RetailToChoosePathModule=group("Retail->ChoosePath"){
		exec(http("#0")
			.post(uri_poa + "/retail/")
			.headers(CommonHeaders.poa_headers_0)
			.body(ElFileBody("Common/shopping.txt"))
			//.formParam("redirectUrl", "https%3A%2F%2Fperf-scale-ui.consensuscorpdev.com%2Fshopping%2F")
			//.formParam("userAction", "shopping")
			.resources(http("#1")
			.get(uri_ui + "/")
			.headers(CommonHeaders.ui_headers_1),
			//        http("#2")
			//          .get(uri_ui + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js")
			//          .headers(CommonHeaders.ui_headers_1),
			http("#3")
				.get(uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin")
				.headers(CommonHeaders.ui_headers_1),
			http("#4")
				.get(uri_ui + "/assets/img/cloader.gif")
				.headers(CommonHeaders.ui_headers_1),
			http("#5")
				.get(uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
				.headers(CommonHeaders.ui_headers_5),
			http("#6")
				.get(uri_ui + "/config.json")
				.headers(CommonHeaders.ui_headers_6),
			http("#7")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_7),
			http("#8")
				.options(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_7),
			http("#9")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_post_request_001.json"))))
			.exec(http("#10")
				.post(uri_dsom_v1 + "/getNextState")
				.check(regex("Error retrieving the next state for").find.notExists)
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_nextState_request_002.json")))
			.exec(http("#11")
				.get(uri_poa + "/retail/orderassembly/controller/process.php")
				.headers(CommonHeaders.poa_headers_11))
			//    .pause(40)
			.exec(http("#12")
			.get(uri_ui + "/")
			.headers(CommonHeaders.ui_headers_1)
			//        http("#13")
			//          .get(uri_ui + "/build/css_d4c30075bc2eb1a8b7a8_min.js"),
			//        http("#14")
			//          .get(uri_ui + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js"),
			.resources(http("#ui_request_14_google_api")
			.get(uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin"),
			http("#15")
				.get(uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"),
			http("#16")
				.get(uri_ui + "/assets/img/cloader.gif"),
			http("#17")
				.get(uri_ui + "/config.json")
				.headers(CommonHeaders.ui_headers_6)))
			.exec(http("#18")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_content_post_request_003.json")))
			.exec(http("#19")
				.post(uri_dsom_v1 + "/getNextState")
				.check(regex("Error retrieving the next state for").find.notExists)
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_getNextState_post_request_004.json")))
			.exec(http("#20")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.check(regex("Purchase unactivated device at full price").find.exists)
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_start_content_frame_post_request_005.json"))
				.resources(
					//         http("#21")
					//          .get(uri_ui + "/build/ch_9afac72ed1aa9ce2cabc_min.js")
					//          .headers(CommonHeaders.ui_headers_1),
					http("#22")
						.get(uri_ui + "/app/pages/frame/header/header.html")
						.headers(CommonHeaders.ui_headers_22),
					http("#23")
						.get(uri_ui + "/app/pages/frame/footer/footer.html")
						.headers(CommonHeaders.ui_headers_22),
					http("#24")
						.get(uri_ui + "/app/pages/choosepath/choosepath.html")
						.headers(CommonHeaders.ui_headers_22),
					http("#25")
						.get(uri_ui + "/app/pages/choosepath/partials/optionscolumn.html")
						.headers(CommonHeaders.ui_headers_22),
					http("#26")
						.get(uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("#27")
						.get(uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("#28")
						.get(uri_ui + "/assets/img/bullseye.svg")
						.headers(CommonHeaders.ui_headers_1),
					http("#29")
						.get(uri_poa + "/img/brands/target/retail/sign_up_new_red.svg")
						.headers(CommonHeaders.ui_headers_1),
					http("#30")
						.get(uri_poa + "/img/brands/target/retail/upgrade_new_red.svg")
						.headers(CommonHeaders.ui_headers_1)))

	}

	val ChoosePathToScan=group("ChoosePath->Scan"){
		exec(http("#0")
			.options(uri_dsom_v1 + "/getNextState")
			.headers(CommonHeaders.dsom_headers_7)
			.resources(http("#1")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_10)
				.body(ElFileBody("Common/dsom_Scan_0001_request.json"))))
			.pause(1)
			.exec(http("#2")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_7)
				.resources(http("#3")
					.post(uri_dsom_v1 + "/getContentForAisle")
					.check(regex("Scan or enter a device's IMEI").find.exists)
					.headers(CommonHeaders.dsom_headers_10)
					.body(ElFileBody("Common/dsom_Scan_0003_request.json")),
					http("#4")
						.get(uri_ui + "/app/pages/scan/scan.html")))
	}

	val PaymentOptionsToCartWheel = group("PaymentOpt->CartWheel"){
		exec(http("#0")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(CommonHeaders.dsom_headers_100))
			.exec(http("#1")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/VZWPO2Activation_0001_request.json")))
			.exec(http("#2")
				.options(uri_dsom + "/dsom-app/v1/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_100))
			.exec(http("#3")
				.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
				//	.check(substring("download the Cartwheel App"))
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/VZWPO2Activation_0003_request.json")))
			.exec(http("#4")
				.get(uri_ui + "/app/pages/cartwheel/cartwheel.html")
				.headers(CommonHeaders.ui_headers_22))
			.exec(http("#5")
				.get(uri_poa + "/img/retail/cartwheel/cartwheel_logo.png")
				.headers(CommonHeaders.poa_headers_11))
	}

	val CartwheelToLegacyCreditCheck = group("Cartwheel->CC"){
		exec(http("#0")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(CommonHeaders.dsom_headers_100))
			.exec(http("#1")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/dsom_cartwheel_getNextState_request_001.json"))) //todo: test
			.exec(http("#2")
			.get(uri_poa + "/retail/orderassembly/controller/process.php")
			.check(substring("Your personal information"))
			.headers(CommonHeaders.poa_headers_2))
			.exec(http("#3")
				.get(uri_poa + "/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_107))
			.exec(http("#4")
				.get(uri_poa + "/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_108))
			.exec(http("#5")
				.get(uri_poa + "/js/retail/topnav.php")
				.headers(CommonHeaders.headers_108))
			.exec(http("#6")
				.get(uri_poa + "/js/retail/numport.php?devices=")
				.headers(CommonHeaders.headers_108))
			.exec(http("#7")
				.get(uri_poa + "/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019067082")
				.headers(CommonHeaders.headers_1011))
		//.pause(5, 15)
	}

	val CartwheelToCreditCheck = group("Cartwheel->CC"){
		exec(http("#0")
			.options(uri_dsom_v1 + "/getNextState")
			.headers(CommonHeaders.dsom_headers_100))
			.exec(http("#1")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_101)
				.body(ElFileBody("Common/dsom_cartwheel_getNextState_request_001.json")))
			.exec(http("#2")
				.get(uri_poa + "/retail/orderassembly/controller/process.php")
				.headers(CommonHeaders.headers_106)
				.resources(http("#3")
					.get(uri_ui + "/assets/img/cloader.gif")
					.headers(CommonHeaders.ui_headers_4),
					http("#4")
						.get(uri_ui + "/config.json")
						.headers(CommonHeaders.ui_headers_6)))
			.pause(40)
			.exec(http("#5")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_7))
			.exec(http("#6")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_cartwheel_to_creditcheck_nextState_request_002.json")))
			.pause(40)
			.exec(http("#7")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_creditcheck_getContent_request_003.json")))
			.pause(40)
			.exec(http("#8")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.check(substring("Your personal information"))
				.headers(CommonHeaders.dsom_headers_9)
				.body(ElFileBody("Common/dsom_creditcheck_getContent_request_004.json"))
				.resources(
					http("#9")
						.get(uri_ui + "/app/pages/frame/header/header.html")
						.headers(CommonHeaders.ui_headers_14),
					http("#10")
						.get(uri_ui + "/app/pages/frame/footer/footer.html")
						.headers(CommonHeaders.ui_headers_14),
					http("#11")
						.get(uri_ui + "/app/pages/creditcheck/creditcheck.html")
						.headers(CommonHeaders.ui_headers_22),
					http("#12")
						.get(uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("#13")
						.get(uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
						.headers(CommonHeaders.ui_headers_5),
					http("#14")
						.get(uri_ui + "/assets/img/bullseye.svg")))
	}

	val NewGuest=group("NewGuest"){
		exec(http("#0")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(CommonHeaders.headers_22))
			.exec(http("#1")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(CommonHeaders.headers_23)
				.body(ElFileBody("Common/Sprint_0039_request.txt")))
			.exec(http("#2")
				.get("/retail/orderassembly/controller/newcustomer.php")
				.headers(CommonHeaders.headers_25))
			.exec(http("#3")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.headers_12))
			.exec(http("#4")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.headers_11))
			.exec(http("#5")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.headers_11))
			.exec(http("#6")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013252401")
				.headers(CommonHeaders.headers_14))
			.exec(http("#7")
				.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489013252483&storeId=0003")
				.headers(CommonHeaders.headers_14))
		//.pause(5, 15)
	}

	val Logout=group("Logout"){
		exec(http("#0")
			.get("/retail/orderassembly/controller/newcustomer.php?logout=1")
			.headers(CommonHeaders.Logoutheaders_0))
			.exec(http("#1")
				.get("/jslibs/modernizr.php")
				.headers(CommonHeaders.Logoutheaders_1))
			.exec(http("#2")
				.get("/retail/public/styles/normalize.php")
				.headers(CommonHeaders.Logoutheaders_2))
			.exec(http("#3")
				.get("/js/retail/topnav.php")
				.headers(CommonHeaders.Logoutheaders_1))
			.exec(http("#4 ")
				.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490039628495")
				.headers(CommonHeaders.Logoutheaders_4))
	}

}

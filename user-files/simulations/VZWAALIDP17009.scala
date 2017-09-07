/*********************************************
 * *******************************************
 * 
 * This simulation includes functionality for Verizon Add a Line and continues through the Your Cart page.
 * Specifically, Steps are as follows:
 * 
 * Function Name denotes the required field in the Modularized Scenario
 * 
 *    Fucntion Name		Navigation
 *    =============		==========
 * 1.	SelectVZW     	SelectVZW to SelectOption
 * 2. SelectOption		SelectOption to Scan
 * 3. ScantoPO				Scan to PO
 * 4. POtoCC					PO to Credit Check (Cartwheel disabled for this. If it's re-enabled, it will need to be included in the modularized scenario.
 * 5. CreditCheck 		CreditCheck to Credit Check Success (Credit check is legacy)
 * 6. CCtoIDP					Credit Check Success to IDP
 * 7. IDPtoYourCart		IDP to Your Cart
 * 
 * For this to work, use the Common library functions for the following:
 *  Login 
 *  PickYourPath
 *  Add a Line to Existing Account
 *  
 * For this to work, use the following Data:
 * 
 * Phone Number: 	2106278804
 * Last Name:			successSubmitCreditApplication
 * 
 * 
 ****************************************************/

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object VZWAALIDP17009 {

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://poa-perf-scale.consensuscorpdev.com",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_5 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_12 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 24 Jul 2017 23:39:20 GMT",
		"If-None-Match" -> "28c41-174-55518b95219ee",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_19 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 24 Jul 2017 23:39:21 GMT",
		"If-None-Match" -> "2833f-70e-55518b9691c8e",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_25 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_32 = Map(
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_33 = Map(
		"Accept" -> "*/*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_34 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_36 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_40 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_46 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_47 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36",
		"cartId" -> "${p_sessionid}")

	val headers_58 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_70 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> "a9e2-5e7-55439ef8ee223",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_71 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> "a9d2-c4d-55439ef8ee223",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_72 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> "a8e1-1c4-55439ef8ec2e3",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_99 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 13 Jul 2017 21:51:33 GMT",
		"If-None-Match" -> "d561-9034-55439ef9663fd",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_149 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> "a9d8-867-55439ef8ee223",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_150 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 13 Jul 2017 21:51:33 GMT",
		"If-None-Match" -> "63c08-a9d-55439ef9692dd",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_179 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> "85be6-660-55334fe376000",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_180 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> "85c62-1260-55334fe376000",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_184 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_185 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36",
		"sessionId" -> "${p_sessionid}")

	val headers_186 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 13 Jul 2017 21:51:33 GMT",
		"If-None-Match" -> "d140-1948-55439efa509f2",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_187 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "PATCH",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36")

	val headers_188 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36",
		"cartId" -> "${p_sessionid}")

    val uri_dsom = "https://perf-scale-dsom.consensuscorpdev.com"
    val uri_ui = "https://perf-scale-ui.consensuscorpdev.com/shopping"
    val uri_gstatic = "https://fonts.gstatic.com/s/lato/v13"
    val uri_google = "https://fonts.googleapis.com/css"

    val SelectVZW=group("SelectVZWtoSelectOption"){
     exec(http("SelectVZWtoSelectOption_0")
			.post("/retail/eligibility/eligibility.htm")
			.headers(headers_0)
			.formParam("corpId", "660")
			.formParam("phoneNumber", "2106278804")
			.formParam("pNum", "2106278804")
			.formParam("last4SSN", "8383")
			.formParam("password", "")
			.formParam("accountzip", "94110")
			.formParam("eligibility", "runcheck")
			.check(substring("Add a line to your existing account")))
		.exec(http("SelectVZWtoSelectOption_1")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("SelectVZWtoSelectOption_2")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("SelectVZWtoSelectOption_3")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("SelectVZWtoSelectOption_4")
			.get("/jslibs/modernizr.php")
			.headers(headers_4))
		.exec(http("SelectVZWtoSelectOption_5")
			.get("/template/public/styles/new.main.css")
			.headers(headers_5))
		.exec(http("SelectVZWtoSelectOption_6")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_5))
		.exec(http("SelectVZWtoSelectOption_7")
			.get("/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("SelectVZWtoSelectOption_8")
			.get("/js/retail/topnav.php")
			.headers(headers_4))
		.exec(http("SelectVZWtoSelectOption_9")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("SelectVZWtoSelectOption_10")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("SelectVZWtoSelectOption_11")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("SelectVZWtoSelectOption_12")
			.get("/js/retail/addalinetypeselection.js")
			.headers(headers_12))
		.exec(http("SelectVZWtoSelectOption_13")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("SelectVZWtoSelectOption_14")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("SelectVZWtoSelectOption_15")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("SelectVZWtoSelectOption_16")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("SelectVZWtoSelectOption_17")
			.get("/img/retail/cart.png"))
		.exec(http("SelectVZWtoSelectOption_18")
			.get("/img/retail/setting.png"))
		.exec(http("SelectVZWtoSelectOption_19")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_19))
		.exec(http("SelectVZWtoSelectOption_20")
			.get("/img/retail/home.png"))
		.exec(http("SelectVZWtoSelectOption_21")
			.get("/img/retail/inventory-management.png"))
		.exec(http("SelectVZWtoSelectOption_22")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("SelectVZWtoSelectOption_23")
			.get("/img/retail/save.png"))
		.exec(http("SelectVZWtoSelectOption_24")
			.get("/img/retail/lock.png"))
		.exec(http("SelectVZWtoSelectOption_25")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1501177736636")
			.headers(headers_25))
		.exec(http("SelectVZWtoSelectOption_26")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1501177736862&storeId=0003")
			.headers(headers_25))
	}
//		.pause(41)
	val SelectOption=group("SelectOptiontoScan"){
		exec(http("SelectOptiontoScan_27")
			.post("/retail/orderassembly/addalinetypeselection.htm")
			.headers(headers_0)
			.formParam("addLineType", "addFamilyLine")
			.formParam("maxedOutError", ""))
	//  .exec(http("SelectOptiontoScan_28")
	//		.get(uri_ui + "/build/css_1908400c1a8320a8bfb3_min.js")
	//		.headers(headers_5))
	//	.exec(http("SelectOptiontoScan_29")
	//		.get(uri_ui + "/build/bundle_1908400c1a8320a8bfb3_min.js")
	//		.headers(headers_5))
		.exec(http("SelectOptiontoScan_30")
			.get(uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_5))
		.exec(http("SelectOptiontoScan_31")
			.get(uri_ui + "/assets/img/cloader.gif")
			.headers(headers_5))
		.exec(http("SelectOptiontoScan_32")
			.get(uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
			.headers(headers_32))
		.exec(http("SelectOptiontoScan_33")
			.get(uri_ui + "/config.json")
			.headers(headers_33))
		.exec(http("SelectOptiontoScan_34")
			.options(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(headers_34))
		.exec(http("SelectOptiontoScan_35")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_34))
		.exec(http("SelectOptiontoScan_36")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_36)
			.body(ElFileBody("dsom/selectoption/VZWAALIDP17009_0036_request.json")))
		.exec(http("SelectOptiontoScan_37")
			.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(headers_36)
			.body(ElFileBody("dsom/selectoption/VZWAALIDP17009_0037_request.json")))
		//.pause(1)
		.exec(http("SelectOptiontoScan_38")
			.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.check(substring("Important note about the iPhone SIM"))
			.headers(headers_36)
			.body(ElFileBody("dsom/selectoption/VZWAALIDP17009_0038_request.json")))
//		.exec(http("SelectOptiontoScan_39")
//			.get(uri_ui + "/build/ch_779d19d79bdd207f42f2_min.js")
//			.headers(headers_5))
		.exec(http("SelectOptiontoScan_40")
			.get(uri_ui + "/app/pages/frame/header/header.html")
			.headers(headers_40))
		.exec(http("SelectOptiontoScan_41")
			.get(uri_ui + "/app/pages/frame/footer/footer.html")
			.headers(headers_40))
		.exec(http("SelectOptiontoScan_42")
			.get(uri_ui + "/app/pages/scan/scan.html")
			.headers(headers_40))
		.exec(http("SelectOptiontoScan_43")
			.get(uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
			.headers(headers_32))
		.exec(http("SelectOptiontoScan_44")
			.get(uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
			.headers(headers_32))
		.exec(http("SelectOptiontoScan_45")
			.get(uri_ui + "/assets/img/bullseye.svg")
			.headers(headers_5))
	}
//		.pause(40)
	val ScantoPO=group("ScantoPO"){
		exec(http("ScantoPO_46")
			.options(uri_dsom + "/session/dsom/v1/cart/item")
			.headers(headers_46))
		.exec(http("ScantoPO_47")
			.post(uri_dsom + "/session/dsom/v1/cart/item")
			.headers(headers_47)
			.body(ElFileBody("dsom/scan/VZWAALIDP17009_0047_request.json")))
		.exec(http("ScantoPO_48")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_34))
		.exec(http("ScantoPO_49")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_36)
			.body(ElFileBody("dsom/scan/VZWAALIDP17009_0049_request.json")))
		//.pause(1)
		.exec(http("ScantoPO_50")
			.options(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(headers_34))
		.exec(http("ScantoPO_51")
			.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(headers_36)
			.body(ElFileBody("dsom/scan/VZWAALIDP17009_0051_request.json")))
		.exec(http("ScantoPO_52")
			.get(uri_ui + "/app/pages/paymentoptions/paymentoptions.html")
			.headers(headers_40))
		.exec(http("ScantoPO_53")
			.options(uri_dsom + "/dsom-app/v1/getPaymentDetails")
			.headers(headers_34))
		.exec(http("ScantoPO_54")
			.post(uri_dsom + "/dsom-app/v1/getPaymentDetails")
			.check(substring("Sign up today and get your choice of the latest smartphone"))
			.headers(headers_36)
			.body(ElFileBody("dsom/scan/VZWAALIDP17009_0054_request.json")))
		.exec(http("ScantoPO_55")
			.get(uri_ui + "/assets/img/verizon.svg")
			.headers(headers_5))
	}
	
//		.pause(61)
	val POtoCC=group("POtoCC"){
		 exec(http("POtoCC_56")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
		  .headers(headers_34))
		.exec(http("POtoCC_57")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_36)
			.body(ElFileBody("dsom/paymentoptionsVZWAALIDP17009_0057_request.json")))
//		.pause(1)
		.exec(http("POtoCC_58")
			.get("/retail/orderassembly/controller/process.php")
			.check(substring("Target keeps your information"))
			.headers(headers_58))
//		.pause(1)
		.exec(http("POtoCC_59")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("POtoCC_60")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("POtoCC_61")
			.get("/jslibs/modernizr.php")
			.headers(headers_4))
		.exec(http("POtoCC_62")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("POtoCC_63")
			.get("/template/public/styles/new.main.css")
			.headers(headers_5))
		.exec(http("POtoCC_64")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_5))
		.exec(http("POtoCC_65")
			.get("/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("POtoCC_66")
			.get("/js/retail/topnav.php")
			.headers(headers_4))
		.exec(http("POtoCC_67")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("POtoCC_68")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("POtoCC_69")
			.get("/brands/target/retail/public/styles/main.css")
			.check(substring("Before proceeding verify that you are the Account Holder or Authorized User."))
			.headers(headers_5))
		.exec(http("POtoCC_70")
			.get("/js/retail/creditcheck.js")
			.headers(headers_70))
		.exec(http("POtoCC_71")
			.get("/js/retail/checkoutinit.js")
			.headers(headers_71))
		.exec(http("POtoCC_72")
			.get("/js/datechange.js")
			.headers(headers_72))
		.exec(http("POtoCC_73")
			.get("/js/retail/numport.php?devices=")
			.headers(headers_4))
		.exec(http("POtoCC_74")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("POtoCC_75")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("POtoCC_76")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("POtoCC_77")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("POtoCC_78")
			.get("/img/retail/cart.png"))
		.exec(http("POtoCC_79")
			.get("/img/retail/setting.png"))
		.exec(http("POtoCC_80")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_19))
		.exec(http("POtoCC_81")
			.get("/img/retail/home.png"))
		.exec(http("POtoCC_82")
			.get("/img/retail/inventory-management.png"))
		.exec(http("POtoCC_83")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("POtoCC_84")
			.get("/img/retail/save.png"))
		.exec(http("POtoCC_85")
			.get("/img/retail/lock.png"))
		.exec(http("POtoCC_86")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1501177894644")
			.headers(headers_25))
	}
//		.pause(72)
	val CreditCheck=group("CreditChecktoSuccess"){
		exec(http("CreditChecktoSuccess_87")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(headers_0)
			.formParam("creditCheckToolArray[1008][newOrExisting]", "existing")
			.formParam("creditCheckToolArray[1008][addLineType]", "addExistingPlan")
			.formParam("currentPageCOPId", "439")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "1")
			.formParam("edit", "")
			.formParam("Lines_To_Be_Activated", "3")
			.formParam("creditCheckToolArray[1008][numOfNewLines]", "1")
			.formParam("creditCheckToolArray[1008][numOfExistingLines]", "2")
			.formParam("Billing_Address_Radio", "unfinished")
			.formParam("Ecom_BillTo_Postal_Name_First", "Tom")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "successSubmitCreditApplication")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94127")
			.formParam("Ecom_BillTo_Telecom_Phone_Number", "4158419060")
			.formParam("Ecom_BillTo_Online_Email", "${p_sessionid}@letstalk.com")
			.formParam("Date_of_Birth[1]", "02")
			.formParam("Date_of_Birth[2]", "20")
			.formParam("Date_of_Birth[3]", "1970")
			.formParam("Social_Security", "637383738")
			.formParam("Identification_Type", "licns")
			.formParam("Identification_State", "CA")
			.formParam("Identification_Number", "123456789")
			.formParam("Identification_Expiration_Month", "12")
			.formParam("Identification_Expiration_Year", "2020")
			.formParam("Drivers_license_Checkbox", "Y")
			.formParam("Agree_To_Credit_Check", "Y")
			.formParam("Agree_To_Credit_Check_Hidden", "Y")
			.formParam("checkoutSubmitType", "continue"))
		.pause(60)
		.exec(http("CreditChecktoSuccess_88")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("CreditChecktoSuccess_89")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("CreditChecktoSuccess_90")
			.get("/jslibs/modernizr.php")
			.headers(headers_4))
		.exec(http("CreditChecktoSuccess_91")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("CreditChecktoSuccess_92")
			.get("/template/public/styles/new.main.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_93")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_94")
			.get("/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_95")
			.get("/js/retail/topnav.php")
			.headers(headers_4))
		.exec(http("CreditChecktoSuccess_96")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_97")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_98")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_99")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_99))
		.exec(http("CreditChecktoSuccess_100")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("CreditChecktoSuccess_101")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("CreditChecktoSuccess_102")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("CreditChecktoSuccess_103")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("CreditChecktoSuccess_104")
			.get("/img/retail/cart.png"))
		.exec(http("CreditChecktoSuccess_105")
			.get("/img/retail/setting.png"))
		.exec(http("CreditChecktoSuccess_106")
			.get("/img/retail/home.png"))
		.exec(http("CreditChecktoSuccess_107")
			.get("/img/retail/inventory-management.png"))
		.exec(http("CreditChecktoSuccess_108")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("CreditChecktoSuccess_109")
			.get("/img/retail/save.png"))
		.exec(http("CreditChecktoSuccess_110")
			.get("/img/retail/lock.png"))
		.exec(http("CreditChecktoSuccess_111")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1501177977481")
			.headers(headers_25))
		.exec(http("CreditChecktoSuccess_112")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_58))
		.exec(http("CreditChecktoSuccess_113")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("CreditChecktoSuccess_114")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("CreditChecktoSuccess_115")
			.get("/jslibs/modernizr.php")
			.headers(headers_4))
		.exec(http("CreditChecktoSuccess_116")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("CreditChecktoSuccess_117")
			.get("/template/public/styles/new.main.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_118")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_119")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_99))
		.exec(http("CreditChecktoSuccess_120")
			.get("/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_121")
			.get("/js/retail/topnav.php")
			.headers(headers_4))
		.exec(http("CreditChecktoSuccess_122")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_123")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_124")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("CreditChecktoSuccess_125")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("CreditChecktoSuccess_126")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("CreditChecktoSuccess_127")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("CreditChecktoSuccess_128")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("CreditChecktoSuccess_129")
			.get("/img/retail/cart.png"))
		.exec(http("CreditChecktoSuccess_130")
			.get("/img/retail/setting.png"))
		.exec(http("CreditChecktoSuccess_131")
			.get("/img/retail/home.png"))
		.exec(http("CreditChecktoSuccess_132")
			.get("/img/retail/inventory-management.png"))
		.exec(http("CreditChecktoSuccess_133")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("CreditChecktoSuccess_134")
			.get("/img/retail/save.png"))
		.exec(http("CreditChecktoSuccess_135")
			.get("/img/retail/lock.png"))
		.exec(http("CreditChecktoSuccess_136")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1501177982693")
			.headers(headers_25))
		.exec(http("CreditChecktoSuccess_137")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful. Continue with Verizon Wireless"))
			.headers(headers_58))
//		.pause(1)
		.exec(http("CreditChecktoSuccess_138")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("CreditChecktoSuccess_139")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("CreditChecktoSuccess_140")
			.get("/jslibs/modernizr.php")
			.headers(headers_4))
		.exec(http("CreditChecktoSuccess_141")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("CreditChecktoSuccess_142")
			.get("/template/public/styles/new.main.css"))
		.exec(http("CreditChecktoSuccess_143")
			.get("/template/css/semantic.jqmsafe.min.css"))
		.exec(http("CreditChecktoSuccess_144")
			.get("/retail/public/styles/main.css"))
		.exec(http("CreditChecktoSuccess_145")
			.get("/js/retail/topnav.php")
			.headers(headers_4))
		.exec(http("CreditChecktoSuccess_146")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css"))
		.exec(http("CreditChecktoSuccess_147")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css"))
		.exec(http("CreditChecktoSuccess_148")
			.get("/brands/target/retail/public/styles/main.css"))
		.exec(http("CreditChecktoSuccess_149")
			.get("/js/retail/creditcheckresult.js")
			.headers(headers_149))
		.exec(http("CreditChecktoSuccess_150")
			.get("/img/corpLogos/plLg660.gif")
			.headers(headers_150))
		.exec(http("CreditChecktoSuccess_151")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("CreditChecktoSuccess_152")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("CreditChecktoSuccess_153")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("CreditChecktoSuccess_154")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("CreditChecktoSuccess_155")
			.get("/img/retail/cart.png"))
		.exec(http("CreditChecktoSuccess_156")
			.get("/img/retail/setting.png"))
		.exec(http("CreditChecktoSuccess_157")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_19))
		.exec(http("CreditChecktoSuccess_158")
			.get("/img/retail/home.png"))
		.exec(http("CreditChecktoSuccess_159")
			.get("/img/retail/inventory-management.png"))
		.exec(http("CreditChecktoSuccess_160")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("CreditChecktoSuccess_161")
			.get("/img/retail/save.png"))
		.exec(http("CreditChecktoSuccess_162")
			.get("/img/retail/lock.png"))
		.exec(http("CreditChecktoSuccess_163")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1501177985823")
			.headers(headers_25))
	}
//		.pause(29)
	val CCtoIDP=group("CreditChecktoIDP"){
		 exec(http("CreditChecktoIDP_164")
			.post("/retail/creditcheck/result.htm")
			.headers(headers_0)
			.formParam("submitType", "continue")
			.formParam("acceptCorp", "660")
			.formParam("acceptType", "passed")
			.formParam("secondRun", "")
			.formParam("numofline_to_activate", "1")
			.formParam("checkbox-1", "on"))
		.exec(http("CreditChecktoIDP_165")
			.get(uri_ui + "/build/css_1908400c1a8320a8bfb3_min.js")
			.headers(headers_5))
		.exec(http("CreditChecktoIDP_166")
			.get(uri_ui + "/build/bundle_1908400c1a8320a8bfb3_min.js")
			.headers(headers_5))
		.exec(http("CreditChecktoIDP_167")
			.get(uri_ui + "/assets/img/cloader.gif")
			.headers(headers_5))
		.exec(http("CreditChecktoIDP_168")
			.get(uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_5))
		.exec(http("CreditChecktoIDP_169")
			.get(uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
			.headers(headers_32))
		.exec(http("CreditChecktoIDP_170")
			.get(uri_ui + "/config.json")
			.headers(headers_33))
		.exec(http("CreditChecktoIDP_171")
			.options(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(headers_34))
		.exec(http("CreditChecktoIDP_172")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_34))
		.exec(http("CreditChecktoIDP_173")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_36)
			.body(ElFileBody("dsom/creditcheck/VZWAALIDP17009_0173_request.json")))
		.exec(http("CreditChecktoIDP_174")
			.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(headers_36)
			.body(ElFileBody("dsom/creditcheck/VZWAALIDP17009_0174_request.json")))
//		.pause(1)
		.exec(http("CreditChecktoIDP_175")
			.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.check(substring("Choose how you want to pay for your device"))
			.headers(headers_36)
			.body(ElFileBody("dsom/creditcheck/VZWAALIDP17009_0175_request.json")))
		.exec(http("CreditChecktoIDP_176")
			.get(uri_ui + "/build/ch_779d19d79bdd207f42f2_min.js")
			.headers(headers_5))
		.exec(http("CreditChecktoIDP_177")
			.get(uri_ui + "/app/pages/frame/header/header.html")
			.headers(headers_40))
		.exec(http("CreditChecktoIDP_178")
			.get(uri_ui + "/app/pages/frame/footer/footer.html")
			.headers(headers_40))
		.exec(http("CreditChecktoIDP_179")
			.get(uri_ui + "/app/pages/installmentdetails/installmentdetails.html")
			.headers(headers_179))
		.exec(http("CreditChecktoIDP_180")
			.get(uri_ui + "/app/components/channel/channel.html")
			.headers(headers_180))
		.exec(http("CreditChecktoIDP_181")
			.get(uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
			.headers(headers_32))
		.exec(http("CreditChecktoIDP_182")
			.get(uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
			.headers(headers_32))
		.exec(http("CreditChecktoIDP_183")
			.get(uri_ui + "/assets/img/bullseye.svg")
			.headers(headers_5))
		.exec(http("CreditChecktoIDP_184")
			.options(uri_dsom + "/dsom-app/v1/paymentPlans")
			.headers(headers_184))
		.exec(http("CreditChecktoIDP_185")
			.get(uri_dsom + "/dsom-app/v1/paymentPlans")
			.headers(headers_185))
		.exec(http("CreditChecktoIDP_186")
			.get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png")
			.headers(headers_186))
	}
//		.pause(38)
	val IDPtoYourCart=group("IDPtoYourCart"){
		exec(http("IDPtoYourCart_187")
			.options(uri_dsom + "/session/dsom/v1/cart/item/5")
			.headers(headers_187))
		.exec(http("IDPtoYourCart_188")
			.patch(uri_dsom + "/session/dsom/v1/cart/item/5")
			.headers(headers_188)
			.body(ElFileBody("dsom/idp/VZWAALIDP17009_0188_request.json")))
		.exec(http("IDPtoYourCart_189")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_34))
		.exec(http("IDPtoYourCart_190")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_36)
			.body(ElFileBody("dsom/idp/VZWAALIDP17009_0190_request.json")))
//		.pause(1)
		.exec(http("IDPtoYourCart_191")
			.get("/retail/orderassembly/controller/process.php")
			.check(substring("Is the guest a Target credit or debit REDcard holder"))
			.headers(headers_58))
//		.pause(2)
		.exec(http("IDPtoYourCart_192")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("IDPtoYourCart_193")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("IDPtoYourCart_194")
			.get("/jslibs/modernizr.php")
			.headers(headers_4))
		.exec(http("IDPtoYourCart_195")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("IDPtoYourCart_196")
			.get("/template/public/styles/new.main.css")
			.headers(headers_5))
		.exec(http("IDPtoYourCart_197")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_5))
		.exec(http("IDPtoYourCart_198")
			.get("/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("IDPtoYourCart_199")
			.get("/js/retail/topnav.php")
			.headers(headers_4))
		.exec(http("IDPtoYourCart_200")
			.get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png")
			.headers(headers_186))
		.exec(http("IDPtoYourCart_201")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("IDPtoYourCart_202")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_5))
		.exec(http("IDPtoYourCart_203")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_5))
		.exec(http("IDPtoYourCart_204")
			.get("/js/retail/cart.js")
			.headers(headers_4))
		.exec(http("IDPtoYourCart_205")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("IDPtoYourCart_206")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("IDPtoYourCart_207")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("IDPtoYourCart_208")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("IDPtoYourCart_209")
			.get("/img/retail/cart.png"))
		.exec(http("IDPtoYourCart_210")
			.get("/img/retail/setting.png"))
		.exec(http("IDPtoYourCart_211")
			.get("/img/retail/home.png"))
		.exec(http("IDPtoYourCart_212")
			.get("/img/retail/inventory-management.png"))
		.exec(http("IDPtoYourCart_213")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("IDPtoYourCart_214")
			.get("/img/retail/save.png"))
		.exec(http("IDPtoYourCart_215")
			.get("/img/retail/lock.png"))
		.exec(http("IDPtoYourCart_216")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1501178069086")
			.headers(headers_25))
	}

//	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
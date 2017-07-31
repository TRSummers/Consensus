/*********************************************************
 * 
 *  
 * This simulation includes functionality for Verizon Add a Line and continues through the Your Cart page.
 * 
 * For this simulation to work, you need to use the following 
 * IMEI: YYZHOPEIMUNIQUE
 * Use phone number: 8122061972
 * 
 * 
 * Specifically, Steps are as follows:
 * 
 * Function Name denotes the required field in the Modularized Scenario
 * 
 *    Fucntion Name		Navigation
 *    =============		==========
 * 
 * 
 */


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object SprAALIDP {

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_2 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_3 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://poa-perf-scale.consensuscorpdev.com",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_4 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_41 = Map(
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_42 = Map(
		"Accept" -> "*/*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_43 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_45 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_47 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_58 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_310 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_311 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36",
		"sessionId" -> "${p_sessionid}")

	val headers_312 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 20 Jun 2017 00:11:12 GMT",
		"If-None-Match" -> "4d96a-17b8-5525916da44d8",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_313 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "PATCH",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val headers_314 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36",
		"cartId" -> "${p_sessionid}")

	val headers_376 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36")

	val uri1 = "https://perf-scale-dsom.consensuscorpdev.com"
	val uri2 = "https://perf-scale-ui.consensuscorpdev.com/shopping"
	val uri4 = "https://fonts.gstatic.com/s/lato/v13"
	val uri5 = "https://fonts.googleapis.com/css"

	val AddALinetoExistingAccount = group("AddALinetoExistingAccount") {
		exec(http("request_67")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_43)
			.resources(http("request_68")
				.post(uri1 + "/dsom-app/v1/getNextState")
				.headers(headers_45)
				.body(ElFileBody("dsom/addaline/SPRIDP_0068_request.json")),
				http("request_69")
					.get("/retail/orderassembly/controller/process.php?planType=addLine&action=buyTypeChosen")
					.check(substring("Check Your Upgrade Eligibility"))
					.headers(headers_47),
				http("request_70")
					.get("/retail/public/styles/normalize.php")
					.headers(headers_4),
				http("request_71")
					.get("/jslibs/jquery.php?ver=1.8.2")
					.headers(headers_2),
				http("request_72")
					.get("/jslibs/modernizr.php")
					.headers(headers_6),
				http("request_73")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2),
				http("request_74")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2),
				http("request_75")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2),
				http("request_76")
					.get("/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_77")
					.get("/js/retail/topnav.php")
					.headers(headers_6),
				http("request_78")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_79")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_80")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_81")
					.get("/js/retail/eligibility.js")
					.headers(headers_2),
				http("request_82")
					.get("/img/retail/notification-img.png")
					.headers(headers_2),
				http("request_83")
					.get("/img/retail/corps/plLgs596.png")
					.headers(headers_2),
				http("request_84")
					.get("/img/retail/corps/plLgs545.png")
					.headers(headers_2),
				http("request_85")
					.get("/img/retail/corps/plLgs660.png")
					.headers(headers_2),
				http("request_86")
					.get("/img/retail/ajax-loader.gif"),
				http("request_87")
					.get("/img/brands/target/retail/logo-mini.png")
					.headers(headers_2),
				http("request_88")
					.get("/retail/public/img/alertsprite.png")
					.headers(headers_2),
				http("request_89")
					.get("/retail/public/img/reservesprite.png")
					.headers(headers_2),
				http("request_90")
					.get("/img/retail/cart.png")
					.headers(headers_2),
				http("request_91")
					.get("/img/retail/icons-18-white.png"),
				http("request_92")
					.get("/img/retail/setting.png")
					.headers(headers_2),
				http("request_93")
					.get("/img/retail/home.png")
					.headers(headers_2),
				http("request_94")
					.get("/img/retail/inventory-management.png")
					.headers(headers_2),
				http("request_95")
					.get("/img/retail/customer-lookup.png")
					.headers(headers_2),
				http("request_96")
					.get("/img/retail/save.png")
					.headers(headers_2),
				http("request_97")
					.get("/img/retail/lock.png")
					.headers(headers_2),
				http("request_98")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285243318")
					.headers(headers_0),
				http("request_99")
					.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1499285243749&storeId=0003")
					.headers(headers_0)))
	}

	
	val AccountLookup_Sprint = group("AccountLookupSprint") {
		exec(http("request_100")
			.post("/retail/eligibility/eligibility.htm")
			.check(substring("Add a line to your existing account"))
			.headers(headers_3)
			.formParam("corpId", "545")
			.formParam("phoneNumber", "8122061972")
			.formParam("pNum", "8122061972")
			.formParam("last4SSN", "7373")
			.formParam("pin", "7373")
			.formParam("eligibility", "runcheck")
			.resources(http("request_101")
				.get("/retail/public/styles/normalize.php")
				.headers(headers_4),
				http("request_102")
					.get("/jslibs/jquery.php?ver=1.8.2")
					.headers(headers_2),
				http("request_103")
					.get("/jslibs/modernizr.php")
					.headers(headers_6),
				http("request_104")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2),
				http("request_105")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2),
				http("request_106")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2),
				http("request_107")
					.get("/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_108")
					.get("/js/retail/topnav.php")
					.headers(headers_6),
				http("request_109")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_110")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_111")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_112")
					.get("/js/retail/addalinetypeselection.js")
					.headers(headers_2),
				http("request_113")
					.get("/img/retail/ajax-loader.gif"),
				http("request_114")
					.get("/img/brands/target/retail/logo-mini.png"),
				http("request_115")
					.get("/retail/public/img/alertsprite.png"),
				http("request_116")
					.get("/retail/public/img/reservesprite.png"),
				http("request_117")
					.get("/img/retail/cart.png"),
				http("request_118")
					.get("/img/retail/setting.png"),
				http("request_119")
					.get("/img/retail/icons-18-white.png"),
				http("request_120")
					.get("/img/retail/home.png"),
				http("request_121")
					.get("/img/retail/inventory-management.png"),
				http("request_122")
					.get("/img/retail/customer-lookup.png"),
				http("request_123")
					.get("/img/retail/save.png"),
				http("request_124")
					.get("/img/retail/lock.png"),
				http("request_125")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285282267")
					.headers(headers_0),
				http("request_126")
					.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1499285282440&storeId=0003")
					.headers(headers_0)))
	}
	//.pause(13)
	val AddALinetoScan = group("AddALinetoScan") {
		exec(http("request_127")
			.post("/retail/orderassembly/addalinetypeselection.htm")
			.check(substring("Important note about the iPhone "))
			.headers(headers_3)
			.formParam("addLineType", "addFamilyLine")
			.formParam("maxedOutError", ""))
			//.pause(1)
			.exec(http("request_128")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_4)
			.resources(http("request_129")
				.get("/jslibs/jquery.php?ver=1.8.2")
				.headers(headers_2),
				http("request_130")
					.get("/jslibs/modernizr.php")
					.headers(headers_6),
				http("request_131")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2),
				http("request_132")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2),
				http("request_133")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2),
				http("request_134")
					.get("/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_135")
					.get("/js/retail/topnav.php")
					.headers(headers_6),
				http("request_136")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_137")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_138")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_139")
					.get("/js/retail/scanutilities.js")
					.headers(headers_2),
				http("request_140")
					.get("/js/retail/scanview.js")
					.headers(headers_2),
				http("request_141")
					.get("/img/retail/tooltips/imei-outsidebox.jpg")
					.headers(headers_2),
				http("request_142")
					.get("/img/retail/tooltips/esn-outsidebox.jpg")
					.headers(headers_2),
				http("request_143")
					.get("/img/retail/ajax-loader.gif"),
				http("request_144")
					.get("/img/brands/target/retail/logo-mini.png"),
				http("request_145")
					.get("/retail/public/img/alertsprite.png"),
				http("request_146")
					.get("/retail/public/img/reservesprite.png"),
				http("request_147")
					.get("/img/retail/cart.png"),
				http("request_148")
					.get("/img/retail/setting.png"),
				http("request_149")
					.get("/img/retail/home.png"),
				http("request_150")
					.get("/img/retail/inventory-management.png"),
				http("request_151")
					.get("/img/retail/customer-lookup.png"),
				http("request_152")
					.get("/img/retail/save.png"),
				http("request_153")
					.get("/img/retail/lock.png"),
				http("request_154")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285300800")
					.headers(headers_0)))
	}
	//.pause(39)
	val Scan = group("Scan") {
		exec(http("request_155")
			.post("/retail/orderassembly/scan.htm?action=addDevice")
			.check(substring("Sprint Lease is an industry-first"))
			.headers(headers_3)
			.formParam("prodIdents[addDeviceId]", "YYZHOPEIMUNIQUE")
			.formParam("currentStep", "addDeviceId")
			.formParam("testPrId", ""))
			//.pause(2)
			.exec(http("request_156")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_4)
			.resources(http("request_157")
				.get("/jslibs/jquery.php?ver=1.8.2")
				.headers(headers_2),
				http("request_158")
					.get("/jslibs/modernizr.php")
					.headers(headers_6),
				http("request_159")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2),
				http("request_160")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2),
				http("request_161")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2),
				http("request_162")
					.get("/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_163")
					.get("/js/retail/topnav.php")
					.headers(headers_6),
				http("request_164")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_165")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_166")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_167")
					.get("/js/retail/devicefinanceoptionview.js")
					.headers(headers_2),
				http("request_168")
					.get("/js/track.php?pageTag=RTLSP")
					.headers(headers_6),
				http("request_169")
					.get("/js/retail/paymentoptions.js")
					.headers(headers_2),
				http("request_170")
					.get("/img/retail/corps/plMed545.png")
					.headers(headers_2),
				http("request_171")
					.get("/img/retail/ajax-loader.gif"),
				http("request_172")
					.get("/img/brands/target/retail/logo-mini.png"),
				http("request_173")
					.get("/retail/public/img/alertsprite.png"),
				http("request_174")
					.get("/retail/public/img/reservesprite.png"),
				http("request_175")
					.get("/img/retail/cart.png"),
				http("request_176")
					.get("/img/retail/setting.png"),
				http("request_177")
					.get("/img/retail/home.png"),
				http("request_178")
					.get("/img/retail/inventory-management.png"),
				http("request_179")
					.get("/img/retail/customer-lookup.png"),
				http("request_180")
					.get("/img/retail/save.png"),
				http("request_181")
					.get("/img/retail/lock.png"),
				http("request_182")
					.get("/img/retail/icons-18-white.png"),
				http("request_183")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285348337")
					.headers(headers_0)))
	}
	//.pause(16)
	val PaymentOptions = group("PaymentOptions") {
		exec(http("request_184")
			.get("/retail/orderassembly/scan.htm?lastIndex=4&financingOptIn=1&fpId=1&contractType=4&maxLineReached=1")
			.headers(headers_47))
			//.pause(1)
			.exec(http("request_185")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_4)
			.resources(http("request_186")
				.get("/jslibs/jquery.php?ver=1.8.2")
				.headers(headers_2),
				http("request_187")
					.get("/jslibs/modernizr.php")
					.headers(headers_6),
				http("request_188")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2),
				http("request_189")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2),
				http("request_190")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2),
				http("request_191")
					.get("/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_192")
					.get("/js/retail/topnav.php")
					.headers(headers_6),
				http("request_193")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_194")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_195")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_196")
					.get("/js/retail/creditcheck.js")
					.headers(headers_2),
				http("request_197")
					.get("/js/retail/checkoutinit.js")
					.headers(headers_2),
				http("request_198")
					.get("/js/datechange.js")
					.headers(headers_2),
				http("request_199")
					.get("/js/retail/numport.php?devices=")
					.headers(headers_6),
				http("request_200")
					.get("/img/retail/ajax-loader.gif"),
				http("request_201")
					.get("/img/brands/target/retail/logo-mini.png"),
				http("request_202")
					.get("/retail/public/img/alertsprite.png"),
				http("request_203")
					.get("/retail/public/img/reservesprite.png"),
				http("request_204")
					.get("/img/retail/cart.png"),
				http("request_205")
					.get("/img/retail/setting.png"),
				http("request_206")
					.get("/img/retail/icons-18-white.png"),
				http("request_207")
					.get("/img/retail/home.png"),
				http("request_208")
					.get("/img/retail/inventory-management.png"),
				http("request_209")
					.get("/img/retail/customer-lookup.png"),
				http("request_210")
					.get("/img/retail/save.png"),
				http("request_211")
					.get("/img/retail/lock.png"),
				http("request_212")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285370691")
					.headers(headers_0)))
	}
	//.pause(26)
	val CreditCheck = group("CreditCheck") {
		exec(http("request_213")
			.post("/retail/creditcheck/creditcheck.htm")
			//.check(substring("Credit check successful"))
			.headers(headers_3)
			.formParam("creditCheckToolArray[1034][newOrExisting]", "existing")
			.formParam("creditCheckToolArray[1034][addLineType]", "addExistingPlan")
			.formParam("currentPageCOPId", "439")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "1")
			.formParam("edit", "")
			.formParam("Lines_To_Be_Activated", "4")
			.formParam("creditCheckToolArray[1034][numOfNewLines]", "1")
			.formParam("creditCheckToolArray[1034][numOfExistingLines]", "3")
			.formParam("Billing_Address_Radio", "unfinished")
			.formParam("Ecom_BillTo_Postal_Name_First", "Teddy")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "McTest")
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
			.exec(http("request_214")
				.get("/retail/public/styles/normalize.php")
				.headers(headers_4))
			.exec(http("request_215")
					.get("/jslibs/jquery.php?ver=1.8.2")
					.headers(headers_2))
				.exec(http("request_216")
					.get("/jslibs/modernizr.php")
					.headers(headers_6))
				.exec(http("request_217")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2))
				.exec(http("request_218")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2))
				.exec(http("request_219")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2))
				.exec(http("request_220")
					.get("/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_221")
					.get("/js/retail/topnav.php")
					.headers(headers_6))
				.exec(http("request_222")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_223")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_224")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_225")
					.get("/img/brands/target/retail/ajax-loader-l.gif")
					.headers(headers_2))
				.exec(http("request_226")
					.get("/img/retail/ajax-loader.gif"))
				.exec(http("request_227")
					.get("/img/brands/target/retail/logo-mini.png"))
				.exec(http("request_228")
					.get("/retail/public/img/alertsprite.png"))
				.exec(http("request_229")
					.get("/retail/public/img/reservesprite.png"))
				.exec(http("request_230")
					.get("/img/retail/cart.png"))
				.exec(http("request_231")
					.get("/img/retail/setting.png"))
				.exec(http("request_232")
					.get("/img/retail/home.png"))
				.exec(http("request_233")
					.get("/img/retail/inventory-management.png"))
				.exec(http("request_234")
					.get("/img/retail/customer-lookup.png"))
				.exec(http("request_235")
					.get("/img/retail/save.png"))
				.exec(http("request_236")
					.get("/img/retail/lock.png"))
				.exec(http("request_237")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285412397")
					.headers(headers_0))
				.exec(http("request_238")
					.get("/retail/creditcheck/controller/runprecreditcheck.php")
					.headers(headers_47))
				.exec(http("request_239")
					.get("/retail/public/styles/normalize.php")
					.headers(headers_4))
				.exec(http("request_240")
					.get("/jslibs/jquery.php?ver=1.8.2")
					.headers(headers_2))
				.exec(http("request_241")
					.get("/jslibs/modernizr.php")
					.headers(headers_6))
				.exec(http("request_242")
					.get("/img/brands/target/retail/ajax-loader-l.gif"))
				.exec(http("request_243")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2))
				.exec(http("request_244")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2))
				.exec(http("request_245")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2))
				.exec(http("request_246")
					.get("/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_247")
					.get("/js/retail/topnav.php")
					.headers(headers_6))
				.exec(http("request_248")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_249")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_250")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_251")
					.get("/img/retail/ajax-loader.gif"))
				.exec(http("request_252")
					.get("/img/brands/target/retail/logo-mini.png"))
				.exec(http("request_253")
					.get("/retail/public/img/alertsprite.png"))
				.exec(http("request_254")
					.get("/retail/public/img/reservesprite.png"))
				.exec(http("request_255")
					.get("/img/retail/cart.png"))
				.exec(http("request_256")
					.get("/img/retail/setting.png"))
				.exec(http("request_257")
					.get("/img/retail/home.png"))
				.exec(http("request_258")
					.get("/img/retail/inventory-management.png"))
				.exec(http("request_259")
					.get("/img/retail/customer-lookup.png"))
				.exec(http("request_260")
					.get("/img/retail/save.png"))
				.exec(http("request_261")
					.get("/img/retail/lock.png"))
				.exec(http("request_262")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285415945")
					.headers(headers_0))
				.exec(http("request_263")
					.get("/retail/creditcheck/controller/runprecreditcheck.php")
					.check(substring("Carrier credit check successful"))
					.headers(headers_47))
			//.pause(2)
			.exec(http("request_264")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_4))
			.exec(http("request_265")
				.get("/jslibs/jquery.php?ver=1.8.2")
				.headers(headers_2))
			.exec(http("request_266")
					.get("/jslibs/modernizr.php")
					.headers(headers_6))
				.exec(http("request_267")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2))
				.exec(http("request_268")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2))
				.exec(http("request_269")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2))
				.exec(http("request_270")
					.get("/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_271")
					.get("/js/retail/topnav.php")
					.headers(headers_6))
				.exec(http("request_272")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_273")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_274")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_275")
					.get("/js/retail/creditcheckresult.js")
					.headers(headers_2))
				.exec(http("request_276")
					.get("/img/corpLogos/plLg545.gif")
					.headers(headers_2))
				.exec(http("request_277")
					.get("/img/retail/ajax-loader.gif"))
				.exec(http("request_278")
					.get("/img/brands/target/retail/logo-mini.png"))
				.exec(http("request_279")
					.get("/retail/public/img/alertsprite.png"))
				.exec(http("request_280")
					.get("/retail/public/img/reservesprite.png"))
				.exec(http("request_281")
					.get("/img/retail/cart.png"))
				.exec(http("request_282")
					.get("/img/retail/setting.png"))
				.exec(http("request_283")
					.get("/img/retail/icons-18-white.png"))
				.exec(http("request_284")
					.get("/img/retail/home.png"))
				.exec(http("request_285")
					.get("/img/retail/inventory-management.png"))
				.exec(http("request_286")
					.get("/img/retail/customer-lookup.png"))
				.exec(http("request_287")
					.get("/img/retail/save.png"))
				.exec(http("request_288")
					.get("/img/retail/lock.png"))
				.exec(http("request_289")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285420031")
					.headers(headers_0))
	}
			//.pause(15)
	val CreditChecktoIDP=group("CreditChecktoIDP"){
			exec(http("request_290")
			.post("/retail/creditcheck/result.htm")
			.headers(headers_3)
			.formParam("submitType", "continue")
			.formParam("acceptCorp", "545")
			.formParam("acceptType", "failed")
			.formParam("secondRun", "")
			.formParam("numofline_to_activate", "1")
			.formParam("checkbox-1", "on"))
			.exec(http("request_291")
				.get(uri2 + "/build/css_7f6c25a39d0ca95bcf3f_min.js")
				.headers(headers_2))
				.exec(http("request_292")
					.get(uri2 + "/build/bundle_7f6c25a39d0ca95bcf3f_min.js")
					.headers(headers_2))
				.exec(http("request_293")
					.get(uri2 + "/assets/img/cloader.gif")
					.headers(headers_2))
				.exec(http("request_294")
					.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin")
					.headers(headers_2))
				.exec(http("request_295")
					.get(uri4 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
					.headers(headers_41))
				.exec(http("request_296")
					.get(uri2 + "/config.json")
					.headers(headers_42))
				.exec(http("request_297")
					.options(uri1 + "/dsom-app/v1/getContentForAisle")
					.headers(headers_43))
				.exec(http("request_298")
					.options(uri1 + "/dsom-app/v1/getNextState")
					.headers(headers_43))
				.exec(http("request_299")
					.post(uri1 + "/dsom-app/v1/getContentForAisle")
					.headers(headers_45)
					.body(ElFileBody("dsom/creditcheck/SPRIDP_0299_request.json")))
				.exec(http("request_300")
					.post(uri1 + "/dsom-app/v1/getNextState")
					.headers(headers_45)
					.body(ElFileBody("dsom/creditcheck/SPRIDP_0300_request.json")))
			//.pause(1)
			.exec(http("request_301")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			  .check(substring("Choose how you want to pay for your device"))
			.headers(headers_45)
			.body(ElFileBody("dsom/creditcheck/SPRIDP_0301_request.json")))
			.exec(http("request_302")
				.get(uri2 + "/build/ch_bbfd1a7cd9bfd1abb10d_min.js")
				.headers(headers_2))
				.exec(http("request_303")
					.get(uri2 + "/app/pages/frame/header/header.html")
					.headers(headers_58))
				.exec(http("request_304")
					.get(uri2 + "/app/pages/frame/footer/footer.html")
					.headers(headers_58))
				.exec(http("request_305")
					.get(uri2 + "/app/pages/installmentdetails/installmentdetails.html")
					.headers(headers_58))
				.exec(http("request_306")
					.get(uri2 + "/app/components/channel/channel.html")
					.headers(headers_58))
				.exec(http("request_307")
					.get(uri2 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
					.headers(headers_41))
				.exec(http("request_308")
					.get(uri4 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
					.headers(headers_41))
				.exec(http("request_309")
					.get(uri2 + "/assets/img/bullseye.svg")
					.headers(headers_2))
				.exec(http("request_310")
					.options(uri1 + "/dsom-app/v1/paymentPlans")
					.headers(headers_310))
				.exec(http("request_311")
					.get(uri1 + "/dsom-app/v1/paymentPlans")
					.headers(headers_311))
				.exec(http("request_312")
					.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png")
					.headers(headers_312))
	}
	//.pause(89)
	val IDPtoYourCart = group("IDPtoYourCart") {
		exec(http("request_313")
			.options(uri1 + "/session/dsom/v1/cart/item/8")
			.headers(headers_313))
			.exec(http("request_314")
				.patch(uri1 + "/session/dsom/v1/cart/item/8")
				.headers(headers_314)
				.body(ElFileBody("dsom/idp/SPRIDP_0314_request.json")))
			.exec(http("request_315")
					.options(uri1 + "/dsom-app/v1/getNextState")
					.headers(headers_43))
			.exec(http("request_316")
					.post(uri1 + "/dsom-app/v1/getNextState")
					.headers(headers_45)
					.body(ElFileBody("dsom/idp/SPRIDP_0316_request.json")))
			//.pause(1)
			.exec(http("request_317")
			.get("/retail/orderassembly/controller/process.php")
			 // .check(substring("Capital Cost"))
			.headers(headers_47))
			//.pause(3)
			.exec(http("request_318")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_4))
			.exec(http("request_319")
				.get("/jslibs/jquery.php?ver=1.8.2")
				.headers(headers_2))
				.exec(http("request_320")
					.get("/jslibs/modernizr.php")
					.headers(headers_6))
				.exec(http("request_321")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2))
				.exec(http("request_322")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2))
				.exec(http("request_323")
					.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png")
					.headers(headers_312))
				.exec(http("request_324")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2))
				.exec(http("request_325")
					.get("/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_326")
					.get("/js/retail/topnav.php")
					.headers(headers_6))
				.exec(http("request_327")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_328")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2))
				.exec(http("request_329")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2))
				.exec(http("request_330")
					.get("/js/retail/cart.js")
					.headers(headers_6))
				.exec(http("request_331")
					.get("/img/retail/ajax-loader.gif"))
				.exec(http("request_332")
					.get("/img/brands/target/retail/logo-mini.png"))
				.exec(http("request_333")
					.get("/retail/public/img/alertsprite.png"))
				.exec(http("request_334")
					.get("/retail/public/img/reservesprite.png"))
				.exec(http("request_335")
					.get("/img/retail/cart.png"))
				.exec(http("request_336")
					.get("/img/retail/setting.png"))
				.exec(http("request_337")
					.get("/img/retail/home.png"))
				.exec(http("request_338")
					.get("/img/retail/inventory-management.png"))
				.exec(http("request_339")
					.get("/img/retail/customer-lookup.png"))
				.exec(http("request_340")
					.get("/img/retail/save.png"))
				.exec(http("request_341")
					.get("/img/retail/lock.png"))
				.exec(http("request_342")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285544312")
					.headers(headers_0))
	}/***
	val NewGuest=group("NewGuet"){
			//.pause(45)
			.exec(http("request_343")
			.get("/retail/orderassembly/controller/newcustomer.php")
			.headers(headers_47))
			//.pause(1)
			.exec(http("request_344")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_4)
			.resources(http("request_345")
				.get("/jslibs/jquery.php?ver=1.8.2")
				.headers(headers_2),
				http("request_346")
					.get("/jslibs/modernizr.php")
					.headers(headers_6),
				http("request_347")
					.get("/jslibs/jquerymobile.php")
					.headers(headers_2),
				http("request_348")
					.get("/template/public/styles/new.main.css")
					.headers(headers_2),
				http("request_349")
					.get("/template/css/semantic.jqmsafe.min.css")
					.headers(headers_2),
				http("request_350")
					.get("/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_351")
					.get("/js/retail/topnav.php")
					.headers(headers_6),
				http("request_352")
					.get("/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_353")
					.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
					.headers(headers_2),
				http("request_354")
					.get("/brands/target/retail/public/styles/main.css")
					.headers(headers_2),
				http("request_355")
					.get("/img/brands/target/retail/sales-activation.png")
					.headers(headers_2),
				http("request_356")
					.get("/img/brands/target/retail/upgrade-eligibility.png")
					.headers(headers_2),
				http("request_357")
					.get("/img/brands/target/retail/trade-in.png")
					.headers(headers_2),
				http("request_358")
					.get("/img/brands/target/retail/appleCare.png")
					.headers(headers_2),
				http("request_359")
					.get("/img/brands/target/retail/account-lookup.png")
					.headers(headers_2),
				http("request_360")
					.get("/img/brands/target/retail/prepaid.png")
					.headers(headers_2),
				http("request_361")
					.get("/img/brands/target/retail/plan_calculator.png")
					.headers(headers_2),
				http("request_362")
					.get("/img/brands/target/retail/digital_TV_dash.png")
					.headers(headers_2),
				http("request_363")
					.get("/img/retail/ajax-loader.gif"),
				http("request_364")
					.get("/img/brands/target/retail/logo-mini.png"),
				http("request_365")
					.get("/retail/public/img/alertsprite.png"),
				http("request_366")
					.get("/retail/public/img/reservesprite.png"),
				http("request_367")
					.get("/img/retail/cart.png"),
				http("request_368")
					.get("/img/retail/setting.png"),
				http("request_369")
					.get("/img/retail/home.png"),
				http("request_370")
					.get("/img/retail/inventory-management.png"),
				http("request_371")
					.get("/img/retail/customer-lookup.png"),
				http("request_372")
					.get("/img/retail/save.png"),
				http("request_373")
					.get("/img/retail/lock.png"),
				http("request_374")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285593512")
					.headers(headers_0),
				http("request_375")
					.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1499285593737&storeId=0003")
					.headers(headers_0)))
			//.pause(2)
			.exec(http("request_376")
			.get("/img/retail/faqs.png")
			.headers(headers_376)
			.resources(http("request_377")
				.get("/img/brands/poa-training/training-m.png")
				.headers(headers_376),
				http("request_378")
					.get("/img/retail/logout.png")
					.headers(headers_376)))
			//.pause(1)
			.exec(http("request_379")
			.get("/retail/orderassembly/controller/newcustomer.php?logout=1")
			.headers(headers_47)
			.resources(http("request_380")
				.get("/img/retail/ajax-loader.gif"),
				http("request_381")
					.get("/img/brands/target/retail/login-logo.jpg")
					.headers(headers_2),
				http("request_382")
					.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1499285600485")
					.headers(headers_0)))
	}
	}***/
//	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
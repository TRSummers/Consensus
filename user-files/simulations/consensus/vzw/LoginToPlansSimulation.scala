package consensus.vzw

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import Common

class LoginToPlansSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://perf-scale-dsom.consensuscorpdev.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://poa-perf-scale.consensuscorpdev.com",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_5 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_12 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_31 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_41 = Map(
		"Accept" -> "*/*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_42 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_44 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_46 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_59 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_65 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 20 Jun 2017 00:11:22 GMT",
		"If-None-Match" -> "98da-26dd-55259176f5af9",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_69 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_70 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36",
		"cartId" -> "${p_sessionId}")

	val headers_82 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 20 Jun 2017 00:11:12 GMT",
		"If-None-Match" -> "1344e-2c63-5525916de3c6f",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_84 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 20 Jun 2017 00:11:23 GMT",
		"If-None-Match" -> "62e77-10fe-55259177db2cf",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_125 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_126 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36",
		"sessionId" -> "${p_sessionId}")

	val headers_127 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 20 Jun 2017 00:11:12 GMT",
		"If-None-Match" -> "4e153-1948-5525916ddbf70",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_128 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "PATCH",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_129 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36",
		"cartId" -> "${p_sessionId}")

	val headers_143 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 20 Jun 2017 00:11:21 GMT",
		"If-None-Match" -> "7048-148-552591768b3dd",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

    val uri2 = "https://perf-scale-ui.consensuscorpdev.com/shopping"
    val uri3 = "https://poa-perf-scale.consensuscorpdev.com"
    val uri4 = "https://fonts.gstatic.com/s/lato/v13"
    val uri5 = "https://fonts.googleapis.com/css"




	val scn = scenario("LoginToPlansSimulation")
		.exec(http("request_0")
			.post(uri3 + "/retail/login.htm")
			//.check(regex("blank'>(.+?)<").saveAs("p_sessionId"))
			.headers(headers_0)
			.formParam("userName", "tadmin2")
			.formParam("userPassword", "target1234")
			.formParam("newStoreId", "0003")
			.formParam("storeId", "0003")
			.check(headerRegex("Set-Cookie", "sessionId=(.+?);").saveAs("p_sessionId"))
			.resources(http("request_1")
			.get(uri3 + "/retail/public/styles/normalize.php")
			.headers(headers_1),
            http("request_2")
			.get(uri3 + "/jslibs/jquery.php?ver=1.8.2"),
            http("request_3")
			.get(uri3 + "/jslibs/jquerymobile.php"),
            http("request_4")
			.get(uri3 + "/template/public/styles/new.main.css"),
            http("request_5")
			.get(uri3 + "/jslibs/modernizr.php")
			.headers(headers_5),
            http("request_6")
			.get(uri3 + "/template/css/semantic.jqmsafe.min.css"),
            http("request_7")
			.get(uri3 + "/retail/public/styles/main.css"),
            http("request_8")
			.get(uri3 + "/js/retail/topnav.php")
			.headers(headers_5),
            http("request_9")
			.get(uri3 + "/retail/public/styles/jquery.mobile-1.2.0.css"),
            http("request_10")
			.get(uri3 + "/brands/target/retail/public/styles/jquery.mobile-1.2.0.css"),
            http("request_11")
			.get(uri3 + "/brands/target/retail/public/styles/main.css"),
            http("request_12")
			.get(uri3 + "/img/brands/target/retail/sales-activation.png")
			.headers(headers_12),
            http("request_13")
			.get(uri3 + "/img/brands/target/retail/upgrade-eligibility.png")
			.headers(headers_12),
            http("request_14")
			.get(uri3 + "/img/brands/target/retail/trade-in.png")
			.headers(headers_12),
            http("request_15")
			.get(uri3 + "/img/brands/target/retail/appleCare.png")
			.headers(headers_12),
            http("request_16")
			.get(uri3 + "/img/brands/target/retail/account-lookup.png")
			.headers(headers_12),
            http("request_17")
			.get(uri3 + "/img/brands/target/retail/prepaid.png")
			.headers(headers_12),
            http("request_18")
			.get(uri3 + "/img/brands/target/retail/plan_calculator.png")
			.headers(headers_12),
            http("request_19")
			.get(uri3 + "/img/brands/target/retail/digital_TV_dash.png")
			.headers(headers_12),
            http("request_20")
			.get(uri3 + "/img/retail/ajax-loader.gif"),
            http("request_21")
			.get(uri3 + "/img/brands/target/retail/logo-mini.png")
			.headers(headers_12),
            http("request_22")
			.get(uri3 + "/retail/public/img/alertsprite.png")
			.headers(headers_12),
            http("request_23")
			.get(uri3 + "/retail/public/img/reservesprite.png")
			.headers(headers_12),
            http("request_24")
			.get(uri3 + "/img/retail/cart.png")
			.headers(headers_12),
            http("request_25")
			.get(uri3 + "/img/retail/setting.png")
			.headers(headers_12),
            http("request_26")
			.get(uri3 + "/img/retail/home.png")
			.headers(headers_12),
            http("request_27")
			.get(uri3 + "/img/retail/inventory-management.png")
			.headers(headers_12),
            http("request_28")
			.get(uri3 + "/img/retail/customer-lookup.png")
			.headers(headers_12),
            http("request_29")
			.get(uri3 + "/img/retail/save.png")
			.headers(headers_12),
            http("request_30")
			.get(uri3 + "/img/retail/lock.png")
			.headers(headers_12),
            http("request_31")
			.get(uri3 + "/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1497991137471")
			.headers(headers_31),
            http("request_32")
			.get(uri3 + "/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1497991137650&storeId=0003")
			.headers(headers_31)))
		.pause(2)
		.exec(http("request_33")
			.post(uri3 + "/retail/")
			.headers(headers_0)
			.formParam("redirectUrl", "https%3A%2F%2Fperf-scale-ui.consensuscorpdev.com%2Fshopping%2F")
			.formParam("userAction", "shopping"))
		.pause(76)
		.exec(http("request_34")
			.get(uri2 + "/build/css_d4c30075bc2eb1a8b7a8_min.js")
			.resources(http("request_35")
			.get(uri2 + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js"),
            http("request_36")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin"),
            http("request_37")
			.get(uri2 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2"),
            http("request_38")
			.get(uri4 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"),
            http("request_39")
			.get(uri4 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2"),
            http("request_40")
			.get(uri2 + "/assets/img/cloader.gif"),
            http("request_41")
			.get(uri2 + "/config.json")
			.headers(headers_41),
            http("request_42")
			.options("/dsom-app/v1/getContentForAisle")
			.headers(headers_42),
            http("request_43")
			.options("/dsom-app/v1/getNextState")
			.headers(headers_42),
            http("request_44")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0044_request.txt")),
            http("request_45")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0045_request.txt")),
            http("request_46")
			.get(uri3 + "/retail/orderassembly/controller/process.php")
			.headers(headers_46),
            http("request_47")
			.get(uri2 + "/build/css_d4c30075bc2eb1a8b7a8_min.js"),
            http("request_48")
			.get(uri2 + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js"),
            http("request_49")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin"),
            http("request_50")
			.get(uri2 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2"),
            http("request_51")
			.get(uri4 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"),
            http("request_52")
			.get(uri4 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2"),
            http("request_53")
			.get(uri2 + "/assets/img/cloader.gif"),
            http("request_54")
			.get(uri2 + "/config.json")
			.headers(headers_41),
            http("request_55")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0055_request.txt")),
            http("request_56")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0056_request.txt")),
            http("request_57")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0057_request.txt")),
            http("request_58")
			.get(uri2 + "/build/ch_9afac72ed1aa9ce2cabc_min.js")
			.headers(headers_12),
            http("request_59")
			.get(uri2 + "/app/pages/frame/header/header.html")
			.headers(headers_59),
            http("request_60")
			.get(uri2 + "/app/pages/frame/footer/footer.html")
			.headers(headers_59),
            http("request_61")
			.get(uri2 + "/app/pages/choosepath/choosepath.html")
			.headers(headers_59),
            http("request_62")
			.get(uri2 + "/assets/img/bullseye.svg"),
            http("request_63")
			.get(uri2 + "/app/pages/choosepath/partials/optionscolumn.html")
			.headers(headers_59),
            http("request_64")
			.get(uri3 + "/img/brands/target/retail/sign_up_new_red.svg")
			.headers(headers_12),
            http("request_65")
			.get(uri3 + "/img/brands/target/retail/upgrade_new_red.svg")
			.headers(headers_65)))
		.pause(2)
		.exec(http("request_66")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0066_request.txt"))
			.resources(http("request_67")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0067_request.txt")),
            http("request_68")
			.get(uri2 + "/app/pages/scan/scan.html")
			.headers(headers_59)))
		.pause(12)
		.exec(http("request_69")
			.options("/session/dsom/v1/cart/item")
			.headers(headers_69)
			.resources(http("request_70")
			.post("/session/dsom/v1/cart/item")
			.headers(headers_70)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0070_request.txt")),
            http("request_71")
			.options("/dsom-app/v1/getNextState")
			.headers(headers_42),
            http("request_72")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0072_request.txt"))))
		.pause(1)
		.exec(http("request_73")
			.options("/dsom-app/v1/getContentForAisle")
			.headers(headers_42)
			.resources(http("request_74")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0074_request.txt")),
            http("request_75")
			.get(uri2 + "/app/pages/paymentoptions/paymentoptions.html")
			.headers(headers_59),
            http("request_76")
			.options("/dsom-app/v1/getPaymentDetails")
			.headers(headers_42),
            http("request_77")
			.post("/dsom-app/v1/getPaymentDetails")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0077_request.txt")),
            http("request_78")
			.get(uri2 + "/assets/img/verizon.svg")
			.headers(headers_12)))
		.pause(1)
		.exec(http("request_79")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0079_request.txt")))
		.pause(1)
		.exec(http("request_80")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0080_request.txt"))
			.resources(http("request_81")
			.get(uri2 + "/app/pages/cartwheel/cartwheel.html")
			.headers(headers_59),
            http("request_82")
			.get(uri3 + "/img/retail/cartwheel/cartwheel_logo.png")
			.headers(headers_82),
            http("request_83")
			.get(uri3 + "/img/retail/cartwheel/apple_store_icon.png")
			.headers(headers_12),
            http("request_84")
			.get(uri3 + "/img/retail/cartwheel/google_store_icon.png")
			.headers(headers_84)))
		.pause(1)
		.exec(http("request_85")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0085_request.txt"))
			.resources(http("request_86")
			.get(uri3 + "/retail/orderassembly/controller/process.php")
			.headers(headers_46),
            http("request_87")
			.get(uri2 + "/build/css_d4c30075bc2eb1a8b7a8_min.js"),
            http("request_88")
			.get(uri2 + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js"),
            http("request_89")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin"),
            http("request_90")
			.get(uri2 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2"),
            http("request_91")
			.get(uri4 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"),
            http("request_92")
			.get(uri4 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2"),
            http("request_93")
			.get(uri2 + "/assets/img/cloader.gif"),
            http("request_94")
			.get(uri2 + "/config.json")
			.headers(headers_41),
            http("request_95")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0095_request.txt")),
            http("request_96")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0096_request.txt")),
            http("request_97")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0097_request.txt")),
            http("request_98")
			.get(uri2 + "/build/ch_9afac72ed1aa9ce2cabc_min.js")
			.headers(headers_12),
            http("request_99")
			.get(uri2 + "/app/pages/frame/header/header.html")
			.headers(headers_59),
            http("request_100")
			.get(uri2 + "/app/pages/frame/footer/footer.html")
			.headers(headers_59),
            http("request_101")
			.get(uri2 + "/app/pages/creditcheck/creditcheck.html")
			.headers(headers_59),
            http("request_102")
			.get(uri2 + "/assets/img/bullseye.svg")))
		.pause(297)
		.exec(http("request_103")
			.options("/dsom-app/v1/getNextState")
			.headers(headers_42)
			.resources(http("request_104")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0104_request.txt"))))
		.pause(4)
		.exec(http("request_105")
			.get(uri3 + "/retail/orderassembly/controller/process.php")
			.headers(headers_46)
			.resources(http("request_106")
			.get(uri2 + "/build/css_d4c30075bc2eb1a8b7a8_min.js"),
            http("request_107")
			.get(uri2 + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js"),
            http("request_108")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin"),
            http("request_109")
			.get(uri2 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2"),
            http("request_110")
			.get(uri4 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"),
            http("request_111")
			.get(uri4 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2"),
            http("request_112")
			.get(uri2 + "/assets/img/cloader.gif"),
            http("request_113")
			.get(uri2 + "/config.json")
			.headers(headers_41),
            http("request_114")
			.options("/dsom-app/v1/getContentForAisle")
			.headers(headers_42),
            http("request_115")
			.options("/dsom-app/v1/getNextState")
			.headers(headers_42),
            http("request_116")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0116_request.txt")),
            http("request_117")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0117_request.txt")),
            http("request_118")
			.post("/dsom-app/v1/getContentForAisle")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0118_request.txt")),
            http("request_119")
			.get(uri2 + "/build/ch_9afac72ed1aa9ce2cabc_min.js")
			.headers(headers_12),
            http("request_120")
			.get(uri2 + "/app/pages/frame/header/header.html")
			.headers(headers_59),
            http("request_121")
			.get(uri2 + "/app/pages/frame/footer/footer.html")
			.headers(headers_59),
            http("request_122")
			.get(uri2 + "/app/pages/installmentdetails/installmentdetails.html")
			.headers(headers_59),
            http("request_123")
			.get(uri2 + "/assets/img/bullseye.svg"),
            http("request_124")
			.get(uri2 + "/app/components/channel/channel.html")
			.headers(headers_59),
            http("request_125")
			.options("/dsom-app/v1/paymentPlans")
			.headers(headers_125),
            http("request_126")
			.get("/dsom-app/v1/paymentPlans")
			.headers(headers_126),
            http("request_127")
			.get(uri3 + "/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png")
			.headers(headers_127)))
		.pause(6)
		.exec(http("request_128")
			.options("/session/dsom/v1/cart/item/1")
			.headers(headers_128)
			.resources(http("request_129")
			.patch("/session/dsom/v1/cart/item/1")
			.headers(headers_129)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0129_request.txt")),
            http("request_130")
			.post("/dsom-app/v1/getNextState")
			.headers(headers_44)
			.body(RawFileBody("LoginToPlans/LoginToPlansSimulation_0130_request.txt"))))
		.pause(1)
		.exec(http("request_131")
			.get(uri3 + "/retail/orderassembly/controller/process.php")
			.headers(headers_46))
		.pause(1)
		.exec(http("request_132")
			.get(uri3 + "/retail/public/styles/normalize.php")
			.headers(headers_1)
			.resources(http("request_133")
			.get(uri3 + "/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_12),
            http("request_134")
			.get(uri3 + "/jslibs/modernizr.php")
			.headers(headers_5),
            http("request_135")
			.get(uri3 + "/jslibs/jquerymobile.php")
			.headers(headers_12),
            http("request_136")
			.get(uri3 + "/template/public/styles/new.main.css")
			.headers(headers_12),
            http("request_137")
			.get(uri3 + "/template/css/semantic.jqmsafe.min.css")
			.headers(headers_12),
            http("request_138")
			.get(uri3 + "/retail/public/styles/main.css")
			.headers(headers_12),
            http("request_139")
			.get(uri3 + "/js/retail/topnav.php")
			.headers(headers_5),
            http("request_140")
			.get(uri3 + "/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_12),
            http("request_141")
			.get(uri3 + "/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_12),
            http("request_142")
			.get(uri3 + "/brands/target/retail/public/styles/main.css")
			.headers(headers_12),
            http("request_143")
			.get(uri3 + "/js/retail/plans.js")
			.headers(headers_143),
            http("request_144")
			.get(uri3 + "/img/retail/ajax-loader.gif")
			.headers(headers_12),
            http("request_145")
			.get(uri3 + "/img/brands/target/retail/logo-mini.png")
			.headers(headers_12),
            http("request_146")
			.get(uri3 + "/retail/public/img/alertsprite.png")
			.headers(headers_12),
            http("request_147")
			.get(uri3 + "/retail/public/img/reservesprite.png")
			.headers(headers_12),
            http("request_148")
			.get(uri3 + "/img/retail/cart.png")
			.headers(headers_12),
            http("request_149")
			.get(uri3 + "/img/retail/setting.png")
			.headers(headers_12),
            http("request_150")
			.get(uri3 + "/img/retail/home.png")
			.headers(headers_12),
            http("request_151")
			.get(uri3 + "/img/retail/inventory-management.png")
			.headers(headers_12),
            http("request_152")
			.get(uri3 + "/img/retail/customer-lookup.png")
			.headers(headers_12),
            http("request_153")
			.get(uri3 + "/img/retail/save.png")
			.headers(headers_12),
            http("request_154")
			.get(uri3 + "/img/retail/lock.png")
			.headers(headers_12),
            http("request_155")
			.get(uri3 + "/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1497991644223")
			.headers(headers_31)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
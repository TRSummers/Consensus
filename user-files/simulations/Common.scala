
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

//class Common extends Simulation {
object Common{
	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")
	val Logoutheaders_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val Logoutheaders_1 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/login.htm")

	val Logoutheaders_2 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/login.htm")

	val Logoutheaders_4 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/login.htm",
		"X-Requested-With" -> "XMLHttpRequest")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "max-age=0",
    "Connection" -> "keep-alive",
    "Origin" -> "https://poa-perf-scale.consensuscorpdev.com",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val ui_headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val ui_headers_5 = Map(
    "Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val ui_headers_6 = Map(
    "Accept" -> "*/*",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest")

  val ui_headers_22 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val dsom_headers_7 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Access-Control-Request-Headers" -> "content-type",
    "Access-Control-Request-Method" -> "POST",
    "Connection" -> "keep-alive",
    "Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val dsom_headers_9 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val dsom_headers_10 = Map(
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

  val poa_headers_11 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/login.htm?brandId=731&metaCode=newSession")

	val headers_2 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/login.htm?brandId=731&metaCode=newSession")

	val headers_4 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/login.htm?brandId=731&metaCode=newSession",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_10 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/login.htm?brandId=731&metaCode=newSession")

	val headers_11 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val headers_12 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val headers_14 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_16 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val headers_17 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm")

	val headers_18 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm")

	val headers_20 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_21 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm")

	val headers_22 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val headers_23 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val headers_25 = Map("Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val headers_30 = Map(
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val headers_31 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")

	val dsom_headers_100 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val dsom_headers_101 = Map(
		"Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Connection" -> "keep-alive",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val headers_106 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val headers_107 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val headers_108 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val headers_1011 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm",
		"X-Requested-With" -> "XMLHttpRequest")
	val headers_1012 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val headers_1013 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val headers_1014 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val headers_1016 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_1017 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_1023 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_1024 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_1026 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm",
		"X-Requested-With" -> "XMLHttpRequest")


    val uri_poa = "https://poa-perf-scale.consensuscorpdev.com:443"
    val uri_dsom = "https://perf-scale-dsom.consensuscorpdev.com:443"

    val uri_ui       = "https://perf-scale-ui.consensuscorpdev.com/shopping"
    val uri_dsom_v1  = "https://perf-scale-dsom.consensuscorpdev.com/dsom-app/v1"
    val uri4_gstatic = "https://fonts.gstatic.com/s/lato/v13"
    val uri5_google  = "https://fonts.googleapis.com/css"



	val LoginToRetail=group("LoginToRetail"){
		exec(http("Login")
			.get("/retail/login.htm?brandId=731&metaCode=newSession"))
		.pause(155 milliseconds)
		.exec(http("Login_1")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("Login_2")
			.get("/jslibs/modernizr.php")
			.headers(headers_2))
		.exec(http("Login_3")
			.get("/js/retail/topnav.php")
			.headers(headers_2))
		.pause(105 milliseconds)
		.exec(http("Login_4")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013173473")
			.headers(headers_4))
		//.pause(12)
		.exec(http("Login_5_findstores")
			.get("/ajax/retail/findstores.php?storeId=")
			.headers(headers_4))
		.pause(774 milliseconds)
		.exec(http("Login_6_findstores")
			.get("/ajax/retail/findstores.php?storeId=0")
			.headers(headers_4))
		.pause(959 milliseconds)
		.exec(http("Login_7_findstores")
			.get("/ajax/retail/findstores.php?storeId=00")
			.headers(headers_4))
		.pause(960 milliseconds)
		.exec(http("Login_8_findstores")
			.get("/ajax/retail/findstores.php?storeId=000")
			.headers(headers_4))
		.pause(802 milliseconds)
		.exec(http("Login_9_findstores")
			.get("/ajax/retail/findstores.php?storeId=0003")
			.headers(headers_4))
		.pause(3)
		.exec(http("Login_10")
			.post("/retail/login.htm")
			.headers(headers_10)
			.formParam("userName", "tadmin2")
			.formParam("userPassword", "target1234")
			.formParam("newStoreId", "0003")
			.formParam("storeId", "0003"))
		.exec(http("Login_11_0_newcustomer")
			.get("/retail/orderassembly/controller/newcustomer.php")
			.headers(headers_10))
    .exec(http("Login_11_1_retail")
        .get("/retail/")
        .check(regex("blank'>(.+?)<").saveAs("p_sessionid"))
        .headers(headers_10))
		.exec(http("Login_11_2")
			.get("/jslibs/modernizr.php")
      .headers(headers_11))
		.exec(http("Login_12")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_12))
		.exec(http("Login_13")
			.get("/js/retail/topnav.php")
			.headers(headers_11))
		.pause(110 milliseconds)
		.exec(http("Login_14")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013197479")
			.headers(headers_14))
		.exec(http("Login_15")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489013197573&storeId=0003")
			.headers(headers_14))

	}

  val RetailToChoosePathModule=group("RetailToChoosePathModule"){
    exec(http("Retail_0")
      .post("/retail/")
      .headers(headers_0)
      //.formParam("redirectUrl", "https%3A%2F%2Fperf-scale-ui.consensuscorpdev.com%2Fshopping%2F")
      .formParam("userAction", "shopping")
      .resources(http("request_1")
        .get(uri_ui + "/build/css_d4c30075bc2eb1a8b7a8_min.js")
        .headers(ui_headers_1),
        http("request_2")
          .get(uri_ui + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js")
          .headers(ui_headers_1),
        http("ui_request_3_fonts")
          .get(uri5_google + "?family=Lato:400,700,400italic,700italic&subset=latin")
          .headers(ui_headers_1),
        http("ui_request_4_gif")
          .get(uri_ui + "/assets/img/cloader.gif")
          .headers(ui_headers_1),
        http("request_5")
          .get(uri4_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
          .headers(ui_headers_5),
        http("request_6")
          .get(uri_ui + "/config.json")
          .headers(ui_headers_6),
        http("dsom_start_req_7_options")
          .options(uri_dsom_v1 + "/getContentForAisle")
          .headers(dsom_headers_7),
        http("dsom_start_req_8_options")
          .options(uri_dsom_v1 + "/getNextState")
          .headers(dsom_headers_7),
        http("dsom_start_req_9")
          .post(uri_dsom_v1 + "/getNextState")
          .headers(dsom_headers_9)
          .body(ElFileBody("dsom/choosepath/dsom_start_options_request.json")),
        http("dsom_start_req_10")
          .post(uri_dsom_v1 + "/getContentForAisle")
          .headers(dsom_headers_9)
          .body(ElFileBody("dsom/choosepath/dsom_start_post_request.json")),
        http("poa_path_req_11_process_php")
          .get(uri_poa + "/retail/orderassembly/controller/process.php")
          .headers(poa_headers_11),
        http("dsom_start_req_12")
          .get(uri_ui + "/build/css_d4c30075bc2eb1a8b7a8_min.js"),
        http("dsom_start_req_13")
          .get(uri_ui + "/build/bundle_d4c30075bc2eb1a8b7a8_min.js"),
        http("ui_request_14_google_api")
          .get(uri5_google + "?family=Lato:400,700,400italic,700italic&subset=latin"),
        http("ui_request_15_fonts")
          .get(uri4_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"),
        http("ui_request_16_gif")
          .get(uri_ui + "/assets/img/cloader.gif"),
        http("ui_request_17_config")
          .get(uri_ui + "/config.json")
          .headers(ui_headers_6),
        http("dsom_start_req_18")
          .post(uri_dsom_v1 + "/getContentForAisle")
          .headers(dsom_headers_9)
          .body(ElFileBody("dsom/choosepath/dsom_start_content_post_request.json")),
        http("dsom_start_req_19")
          .post(uri_dsom_v1 + "/getNextState")
          .headers(dsom_headers_9)
          .body(ElFileBody("dsom/choosepath/dsom_start_getNextState_post_request.json")),
        http("dsom_start_req_20_path_content")
          .post(uri_dsom_v1 + "/getContentForAisle")
          .check(regex("Purchase unactivated device at full price").find.exists)
          .headers(dsom_headers_9)
          .body(ElFileBody("dsom/choosepath/dsom_start_content_frame_post_request.json")),
        http("dsom_start_req_21")
          .get(uri_ui + "/build/ch_9afac72ed1aa9ce2cabc_min.js")
          .headers(ui_headers_1),
        http("dsom_start_req_22")
          .get(uri_ui + "/app/pages/frame/header/header.html")
          .headers(ui_headers_22),
        http("ui_request_23")
          .get(uri_ui + "/app/pages/frame/footer/footer.html")
          .headers(ui_headers_22),
        http("ui_request_24_choosepath")
          .get(uri_ui + "/app/pages/choosepath/choosepath.html")
          .headers(ui_headers_22),
        http("ui_request_25_optionscolumn")
          .get(uri_ui + "/app/pages/choosepath/partials/optionscolumn.html")
          .headers(ui_headers_22),
        http("ui_request_26_fonts")
          .get(uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
          .headers(ui_headers_5),
        http("ui_request_27_fonts")
          .get(uri4_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
          .headers(ui_headers_5),
        http("ui_request_28_svg")
          .get(uri_ui + "/assets/img/bullseye.svg")
          .headers(ui_headers_1),
        http("poa_request_29_svg")
          .get(uri_poa + "/img/brands/target/retail/sign_up_new_red.svg")
          .headers(ui_headers_1),
        http("poa_request_30_svg")
          .get(uri_poa + "/img/brands/target/retail/upgrade_new_red.svg")
          .headers(ui_headers_1)))
  }

  val ChoosePathToScan=group("ChoosePathToScan"){
      exec(http("dsom_scan_request_0")
        .options(uri_dsom_v1 + "/getNextState")
        .headers(dsom_headers_7)
        .resources(http("dsom_scan_request_1")
          .post(uri_dsom_v1 + "/getNextState")
          .headers(dsom_headers_10)
          .body(ElFileBody("dsom/scan/dsom_Scan_0001_request.json"))))
      .pause(1)
      .exec(http("dsom_scan_request_2")
          .options(uri_dsom_v1 + "/getContentForAisle")
          .headers(dsom_headers_7)
          .resources(http("dsom_scan_request_3")
            .post(uri_dsom_v1 + "/getContentForAisle")
            .check(regex("Scan or enter a device's IMEI").find.exists)
            .headers(dsom_headers_10)
            .body(ElFileBody("dsom/scan/dsom_Scan_0003_request.json")),
            http("dsom_scan_request_4")
              .get(uri_ui + "/app/pages/scan/scan.html")))
    }

	val PaymentOptionsToCartWheel = group("${carrier}_PaymentOptions"){
			exec(http("dsom_po_request_0")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(dsom_headers_100))
		.exec(http("dsom_po_request_1")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(dsom_headers_101)
			.body(ElFileBody("dsom/cartwheel/VZWPO2Activation_0001_request.json")))
		.exec(http("dsom_po_request_102")
			.options(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(dsom_headers_100))
		.exec(http("dsom_po_request_3")
			.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.check(substring("download the Cartwheel App"))
			.headers(dsom_headers_101)
			.body(ElFileBody("dsom/cartwheel/VZWPO2Activation_0003_request.json")))
    .exec(http("dsom_po_cartwheel_content")
      .get(uri_ui + "/app/pages/cartwheel/cartwheel.html")
      .headers(ui_headers_22))
    .exec(http("poa_cartwheel_logo")
      .get(uri_poa + "/img/retail/cartwheel/cartwheel_logo.png")
      .headers(poa_headers_11))
	}

		val Cartwheel=group("${carrier}_Cartwheel"){
		  val uriX = "https://perf-scale-dsom.consensuscorpdev.com:443"
		  exec(http("Cartwheel_4")
			.options(uriX + "/dsom-app/v1/getNextState")
			.headers(dsom_headers_100))
		.exec(http("Cartwheel_5")
			.post(uriX + "/dsom-app/v1/getNextState")
			.headers(dsom_headers_101)
			.body(ElFileBody("CW005.txt")))
			//.body(ElFileBody("VZWPO2Activation_0005_request.txt")))
		.exec(http("Cartwheel_6")
			.get("/retail/orderassembly/controller/process.php")
			.check(substring("Your personal information"))
			.headers(headers_106))
		.exec(http("Cartwheel_7")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_107))
		.exec(http("Cartwheel_8")
			.get("/jslibs/modernizr.php")
			.headers(headers_108))
		.exec(http("Cartwheel_9")
			.get("/js/retail/topnav.php")
			.headers(headers_108))
		.exec(http("Cartwheel_10")
			.get("/js/retail/numport.php?devices=")
			.headers(headers_108))
		.exec(http("Cartwheel_11")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019067082")
			.headers(headers_1011))
		//.pause(5, 15)
		}
	// NewGuest
	val NewGuest=group("NewGuest"){
		exec(http("NewGuest_38")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_22))
		.exec(http("NewGuest_39")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(headers_23)
			.body(ElFileBody("Sprint_0039_request.txt")))
		.exec(http("NewGuest_40")
			.get("/retail/orderassembly/controller/newcustomer.php")
			.headers(headers_25))
		.exec(http("NewGuest_41")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_12))
		.exec(http("NewGuest_42")
			.get("/jslibs/modernizr.php")
			.headers(headers_11))
		.exec(http("NewGuest_43")
			.get("/js/retail/topnav.php")
			.headers(headers_11))
		.exec(http("NewGuest_44")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489013252401")
			.headers(headers_14))
		.exec(http("NewGuest_45")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489013252483&storeId=0003")
		.headers(headers_14))
		//.pause(5, 15)
	}
	val CommonPause=pause(5,10)
	val CreditCheck=group("${carrier}_CreditCheck"){
	  	exec(http("CreditCheck_${SSN}")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(headers_1012)
			.formParam("creditCheckToolArray[1008][newOrExisting]", "new")
			.formParam("creditCheckToolArray[1008][addLineType]", "addNewPlan")
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
			.headers(headers_1013))
		.exec(http("CreditCheck_14")
			.get("/jslibs/modernizr.php")
			.headers(headers_1014))
		.exec(http("CreditCheck_15")
			.get("/js/retail/topnav.php")
			.headers(headers_1014))
		.exec(http("CreditCheck_16")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019095749")
			.headers(headers_1016))
		.exec(http("CreditCheck_17")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_1017))
		.exec(http("CreditCheck_18")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1013))
		.exec(http("CreditCheck_19")
			.get("/jslibs/modernizr.php")
			.headers(headers_1014))
		.exec(http("CreditCheck_20")
			.get("/js/retail/topnav.php")
			.headers(headers_1014))
		.exec(http("CreditCheck_21")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019104573")
			.headers(headers_1016))
		.exec(http("CreditCheck_22")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful. Continue with Verizon").count.saveAs("Checkcounts"))
			.headers(headers_1017))
		.exec(http("CreditCheck_>>${Checkcounts}<<")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1023))
		.exec(http("CreditCheck_24")
			.get("/jslibs/modernizr.php")
			.headers(headers_1024))
		.exec(http("CreditCheck_25")
			.get("/js/retail/topnav.php")
			.headers(headers_1024))
		.exec(http("CreditCheck_26")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019106381")
			.headers(headers_1026))
		//.pause(5, 16)
	}
			val SprintHeaders_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val SprintHeaders_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val SprintHeaders_2 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val SprintHeaders_4 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val SprintHeaders_5 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val SprintHeaders_11 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val SprintHeaders_12 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val SprintHeaders_14 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm",
		"X-Requested-With" -> "XMLHttpRequest")

		// sprcc
    val SPRCC=group("${carrier}_${imei}"){
		   exec(http("request_0")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(SprintHeaders_0)
			.formParam("creditCheckToolArray[1034][newOrExisting]", "new")
			.formParam("creditCheckToolArray[1034][addLineType]", "addNewPlan")
			.formParam("currentPageCOPId", "439")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "1")
			.formParam("edit", "")
			.formParam("Lines_To_Be_Activated", "1")
			.formParam("creditCheckToolArray[1034][numOfNewLines]", "1")
			.formParam("creditCheckToolArray[1034][numOfExistingLines]", "")
			.formParam("Billing_Address_Radio", "unfinished")
			.formParam("Ecom_BillTo_Postal_Name_First", "Fred")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "Consumer Two")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks St")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "CRONISH")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117")
			.formParam("Ecom_BillTo_Telecom_Phone_Number", "2342342345")
			.formParam("Ecom_BillTo_Online_Email", "${p_sessionid}@letstalk.com")
			.formParam("Date_of_Birth[f1]", "02")
			.formParam("Date_of_Birth[2]", "20")
			.formParam("Date_of_Birth[3]", "1970")
			.formParam("Social_Security", "137594102")
			.formParam("Identification_Type", "licns")
			.formParam("Identification_State", "CA")
			.formParam("Identification_Number", "123456789")
			.formParam("Identification_Expiration_Month", "12")
			.formParam("Identification_Expiration_Year", "2020")
			.formParam("Drivers_license_Checkbox", "Y")
			.formParam("Agree_To_Credit_Check", "Y")
			.formParam("Agree_To_Credit_Check_Hidden", "Y")
			.formParam("checkoutSubmitType", "continue"))
		.exec(http("request_1")
			.get("/retail/public/styles/normalize.php")
			.headers(SprintHeaders_1))
		.exec(http("request_2")
			.get("/jslibs/modernizr.php")
			.headers(SprintHeaders_2))
		.exec(http("request_3")
			.get("/js/retail/topnav.php")
			.headers(SprintHeaders_2))
		.exec(http("request_4")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489112672721")
			.headers(SprintHeaders_4))
		.exec(http("request_5")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(SprintHeaders_5))
		.exec(http("request_6")
			.get("/retail/public/styles/normalize.php")
			.headers(SprintHeaders_1))
		.exec(http("request_7")
			.get("/jslibs/modernizr.php")
			.headers(SprintHeaders_2))
		.exec(http("request_8")
			.get("/js/retail/topnav.php")
			.headers(SprintHeaders_2))
		.exec(http("request_9")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489112681135")
			.headers(SprintHeaders_4))
		.exec(http("request_10")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(SprintHeaders_5))
		.exec(http("request_11")
			.get("/retail/public/styles/normalize.php")
			.headers(SprintHeaders_11))
		.exec(http("request_12")
			.get("/jslibs/modernizr.php")
			.headers(SprintHeaders_12))
		.exec(http("request_13")
			.get("/js/retail/topnav.php")
			.headers(SprintHeaders_12))
		.exec(http("request_14")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489112682988")
			.headers(SprintHeaders_14))
	}
	val Logout=group("Logout"){
	 exec(http("Logout_0")
			.get("/retail/orderassembly/controller/newcustomer.php?logout=1")
			.headers(Logoutheaders_0))
		.exec(http("Logout_1")
			.get("/jslibs/modernizr.php")
			.headers(Logoutheaders_1))
		.exec(http("Logout_2")
			.get("/retail/public/styles/normalize.php")
			.headers(Logoutheaders_2))
		.exec(http("Completed Orders")
			.get("/js/retail/topnav.php")
			.headers(Logoutheaders_1))
		.exec(http("Completed_${p_orderid}")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490039628495")
			.headers(Logoutheaders_4))
	}
//	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}

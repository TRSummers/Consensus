
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object VZWFlow{
  
	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

	val VZWFlowheaders_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val VZWFlowheaders_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val VZWFlowheaders_2 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val VZWFlowheaders_4 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_5 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val VZWFlowheaders_10 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val VZWFlowheaders_11 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm")

	val VZWFlowheaders_12 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm")

	val VZWFlowheaders_15 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_16 = Map(
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_17 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm")

	val VZWFlowheaders_18 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1")

	val VZWFlowheaders_19 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1")

	val VZWFlowheaders_22 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_23 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1")

	val VZWFlowheaders_24 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm")

	val VZWFlowheaders_25 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm")

	val VZWFlowheaders_27 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_28 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm")

	val VZWFlowheaders_29 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm")

	val VZWFlowheaders_30 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm")

	val VZWFlowheaders_32 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_33 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm")

	val VZWFlowheaders_34 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/rtcc/runcredit.htm")

	val VZWFlowheaders_35 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/rtcc/runcredit.htm")

	val VZWFlowheaders_37 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/rtcc/runcredit.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_38 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val VZWFlowheaders_39 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm")

	val VZWFlowheaders_40 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm")

	val VZWFlowheaders_42 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_44 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Pragma" -> "no-cache",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_46 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm")

	val VZWFlowheaders_47 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val VZWFlowheaders_48 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val VZWFlowheaders_50 = Map(
		"Accept" -> "image/png,image/*;q=0.8,*/*;q=0.5",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val VZWFlowheaders_52 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_53 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val VZWFlowheaders_54 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm")

	val VZWFlowheaders_55 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm")

	val VZWFlowheaders_57 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_58 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_59 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm")

	val VZWFlowheaders_60 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm")

	val VZWFlowheaders_61 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm")

	val VZWFlowheaders_63 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_64 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm")

	val VZWFlowheaders_65 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/parking.htm")

	val VZWFlowheaders_66 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/parking.htm")

	val VZWFlowheaders_68 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/parking.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_77 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Pragma" -> "no-cache",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/ng/POA/?auto=on")

	val VZWFlowheaders_78 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/ng/POA/?auto=on")

	val VZWFlowheaders_82 = Map(
		"Accept" -> "image/png,image/*;q=0.8,*/*;q=0.5",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/ng/POA/?auto=on")

	val VZWFlowheaders_96 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/ng/POA/?auto=on")

	val VZWFlowheaders_97 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val VZWFlowheaders_98 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val VZWFlowheaders_100 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_102 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "text/plain",
		"Pragma" -> "no-cache")

	val VZWFlowheaders_103 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")
val headers_222 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val headers_223 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")
	val headers_230 = Map(
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val headers_231 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")
		
			val VZWFlowheaders_1000 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val VZWFlowheaders_101 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val VZWFlowheaders_106 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val VZWFlowheaders_107 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val VZWFlowheaders_108 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val VZWFlowheaders_1011 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_1012 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val VZWFlowheaders_1013 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val VZWFlowheaders_1014 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val VZWFlowheaders_1016 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_1017 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val VZWFlowheaders_1023 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val VZWFlowheaders_1024 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val VZWFlowheaders_1026 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_1027 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val VZWFlowheaders_1034 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val VZWFlowheaders_1035 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"sessionId" -> "${p_sessionid}")

	val VZWFlowheaders_1036 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "PATCH",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val VZWFlowheaders_1037 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json; charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")

	val VZWFlowheaders_1041 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val VZWFlowheaders_1042 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val VZWFlowheaders_1044 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_1045 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val VZWFlowheaders_1046 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val VZWFlowheaders_1047 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val VZWFlowheaders_1049 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZWFlowheaders_1050 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val VZWFlowheaders_1051 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val VZWFlowheaders_1052 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val VZWFlowheaders_1055 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm",
		"X-Requested-With" -> "XMLHttpRequest")

    val VZWFlowuri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val VZWFlowuri2 = "https://perf-scale-dsom.consensuscorpdev.com:443"

		
    val uri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val uri2 = "https://perf-scale-dsom.consensuscorpdev.com:443"

    	val VZWScan=group("${carrier}_Scan"){
		exec(http("Scan_30")
			.options(uri2 + "/session/dsom/v1/cart/item")
			.headers(headers_230))
		.exec(http("Scan_31")
			.post(uri2 + "/session/dsom/v1/cart/item")
			.headers(headers_231)
			.body(ElFileBody("VZW_0031_request.txt")))
		.exec(http("Scan_32")
			.options(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_222))
		.exec(http("Scan_33")
			.post(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_223)
			.body(ElFileBody("VZW_0033_request.txt")))
		.exec(http("Scan_34")
			.options(uri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_222))
		.exec(http("Scan_35")
			.post(uri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_223)
			.body(ElFileBody("VZW_0035_request.txt")))
		.exec(http("Scan_36")
			.options(uri2 + "/dsom-app/v1/getPaymentDetails")
			.headers(headers_222))
		.exec(http("Scan_37")
			.post(uri2 + "/dsom-app/v1/getPaymentDetails")
			.check(substring("Get more savings with Device Payment on The Verizon Plan"))
			.headers(headers_223)
			.body(ElFileBody("VZW_0037_request.txt")))
		//.pause(5, 14)
	}
	
	    val CC=group("${carrier}_CC"){
		exec(http("CreditCheck_12")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(VZWFlowheaders_1012)
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
			.formParam("Social_SecVZWFlowurity", "${SSN1}${SSN2}${SSN3}${SSN4}")
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
			.headers(VZWFlowheaders_1013))
		.exec(http("CreditCheck_14")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_1014))
		.exec(http("CreditCheck_15")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_1014))
		.exec(http("CreditCheck_16")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019095749")
			.headers(VZWFlowheaders_1016))
		.exec(http("CreditCheck_17")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(VZWFlowheaders_1017))
		.exec(http("CreditCheck_18")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_1013))
		.exec(http("CreditCheck_19")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_1014))
		.exec(http("CreditCheck_20")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_1014))
		//.pause(101 milliseconds)
		.exec(http("CreditCheck_21")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019104573")
			.headers(VZWFlowheaders_1016))
		.exec(http("CreditCheck_22")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful."))
			.headers(VZWFlowheaders_1017))
		.exec(http("CreditCheck_23")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_1023))
		.exec(http("CreditCheck_24")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_1024))
		.exec(http("CreditCheck_25")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_1024))
		.pause(140 milliseconds)
		.exec(http("CreditCheck_26")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019106381")
			.headers(VZWFlowheaders_1026))
	}
		//.pause(5, 16)}
		// CC2IDP
    val CC2IDP=group("${carrier}_CreditCheck_IDP"){
		exec(http("CreditCheck_IDP_27")
			.post("/retail/creditcheck/result.htm")
			.headers(VZWFlowheaders_1027)
			.formParam("submitType", "continue")
			.formParam("acceptCorp", "660")
			.formParam("acceptType", "passed")
			.formParam("secondRun", "")
			.formParam("numofline_to_activate", "1")
			.formParam("checkbox-1", "on"))
		.exec(http("CreditCheck_IDP_28")
			.post(VZWFlowuri2 + "/dsom-app/v1/getContentForAisle")
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0028_request.txt")))
		.exec(http("CreditCheck_IDP_29")
			.options(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(VZWFlowheaders_1000))
		.exec(http("CreditCheck_IDP_30")
			.post(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0030_request.txt")))
		.exec(http("CreditCheck_IDP_31")
			.options(VZWFlowuri2 + "/dsom-app/v1/getJSONAisles")
			.headers(VZWFlowheaders_1000))
		.exec(http("CreditCheck_IDP_32")
			.post(VZWFlowuri2 + "/dsom-app/v1/getJSONAisles")
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0032_request.txt")))
		.exec(http("CreditCheck_IDP_33")
			.post(VZWFlowuri2 + "/dsom-app/v1/getContentForAisle")
			.check(substring("Sales tax based on full"))
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0033_request.txt")))
		.pause(144 milliseconds)
		.exec(http("CreditCheck_IDP_34")
			.options(VZWFlowuri2 + "/dsom-app/v1/paymentPlans")
			.headers(VZWFlowheaders_1034))
		.exec(http("CreditCheck_IDP_35")
			.get(VZWFlowuri2 + "/dsom-app/v1/paymentPlans")
			.headers(VZWFlowheaders_1035))
		//.pause(5, 15)
	}
		// IDP2Plan
	val IDP2Plan=group("${carrier}_IDP_Plan"){
		exec(http("IDP_Plan36")
			.options(VZWFlowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(VZWFlowheaders_1036))
		.exec(http("IDP_Plan37")
			.patch(VZWFlowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(VZWFlowheaders_1037)
			.body(ElFileBody("VZWPO2Activation_0037_request.txt")))
		.exec(http("IDP_Plan38")
			.options(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(VZWFlowheaders_1000))
		.exec(http("IDP_Plan39")
			.post(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0039_request.txt")))
		.exec(http("IDP_Plan40")
			.get("/retail/orderassembly/controller/process.php")
			.check(substring("Pick the perfect plan to stay connected wherever you"))
			.headers(VZWFlowheaders_106))
		.exec(http("IDP_Plan41")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_1041))
		.exec(http("IDP_Plan42")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_1042))
		.exec(http("IDP_Plan43")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_1042))
		.exec(http("IDP_Plan44")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019148728")
			.headers(VZWFlowheaders_1044))
		////.pause(10, 15)
	}
		// Plan
	val SelectPlan=group("SelectPlan"){
		exec(http("SelectPlan_45")
			.get("/retail/orderassembly/controller/process.php?addServicePrIds=42340")
			.check(substring("Your Cart"))
			.headers(VZWFlowheaders_1045))
		.exec(http("SelectPlan_46")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_1046))
		.exec(http("SelectPlan_47")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_1047))
		.exec(http("SelectPlan_48")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_1047))
		.exec(http("SelectPlan_49")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019193820")
			.headers(VZWFlowheaders_1049))
		//.pause(5, 15)
	}
		val YourCart=group("YourCart"){
		exec(http("YourCart_50")
			.post("/retail/orderassembly/cart.htm")
			.check(substring("Select Plan Features and Access Fees"))
			.headers(VZWFlowheaders_1050)
			.formParam("action", "continue")
			.formParam("continueOnConfirm", ""))
		.exec(http("YourCart_51")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_1051))
		.exec(http("YourCart_52")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_1052))
		.exec(http("YourCart_53")
			.get("/js/track.php?pageTag=$pageTag")
			.headers(VZWFlowheaders_1052))
		.exec(http("YourCart_54")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_1052))
		.exec(http("YourCart_55")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019212493")
			.headers(VZWFlowheaders_1055))
	}
		// SelectPlanFeatures
    val SelectPlanFeatures=group("${carrier}_SelectPlanFeatures"){
		 exec(http("SelectPlanFeatures_10")
			.post("/retail/orderassembly/features.htm")
			.check(substring("Select a Protection Plan"))
			.headers(VZWFlowheaders_10)
			.formParam("posted", "1")
			.formParam("addPurchaseOptionsArr[1][42340][185]", "1")
			.formParam("shownPoptIds[99401]", "99401")
			.formParam("shownPoptIds[99518]", "99518"))
		.exec(http("SelectPlanFeatures_11")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_11))
		.exec(http("SelectPlanFeatures_12")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_12))
		.exec(http("SelectPlanFeatures_13")
			.get("/js/track.php?pageTag=RTLDO")
			.headers(VZWFlowheaders_12))
		.exec(http("SelectPlanFeatures_14")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_12))
		.exec(http("SelectPlanFeatures_15")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604767762")
			.headers(VZWFlowheaders_15))
		//.pause(5, 15)
	}
		// SelectProtectionPlan
	val SelectProtectionPlan=group("${carrier}_SelectProtetionPlan"){
		exec(http("SelectProtectionPlan16")
			.get("/minicart/minicart.php?type=popt&isNoResponse=1&noCache=0.5845231551502829&action=update&dataArray%5Badd%5D%5BaddPoptId%5D=99485&dataArray%5Badd%5D%5BaddPoptIdIndex%5D=1")
			.headers(VZWFlowheaders_16))
		.exec(http("SelectProtectionPlan17")
			.post("/retail/orderassembly/controller/process.php?action=featureAdded")
			.headers(VZWFlowheaders_17)
			.formParam("isNoResponse", "1")
			.formParam("doNotRequest", "0")
			.formParam("isNoInsuranceSelected", "0")
			.formParam("addPurchaseOptionsArr[1][42252][259]", "1")
			.formParam("shownPoptIds[99485]", "99485")
			.formParam("guestReview", "on")
			.formParam("continueButton", "continue"))
		.exec(http("SelectProtectionPlan18")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_18))
		.exec(http("SelectProtectionPlan19")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_19))
		.exec(http("SelectProtectionPlan20")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_19))
		.exec(http("SelectProtectionPlan21")
			.get("/js/retail/numport.php?devices=%7B%221%22%3A%7B%22device%22%3A%7B%2242252%22%3A42252%7D%2C%22service%22%3A%7B%2242340%22%3A42340%7D%7D%7D")
			.headers(VZWFlowheaders_19))
		.exec(http("SelectProtectionPlan22")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604798563")
			.headers(VZWFlowheaders_22))
		//.pause(5, 15)
	}
		// NumberPort
	val NumberPort=group("${carrier}_NumberPort"){
		exec(http("NumberPort_23")
			.post("/retail/checkout/checkout.htm?copId=436")
			.headers(VZWFlowheaders_23)
			.formParam("currentPageCOPId", "436")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "")
			.formParam("edit", "")
			.formParam("Number_Port_Radio", "N")
			.formParam("checkoutSubmitType", "continue"))
		.exec(http("NumberPort_24")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_24))
		.exec(http("NumberPort_25")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_25))
		.exec(http("NumberPort_26")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_25))
		.exec(http("NumberPort_27")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604817061")
			.headers(VZWFlowheaders_27))
		//.pause(5, 18)
	}
		// OrderReviewandConfirm
	
	val OrderReviewandConfirm=group("${carrier}_OrderReviewandConfirm"){
		exec(http("OrderReveviewandConfirm_28")
			.get("/retail/checkout/termsconditions.htm")
			.headers(VZWFlowheaders_28))
		.exec(http("OrderReveviewandConfirm_29")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_29))
		.exec(http("OrderReveviewandConfirm_30")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_30))
		.exec(http("OrderReveviewandConfirm_31")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_30))
		////.pause(140 milliseconds)
		.exec(http("OrderReveviewandConfirm_32")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604837215")
			.headers(VZWFlowheaders_32))
		//.pause(5, 15)
	}
		// TermsandConditions
	val TermsandConditions=group("${carrier}_TermsandConditions"){
		exec(http("TermsandConditions_33")
			.post("/retail/checkout/termsconditions.htm")
			.headers(VZWFlowheaders_33)
			.formParam("termsConditions[lt]", "Y"))
		.exec(http("TermsandConditions_34")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_34))
		.exec(http("TermsandConditions_35")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_35))
		.exec(http("TermsandConditions_36")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_35))
		.exec(http("TermsandConditions_37")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604863565")
			.headers(VZWFlowheaders_37))
		.exec(http("TermsandConditions_38")
			.get("/retail/rtcc/runcreditprocess.php")
			.headers(VZWFlowheaders_38))
		.exec(http("TermsandConditions_39")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_39))
		.exec(http("TermsandConditions_40")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_40))
		.exec(http("TermsandConditions_41")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_40))
		.exec(http("TermsandConditions_42")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604874466")
			.headers(VZWFlowheaders_42))
		.exec(http("TermsandConditions_43")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489604874544&storeId=0003")
			.headers(VZWFlowheaders_42))
		//.pause(5, 15)
	}
		// SwipeCard
	val SwipeCard=group("${carrier}_SwipeCard"){
		exec(http("SwipeCard_44")
			.post("/ajax/retail/savebillingaddress.php")
			.headers(VZWFlowheaders_44)
			.formParam("addressChoice", "same")
			.formParam("Billing_Address_Radio", "Y")
			.formParam("Ecom_BillTo_Postal_Name_First", "Fred")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "Consumer Two")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks St")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "CRAPOLA")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117"))
		.pause(15)
		.exec(http("SwipeCard_45")
			.get("/ajax/retail/auruscallbackresponse.php")
			.headers(VZWFlowheaders_42))
		.exec(http("SwipeCard_46")
			.post("/retail/checkout/emvpayment.htm")
			.headers(VZWFlowheaders_46)
			.formParam("addressChoice", "same")
			.formParam("Billing_Address_Radio", "Y")
			.formParam("Ecom_BillTo_Postal_Name_First", "Fred")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "Consumer Two")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks St")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "CRAPOLA")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117"))
		.exec(http("SwipeCard_47")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_47))
		.exec(http("SwipeCard_48")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_48))
		.exec(http("SwipeCard_49")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_48))
		.exec(http("SwipeCard_50")
			.get("/barcode.htm?code=15/25504056500799990000001890&width=360&height=90&type=C128B&font=1")
			.headers(VZWFlowheaders_50))
		.exec(http("SwipeCard_51")
			.get("/barcode.htm?code=9881257290057620&height=90&type=C128B&font=1")
			.headers(VZWFlowheaders_50))
		//.pause(125 milliseconds)
		.exec(http("SwipeCard_52")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604920754")
			.headers(VZWFlowheaders_52))
		//.pause(5, 15)
	}
		// PrintMobileScanSheet
	val PrintMobileScanSheet=group("${carrier}_PrintMobileScanSheet"){
		exec(http("PrintMobileScanSheet_53")
			.get("/retail/controller/saleassocflowcontroller.php?activate=1")
			.headers(VZWFlowheaders_53))
		.exec(http("PrintMobileScanSheet_54")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_54))
		.exec(http("PrintMobileScanSheet_55")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_55))
		.exec(http("PrintMobileScanSheet_56")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_55))
		.exec(http("PrintMobileScanSheet_57")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604944366")
			.headers(VZWFlowheaders_57))
		//.pause(5, 14)
	}
		// ScanReceipt
		val ScanReceipt=group("${carrier}_ScanReceipt"){
   	 exec(http("ScanReceipt_58")
			.post("/ajax/retail/fakereceipt.php")
			.headers(VZWFlowheaders_58))
		.exec(http("ScanReceipt_59")
			.post("/retail/receiptscan.htm")
//			.check(regex("Activation for order: #(.+?)</h3>").saveAs("p_orderid"))
				.check(regex("Activation for order: #(.+?)</h3>").saveAs("p_orderid"))

			.headers(VZWFlowheaders_59)
			.formParam("receiptId", "485945645720265173"))
		.exec(http("ScanReceipt")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_60))
		.exec(http("ScanReceipt_61")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_61))
		.exec(http("ScanReceipt_62")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_61))
		.exec(http("ScanReceipt_63")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489604964706")
			.headers(VZWFlowheaders_63))
		//.pause(5, 15)
		}
		// EnterIMEIandSIM
		val EnterIMEIandSIM=group("${carrier}_EnterIMEIandSIM"){
		 exec(http("EnterIMEIandSIM64")
			.post("/retail/checkout/activationscan.htm")
			.headers(VZWFlowheaders_64)
			.formParam("serial", "")
			.formParam("device[99000088304056]", "Y")
			.formParam("deviceScanInfo[${p_orderid}_42252_1_1][sim]", "99999999998888888888"))
		.exec(http("EnterIMEIandSIM65")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_65))
    .exec(http("EnterIMEIandSIM66")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_66))
		.exec(http("EnterIMEIandSIM67")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_66))
		.exec(http("EnterIMEIandSIM68")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489605011210")
			.headers(VZWFlowheaders_68))
		.exec(http("EnterIMEIandSIM69")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489605011317&storeId=0003")
			.headers(VZWFlowheaders_68))
		.exec(http("EnterIMEIandSIM70")
			.get("/retail/controller/saleassocflowcontroller.php?parking=1")
			.headers(VZWFlowheaders_38))
		.exec(http("EnterIMEIandSIM71")
			.get("/retail/public/styles/normalize.php")
			.headers(VZWFlowheaders_65))
		.exec(http("EnterIMEIandSIM72")
			.get("/jslibs/modernizr.php")
			.headers(VZWFlowheaders_66))
		.exec(http("EnterIMEIandSIM73")
			.get("/js/retail/topnav.php")
			.headers(VZWFlowheaders_66))
		.exec(http("EnterIMEIandSIM74")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489605014629")
			.headers(VZWFlowheaders_68))
		.exec(http("EnterIMEIandSIM75")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1489605014697&storeId=0003")
			.headers(VZWFlowheaders_68))
		.exec(http("EnterIMEIandSIM76")
			.get("/retail/controller/saleassocflowcontroller.php?parking=1")
			.headers(VZWFlowheaders_38))
		.exec(http("EnterIMEIandSIM77")
			.post("/webservices/external/poa_rest/index.php/sales/v1/order")
			.headers(VZWFlowheaders_77)
			.body(ElFileBody("VZWFlow_0077_request.txt")))
		.exec(http("EnterIMEIandSIM78")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}")
			.headers(VZWFlowheaders_78))
		.exec(http("EnterIMEIandSIM79")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/contracts")
			.headers(VZWFlowheaders_78))
		.exec(http("EnterIMEIandSIM80")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status")
			.headers(VZWFlowheaders_78))
		.exec(http("EnterIMEIandSIM81")
			.get("/legacy/v1/index.php/strings?pageTags=%5B%22WCAGR%22%5D")
			.headers(VZWFlowheaders_78))
		.exec(http("EnterIMEIandSIM82")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=wca&page=1")
			.headers(VZWFlowheaders_82))
		.exec(http("EnterIMEIandSIM83")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=wca&page=2")
			.headers(VZWFlowheaders_82))
		//.pause(5, 15)
		}
		// WirelessCustomerAgreement
		val WirelessCustomerAgreement=group("${carrier}_WirelessCustomerAgreement"){
		 exec(http("WirelessCustomerAgreement")
			.get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLTC%22%5D")
			.headers(VZWFlowheaders_78))
		.exec(http("WirelessCustomerAgreement_85")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/productimage")
			.headers(VZWFlowheaders_78))
		.exec(http("WirelessCustomerAgreement_86")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=finance&page=4&ordiIndex=1")
			.headers(VZWFlowheaders_82))
		.exec(http("WirelessCustomerAgreement_87")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=finance&page=3&ordiIndex=1")
			.headers(VZWFlowheaders_82))
		.exec(http("WirelessCustomerAgreement_88")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=finance&page=2&ordiIndex=1")
			.headers(VZWFlowheaders_82))
		.exec(http("WirelessCustomerAgreement_89")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=finance&page=1&ordiIndex=1")
			.headers(VZWFlowheaders_82))
		}
		// DeviceFinancingInstallmentContract
		val DeviceFinancingInstallmentContract=group("${carrier}_DeviceFinancingInstallmentContract"){
		 exec(http("DeviceFinancingInstallmentContract_90")
			.get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLRC%22%5D")
			.check(substring("Order and Activation Complete"))
			.headers(VZWFlowheaders_78))
		.exec(http("DeviceFinancingInstallmentContract_91")
			.post("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/signatures")
			.headers(VZWFlowheaders_77)
			.body(ElFileBody("VZWFlow_0091_request.txt")))
		.exec(http("DeviceFinancingInstallmentContract_92")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status")
			.headers(VZWFlowheaders_78))
		.exec(http("DeviceFinancingInstallmentContract_93")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}")
			.headers(VZWFlowheaders_78))
		.exec(http("DeviceFinancingInstallmentContract_94")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=summary&page=1")
			.headers(VZWFlowheaders_82))
		.exec(http("DeviceFinancingInstallmentContract_95")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=c23599627c00cb8a&code=summary&page=2")
			.headers(VZWFlowheaders_82))
		}
			
}
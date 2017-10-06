
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

	val VZWFlowheaders_01 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive")

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

	val poa_headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val poa_headers_37 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive")

	val poa_headers_175 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36")

	val ui_headers_4 = Map("Upgrade-Insecure-Requests" -> "1")

	val ui_headers_6 = Map("Accept" -> "application/json, text/plain, */*")

	val ui_headers_8 = Map("Accept" -> "*/*", "X-Requested-With" -> "XMLHttpRequest")

	val ui_headers_16 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 08 Jun 2017 19:42:13 GMT",
		"If-None-Match" -> "65a5c-640-551780c9b8f40")

	val ui_headers_70 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val ui_headers_72 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val ui_headers_208 = Map(
		"Accept" -> "application/json, text/plain, */*")

	val headers_223 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")



	val dsom_headers_1 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val dsom_headers_19 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val dsom_headers_20 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"sessionId" -> "${p_sessionid}")

	val dsom_headers_230 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val dsom_headers_231 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")


	val dsom_headers_222 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val pam_headers_02 = Map(
		"Accept" -> "application/json"
	)

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

		val VZW_CC_Headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val VZW_CC_Headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val VZW_CC_Headers_2 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val VZW_CC_Headers_4 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val VZW_CC_Headers_5 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val VZW_CC_Headers_11 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val VZW_CC_Headers_12 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val VZW_CC_Headers_14 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm",
		"X-Requested-With" -> "XMLHttpRequest")

    val VZWFlowuri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val VZWFlowuri2 = "https://perf-scale-dsom.consensuscorpdev.com:443"


    val uri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val uri_dsom = "https://perf-scale-dsom.consensuscorpdev.com:443"
  	val uri_dsom_v1 = "https://perf-scale-dsom.consensuscorpdev.com:443/dsom-app/v1"
	  val uri_ui   = "https://perf-scale-ui.consensuscorpdev.com/shopping"
    val uri_poa  = "https://poa-perf-scale.consensuscorpdev.com"
	  val uri_pam  = "https://perf-scale-pam.consensuscorpdev.com"

	val VZWScanToPaymentOptions = group("${carrier}_Scan"){
		exec(http("dsom_Scan_30")
			.options(uri_dsom + "/session/dsom/v1/cart/item")
			.headers(dsom_headers_230))
		.exec(http("dsom_Scan_31")
			.post(uri_dsom + "/session/dsom/v1/cart/item")
			.headers(dsom_headers_231)
			.body(ElFileBody("dsom/scan/VZW_0031_request.json")))
		.exec(http("dsom_Scan_32")
			.options(uri_dsom + "/dsom-app/v1/getNextState")
			.headers(dsom_headers_222))
		.exec(http("dsom_Scan_33")
			.post(uri_dsom + "/dsom-app/v1/getNextState")
			.check(regex("\"cartCount\":1").find.exists)
			.headers(headers_223)
			.body(ElFileBody("dsom/scan/VZW_0033_request.json")))
		.pause(1)
		.exec(http("dsom_Scan_34")
			.options(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(dsom_headers_222))
		.exec(http("dsom_Scan_35")
			.post(uri_dsom + "/dsom-app/v1/getContentForAisle")
			.headers(headers_223)
			.body(ElFileBody("dsom/scan/VZW_0035_request.json")))
		.exec(http("dsom_Scan_36_payment_options_html")
			.get(uri_ui + "/app/pages/paymentoptions/paymentoptions.html")
			.headers(ui_headers_6))
		.exec(http("dsom_Scan_36")
			.options(uri_dsom + "/dsom-app/v1/getPaymentDetails")
			.headers(dsom_headers_222))
		.exec(http("dsom_Scan_37")
			.post(uri_dsom + "/dsom-app/v1/getPaymentDetails")
			.check(regex("paymentOptions").find.exists)
			.check(substring("Get more savings with Device Payment on The Verizon Plan"))
			.headers(headers_223)
			.body(ElFileBody("dsom/scan/VZW_0037_request.json")))
	}
		    
	      val CC=group("CreditCheck"){
		   exec(http("CC_0")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(VZW_CC_Headers_0)
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
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "RAMBLAS")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117")
			.formParam("Ecom_BillTo_Telecom_Phone_Number", "2342342345")
			.formParam("Ecom_BillTo_Online_Email", "nobody@letstalk.com")
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
		.exec(http("CC_1")
			.get("/retail/public/styles/normalize.php")
			.headers(VZW_CC_Headers_1))
		.exec(http("CC_2")
			.get("/jslibs/modernizr.php")
			.headers(VZW_CC_Headers_2))
		.exec(http("CC_3")
			.get("/js/retail/topnav.php")
			.headers(VZW_CC_Headers_2))
		//.pause(106 milliseconds)
		.exec(http("CC_4")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490215046074")
			.headers(VZW_CC_Headers_4))
		.exec(http("CC_5")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(VZW_CC_Headers_5))
		.exec(http("CC_6")
			.get("/retail/public/styles/normalize.php")
			.headers(VZW_CC_Headers_1))
		.exec(http("CC_7")
			.get("/jslibs/modernizr.php")
			.headers(VZW_CC_Headers_2))
		.exec(http("CC_8")
			.get("/js/retail/topnav.php")
			.headers(VZW_CC_Headers_2))
		//.pause(111 milliseconds)
		.exec(http("CC_9")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490215055419")
			.headers(VZW_CC_Headers_4))
		.exec(http("CC_10")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful. Continue with Verizon Wireless"))
			.headers(VZW_CC_Headers_5))
		.exec(http("CC_11")
			.get("/retail/public/styles/normalize.php")
			.headers(VZW_CC_Headers_11))
		.exec(http("CC_12")
			.get("/jslibs/modernizr.php")
			.headers(VZW_CC_Headers_12))
		.exec(http("CC_13")
			.get("/js/retail/topnav.php")
			.headers(VZW_CC_Headers_12))
		//.pause(135 milliseconds)
		.exec(http("CC_14")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490215057302")
			.headers(VZW_CC_Headers_14))
}


	val CreditCheck=group("CreditCheck"){
		exec(http("dsom_CreditCheck_0")
			.options(uri_dsom_v1 + "/getNextState")
			.headers(dsom_headers_222))
		.pause(30)
		.exec(http("dsom_CreditCheck_1_post_form")
				.post(uri_dsom_v1 + "/getNextState")
				.check(regex("Error retrieving the next state for").find.notExists)
				.headers(dsom_headers_1)
				.body(ElFileBody("dsom/idp/CreditCheckToIDP_0001_request.json")))
		.pause(40)
		.exec(http("dsom_CreditCheck_2_process_php")
				.get(uri_poa + "/retail/orderassembly/controller/process.php")
				.headers(poa_headers_2)
				.resources(http("dsom_CreditCheck_3")
					.get(uri_ui + "/assets/img/cloader.gif"),
					http("ui_cc_request_8")
					.get(uri_ui + "/config.json")
					.headers(ui_headers_8)))
		.pause(5)
		.exec(http("dsom_CreditCheck_9")
						.options(uri_dsom_v1 + "/getContentForAisle")
						.headers(dsom_headers_230))
		.pause(5)
		.exec(http("dsom_CreditCheck_10")
						.post(uri_dsom_v1 + "/getNextState")
			      .check(regex("Error retrieving the next state for").find.notExists)
						.headers(dsom_headers_231)
						.body(ElFileBody("dsom/idp/CreditCheckToIDP_0010_request.json")))
		.pause(5)
		.exec(http("dsom_CreditCheck_11")
						.post(uri_dsom_v1 + "/getContentForAisle")
						.headers(dsom_headers_231)
						.body(ElFileBody("dsom/idp/CreditCheckToIDP_0011_request.json")))
		.pause(5)
		.exec(http("dsom_CreditCheck_12")
						.post(uri_dsom_v1 + "/getContentForAisle")
			      .check(regex("Installment Details").find.exists)
						.headers(dsom_headers_231)
						.body(ElFileBody("dsom/idp/CreditCheckToIDP_0012_request.json"))
		   .resources(
			    //http("ui_cc_request_13")
					//	.get(uri_ui + "/shopping/build/ch_9afac72ed1aa9ce2cabc_min.js")
					http("ui_cc_request_14")
						.get(uri_ui + "/app/pages/frame/header/header.html")
						.headers(ui_headers_6),
					http("ui_cc_request_15")
						.get(uri_ui + "/app/pages/frame/footer/footer.html")
						.headers(ui_headers_6),
					http("ui_cc_request_16")
						.get(uri_ui + "/app/pages/installmentdetails/installmentdetails.html")
						.headers(ui_headers_16)))
		.pause(74)
		.exec(http("ui_cc_request_17")
				.get(uri_ui + "/assets/img/bullseye.svg")
				.resources(http("uri_request_18")
					.get(uri_ui + "/app/components/channel/channel.html")
					.headers(ui_headers_16)))
		.pause(4)
		.exec(http("dsom_creditcheck_19")
						.options(uri_dsom_v1 + "/paymentPlans")
						.headers(dsom_headers_19))
		.pause(4)
		.exec(http("dsom_creditcheck_20")
						.get(uri_dsom_v1 + "/paymentPlans")
						.headers(dsom_headers_20))
		.exec(http("dsom_creditcheck_21")
						.get(uri_poa + "/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png")
						.headers(poa_headers_2))

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
			.post(uri_dsom_v1 + "/getContentForAisle")
			.headers(VZWFlowheaders_101)                                                                                                          
			.body(ElFileBody("VZWPO2Activation_0028_request.txt")))
		.exec(http("CreditCheck_IDP_29")
			.options(uri_dsom_v1 + "/getNextState")
			.headers(VZWFlowheaders_1000))
		.exec(http("CreditCheck_IDP_30")
			.post(uri_dsom_v1 + "/getNextState")
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0030_request.txt")))
		.exec(http("CreditCheck_IDP_31")
			.options(uri_dsom_v1 + "/getJSONAisles")
			.headers(VZWFlowheaders_1000))
		.exec(http("CreditCheck_IDP_32")
			.post(uri_dsom_v1 + "/getJSONAisles")
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0032_request.txt")))
		.exec(http("CreditCheck_IDP_33")
			.post(uri_dsom_v1 + "/getContentForAisle")
			.check(substring("Sales tax based on full"))
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("VZWPO2Activation_0033_request.txt")))
		.pause(144 milliseconds)
		.exec(http("CreditCheck_IDP_34")
			.options(uri_dsom_v1 + "/paymentPlans")
			.headers(VZWFlowheaders_1034))
		.exec(http("CreditCheck_IDP_35")
			.get(uri_dsom_v1 + "/paymentPlans")
			.headers(VZWFlowheaders_1035))
		//.pause(5, 15)
	}


	val IDP2PlanInCC=group("${carrier}_IDP_Plan"){
		exec(http("IDP_Plan36")
			.options(uri_dsom + "/session/dsom/v1/cart/item/1")
			.headers(VZWFlowheaders_1036))
		.exec(http("IDP_Plan37")
				.patch(uri_dsom + "/session/dsom/v1/cart/item/1")
				.headers(VZWFlowheaders_1037)
				.body(ElFileBody("dsom/plans/VZWPO2Activation_0037_request.json")))
		.exec(http("IDP_Plan38")
				.options(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(VZWFlowheaders_1000))
		.exec(http("IDP_Plan39")
				.post(uri_dsom + "/dsom-app/v1/getNextState")
				.headers(VZWFlowheaders_101)
				.body(ElFileBody("dsom/plans/VZWPO2Activation_003_request.json")))
		.exec(http("IDP_Plan40")
				.get("/retail/orderassembly/controller/process.php")
				.headers(VZWFlowheaders_106))
		//.exec(http("IDP_Plan41")
		//		.get(uri_ui + "/build/css_17b781d9571d1352024a_min.js"))
		//.exec(http("IDP_Plan42")
		//		.get(uri_ui + "/build/bundle_17b781d9571d1352024a_min.js"))
		.exec(http("IDP_Plan43")
			.options(uri_dsom_v1 + "/getContentForAisle")
			.headers(dsom_headers_222))
		.exec(http("IDP_Plan44")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(dsom_headers_231)
			  .body(ElFileBody("dsom/plans/IDPToPlans_015_request.json")))
		.exec(http("IDP_Plan45")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(dsom_headers_1)
				.body(ElFileBody("dsom/plans/IDPToPlans_016_request.json")))
		.exec(http("request_27")
				.options(uri_dsom_v1 + "/getNextState")
				.headers(dsom_headers_222))
		.exec(http("request_28")
					.post(uri_dsom_v1 + "/getNextState")
					.headers(dsom_headers_1)
					.body(ElFileBody("dsom/planfeatures/PlansToFeatures_0028_request.json"))
		.resources(
				http("IDP_Planrequest_18")
					.get(uri_ui + "/app/pages/frame/header/header.html"),
				http("IDP_Planrequest_19")
					.get(uri_ui + "/app/pages/frame/footer/footer.html"),
				http("IDP_Planrequest_20")
					.get(uri_ui + "/app/pages/selectproduct/selectservice.html"),
				http("IDP_Planrequest_21")
					.get(uri_ui + "/assets/img/bullseye.svg"),
				http("IDP_Planrequest_22")
					.get(uri_ui + "/app/components/contempiler/config.json"),
				http("IDP_Planrequest_23")
					.get(uri_ui + "/app/components/contempiler/contempiler.html"),
				http("IDP_Planrequest_24")
					.get("/img/retail/corps/plLgs660.png"),
				http("IDP_Planrequest_25")
					.get(uri_ui + "/app/components/contempiler/contemloader.html"),
				http("IDP_Planrequest_26")
					.get(uri_ui + "/app/components/contempiler/sets/carrierinfo/verizon_hide.html")))
	}



		// IDP2Plan
	val IDP2Plan=group("${carrier}_IDP_Plan"){
		exec(http("IDP_Plan36")
			.options(VZWFlowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(VZWFlowheaders_1036))
		.exec(http("IDP_Plan37")
			.patch(VZWFlowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(VZWFlowheaders_1037)
			.body(ElFileBody("dsom/plans/VZWPO2Activation_0037_request.json")))
		.exec(http("IDP_Plan38")
			.options(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(VZWFlowheaders_1000))
		.exec(http("IDP_Plan39")
			.post(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(VZWFlowheaders_101)
			.body(ElFileBody("dsom/plans/VZWPO2Activation_0039_request.json")))
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

	// SelectPlanFeaturesInCC
	val SelectPlanFeaturesInCC=group("${carrier}_SelectPlanFeatures"){
		exec(http("SelectPlanFeatures_10")
			.get(uri_ui + "/assets/img/cloader.gif"))
		.exec(http("featuresrequest_64")
				.get(uri_ui + "/config.json")
				.headers(VZWFlowheaders_4))
		.exec(http("featuresrequest_65")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_70))
		.exec(http("featuresrequest_66")
				.options(uri_dsom_v1 + "/getNextState")
				.headers(ui_headers_70))
		.exec(http("featuresrequest_67")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/planfeatures/PlansToFeatures_0067_request.json")))
		.exec(http("featuresrequest_68")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/planfeatures/PlansToFeatures_0068_request.json")))
		.pause(1)
		.exec(http("featuresrequest_69")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/planfeatures/PlansToFeatures_0069_request.json"))
		    .resources(http("featuresrequest_71")
				  .get(uri_ui + "/app/pages/frame/header/header.html")
				  .headers(ui_headers_72),
				http("featuresrequest_72")
					.get(uri_ui + "/app/pages/frame/footer/footer.html")
					.headers(ui_headers_72),
				http("featuresrequest_73")
						.get(uri_ui + "/app/pages/addons/serviceaddon.html")
						.headers(ui_headers_72),
				http("featuresrequest_74")
						.get(uri_ui + "/assets/img/bullseye.svg"),
				http("featuresrequest_75")
						.get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png")
						.headers(ui_headers_72)))
			.pause(3)
			.exec(http("featuresrequest_76")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/planfeatures/PlansToFeatures_0076_request.json")))
			.pause(1)
			.exec(http("featuresrequest_77")
				.get("/retail/orderassembly/controller/process.php")
				.headers(poa_headers_2)
			.resources(
					http("featuresrequest_84")
						.get(uri_ui + "/assets/img/cloader.gif")))
	}

		// SelectPlanFeatures
    val SelectPlanFeatures=group("${carrier}_SelectPlanFeatures"){
		 exec(http("SelectPlanFeatures_10")
			.post("/retail/orderassembly/features.htm")
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


	// SelectProtectionPlansInCC
	val SelectProtectionPlanInCC=group("${carrier}_SelectProtectionPlanCC"){
		exec(http("SelectProtectionPlan16")
			.get(uri_ui + "/config.json")
			.headers(ui_headers_8))
		.exec(http("request_70")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_70))
		.exec(http("request_71")
				.options(uri_dsom_v1 + "/getNextState")
				.headers(ui_headers_70))
		.exec(http("request_72")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/insurance/miniCart_002_request.json")))
		.exec(http("request_73")
				.post(uri_dsom_v1 + "/getNextState")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/insurance/miniCart_003_request.json")))
		.pause(1)
		.exec(http("dsom_post_insurance_74")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/insurance/miniCart_004_request.json")))
		.exec(http("request_75")
					.get(uri_ui + "/app/pages/addons/device.html")
					.headers(ui_headers_16)
		.resources(http("request_76")
						.get(uri_ui + "/app/pages/frame/header/header.html")
						.headers(ui_headers_16),
					http("request_77")
						.get(uri_ui + "/app/pages/frame/footer/footer.html")
						.headers(ui_headers_16),
					http("request_79")
						.get(uri_ui + "/assets/img/bullseye.svg"),
					http("request_80")
						.get(uri_ui + "/app/components/showhide/showhide.html")
						.headers(ui_headers_16),
					http("request_81")
						.get(uri_ui + "/app/components/productoptions/partials/productchoices.html")
						.headers(ui_headers_16),
					http("request_82")
						.options(uri_dsom_v1 + "/getAddOnOptions")
						.headers(ui_headers_70),
					http("request_83")
						.get(uri_ui + "/app/components/contempiler/config.json")
						.headers(ui_headers_16),
					http("request_84")
						.get(uri_ui + "/app/components/contempiler/contempiler.html")
						.headers(ui_headers_16),
					http("request_85")
						.post(uri_dsom_v1 + "/getAddOnOptions")
						.headers(ui_headers_72)
						.body(ElFileBody("dsom/insurance/miniCart_005_request.json")),
					http("request_86")
						.get(uri_ui + "/app/components/contempiler/contemloader.html")
						.headers(ui_headers_16),
					http("request_87")
						.get(uri_ui + "/app/components/selectioninputs/partials/choices.html")
						.headers(ui_headers_16),
					http("request_88")
						.get(uri_ui + "/app/components/contempiler/sets/blurb/squaretrade.json")
						.headers(ui_headers_16),
					http("request_89")
						.get(uri_ui + "/app/components/contempiler/sets/blurb/default.html")
						.headers(ui_headers_16),
					http("request_90")
						.get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png")
						.headers(ui_headers_16),
					http("request_91")
						.get(uri_ui + "/assets/img/squaretrade_logo_325x160.png")
						.headers(ui_headers_16)))
			.pause(4)

			//part 2 of selection protection plan - transition from DSOM to legacy number port
			.exec(http("dsom_switch_to_legacy_numberport_92")
			.options(uri_dsom + "/session/dsom/v1/cart/item")
			.headers(ui_headers_70))
			.exec(http("request_93")
				.post(uri_dsom + "/session/dsom/v1/cart/item")
				.headers(dsom_headers_231)
				.body(ElFileBody("dsom/insurance/CartItem_patch_003_request.json")))
			.exec(http("request_94")
					.post(uri_dsom_v1 + "/getNextState")
					.headers(dsom_headers_1)
					.body(ElFileBody("dsom/insurance/CartItem_patch_004_request.json")))
			.pause(1)
			.exec(http("request_95")
				.get("/retail/orderassembly/controller/process.php")
				.headers(poa_headers_2))
			.pause(1)
			.exec(http("request_96")
				.get("/retail/public/styles/normalize.php")
				.headers(VZWFlowheaders_01)
				.resources(http("request_97")
					.get("/jslibs/jquery.php?ver=1.8.2"),
					http("request_98")
						.get("/jslibs/modernizr.php")
						.headers(VZWFlowheaders_01),
					http("request_99")
						.get("/jslibs/jquerymobile.php")
						.headers(VZWFlowheaders_01),
					http("request_100")
						.get("/template/public/styles/new.main.css")
						.headers(VZWFlowheaders_01),
					http("request_101")
						.get("/template/css/semantic.jqmsafe.min.css")
						.headers(VZWFlowheaders_01),
					http("request_102")
						.get("/retail/public/styles/main.css")
						.headers(VZWFlowheaders_01),
					http("request_103")
						.get("/js/retail/topnav.php")
						.headers(VZWFlowheaders_01),
					http("request_104")
						.get("/retail/public/styles/jquery.mobile-1.2.0.css")
						.headers(VZWFlowheaders_01),
					http("request_105")
						.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
						.headers(VZWFlowheaders_01),
					http("request_106")
						.get("/brands/target/retail/public/styles/main.css")
						.headers(VZWFlowheaders_01),
					http("request_107")
						.get("/js/retail/checkoutinit.js")
						.headers(ui_headers_16),
					http("request_108")
						.get("/js/datechange.js")
						.headers(ui_headers_16),
					http("request_109")
						.get("/js/retail/numport.php?devices=%7B%221%22%3A%7B%22device%22%3A%7B%2242252%22%3A42252%7D%2C%22service%22%3A%7B%2242340%22%3A42340%7D%7D%7D")
						.headers(VZWFlowheaders_01),
					http("request_110")
						.get("/img/retail/ajax-loader.gif")
						.headers(VZWFlowheaders_01),
					http("request_111")
						.get("/img/brands/target/retail/logo-mini.png")
						.headers(VZWFlowheaders_01),
					http("request_112")
						.get("/retail/public/img/alertsprite.png")
						.headers(VZWFlowheaders_01),
					http("request_113")
						.get("/retail/public/img/reservesprite.png")
						.headers(VZWFlowheaders_01),
					http("request_114")
						.get("/img/retail/cart.png")
						.headers(VZWFlowheaders_01),
					http("request_115")
						.get("/img/retail/setting.png")
						.headers(VZWFlowheaders_01),
					http("request_116")
						.get("/img/retail/icons-18-white.png")
						.headers(VZWFlowheaders_01),
					http("request_117")
						.get("/img/retail/home.png")
						.headers(VZWFlowheaders_01),
					http("request_118")
						.get("/img/retail/inventory-management.png")
						.headers(VZWFlowheaders_01),
					http("request_119")
						.get("/img/retail/customer-lookup.png")
						.headers(VZWFlowheaders_01),
					http("request_120")
						.get("/img/retail/save.png")
						.headers(VZWFlowheaders_01),
					http("request_121")
						.get("/img/retail/lock.png")
						.headers(VZWFlowheaders_01),
					http("request_122")
						.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1504646577165")
						.headers(VZWFlowheaders_4)))
		//.pause(5, 15)
	}


		// SelectProtectionPlan
	val SelectProtectionPlan=group("${carrier}_SelectProtectionPlan"){
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

	val WarrantyPaymentCapture=group("${carrier}_WarrantyPaymentCapture") {
		exec(http("poa_request_181")
			.get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLTC%22%5D")
			.headers(poa_headers_2))
		.exec(http("poa_request_182")
				.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/productimage")
				.headers(poa_headers_175))
		.exec(http("poa_request_183")
				.get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png"))
		.exec(http("poa_request_184")
				.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=91abe108fe3020fa&code=finance&page=1&ordiIndex=1")
				.headers(poa_headers_37))
		.exec(http("poa_request_185")
				.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=91abe108fe3020fa&code=finance&page=2&ordiIndex=1")
				.headers(poa_headers_37))
		.exec(http("poa_request_186")
				.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=91abe108fe3020fa&code=finance&page=3&ordiIndex=1")
				.headers(poa_headers_37))
		.exec(http("poa_request_187")
				.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=91abe108fe3020fa&code=finance&page=4&ordiIndex=1")
				.headers(poa_headers_37))
		.pause(1)
		.exec(http("poa_request_188")
				.get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLRC%22%5D")
				.headers(poa_headers_175)
				.resources(http("poa_request_189")
					.post("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/signatures")
					.headers(VZWFlowheaders_77)
					.body(ElFileBody("dsom/warranty/ActivationsWithInsurance_0189_request.json")),
					http("poa_request_190")
						.get("/img/brands/target/retail/printed-logo.png")))
		.pause(1)
		.exec(http("poa_request_191")
				.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status"))
		.exec(http("ui_request_192")
				.get(uri_ui + "/")
				.headers(ui_headers_4))
		.exec(http("ui_request_199")
				.get(uri_ui + "/assets/img/cloader.gif"))
		.exec(http("ui_request_200")
				.get(uri_ui + "/config.json")
				.headers(ui_headers_16))
		.exec(http("dsom_request_201")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(dsom_headers_222))
		.exec(http("dsom_request_202")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(dsom_headers_1))
		.exec(http("dsom_request_204")
				.options(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_70))
		.exec(http("dsom_request_205")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/warranty/ActivationsWithInsurance_0205_request.json")))
		.exec(http("dsom_request_206")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/warranty/ActivationsWithInsurance_0206_request.json")))
		.exec(http("dsom_request_207")
				.post(uri_dsom_v1 + "/getContentForAisle")
				.headers(ui_headers_72)
				.body(ElFileBody("dsom/warranty/ActivationsWithInsurance_0207_request.json")))
		.pause(1)
		.exec(http("ui_request_208")
				.get(uri_ui + "/app/pages/frame/header/header.html")
				.headers(ui_headers_208)
				.resources(http("ui_request_209")
					.get(uri_ui + "/app/pages/frame/footer/footer.html")
					.headers(ui_headers_208),
					http("ui_request_210")
						.get(uri_ui + "/app/pages/addonpayment/addonpayment.html")
						.headers(ui_headers_16),
					http("ui_request_211")
						.get(uri_ui + "/assets/img/bullseye.svg"),
					http("ui_request_212")
						.get("/img/brands/target/retail/EMV-machine.png")
						.headers(poa_headers_37)))
		.exec(http("dsom_request_213")
				.options(uri_dsom_v1 + "/order/${p_orderid}/payment")
				.headers(poa_headers_175)
				.resources(http("dsom_request_214")
					.post(uri_dsom_v1 + "/order/${p_orderid}/payment")
					.headers(dsom_headers_20)
					.body(ElFileBody("dsom/warranty/ActivationsWithInsurance_0214_request.json"))))
		.pause(1)
		.exec(http("dsom_pay_request_215")
				.options(uri_dsom_v1 + "/order/${p_orderid}/payment/3726373689X133000")
				.headers(dsom_headers_19))
		.exec(http("dsom_pay_request_216")
					.get(uri_dsom_v1 + "/order/${p_orderid}/payment/3726373689X133000")
					.headers(dsom_headers_20)
					.check(status.is(200)))
		.exec(http("pam_request_asyncpayment")
		      .post(uri_pam + "/PAM/api/pam/v1/payment/asyncpayment")
		      .headers(pam_headers_02)
 			    .body(ElFileBody("pam/warranty/async_payment_request.json"))
			    .check(status.is(200)))
	}


			
}

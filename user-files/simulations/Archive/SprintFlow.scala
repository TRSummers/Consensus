import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object SprintFlow{

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val headers_1 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val headers_3 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val headers_13 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val headers_14 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val headers_15 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val headers_18 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_19 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val headers_20 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val headers_21 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val headers_23 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_24 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_30 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_31 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_33 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_34 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_41 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val headers_42 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"sessionId" -> "${p_sessionid}")

	val headers_43 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "PATCH",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val headers_44 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json; charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")

	val headers_48 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val headers_49 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val headers_51 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_52 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val headers_53 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val headers_54 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val headers_56 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_57 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val headers_58 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val headers_59 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val headers_62 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_63 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val headers_64 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm")

	val headers_65 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm")

	val headers_68 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_69 = Map(
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_70 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/deviceoptions.htm")

	val headers_71 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1")

	val headers_72 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1")

	val headers_75 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_76 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?restartCheckout=1")

	val headers_77 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?copId=437")

	val headers_78 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?copId=437")

	val headers_81 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?copId=437",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_82 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/checkout.htm?copId=437")

	val headers_83 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm")

	val headers_84 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm")

	val headers_86 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_87 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/orderconfirm.htm")

	val headers_88 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm")

	val headers_89 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm")

	val headers_91 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_92 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm")

	val headers_93 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/rtcc/runcredit.htm")

	val headers_94 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/rtcc/runcredit.htm")

	val headers_96 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/rtcc/runcredit.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_98 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm")

	val headers_99 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm")

	val headers_101 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_103 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Pragma" -> "no-cache",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_105 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/emvpayment.htm")

	val headers_106 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val headers_107 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val headers_109 = Map(
		"Accept" -> "image/png,image/*;q=0.8,*/*;q=0.5",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val headers_111 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_112 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/printticket.htm")

	val headers_113 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm")

	val headers_114 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm")

	val headers_116 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_117 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_118 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/receiptscan.htm")

	val headers_119 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm")

	val headers_120 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm")

	val headers_122 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_123 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activationscan.htm")

	val headers_124 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/parking.htm")

	val headers_125 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/parking.htm")

	val headers_127 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/parking.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_130 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm?rtdfc=1")

	val headers_131 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm?rtdfc=1")

	val headers_133 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm?rtdfc=1",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_134 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/termsconditions.htm?rtdfc=1")

	val headers_135 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activation.htm")

	val headers_136 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activation.htm")

	val headers_138 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activation.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_140 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activation.htm?activating=1")

	val headers_141 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activation.htm?activating=1")

	val headers_143 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/checkout/activation.htm?activating=1",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_184 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "text/plain",
		"Pragma" -> "no-cache")

	val headers_185 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_264 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/support.htm")

	val headers_265 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/support.htm")

	val headers_267 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/support.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_269 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/support.htm")

    val uri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val uri2 = "https://perf-scale-dsom.consensuscorpdev.com:443"
    val uri3 = "http://safebrowsing.clients.google.com/safebrowsing/downloads"
    val uri4 = "http://safebrowsing-cache.google.com/safebrowsing/rd"

    val Scan=group("${carrier}_Scan"){
	    exec(http("Scan0")
			.options(uri2 + "/session/dsom/v1/cart/item")
			.headers(headers_0))
		.exec(http("Scan_1")
			.post(uri2 + "/session/dsom/v1/cart/item")
			.headers(headers_1)
			.body(ElFileBody("SprintFlow_0001_request.txt")))
		.exec(http("Scan_2")
			.options(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_2))
		.exec(http("Scan_3")
			.post(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0003_request.txt")))
		.exec(http("Scan_4")
			.options(uri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_2))
		.exec(http("Scan_5")
			.post(uri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0005_request.txt")))
		.exec(http("Scan_6")
			.options(uri2 + "/dsom-app/v1/getPaymentDetails")
			.headers(headers_2))
		.exec(http("Scan_7")
			.post(uri2 + "/dsom-app/v1/getPaymentDetails")
			.check(substring("It is now easy to get the greatest mobile devices"))
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0007_request.txt")))
	}
		// PO =group("${carrier}_"){
	val PO=group("${carrier}_PaymentOptions"){
		exec(http("PaymentOptions_8")
			.options(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_2))
		.exec(http("PaymentOptions_9")
			.post(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0009_request.txt")))
		.exec(http("PaymentOptions_10")
			.options(uri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_2))
		.exec(http("PaymentOptions_11")
			.post(uri2 + "/dsom-app/v1/getContentForAisle")
			.check(substring("download the Cartwheel App"))
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0011_request.txt")))
	}
		// CW
	val CW=group("${carrier}_Cartwheel"){
		exec(http("CartWheel_12")
			.post(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0012_request.txt")))
		.exec(http("CartWheel_13")
			.get("/retail/orderassembly/controller/process.php")
			.headers(headers_13))
		.exec(http("CartWheel_14")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_14))
		.exec(http("CartWheel_15")
			.get("/jslibs/modernizr.php")
			.headers(headers_15))
		.exec(http("CartWheel_16")
			.get("/js/retail/topnav.php")
			.headers(headers_15))
		.exec(http("CartWheel_17")
			.get("/js/retail/numport.php?devices=")
			.headers(headers_15))
		.exec(http("CartWheel_18")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218229746")
			.headers(headers_18))
	}
		// CC
	val CC=group("CreditCheck"){
		exec(http("CreditCheck_19")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(headers_19)
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
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "FAREBOX")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117")
			.formParam("Ecom_BillTo_Telecom_Phone_Number", "2342342345")
			.formParam("Ecom_BillTo_Online_Email", "${p_sessionid}@letstalk.com")
			.formParam("Date_of_Birth[1]", "02")
			.formParam("Date_of_Birth[2]", "20")
			.formParam("Date_of_Birth[3]", "1970")
			.formParam("Social_Security", "${nationalId}")
			.formParam("Identification_Type", "licns")
			.formParam("Identification_State", "CA")
			.formParam("Identification_Number", "123456789")
			.formParam("Identification_Expiration_Month", "12")
			.formParam("Identification_Expiration_Year", "2020")
			.formParam("Drivers_license_Checkbox", "Y")
			.formParam("Agree_To_Credit_Check", "Y")
			.formParam("Agree_To_Credit_Check_Hidden", "Y")
			.formParam("checkoutSubmitType", "continue"))
		.exec(http("CreditCheck_20")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_20))
		.exec(http("CreditCheck_21")
			.get("/jslibs/modernizr.php")
			.headers(headers_21))
		.exec(http("CreditCheck_22")
			.get("/js/retail/topnav.php")
			.headers(headers_21))
		.exec(http("CreditCheck_23")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218260379")
			.headers(headers_23))
		.exec(http("CreditCheck_24")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_24))
		.exec(http("CreditCheck_25")
			.get("/jslibs/modernizr.php")
			.headers(headers_21))
		.exec(http("CreditCheck_26")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_20))
		.exec(http("CreditCheck_27")
			.get("/js/retail/topnav.php")
			.headers(headers_21))
		.exec(http("CreditCheck_28")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218269119")
			.headers(headers_23))
		.exec(http("CreditCheck_29")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful. Continue with Sprint"))
			.headers(headers_24))
		.exec(http("CreditCheck_30")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_30))
		.exec(http("CreditCheck_31")
			.get("/jslibs/modernizr.php")
			.headers(headers_31))
		.exec(http("CreditCheck_32")
			.get("/js/retail/topnav.php")
			.headers(headers_31))
		.exec(http("CreditCheck_33")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218271006")
			.headers(headers_33))
	}
		// cc2idp
	val CC2IDP=group("${carrier}_CreditCheck_to_IDP"){
		exec(http("CreditCheck_to_IDP34")
			.post("/retail/creditcheck/result.htm")
			.headers(headers_34)
			.formParam("submitType", "continue")
			.formParam("acceptCorp", "545")
			.formParam("acceptType", "passed")
			.formParam("secondRun", "")
			.formParam("numofline_to_activate", "1")
			.formParam("checkbox-1", "on"))
		.exec(http("CreditCheck_to_IDP35")
			.options(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_2))
		.exec(http("CreditCheck_to_IDP36")
			.post(uri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0036_request.txt")))
		.exec(http("CreditCheck_to_IDP37")
			.post(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0037_request.txt")))
		.exec(http("CreditCheck_to_IDP38")
			.options(uri2 + "/dsom-app/v1/getJSONAisles")
			.headers(headers_2))
		.exec(http("CreditCheck_to_IDP39")
			.post(uri2 + "/dsom-app/v1/getJSONAisles")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0039_request.txt")))
		.exec(http("CreditCheck_to_IDP40")
			.post(uri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0040_request.txt")))
		.exec(http("CreditCheck_to_IDP41")
			.options(uri2 + "/dsom-app/v1/paymentPlans")
			.headers(headers_41))
		.exec(http("CreditCheck_to_IDP42")
			.get(uri2 + "/dsom-app/v1/paymentPlans")
			.headers(headers_42))
	}
		// idp2plan
	val IDP2Plan=group("${carrier}_IDP_to_Plan"){
		exec(http("IDP_to_Plan_43")
			.options(uri2 + "/session/dsom/v1/cart/item/1")
			.headers(headers_43))
		.exec(http("IDP_to_Plan_44")
			.patch(uri2 + "/session/dsom/v1/cart/item/1")
			.headers(headers_44)
			.body(ElFileBody("SprintFlow_0044_request.txt")))
		.exec(http("IDP_to_Plan_45")
			.options(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_2))
		.exec(http("IDP_to_Plan_46")
			.post(uri2 + "/dsom-app/v1/getNextState")
			.headers(headers_3)
			.body(ElFileBody("SprintFlow_0046_request.txt")))
		.exec(http("IDP_to_Plan_47")
			.get("/retail/orderassembly/controller/process.php")
			.headers(headers_13))
		.exec(http("IDP_to_Plan_48")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_48))
		.exec(http("IDP_to_Plan_49")
			.get("/jslibs/modernizr.php")
			.headers(headers_49))
		.exec(http("IDP_to_Plan_50")
			.get("/js/retail/topnav.php")
			.headers(headers_49))

		.exec(http("IDP_to_Plan_51")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218308396")
			.headers(headers_51))
	}
		// SelectPlan
	val SelectPlan=group("${carrier}_SelectPlan"){
		exec(http("SelectPlan_52")
			.get("/retail/orderassembly/controller/process.php?addServicePrIds=42506")
			.headers(headers_52))
		.exec(http("SelectPlan_53")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_53))
		.exec(http("SelectPlan_54")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("SelectPlan_55")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("SelectPlan_56")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218322770")
			.headers(headers_56))
	}
		// Cart
	val YourCart=group("${carrier}_YourCart"){
		exec(http("YourCart_57")
			.post("/retail/orderassembly/cart.htm")
			.headers(headers_57)
			.formParam("action", "continue")
			.formParam("continueOnConfirm", ""))
		.exec(http("YourCart_58")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_58))
		.exec(http("YourCart_59")
			.get("/jslibs/modernizr.php")
			.headers(headers_59))
		.exec(http("YourCart_60")
			.get("/js/track.php?pageTag=$pageTag")
			.headers(headers_59))
		.exec(http("YourCart_61")
			.get("/js/retail/topnav.php")
			.headers(headers_59))
		.exec(http("YourCart_62")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218337232")
			.headers(headers_62))
	}
		// SPFAAF
	val SelectPlanFeatures=group("${carrier}_SelectPlanFeatures"){
		exec(http("SelectPlanFeatures_63")
			.post("/retail/orderassembly/features.htm")
			.headers(headers_63)
			.formParam("posted", "1")
			.formParam("shownPoptIds[99490]", "99490")
			.formParam("addPurchaseOptionsArr[1][42506][256]", "1")
			.formParam("shownPoptIds[99443]", "99443")
			.formParam("addPurchaseOptionsArr[1][42506][260]", "1")
			.formParam("shownPoptIds[99516]", "99516"))
		.exec(http("SelectPlanFeatures_64")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_64))
		.exec(http("SelectPlanFeatures_65")
			.get("/js/track.php?pageTag=RTLDO")
			.headers(headers_65))
		.exec(http("SelectPlanFeatures_66")
			.get("/jslibs/modernizr.php")
			.headers(headers_65))
		.exec(http("SelectPlanFeatures_67")
			.get("/js/retail/topnav.php")
			.headers(headers_65))
		.exec(http("SelectPlanFeatures_68")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218354370")
			.headers(headers_68))
	}
		// PP
	val SelectProtectionPlan=group("${carrier}_SelectProtectionPlan"){
		exec(http("SelectProtectionPlan_69")
			.get("/minicart/minicart.php?type=popt&isNoResponse=1&noCache=0.47824818821323367&action=update&dataArray%5Badd%5D%5BaddPoptId%5D=99485&dataArray%5Badd%5D%5BaddPoptIdIndex%5D=1")
			.headers(headers_69))
		.exec(http("SelectProtectionPlan_70")
			.post("/retail/orderassembly/controller/process.php?action=featureAdded")
			.headers(headers_70)
			.formParam("isNoResponse", "1")
			.formParam("doNotRequest", "0")
			.formParam("isNoInsuranceSelected", "0")
			.formParam("addPurchaseOptionsArr[1][42203][259]", "1")
			.formParam("shownPoptIds[99485]", "99485")
			.formParam("shownPoptIds[99436]", "99436")
			.formParam("guestReview", "on")
			.formParam("continueButton", "continue"))
		.exec(http("SelectProtectionPlan_71")
			.get("/jslibs/modernizr.php")
			.headers(headers_71))
		.exec(http("SelectProtectionPlan_72")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_72))
		.exec(http("SelectProtectionPlan_73")
			.get("/js/retail/topnav.php")
			.headers(headers_71))
		.exec(http("SelectProtectionPlan_74")
			.get("/js/retail/numport.php?devices=%7B%221%22%3A%7B%22device%22%3A%7B%2242203%22%3A42203%7D%2C%22service%22%3A%7B%2242506%22%3A42506%7D%7D%7D")
			.headers(headers_71))
		.exec(http("SelectProtectionPlan_75")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218373146")
			.headers(headers_75))
	}

		// NP
	val NumberPort=group("${carrier}_NumberPort"){
		exec(http("NumberPort_76")
			.post("/retail/checkout/checkout.htm?copId=436")
			.headers(headers_76)
			.formParam("currentPageCOPId", "436")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "")
			.formParam("edit", "")
			.formParam("Number_Port_Radio", "N")
			.formParam("checkoutSubmitType", "continue"))
		.exec(http("NumberPort_77")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_77))
		.exec(http("NumberPort_78")
			.get("/jslibs/modernizr.php")
			.headers(headers_78))
		.exec(http("NumberPort_79")
			.get("/js/retail/topnav.php")
			.headers(headers_78))
		.exec(http("NumberPort_80")
			.get("/js/retail/numport.php?devices=%7B%221%22%3A%7B%22device%22%3A%7B%2242203%22%3A42203%7D%2C%22service%22%3A%7B%2242506%22%3A42506%7D%7D%7D")
			.headers(headers_78))
		.exec(http("NumberPort_81")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218385893")
			.headers(headers_81))
	}
		// SQ
	val SecurityQuestion=group("${carrier}_SecurityQuestion"){
		exec(http("SecurityQuestion_82")
			.post("/retail/checkout/checkout.htm?copId=437")
			.headers(headers_82)
			.formParam("currentPageCOPId", "437")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "")
			.formParam("edit", "")
			.formParam("ccfparam_37_0_0_0", "38495637")
			.formParam("securityPinName", "ccfparam_37_0_0_0")
			.formParam("ccfparam_38_0_0_0", "cd2")
			.formParam("ccfparam_39_0_0_0", "sdfdsf")
			.formParam("securityAnswerName", "ccfparam_39_0_0_0")
			.formParam("ccfparam_79_0_0_0_Hidden", "")
			.formParam("checkoutSubmitType", "continue"))
		.exec(http("SecurityQuestion_83")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_83))
		.exec(http("SecurityQuestion_84")
			.get("/jslibs/modernizr.php")
			.headers(headers_84))
		.exec(http("SecurityQuestion_85")
			.get("/js/retail/topnav.php")
			.headers(headers_84))
		.exec(http("SecurityQuestion_86")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218413064")
			.headers(headers_86))
	}
		// OR&C
	val OrderReviewandConfirm=group("${carrier}_OrderReviewandConfirm"){
		exec(http("OrderReviewandConfirm_87")
			.get("/retail/checkout/termsconditions.htm")
			.headers(headers_87))
		.exec(http("OrderReviewandConfirm_88")
			.get("/jslibs/modernizr.php")
			.headers(headers_88))
		.exec(http("OrderReviewandConfirm_89")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89))
		.exec(http("OrderReviewandConfirm_90")
			.get("/js/retail/topnav.php")
			.headers(headers_88))
			.exec(http("OrderReviewandConfirm_91")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218429940")
			.headers(headers_91))
	}
		// T&C
	val TermsandConditions=group("${carrier}_TermsandConditions"){
		exec(http("TermsandConditions_92")
			.post("/retail/checkout/termsconditions.htm")
			.headers(headers_92)
			.formParam("termsConditions[carrier]", "Y")
			.formParam("termsConditions[lt]", "Y")
			.formParam("output", """[{"lx":226,"ly":54,"mx":226,"my":53},{"lx":234,"ly":54,"mx":226,"my":54},{"lx":247,"ly":55,"mx":234,"my":54},{"lx":264,"ly":56,"mx":247,"my":55},{"lx":285,"ly":56,"mx":264,"my":56},{"lx":318,"ly":56,"mx":285,"my":56},{"lx":365,"ly":58,"mx":318,"my":56},{"lx":427,"ly":59,"mx":365,"my":58},{"lx":505,"ly":59,"mx":427,"my":59},{"lx":555,"ly":59,"mx":505,"my":59},{"lx":587,"ly":59,"mx":555,"my":59},{"lx":598,"ly":59,"mx":587,"my":59}]""")
			.formParam("sigStr", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyAAAAB4CAYAAAAKRZZvAAAEQElEQVR4nO3cMUuUcQDHcd+Dbk32Buod6BvIoJagXGtpsqnomtNVwXAQWkoXHdKmaKhzuCaJB5wShHM4WkIamp6nITqwO/Uq/T16fj7w47bjeY6H47784UYqAACAkJG6LwAAALg8BAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABiBAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABiBAgAABAjQAAAgBgBAjWbmHldTT5aqfsyAAAiBAjUbPTWfDV2e+HIjd769Xp1eqm6+Wy9u7nVT929be1WW8V+tVXsV3udg7pvCQDgSAIEanblzuIJAXJ8oBwXLWO3F6rJRyuHwuXh/LtD8fJiY7sbL78HAHBWBAhcEHudg6pZtKtm0a42W1+q2ZVWd1ONte7Gp5f+KVpOI3wGCKPytN/zf69hqrFe/rl7s5vl3Oqnnr3Y2C63iv2e7XUOyrqfDwC4KAQIDLnPu1+74dIs2tWr9zuH4uXJ8odDATPVWLtUAXKWu/7gZU/cTDXWyyfLH/sGztvWbt/AqfsZAoDTJECAS61ZtMs/t9n6Us6utHr2ePlDeePpWs+u3X8ZiZqT4mn83lLf4Bl0R4XRIDvqdGjQffv+Q2gBXBICBOCM7HUOeuKmWbTLxTfbfQPn7vPNvoFznk6Qhv3Uapg2LJ9b3ffxt6fB/tUQTiZAAIZIv+AZdK/e7/QNo0HXL54G3XGnSHX/AL2oG5bPre77+NsAmZh5XffXAJx7AgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABiBAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABiBAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAEPMTrPWZJeL1KvUAAAAASUVORK5CYII=")
			.formParam("vzwStr", "no sig"))
		.exec(http("TermsandConditions_93")
			.get("/jslibs/modernizr.php")
			.headers(headers_93))
		.exec(http("TermsandConditions_94")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_94))
		.exec(http("TermsandConditions_95")
			.get("/js/retail/topnav.php")
			.headers(headers_93))
		.exec(http("TermsandConditions_96")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218453410")
			.headers(headers_96))
		.exec(http("TermsandConditions_97")
			.get("/retail/rtcc/runcreditprocess.php")
			.headers(headers_24))
		.exec(http("TermsandConditions_98")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_98))
		.exec(http("TermsandConditions_99")
			.get("/jslibs/modernizr.php")
			.headers(headers_99))
		.exec(http("TermsandConditions_100")
			.get("/js/retail/topnav.php")
			.headers(headers_99))
		.exec(http("TermsandConditions_101")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218471320")
			.headers(headers_101))
		.exec(http("TermsandConditions_102")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1490218471448&storeId=0003")
			.headers(headers_101))
	}
		// cardscan
	val SwipeCard=group("${carrier}_SwipeCard"){
		exec(http("SwipeCard_103")
			.post("/ajax/retail/savebillingaddress.php")
			.headers(headers_103)
			.formParam("addressChoice", "same")
			.formParam("Billing_Address_Radio", "Y")
			.formParam("Ecom_BillTo_Postal_Name_First", "Fred")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "Consumer Two")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "FAREBOX")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117"))
		.pause(15)
		.exec(http("SwipeCard_104")
			.get("/ajax/retail/auruscallbackresponse.php")
			.headers(headers_101))
		.exec(http("SwipeCard_105")
			.post("/retail/checkout/emvpayment.htm")
			.headers(headers_105)
			.formParam("addressChoice", "same")
			.formParam("Billing_Address_Radio", "Y")
			.formParam("Ecom_BillTo_Postal_Name_First", "Fred")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "Consumer Two")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "536 Banks")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "FAREBOX")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94117"))
		.exec(http("SwipeCard_106")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_106))
		.exec(http("SwipeCard_107")
			.get("/jslibs/modernizr.php")
			.headers(headers_107))
		.exec(http("SwipeCard_108")
			.get("/js/retail/topnav.php")
			.headers(headers_107))
		.exec(http("SwipeCard_109")
			.get("/barcode.htm?code=9881257290050922&height=90&type=C128B&font=1")
			.headers(headers_109))
		.exec(http("SwipeCard_110")
			.get("/barcode.htm?code=15/25508064400899990000001890&width=360&height=90&type=C128B&font=1")
			.headers(headers_109))
		.exec(http("SwipeCard_111")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218508320")
			.headers(headers_111))
	}
		// PMSS
	val PrintMobileScanSheet=group("${carrier}_PrintMobileScanSheet"){
		exec(http("SwipeCard_112")
			.get("/retail/controller/saleassocflowcontroller.php?activate=1")
			.headers(headers_112))
		.exec(http("SwipeCard_113")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_113))
		.exec(http("SwipeCard_114")
			.get("/jslibs/modernizr.php")
			.headers(headers_114))
		.exec(http("SwipeCard_115")
			.get("/js/retail/topnav.php")
			.headers(headers_114))
		.exec(http("SwipeCard_116")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218522177")
			.headers(headers_116))
	}
		// REceipt
	val ScanReceipt=group("${carrier}_ScanReceipt"){
		exec(http("ScanReceipt_117")
			.post("/ajax/retail/fakereceipt.php")
			.headers(headers_117))
		.exec(http("ScanReceipt_118")
			.post("/retail/receiptscan.htm")
							.check(regex("Activation for order: #(.+?)</h3>").saveAs("p_orderid"))
			.headers(headers_118)
			.formParam("receiptId", "181016298490591544"))
		.exec(http("ScanReceipt_119")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_119))
		.exec(http("ScanReceipt_120")
			.get("/jslibs/modernizr.php")
			.headers(headers_120))
		.exec(http("ScanReceipt_121")
			.get("/js/retail/topnav.php")
			.headers(headers_120))

		.exec(http("ScanReceipt_122")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218540388")
			.headers(headers_122))
	}
		// IMEI&SIM
	val EnterIMEIandSIM=group("${carrier}_EnterIMEIandSIM"){
		exec(http("EnterIMEIandSIM_123")
			.post("/retail/checkout/activationscan.htm")
			.headers(headers_123)
			.formParam("serial", "")
			.formParam("device[FORUDAY1]", "Y")
			.formParam("deviceScanInfo[9427290_42203_1_1][sim]", "9999999999888888888"))
		.exec(http("EnterIMEIandSIM_124")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_124))
		.exec(http("EnterIMEIandSIM_125")
			.get("/jslibs/modernizr.php")
			.headers(headers_125))
		.exec(http("EnterIMEIandSIM_126")
			.get("/js/retail/topnav.php")
			.headers(headers_125))
		.exec(http("EnterIMEIandSIM_127")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218569567")
			.headers(headers_127))
		.exec(http("EnterIMEIandSIM_128")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1490218569711&storeId=0003")
			.headers(headers_127))
		.exec(http("EnterIMEIandSIM_129")
			.get("/retail/controller/saleassocflowcontroller.php?parking=1")
			.headers(headers_24))
		.exec(http("EnterIMEIandSIM_130")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_130))
		.exec(http("EnterIMEIandSIM_131")
			.get("/jslibs/modernizr.php")
			.headers(headers_131))
		.exec(http("EnterIMEIandSIM_132")
			.get("/js/retail/topnav.php")
			.headers(headers_131))

		.exec(http("EnterIMEIandSIM_133")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218576161")
			.headers(headers_133))
	}
		// IC
/*	val WirelessCustomerAgreement=group("${carrier}_WirelessCustomerAgreement"){
		exec(http("WirelessCustomerAgreement_134")
			.post("/retail/checkout/termsconditions.htm?rtdfc=1")
			.headers(headers_134)
			.formParam("termsConditions[contractFile]", "Y")
			.formParam("output", """[{"lx":311,"ly":93,"mx":311,"my":92},{"lx":313,"ly":93,"mx":311,"my":93},{"lx":317,"ly":93,"mx":313,"my":93},{"lx":320,"ly":93,"mx":317,"my":93},{"lx":325,"ly":93,"mx":320,"my":93},{"lx":338,"ly":93,"mx":325,"my":93},{"lx":379,"ly":94,"mx":379,"my":93},{"lx":381,"ly":90,"mx":379,"my":94},{"lx":383,"ly":89,"mx":381,"my":90},{"lx":389,"ly":87,"mx":383,"my":89},{"lx":403,"ly":85,"mx":389,"my":87},{"lx":430,"ly":84,"mx":403,"my":85},{"lx":469,"ly":81,"mx":430,"my":84},{"lx":517,"ly":81,"mx":469,"my":81},{"lx":563,"ly":81,"mx":517,"my":81},{"lx":605,"ly":79,"mx":563,"my":81},{"lx":626,"ly":78,"mx":605,"my":79}]""")
			.formParam("sigStr", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyAAAAB4CAYAAAAKRZZvAAAEz0lEQVR4nO3dv0qkZxjG4T0HhSTYJDmAxByBewJZQcMixG3X1G6XzVqvtisKFhIb/zRrEdzSQFaLsQoiWEUQtBAbEQureVMEZcZRsybO/Y3OdcFT2L0zWLw/x++ZJwUAACDkSdUHAAAAuocAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABiBAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABiBAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABiBAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAELR/dFo2dw6b5kNtr0ytbLXM4MRqy3z9Yq70Dk+X3uHp8vTVctUvB+5MgAAA3GD/6LS+uXPYNB9qe/Wpla2WefZmtWW+Gp2r9w5Pl56hd5fRcJ8zML5U9VsEdyZAAIBH4b5ioR3TGCD9Ywvl2Zv3TTP6dq1MLtdaZmPnoGVOzs6rfqvhfxEgAHCDxgvt1Yvs1Ytrz9B02y6viXmo52/3ub99uVD//pf3TfPj27X65HKtZTZ2Dlrm5Oy8XvXvMXQaAQJAV7hLTHTiRfihX+QT5xYL8DAIEAAenHbHxMV8OTrXdJltvMCu1f66vLjuH526uAJ8IgECwL3a3jtu2fBzMddt+Zla2Sqv5z9eu+1ncGK1fPfTwr38lV5MAHQGAQLAJzk5Oy+bO4dl6ffdMrWyVV5MrpXBidW2bfe57d9txATAwyVAALh0U2TcHgXNATIwvtSy4edirtvyM7lcK7O//Xnttp+NnYOyf3Ra9dsCwD0SIABdbnvvuLye/1i+eD7zr59ANK4LXVzftRIUgDsTIABd6CI6rjxfITIAaDsBAtBFFtd3Wz7p6B9bKD/P/1G2946rPh4AXUCAAHSJvpHZy2c2Pn8+IzoAqIQAAegCi+u7pWfoXfnsh5myuL5b9XEA6GICBHh0BsaXytNXy1Ufo6P0j/3zrIf4AKBqAgR4dC7Wwl5dD9v483XfXfFfv8+i02Pnm5e/Xj7rAQBVEyDAo9P4rEMiQAbGl6p+ybe62G7l0w8AOoEAAXjk+kZmS9/IbNXHAIBSigABAACCBAgAABAjQAAAgBgBAgAAxAgQAAAgRoAAAAAxAgQAAIgRIAAAQIwAAQAAYgQIAAAQI0AAAIAYAQIAAMQIEAAAIEaAAAAAMQIEAACIESAAAECMAAEAAGIECAAAECNAAACAGAECAADECBAAACBGgAAAADECBAAAiBEgAABAjAABAABi/gaf8gqjN6P4GAAAAABJRU5ErkJggg==")
			.formParam("vzwStr", "no sig"))
		.exec(http("WirelessCustomerAgreement_135")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_135))
		.exec(http("WirelessCustomerAgreement_136")
			.get("/jslibs/modernizr.php")
			.headers(headers_136))
		.exec(http("WirelessCustomerAgreement_137")
			.get("/js/retail/topnav.php")
			.headers(headers_136))
    .exec(http("WirelessCustomerAgreement_138")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218604893")
			.headers(headers_138))
		.exec(http("WirelessCustomerAgreement_139")
			.get("/retail/checkout/controller/activationprocess.php?activating=")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_140")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_141")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_142")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_143")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218610970")
			.headers(headers_143))
		.exec(http("WirelessCustomerAgreement_144")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_145")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_146")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_147")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_148")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218617245")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_149")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_150")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_151")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_152")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_153")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218623795")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_154")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_155")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_156")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_157")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.pause(101 milliseconds)
		.exec(http("WirelessCustomerAgreement_158")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218628795")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_159")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_160")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_161")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_162")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_163")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218634392")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_164")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_165")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_166")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_167")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_168")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218639451")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_169")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_170")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_171")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_172")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_173")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218644470")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_174")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_175")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_176")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_177")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_178")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218649543")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_179")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_180")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_181")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_182")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_183")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218654837")
			.headers(headers_143))
		.pause(641 milliseconds)
		.exec(http("WirelessCustomerAgreement_184")
			.post(uri3 + "?client=navclient-auto-ffox&appver=28.0&pver=2.2&key=AIzaSyD-s-mXL4mBzF7KMRkhTCIbG2RKnRGXzJc&wrkey=AKEgNiuqSDOcftLH1kPk1RU7BGST_0TiQiADBqomutcE_GVrkGVOtUEK74BxRIkCDtGqDGdHVplx1MtTM3a7g2_7e7__gldw-Q==")
			.headers(headers_184)
			.body(ElFileBody("SprintFlow_0184_request.txt")))
		.exec(http("WirelessCustomerAgreement_185")
			.get(uri4 + "/ChVnb29nLWJhZGJpbnVybC1zaGF2YXI4AEACSgwIARD74QcY_OEHIAFKDAgAEJbMBxiXzAcgAQ")
			.headers(headers_185))
		.exec(http("WirelessCustomerAgreement_186")
			.get(uri4 + "/ChNnb29nLW1hbHdhcmUtc2hhdmFyOABAAkoMCAEQ3NsPGN3bDyABSgwIABDR_w8Y0v8PIAE")
			.headers(headers_185))
		.exec(http("WirelessCustomerAgreement_187")
			.get(uri4 + "/ChFnb29nLXBoaXNoLXNoYXZhcjgAQAJKDAgBEJOtExiUrRMgAUoMCAAQ9f4cGPb-HCAB")
			.headers(headers_185))
		.pause(2)
		.exec(http("WirelessCustomerAgreement_188")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_189")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_190")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_191")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_192")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218659731")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_193")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_194")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_195")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_196")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_197")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218664965")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_198")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_199")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_200")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_201")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_202")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218670179")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_203")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_204")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_205")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_206")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_207")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218675121")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_208")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_209")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_210")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_211")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_212")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218680233")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_213")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_214")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_215")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_216")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_217")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218685323")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_218")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_219")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))

val chain_3 = exec(http("WirelessCustomerAgreement_220")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_221")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_222")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218690298")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_223")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.pause(101 milliseconds)
		.exec(http("WirelessCustomerAgreement_224")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_225")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_226")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_227")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218695459")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_228")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_229")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_230")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_231")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_232")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218700510")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_233")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_234")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_235")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_236")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_237")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218705626")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_238")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_239")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_240")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_241")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_242")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218710694")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_243")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_244")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_245")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_246")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.pause(103 milliseconds)
		.exec(http("WirelessCustomerAgreement_247")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218715780")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_248")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_249")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_250")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_251")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_252")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218721116")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_253")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_254")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_255")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_256")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_257")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218726389")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_258")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_259")
			.get("/jslibs/modernizr.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_260")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_141))
		.exec(http("WirelessCustomerAgreement_261")
			.get("/js/retail/topnav.php")
			.headers(headers_140))
		.exec(http("WirelessCustomerAgreement_262")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218731447")
			.headers(headers_143))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_263")
			.get("/retail/checkout/controller/activationprocess.php?activating=1")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_264")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_264))
		.exec(http("WirelessCustomerAgreement_265")
			.get("/jslibs/modernizr.php")
			.headers(headers_265))
		.exec(http("WirelessCustomerAgreement_266")
			.get("/js/retail/topnav.php")
			.headers(headers_265))
		.pause(100 milliseconds)
		.exec(http("WirelessCustomerAgreement_267")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218735937")
			.headers(headers_267))
		.exec(http("WirelessCustomerAgreement_268")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1490218736028&storeId=0003")
			.headers(headers_267))
		.pause(62)
		.exec(http("WirelessCustomerAgreement_269")
			.post("/retail/support.htm")
			.headers(headers_269)
			.formParam("supportSubmitType", "continue"))
		.exec(http("WirelessCustomerAgreement_270")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_135))
		.exec(http("WirelessCustomerAgreement_271")
			.get("/jslibs/modernizr.php")
			.headers(headers_136))
		.exec(http("WirelessCustomerAgreement_272")
			.get("/js/retail/topnav.php")
			.headers(headers_136))
		.exec(http("WirelessCustomerAgreement_273")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218801837")
			.headers(headers_138))
		.pause(3)
		.exec(http("WirelessCustomerAgreement_274")
			.get("/retail/checkout/controller/activationprocess.php?activating=")
			.headers(headers_24))
		.exec(http("WirelessCustomerAgreement_275")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_264))
		.exec(http("WirelessCustomerAgreement_276")
			.get("/jslibs/modernizr.php")
			.headers(headers_265))
		.exec(http("WirelessCustomerAgreement_277")
			.get("/js/retail/topnav.php")
			.headers(headers_265))
		.exec(http("WirelessCustomerAgreement_278")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490218807990")
			.headers(headers_267))
		.exec(http("WirelessCustomerAgreement_279")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1490218808063&storeId=0003")
			.headers(headers_267))
	}*/
//	val scn = scenario("SprintFlow").exec
//chain_0, chain_1, chain_2, chain_3)

//etUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}

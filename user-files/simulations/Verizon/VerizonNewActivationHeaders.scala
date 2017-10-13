import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object VerizonNewActivationHeaders{
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
}
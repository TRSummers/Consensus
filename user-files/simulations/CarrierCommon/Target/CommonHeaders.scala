package CarrierCommon.Target

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object CommonHeaders{
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

  val poa_headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "max-age=0",
    "Connection" -> "keep-alive",
    "Origin" -> "https://poa-perf-scale.consensuscorpdev.com",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val ui_headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val ui_headers_4 = Map(
    "Accept" -> "image/webp,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Connection" -> "keep-alive",
    "If-Modified-Since" -> "Wed, 31 May 2017 19:28:06 GMT",
    "If-None-Match" -> "659ff-b4f-550d6eb645d80")

  val ui_headers_5 = Map(
    "Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")

  val ui_headers_6 = Map(
    "Accept" -> "*/*",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest")

  val ui_headers_14 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Connection" -> "keep-alive",
    "If-Modified-Since" -> "Wed, 31 May 2017 19:28:06 GMT",
    "If-None-Match" -> "65a69-773-550d6eb645d80")

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

  val poa_headers_2 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1")

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

  val status_call = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "home",
    "X-COMMON-INTERACTION-ID" -> "051d3257-a5d2-40e5-ba0d-7ba1c252632d",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

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
}

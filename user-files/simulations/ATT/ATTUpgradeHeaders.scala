import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object ATTUpgradeHeaders{

  val headers_0 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Access-Control-Request-Headers" -> "content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
    "Access-Control-Request-Method" -> "POST",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_1 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "choosepathmodule",
    "X-COMMON-INTERACTION-ID" -> "7994c1cf-9c95-46e8-b0bb-404998f7d0df",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_2 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_3 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_5 = Map(
    "Accept" -> "image/webp,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_6 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, sdch, br",
    "accept-language" -> "en-US,en;q=0.8",
    "cache-control" -> "no-cache",
    "pragma" -> "no-cache",
    "referer" -> Common.uri_ui,
    "user-agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "x-chrome-uma-enabled" -> "1",
    "x-client-data" -> "CIu2yQEIpbbJAQjBtskBCPqcygEIqZ3KAQ==")

  val headers_7 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_10 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, sdch, br",
    "accept-language" -> "en-US,en;q=0.8",
    "cache-control" -> "no-cache",
    "origin" -> Common.uri_ui_no_shopping,
    "pragma" -> "no-cache",
    "referer" -> "https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic&subset=latin",
    "user-agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "x-chrome-uma-enabled" -> "1",
    "x-client-data" -> "CIu2yQEIpbbJAQjBtskBCPqcygEIqZ3KAQ==")

  val headers_11 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "frame",
    "X-COMMON-INTERACTION-ID" -> "e543d4a5-c356-42b8-bd5c-358b19572663",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_12 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "start",
    "X-COMMON-INTERACTION-ID" -> "e618d0d2-eb28-4c52-b3c4-0e8d2c5e0f50",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_15 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "accountverification",
    "X-COMMON-INTERACTION-ID" -> "d36056f7-f4f3-4278-834e-7523866a6553",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_16 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-INTERACTION-ID" -> "525302cf-4b47-4104-bafe-3b0dfe4a8bf1",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_17 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-INTERACTION-ID" -> "711a2e03-3447-484f-8c59-c97a2723840a",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_18 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-INTERACTION-ID" -> "d22d6c83-be1b-4d7f-8b7e-3301f42c8305",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_19 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_26 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "accountverification",
    "X-COMMON-INTERACTION-ID" -> "227deee8-47fd-4712-b22c-19f0126a0af3",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_28 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "accountverification",
    "X-COMMON-INTERACTION-ID" -> "01eca637-6947-484a-98ef-69168cb5bc8c",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_30 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_58 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_60 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Origin" -> Common.uri_poa_no_port,
    "Pragma" -> "no-cache",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_98 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "frame",
    "X-COMMON-INTERACTION-ID" -> "3053c945-def3-4a52-afc0-ad61ab04c376",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_99 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "start",
    "X-COMMON-INTERACTION-ID" -> "41714da5-fe09-4ccb-926c-0d0c11345542",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_102 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "scan",
    "X-COMMON-INTERACTION-ID" -> "0fbecc00-c410-4ca0-bde4-e7f83f277f6f",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_103 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-INTERACTION-ID" -> "3877cf38-2adc-4a2d-87ef-94f75a5a3c4c",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_104 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-INTERACTION-ID" -> "61d6a51f-1b9f-4747-a0ad-27ecaafcf828",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_105 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-INTERACTION-ID" -> "50f9c2bb-0101-44a7-bb5b-259db6a08fac",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_109 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Access-Control-Request-Headers" -> "cartid,content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
    "Access-Control-Request-Method" -> "POST",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36")

  val headers_110 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "scan",
    "X-COMMON-INTERACTION-ID" -> "099a9464-5d9b-4c16-9983-d450fc972032",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2",
    "cartId" -> "${p_sessionid}")

  val headers_112 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "scan",
    "X-COMMON-INTERACTION-ID" -> "5e4ecb31-d240-43ef-9778-b427fb274df3",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_114 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "paymentoptions",
    "X-COMMON-INTERACTION-ID" -> "af78b87c-99a4-45d0-b2ca-05f672183e59",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_115 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, sdch, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "scan",
    "X-COMMON-INTERACTION-ID" -> "293f2a47-d993-4f50-986c-c8c1721c8804",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_117 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "paymentoptions",
    "X-COMMON-INTERACTION-ID" -> "765cf8a3-1f68-473f-85ef-e3dfa1995153",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_120 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> Common.uri_ui_no_shopping,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-COMMON-FLOW-TYPE" -> "paymentoptions",
    "X-COMMON-INTERACTION-ID" -> "3dfb6547-85cf-4a24-a159-3f5df0f2da59",
    "X-COMMON-RETAIL-STORE-ID" -> "0003",
    "X-COMMON-SALESREP-ID" -> "tadmin2")

  val headers_408 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.8",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Origin" -> Common.uri_poa_no_port,
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Mobile Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest")
  
}
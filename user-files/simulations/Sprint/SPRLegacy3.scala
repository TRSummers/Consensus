
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object SPRLegacy3{

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")

	val headers_0 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_1 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "choosepathmodule",
		"X-COMMON-INTERACTION-ID" -> "ff802433-460e-496a-a7b7-ec9e5ea6313b",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_5 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-modified-since" -> "Tue, 14 Nov 2017 23:41:18 GMT",
		"referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"x-client-data" -> "CI22yQEIorbJAQjBtskBCPqcygEIqZ3KAQioo8oB")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_12 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "start",
		"X-COMMON-INTERACTION-ID" -> "ce9f2bc7-9c0a-44d7-80fc-7fe691a87a34",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_13 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "frame",
		"X-COMMON-INTERACTION-ID" -> "61c9a2c1-d31b-4654-ae04-a0b72f1985b9",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_14 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "841e2865-c04f-43c3-bd5b-74baeb1fe0d2",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_15 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_16 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "26c79434-05ac-42c6-803c-23c0ae30dcab",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_17 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "a28c8b67-1cd9-4cb0-ab74-3e19589f74e9",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_18 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "4591d053-3789-4956-9ebd-32bf7d77af07",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_24 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "de565cd2-a630-4fc4-a616-fb38f4b4b073",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_26 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "782bfa21-9d4a-4eae-a433-63c00a846fe6",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_28 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "34521847-aa2c-4570-8355-698c5fbc40b0",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_29 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "7648ba1e-7f8e-4bc8-9761-5e04b5943c79",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_30 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "deviceTradeIn",
		"X-COMMON-INTERACTION-ID" -> "0f0c6e19-469a-45d5-9c5f-ef24a5ca1275",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_31 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "e7141881-c7d4-474a-b9a7-68292074d299",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_36 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "521ba179-a792-40f9-b290-ba79d1fa36d6",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_38 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "429ba1bb-67f7-4e3b-be4a-1cf91095d229",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_39 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "fcaba590-aba4-4eab-9c77-e842e5187877",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_40 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "cartid,content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "POST",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_41 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "d3953c6d-142d-4aa9-9c58-7950c9f4d308",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2",
		"cartId" -> "${p_sessionid}")

	val headers_43 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "73eb0953-4d49-4581-9b82-b88968d86fdc",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_45 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "paymentoptions",
		"X-COMMON-INTERACTION-ID" -> "ec8050be-8337-4eab-88b5-75e8ea2c8e94",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_46 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "c1973255-e53a-42fb-9079-b30a614b3a0a",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_48 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "paymentoptions",
		"X-COMMON-INTERACTION-ID" -> "4c17d3ab-6cd5-462c-aafb-edb4fbc5c25c",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_50 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "paymentoptions",
		"X-COMMON-INTERACTION-ID" -> "4732555e-659b-4d29-9b10-086422f57c60",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_52 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_54 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_63 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:06 GMT",
		"If-None-Match" -> "43129-5e7-55de525d02c8c",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_65 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:20 GMT",
		"If-None-Match" -> "661fd-1c4-55de526a7ae12",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_73 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:14 GMT",
		"If-None-Match" -> "43d96-70e-55de52648ed25",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_79 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_80 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://poa-perf-scale.consensuscorpdev.com",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_92 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:13 GMT",
		"If-None-Match" -> "69cb9-9034-55de52636ad51",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_143 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:21 GMT",
		"If-None-Match" -> "2666d-720-55de526b0974d",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_168 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "frame",
		"X-COMMON-INTERACTION-ID" -> "2895994b-1525-4bf6-a241-60bbabb42542",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_169 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "start",
		"X-COMMON-INTERACTION-ID" -> "680fad73-196b-47a6-901d-8b56a48b1f25",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_170 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "06cfb026-72fa-48d6-8f93-7b1bf7afc3bf",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_172 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "66b527ef-d533-4c00-8ef0-797f80ce3959",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_173 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "81b60b08-d318-4309-b80d-fa191a78fdb1",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_174 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "1b34a30b-7677-40c4-8e74-6474f706045c",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_176 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "4a1a0914-86fd-4799-8d30-cf8d5ae38a0d",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_177 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "content-type,sessionid,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "GET",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_178 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "d6d5ef28-3e81-4ecf-9515-3b11f27f84eb",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2",
		"sessionId" -> "${p_sessionid}")

	val headers_179 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:08 GMT",
		"If-None-Match" -> "64f98-17b8-55de525e6993e",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_180 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "cartid,content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "PATCH",
		"Connection" -> "keep-alive",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_181 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "4736ffce-f86d-4522-ab45-966e0c0c3e96",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2",
		"cartId" -> "${p_sessionid}")

	val headers_183 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "f516f2dd-3568-443c-a661-4e045dca8a39",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_196 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:14 GMT",
		"If-None-Match" -> "3312-148-55de52644edad",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_221 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:05 GMT",
		"If-None-Match" -> "41c0e-1182-55de525bb61db",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_223 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:14 GMT",
		"If-None-Match" -> "43d4f-2304-55de52648cde6",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_249 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:05 GMT",
		"If-None-Match" -> "41bfc-f45-55de525bb61db",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_250 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:06 GMT",
		"If-None-Match" -> "41ff2-108e-55de525cad3dc",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_251 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:08 GMT",
		"If-None-Match" -> "671e2-1158-55de525eeb407",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_255 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:06 GMT",
		"If-None-Match" -> "43b12-935-55de525c87699",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_286 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:14 GMT",
		"If-None-Match" -> "43d50-85d7-55de52648be46",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_316 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:05 GMT",
		"If-None-Match" -> "41c3a-1c3f-55de525bb61db",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_317 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:06 GMT",
		"If-None-Match" -> "4312e-d95-55de525d02c8c",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_318 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:14 GMT",
		"If-None-Match" -> "690a9-803-55de52643ad69",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_344 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:06 GMT",
		"If-None-Match" -> "67fd0-f16-55de525d18ebe",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_348 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:12 GMT",
		"If-None-Match" -> "685ad-2344-55de5262a6e2a",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_362 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:13 GMT",
		"If-None-Match" -> "673b8-0-55de526311f75",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_376 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:07 GMT",
		"If-None-Match" -> "67419-11b2-55de525d944bb",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_377 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_403 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:10 GMT",
		"If-None-Match" -> "439d1-261-55de5260aaf94",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_404 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:21 GMT",
		"If-None-Match" -> "266b0-112c6-55de526b0780d",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_416 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Origin" -> "https://poa-perf-scale.consensuscorpdev.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_429 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:06 GMT",
		"If-None-Match" -> "28106-c04-55de525ce71dc",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_430 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:12 GMT",
		"If-None-Match" -> "6427f-ad6a-55de526261727",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_431 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:22 GMT",
		"If-None-Match" -> "264a1-9fa3-55de526c2b7e2",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

	val headers_539 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Mon, 13 Nov 2017 22:54:14 GMT",
		"If-None-Match" -> "222fb-4ce-55de526480a8d",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36")

    val uri1 = "https://perf-scale-dsom.consensuscorpdev.com"
    val uri2 = "https://perf-scale-ui.consensuscorpdev.com/shopping"
    val uri4 = "https://fonts.gstatic.com/s/lato/v14"
    val uri5 = "https://fonts.googleapis.com/css"

	val Upgrade = group("Upgrade->SelectSprint"){ 
	  exec(http("request_0")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_0))
		.pause(127 milliseconds)
		.exec(http("request_1")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_1)
			.body(ElFileBody("SPRLegacy3_0001_request.json")))
		.pause(1)
		.exec(http("request_2")
			.get("/retail/orderassembly/controller/process.php?planType=contractExt&action=buyTypeChosen")
			.headers(headers_2))
		.exec(http("request_3")
			.get(uri2 + "/build/bundle_12d37e7970386dd09375_min.js"))
		.exec(http("request_4")
			.get(uri2 + "/build/css_12d37e7970386dd09375_min.js"))
		.pause(146 milliseconds)
		.exec(http("request_5")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_5))
		.exec(http("request_6")
			.get(uri2 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2"))
		.exec(http("request_7")
			.get(uri4 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"))
		.exec(http("request_8")
			.get(uri4 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2"))
		.exec(http("request_9")
			.get(uri2 + "/assets/img/cloader.gif"))
		.exec(http("request_10")
			.get(uri2 + "/config.json")
			.headers(headers_10))
		.exec(http("request_11")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_0))
		.exec(http("request_12")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_12)
			.body(ElFileBody("SPRLegacy3_0012_request.json")))
		.pause(124 milliseconds)
		.exec(http("request_13")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_13)
			.body(ElFileBody("SPRLegacy3_0013_request.json")))
		.pause(425 milliseconds)
		.exec(http("request_14")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_14)
			.body(ElFileBody("SPRLegacy3_0014_request.json")))
		.exec(http("request_15")
			.get(uri2 + "/build/ch_14ace62c4d598704320c_min.js")
			.headers(headers_15))
		.pause(229 milliseconds)
		.exec(http("request_16")
			.get(uri2 + "/app/pages/frame/header/header.html")
			.headers(headers_16))
		.exec(http("request_17")
			.get(uri2 + "/app/pages/frame/footer/footer.html")
			.headers(headers_17))
		.exec(http("request_18")
			.get(uri2 + "/app/pages/accountverification/accountverification.html")
			.headers(headers_18))
		.exec(http("request_19")
			.get(uri2 + "/assets/img/bullseye.svg")
			.check(substring("Upgrade current device"))
			.headers(headers_15))
		.exec(http("request_20")
			.get(uri2 + "/assets/img/verizon.svg")
			.headers(headers_15))
		.exec(http("request_21")
			.get(uri2 + "/assets/img/att.svg")
			.headers(headers_15))
		.exec(http("request_22")
			.get(uri2 + "/assets/img/sprint.svg")
			.headers(headers_15))
	}
		val SelectSprint=group("SelectSprint->UEC"){
		exec(http("request_23")
			.options(uri1 + "/dsom-app/v1/isWidgetEnabledEx")
			.headers(headers_0))
		.pause(126 milliseconds)
		.exec(http("request_24")
			.post(uri1 + "/dsom-app/v1/isWidgetEnabledEx")
			.headers(headers_24)
			.body(ElFileBody("SPRLegacy3_0024_request.json")))
		}
//		.pause(49)
		val UEC=group("UEC->UECResults"){
		exec(http("request_25")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_0))
		.pause(126 milliseconds)
		.exec(http("request_26")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_26)
			.body(ElFileBody("SPRLegacy3_0026_request.json")))
		.pause(2)
		.exec(http("request_27")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_0))
		.pause(125 milliseconds)
		.exec(http("request_28")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.check(substring("Please select a line to upgrade"))
			.headers(headers_28)
			.body(ElFileBody("SPRLegacy3_0028_request.json")))
		.pause(302 milliseconds)
		.exec(http("request_29")
			.get(uri2 + "/app/pages/upgraderesults/upgraderesults.html")
			.headers(headers_29))
		.exec(http("request_30")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_30)
			.body(ElFileBody("SPRLegacy3_0030_request.json")))
		.exec(http("request_31")
			.get(uri2 + "/app/pages/upgraderesults/partials/urtile.html")
			.headers(headers_31))
		.pause(1)
		.exec(http("request_32")
			.get(uri2 + "/assets/img/1-imeitooltip.svg")
			.headers(headers_15))
		.exec(http("request_33")
			.get(uri2 + "/assets/img/2-imeitooltip.svg")
			.headers(headers_15))
		.exec(http("request_34")
			.get(uri2 + "/assets/img/3-imeitooltip.svg")
			.headers(headers_15))
		}
		//.pause(21)
		val UECResults=group("UECResults->Scan"){
		 exec(http("request_35")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_0))
		.pause(144 milliseconds)
		.exec(http("request_36")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_36)
			.body(ElFileBody("SPRLegacy3_0036_request.json")))
		.pause(1)
		.exec(http("request_37")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_0))
		.pause(123 milliseconds)
		.exec(http("request_38")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.check(substring("Important note about the iPhone"))
			.headers(headers_38)
			.body(ElFileBody("SPRLegacy3_0038_request.json")))
		.pause(265 milliseconds)
		.exec(http("request_39")
			.get(uri2 + "/app/pages/scan/scan.html")
			.headers(headers_39))
		}
		//.pause(17)
		val Scan=group("Scan->PO"){
		 exec(http("request_40")
			.options(uri1 + "/session/dsom/v1/cart/item")
			.headers(headers_40))
		.pause(123 milliseconds)
		.exec(http("request_41")
			.post(uri1 + "/session/dsom/v1/cart/item")
			.headers(headers_41)
			.body(ElFileBody("SPRLegacy3_0041_request.json")))
		.pause(488 milliseconds)
		.exec(http("request_42")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_0))
		.pause(122 milliseconds)
		.exec(http("request_43")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_43)
			.body(ElFileBody("SPRLegacy3_0043_request.json")))
		.pause(1)
		.exec(http("request_44")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_0))
		.pause(123 milliseconds)
		.exec(http("request_45")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_45)
			.body(ElFileBody("SPRLegacy3_0045_request.json")))
		.pause(332 milliseconds)
		.exec(http("request_46")
			.get(uri2 + "/app/pages/paymentoptions/paymentoptions.html")
			.headers(headers_46))
		.exec(http("request_47")
			.options(uri1 + "/dsom-app/v1/getPaymentDetails")
			.headers(headers_0))
		.pause(124 milliseconds)
		.exec(http("request_48")
			.post(uri1 + "/dsom-app/v1/getPaymentDetails")
			.check(substring("It is now easy to get the greatest"))
			.headers(headers_48)
			.body(ElFileBody("SPRLegacy3_0048_request.json")))
		}
		//.pause(15)
		val PO=group("PO->CC"){
		exec(http("request_49")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_0))
		.pause(132 milliseconds)
		.exec(http("request_50")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_50)
			.body(ElFileBody("SPRLegacy3_0050_request.json")))
		//.pause(3)
		.exec(http("request_51")
			.get("/retail/orderassembly/controller/process.php")
			.check(substring("Your personal information"))
			.headers(headers_2))
		.exec(http("request_52")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_53")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_15))
		.exec(http("request_54")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_55")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_15))
		.exec(http("request_56")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_57")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_58")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_59")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_60")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_61")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_62")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_63")
			.get("/js/retail/creditcheck.js")
			.headers(headers_63))
		.exec(http("request_64")
			.get("/js/retail/checkoutinit.js")
			.headers(headers_15))
		.exec(http("request_65")
			.get("/js/datechange.js")
			.headers(headers_65))
		.exec(http("request_66")
			.get("/js/retail/numport.php?devices=")
			.headers(headers_54))
		.pause(572 milliseconds)
		.exec(http("request_67")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_15))
		.exec(http("request_68")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_15))
      .exec(http("request_69")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_15))
		.exec(http("request_70")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_15))
		.exec(http("request_71")
			.get("/img/retail/cart.png")
			.headers(headers_15))
		.exec(http("request_72")
			.get("/img/retail/setting.png")
			.headers(headers_15))
		.exec(http("request_73")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_73))
		.exec(http("request_74")
			.get("/img/retail/home.png")
			.headers(headers_15))
		.exec(http("request_75")
			.get("/img/retail/inventory-management.png")
			.headers(headers_15))
		.exec(http("request_76")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_15))
		.exec(http("request_77")
			.get("/img/retail/save.png")
			.headers(headers_15))
		.exec(http("request_78")
			.get("/img/retail/lock.png")
			.headers(headers_15))
		.exec(http("request_79")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793881545")
			.headers(headers_79))
		}
	//.pause(18)
			val CC=group("CC->CCResults"){
		 exec(http("request_80")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(headers_80))
		.exec(http("request_81")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_82")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_83")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_84")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_85")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_86")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_87")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_88")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_89")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_90")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_91")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_92")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_92))
		.pause(590 milliseconds)
		.exec(http("request_93")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_94")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_95")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_96")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_97")
			.get("/img/retail/cart.png"))
		.exec(http("request_98")
			.get("/img/retail/setting.png"))
		.exec(http("request_99")
			.get("/img/retail/home.png"))
		.exec(http("request_100")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_101")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_102")
			.get("/img/retail/save.png"))
		.exec(http("request_103")
			.get("/img/retail/lock.png"))
		.exec(http("request_104")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793900656")
			.headers(headers_79))
		//.pause(2)
		.exec(http("request_105")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_2))
		.exec(http("request_106")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_107")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_108")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_109")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_110")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_111")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_112")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_113")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_114")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_115")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_116")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_117")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_92))
		.pause(715 milliseconds)
		.exec(http("request_118")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_119")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_120")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_121")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_122")
			.get("/img/retail/cart.png"))
		.exec(http("request_123")
			.get("/img/retail/setting.png"))
		.exec(http("request_124")
			.get("/img/retail/home.png"))
		.exec(http("request_125")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_126")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_127")
			.get("/img/retail/save.png"))
		.exec(http("request_128")
			.get("/img/retail/lock.png"))
		.exec(http("request_129")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793904158")
			.headers(headers_79))
		//.pause(2)
		.exec(http("request_130")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_2))
		.exec(http("request_131")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_132")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_133")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_134")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_135")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_136")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_137")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_138")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_139")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_140")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_141")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_142")
			.get("/js/retail/creditcheckresult.js")
			.headers(headers_15))
		.exec(http("request_143")
			.get("/img/corpLogos/plLg545.gif")
			.headers(headers_143))
		.pause(599 milliseconds)
		.exec(http("request_144")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_145")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_146")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_147")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_148")
			.get("/img/retail/cart.png"))
		.exec(http("request_149")
			.get("/img/retail/setting.png"))
		.exec(http("request_150")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_15))
		.exec(http("request_151")
			.get("/img/retail/home.png"))
		.exec(http("request_152")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_153")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_154")
			.get("/img/retail/save.png"))
		.exec(http("request_155")
			.get("/img/retail/lock.png"))
		.exec(http("request_156")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793907097")
			.headers(headers_79))
		}
	//.pause(9)
		val CCResult=group("CCResult->IDP"){
		exec(http("request_157")
			.post("/retail/creditcheck/result.htm")
			.headers(headers_80))
		.exec(http("request_158")
			.get(uri2 + "/build/bundle_12d37e7970386dd09375_min.js"))
		.exec(http("request_159")
			.get(uri2 + "/build/css_12d37e7970386dd09375_min.js"))
		.pause(149 milliseconds)
		.exec(http("request_160")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_5))
     .exec(http("request_161")
			.get(uri2 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2"))
		.exec(http("request_162")
			.get(uri4 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2"))
		.exec(http("request_163")
			.get(uri4 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2"))
		.exec(http("request_164")
			.get(uri2 + "/assets/img/cloader.gif"))
		.exec(http("request_165")
			.get(uri2 + "/config.json")
			.headers(headers_10))
		.exec(http("request_166")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_0))
		.exec(http("request_167")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_0))
		.pause(122 milliseconds)
		.exec(http("request_168")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_168)
			.body(ElFileBody("SPRLegacy3_0168_request.json")))
		.exec(http("request_169")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_169)
			.body(ElFileBody("SPRLegacy3_0169_request.json")))
		.pause(1)
		.exec(http("request_170")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_170)
			.body(ElFileBody("SPRLegacy3_0170_request.json")))
		.exec(http("request_171")
			.get(uri2 + "/build/ch_14ace62c4d598704320c_min.js")
			.headers(headers_15))
		.pause(306 milliseconds)
		.exec(http("request_172")
			.get(uri2 + "/app/pages/frame/header/header.html")
			.headers(headers_172))
		.exec(http("request_173")
			.get(uri2 + "/app/pages/frame/footer/footer.html")
			.headers(headers_173))
		.exec(http("request_174")
			.get(uri2 + "/app/pages/installmentdetails/installmentdetails.html")
			.headers(headers_174))
		.exec(http("request_175")
			.get(uri2 + "/assets/img/bullseye.svg"))
		.exec(http("request_176")
			.get(uri2 + "/app/components/channel/channel.html")
			.headers(headers_176))
		.exec(http("request_177")
			.options(uri1 + "/dsom-app/v1/paymentPlans")
			.headers(headers_177))
		.pause(125 milliseconds)
		.exec(http("request_178")
			.get(uri1 + "/dsom-app/v1/paymentPlans")
			.headers(headers_178))
		.pause(1)
		.exec(http("request_179")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png")
			.headers(headers_179))
		
		}
/***		//.pause(7)
		val IDP=group("IDP->Plan"){
		 exec(http("request_180")
			.options(uri1 + "/session/dsom/v1/cart/item/1")
			.headers(headers_180))
		.pause(137 milliseconds)
		.exec(http("request_181")
			.patch(uri1 + "/session/dsom/v1/cart/item/1")
			.headers(headers_181)
			.body(ElFileBody("SPRLegacy3_0181_request.json")))
		.pause(308 milliseconds)
		.exec(http("request_182")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_0))
		.pause(125 milliseconds)
		.exec(http("request_183")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_183)
			.body(ElFileBody("SPRLegacy3_0183_request.json")))
		}
		//.pause(4)
		val Plan=group("Plan->Cart"){
		 exec(http("request_184")
			.get("/retail/orderassembly/controller/process.php")
			.headers(headers_2))
		.exec(http("request_185")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_186")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_15))
		.exec(http("request_187")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_188")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_15))
		.exec(http("request_189")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_190")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_191")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_192")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_193")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_194")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_195")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_196")
			.get("/js/retail/plans.js")
			.headers(headers_196))
		.pause(582 milliseconds)
		.exec(http("request_197")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_15))
		.exec(http("request_198")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_15))
		.exec(http("request_199")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_15))
		.exec(http("request_200")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_15))
		.exec(http("request_201")
			.get("/img/retail/cart.png")
			.headers(headers_15))
		.exec(http("request_202")
			.get("/img/retail/setting.png")
			.headers(headers_15))
		.exec(http("request_203")
			.get("/img/retail/home.png")
			.headers(headers_15))
		.exec(http("request_204")
			.get("/img/retail/inventory-management.png")
			.headers(headers_15))
		.exec(http("request_205")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_15))
		.exec(http("request_206")
			.get("/img/retail/save.png")
			.headers(headers_15))
		.exec(http("request_207")
			.get("/img/retail/lock.png")
			.headers(headers_15))
		.exec(http("request_208")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793933637")
			.headers(headers_79))
		}
//		.pause(14)
		val Cart=group("Cart->Features"){
		 exec(http("request_209")
			.get("/retail/orderassembly/controller/process.php?addServicePrIds=41922")
			.headers(headers_2))
		.exec(http("request_210")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_211")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_212")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_213")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_214")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_215")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_216")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_217")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_218")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_219")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_220")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_221")
			.get("/js/retail/cart.js")
			.headers(headers_221))
		.exec(http("request_222")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png")
			.headers(headers_15))
		.exec(http("request_223")
			.get("/img/retail/corps/plLgs545.png")
			.headers(headers_223))
		.pause(639 milliseconds)
		.exec(http("request_224")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_225")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_226")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_227")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_228")
			.get("/img/retail/cart.png"))
		.exec(http("request_229")
			.get("/img/retail/setting.png"))
		.exec(http("request_230")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_15))
		.exec(http("request_231")
			.get("/img/retail/home.png"))
		.exec(http("request_232")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_233")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_234")
			.get("/img/retail/save.png"))
		.exec(http("request_235")
			.get("/img/retail/lock.png"))
		.exec(http("request_236")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793949099")
			.headers(headers_79))
		}
		//.pause(20)
		val Features=group("Features->ProtectionPlan"){
		exec(http("request_237")
			.post("/retail/orderassembly/cart.htm")
			.headers(headers_80))
		.exec(http("request_238")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_239")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_240")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_241")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_242")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_243")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_244")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_245")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_246")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
      .exec(http("request_247")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_248")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_249")
			.get("/js/popupfunctions.js")
			.headers(headers_249))
		.exec(http("request_250")
			.get("/ajax/addtocartpopt.js")
			.headers(headers_250))
		.exec(http("request_251")
			.get("/js/init.js")
			.headers(headers_251))
		.exec(http("request_252")
			.get("/js/track.php?pageTag=$pageTag")
			.headers(headers_54))
		.exec(http("request_253")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png"))
		.pause(667 milliseconds)
		.exec(http("request_254")
			.get("/js/ajaxfunctions.js")
			.headers(headers_15))
		.exec(http("request_255")
			.get("/ajax/addtocartfunctions.js")
			.headers(headers_255))
		.exec(http("request_256")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png")
			.headers(headers_15))
		.pause(150 milliseconds)
		.exec(http("request_257")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_15))
		.exec(http("request_258")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_15))
		.exec(http("request_259")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_15))
		.exec(http("request_260")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_15))
		.exec(http("request_261")
			.get("/img/retail/cart.png")
			.headers(headers_15))
		.exec(http("request_262")
			.get("/img/retail/setting.png")
			.headers(headers_15))
		.exec(http("request_263")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_15))
		.exec(http("request_264")
			.get("/img/retail/home.png")
			.headers(headers_15))
		.exec(http("request_265")
			.get("/img/retail/inventory-management.png")
			.headers(headers_15))
		.exec(http("request_266")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_15))
		.exec(http("request_267")
			.get("/img/retail/save.png")
			.headers(headers_15))
		.exec(http("request_268")
			.get("/img/retail/lock.png")
			.headers(headers_15))
		.exec(http("request_269")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793970846")
			.headers(headers_79))
		}
		//.pause(18)
		val ProtectionPlan=group("ProtectionPlan->OrderReview"){
		 exec(http("request_270")
			.post("/retail/orderassembly/features.htm")
			.headers(headers_80))
		.exec(http("request_271")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_272")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_273")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_274")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_275")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_276")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_277")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_278")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_279")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_280")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_281")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_282")
			.get("/js/popupfunctions.js")
			.headers(headers_249))
		.exec(http("request_283")
			.get("/ajax/addtocartpopt.js")
			.headers(headers_250))
		.exec(http("request_284")
			.get("/js/init.js")
			.headers(headers_251))
		.exec(http("request_285")
			.get("/js/track.php?pageTag=RTLDO")
			.headers(headers_54))
		.exec(http("request_286")
			.get("/img/retail/corps/corp_logo_634.png")
			.headers(headers_286))
		.exec(http("request_287")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png"))
		.pause(610 milliseconds)
		.exec(http("request_288")
			.get("/js/ajaxfunctions.js"))
		.exec(http("request_289")
			.get("/ajax/addtocartfunctions.js")
			.headers(headers_255))
		.exec(http("request_290")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_291")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_292")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_293")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_294")
			.get("/img/retail/cart.png"))
		.exec(http("request_295")
			.get("/img/retail/setting.png"))
		.exec(http("request_296")
			.get("/img/retail/icons-18-white.png"))
		.exec(http("request_297")
			.get("/img/retail/home.png"))
		.exec(http("request_298")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_299")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_300")
			.get("/img/retail/save.png"))
		.exec(http("request_301")
			.get("/img/retail/lock.png"))
		.exec(http("request_302")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510793990049")
			.headers(headers_79))
		}
		//.pause(13)
		val OrderReview=group("OrderReview->T&C"){
		 exec(http("request_303")
			.get("/ajax/tracking/trackpageview.php?trk=RMPOP&trkFrom=RTLDO&isNoResponse=1")
			.headers(headers_54))
		//.pause(11)
		.exec(http("request_304")
			.post("/retail/orderassembly/controller/process.php?action=featureAdded")
			.headers(headers_80))
		.exec(http("request_305")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_306")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_307")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_308")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_309")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_310")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_311")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_312")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_313")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_314")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_315")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_316")
			.get("/js/printfunctions.js")
			.headers(headers_316))
		.exec(http("request_317")
			.get("/js/retail/orderconfirm.js?antiCacheStr=bb6cbd38d678c79bf3edc67fc56b5325")
			.headers(headers_317))
		.exec(http("request_318")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_thumb.png")
			.headers(headers_318))
		.exec(http("request_319")
			.get("/img/retail/corps/plLgs545.png")
			.headers(headers_15))
		.pause(690 milliseconds)
		.exec(http("request_320")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_321")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_322")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_323")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_324")
			.get("/img/retail/cart.png"))
		.exec(http("request_325")
			.get("/img/retail/setting.png"))
		.exec(http("request_326")
			.get("/img/retail/home.png"))
		.exec(http("request_327")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_328")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_329")
			.get("/img/retail/save.png"))
		.exec(http("request_330")
			.get("/img/retail/lock.png"))
		.exec(http("request_331")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794015944")
			.headers(headers_79))
		}
		//.pause(20)
		val TC=group("T&C->PMSS"){
		 exec(http("request_332")
			.get("/retail/checkout/termsconditions.htm")
			.headers(headers_2))
		.exec(http("request_333")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_334")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_335")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_336")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_337")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_338")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
      .exec(http("request_339")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_340")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_341")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_342")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_343")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_344")
			.get("/retail/public/styles/jquery.signaturepad.css")
			.headers(headers_344))
		.exec(http("request_345")
			.get("/js/printfunctions.js")
			.headers(headers_316))
		.exec(http("request_346")
			.get("/jslibs/signature/signaturepad.php")
			.headers(headers_15))
		.exec(http("request_347")
			.get("/jslibs/signature/json2.php")
			.headers(headers_15))
		.exec(http("request_348")
			.get("/js/retail/tandc.js")
			.headers(headers_348))
		.pause(576 milliseconds)
		.exec(http("request_349")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_350")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_351")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_352")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_353")
			.get("/img/retail/cart.png"))
		.exec(http("request_354")
			.get("/img/retail/setting.png"))
		.exec(http("request_355")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_15))
		.exec(http("request_356")
			.get("/img/retail/home.png"))
		.exec(http("request_357")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_358")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_359")
			.get("/img/retail/save.png"))
		.exec(http("request_360")
			.get("/img/retail/lock.png"))
		.pause(139 milliseconds)
		.exec(http("request_361")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794036960")
			.headers(headers_79))
		.pause(236 milliseconds)
		.exec(http("request_362")
			.get("/retail/public/styles/pen.cur")
			.headers(headers_362))
		}
		//.pause(33)
		val PMSS=group("PMSS->PV"){
		 exec(http("request_363")
			.post("/retail/checkout/termsconditions.htm")
			.headers(headers_80))
		.exec(http("request_364")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_365")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_366")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_367")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_368")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_369")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_370")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_371")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_372")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_373")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_374")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_375")
			.get("/js/printfunctions.js")
			.headers(headers_316))
		.exec(http("request_376")
			.get("/img/brands/target/retail/printed-logo.png")
			.headers(headers_376))
		.exec(http("request_377")
			.get("/barcode.htm?code=15/25508056600799990000001890&width=360&height=90&type=C128B&font=1")
			.headers(headers_377))
		.exec(http("request_378")
			.get("/barcode.htm?code=9881257290052308&height=90&type=C128B&font=1")
			.headers(headers_377))
		.pause(560 milliseconds)
		.exec(http("request_379")
			.get("/js/printfunctions.js")
			.headers(headers_15))
		.exec(http("request_380")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_15))
		.exec(http("request_381")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_15))
		.exec(http("request_382")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_15))
		.exec(http("request_383")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_15))
		.exec(http("request_384")
			.get("/img/retail/setting.png")
			.headers(headers_15))
		.exec(http("request_385")
			.get("/img/retail/home.png")
			.headers(headers_15))
		.exec(http("request_386")
			.get("/img/retail/inventory-management.png")
			.headers(headers_15))
		.exec(http("request_387")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_15))
		.exec(http("request_388")
			.get("/img/retail/save.png")
			.headers(headers_15))
		.exec(http("request_389")
			.get("/img/retail/lock.png")
			.headers(headers_15))
		.exec(http("request_390")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794071198")
			.headers(headers_79))
		}
		//.pause(17)
		val PV=group("PV->V&Act"){
		exec(http("request_391")
			.get("/retail/controller/saleassocflowcontroller.php?activate=1")
			.headers(headers_2))
		.exec(http("request_392")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_393")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_394")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_395")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_396")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_397")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_398")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_399")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_400")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_401")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_402")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_403")
			.get("/js/retail/receiptscan.js")
			.headers(headers_403))
		.exec(http("request_404")
			.get("/img/brands/target/retail/tooltips/receipt.png")
			.headers(headers_404))
		.pause(692 milliseconds)
		.exec(http("request_405")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_406")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_407")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_408")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_409")
			.get("/img/retail/setting.png"))
		.exec(http("request_410")
			.get("/img/retail/home.png"))
		.exec(http("request_411")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_412")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_413")
			.get("/img/retail/save.png"))
		.exec(http("request_414")
			.get("/img/retail/lock.png"))
		.exec(http("request_415")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794089773")
			.headers(headers_79))
		}
		//.pause(8)
		val VACT=group("V&Act->DevFin"){
		exec(http("request_416")
			.post("/ajax/retail/fakereceipt.php")
			.headers(headers_416))
		//.pause(4)
		.exec(http("request_417")
			.post("/retail/receiptscan.htm")
			.headers(headers_80))
		.exec(http("request_418")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_419")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_420")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_421")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_422")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_423")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_424")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_425")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_426")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_427")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_428")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_429")
			.get("/js/retail/activationqc.js")
			.headers(headers_429))
      .exec(http("request_430")
			.get("/img/retail/tooltips/imei-outsidebox.jpg")
			.headers(headers_430))
		.exec(http("request_431")
			.get("/img/retail/tooltips/esn-outsidebox.jpg")
			.headers(headers_431))
		.exec(http("request_432")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png")
			.headers(headers_15))
		.pause(563 milliseconds)
		.exec(http("request_433")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_434")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_435")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_436")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_437")
			.get("/img/retail/setting.png"))
		.exec(http("request_438")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_15))
		.exec(http("request_439")
			.get("/img/retail/home.png"))
		.exec(http("request_440")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_441")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_442")
			.get("/img/retail/save.png"))
		.exec(http("request_443")
			.get("/img/retail/lock.png"))
		.exec(http("request_444")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794103234")
			.headers(headers_79))
		}
		//.pause(33)
		val DevFin=group("DevFin->Activation"){
		exec(http("request_445")
			.post("/retail/checkout/activationscan.htm")
			.headers(headers_80))
		.exec(http("request_446")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_447")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_448")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_449")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_450")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_451")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_452")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_453")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_454")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_455")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_456")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_457")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_15))
		.pause(575 milliseconds)
		.exec(http("request_458")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_459")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_460")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_461")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_462")
			.get("/img/retail/setting.png"))
		.exec(http("request_463")
			.get("/img/retail/home.png"))
		.exec(http("request_464")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_465")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_466")
			.get("/img/retail/save.png"))
		.exec(http("request_467")
			.get("/img/retail/lock.png"))
		.exec(http("request_468")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794137325")
			.headers(headers_79))
		.pause(229 milliseconds)
		.exec(http("request_469")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1510794137560&storeId=0003")
			.headers(headers_79))
		.pause(6)
		.exec(http("request_470")
			.get("/retail/controller/saleassocflowcontroller.php?parking=1")
			.headers(headers_2))
		.exec(http("request_471")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_472")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_473")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_474")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_475")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_476")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_477")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_478")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_479")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_480")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_481")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_482")
			.get("/retail/public/styles/jquery.signaturepad.css")
			.headers(headers_15))
		.exec(http("request_483")
			.get("/js/printfunctions.js")
			.headers(headers_15))
		.exec(http("request_484")
			.get("/jslibs/signature/signaturepad.php")
			.headers(headers_15))
		.exec(http("request_485")
			.get("/jslibs/signature/json2.php")
			.headers(headers_15))
		.exec(http("request_486")
			.get("/js/retail/tandc.js")
			.headers(headers_15))
		.exec(http("request_487")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png"))
		.pause(1)
		.exec(http("request_488")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_489")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_490")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_491")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_492")
			.get("/img/retail/setting.png"))
		.exec(http("request_493")
			.get("/img/retail/icons-18-white.png"))
		.exec(http("request_494")
			.get("/img/retail/home.png"))
		.exec(http("request_495")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_496")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_497")
			.get("/img/retail/save.png"))
		.exec(http("request_498")
			.get("/img/retail/lock.png"))
		.exec(http("request_499")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794145048")
			.headers(headers_79))
		.pause(17)
		.exec(http("request_500")
			.get("/retail/public/styles/pen.cur")
			.headers(headers_15))
		.pause(13)
		.exec(http("request_501")
			.post("/retail/checkout/termsconditions.htm?rtdfc=1")
			.headers(headers_80))
		.exec(http("request_502")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_503")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_504")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_505")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_506")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_507")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_508")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_509")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_510")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_511")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_512")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_513")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_15))
		.pause(644 milliseconds)
		.exec(http("request_514")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_515")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_516")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_517")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_518")
			.get("/img/retail/setting.png"))
		.exec(http("request_519")
			.get("/img/retail/home.png"))
		.exec(http("request_520")
			.get("/img/retail/inventory-management.png"))
      .exec(http("request_521")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_522")
			.get("/img/retail/save.png"))
		.exec(http("request_523")
			.get("/img/retail/lock.png"))
		.exec(http("request_524")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794177193")
			.headers(headers_79))
	//	.pause(9)
		.exec(http("request_525")
			.get("/retail/checkout/controller/activationprocess.php?activating=")
			.headers(headers_2))
		.exec(http("request_526")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_52))
		.exec(http("request_527")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_528")
			.get("/jslibs/modernizr.php")
			.headers(headers_54))
		.exec(http("request_529")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_530")
			.get("/template/public/styles/new.main.css")
			.headers(headers_15))
		.exec(http("request_531")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_15))
		.exec(http("request_532")
			.get("/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_533")
			.get("/js/retail/topnav.php")
			.headers(headers_54))
		.exec(http("request_534")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_535")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_15))
		.exec(http("request_536")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_15))
		.exec(http("request_537")
			.get("/js/printfunctions.js")
			.headers(headers_15))
		.exec(http("request_538")
			.get("/img/brands/target/retail/printed-logo.png")
			.headers(headers_15))
		.exec(http("request_539")
			.get("/retail/public/styles/carriers/sprintstyles.css")
			.headers(headers_539))
		.exec(http("request_540")
			.get("/img/retail/spr-esa-logo.jpg")
			.headers(headers_15))
		.pause(630 milliseconds)
		.exec(http("request_541")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_542")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_543")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_544")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_545")
			.get("/img/retail/setting.png"))
		.exec(http("request_546")
			.get("/img/retail/home.png"))
		.exec(http("request_547")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_548")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_549")
			.get("/img/retail/save.png"))
		.exec(http("request_550")
			.get("/img/retail/lock.png"))
		.exec(http("request_551")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510794187092")
			.headers(headers_79))
		}***/			
}
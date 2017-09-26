package sprint

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SprintUpgradeE2E extends Simulation {

	val httpProtocol = http
		.baseURL("https://poa-dev1dbctarget.consensuscorpdev.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://poa-dev1dbctarget.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_3 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_4 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.8",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"referer" -> "https://integration-ui.consensuscorpdev.com/shopping/",
		"user-agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"x-chrome-uma-enabled" -> "1",
		"x-client-data" -> "CIu2yQEIpbbJAQjBtskBCIuYygEItJnKAQj6nMoBCKmdygEI0p3KAQ==")

	val headers_5 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.8",
		"cache-control" -> "no-cache",
		"origin" -> "https://integration-ui.consensuscorpdev.com",
		"pragma" -> "no-cache",
		"referer" -> "https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic&subset=latin",
		"user-agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"x-chrome-uma-enabled" -> "1",
		"x-client-data" -> "CIu2yQEIpbbJAQjBtskBCIuYygEItJnKAQj6nMoBCKmdygEI0p3KAQ==")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_7 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_9 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "frame",
		"X-COMMON-INTERACTION-ID" -> "e66beae0-aec5-4e5f-873f-dff7f8c5fcf5",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_10 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "start",
		"X-COMMON-INTERACTION-ID" -> "425ed199-83fc-468e-a882-e9c662b45812",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_11 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_20 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "start",
		"X-COMMON-INTERACTION-ID" -> "b03dfb55-c5a0-4beb-8062-5ecbbe29d202",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_21 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "frame",
		"X-COMMON-INTERACTION-ID" -> "016c7b6e-d110-40d0-a475-cbbace2ac8d8",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_24 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "choosepathmodule",
		"X-COMMON-INTERACTION-ID" -> "1ec883f0-3e41-4eaa-bf0f-95f58048171b",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_25 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "3def615f-adb4-4607-b7c0-d30504d9341f",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_26 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "5d30b0cc-e413-4ecb-b310-d71e44498c20",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_27 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "7dc9d33a-8aa9-45f8-b038-011bf9c2a545",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_28 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "choosepathmodule",
		"X-COMMON-INTERACTION-ID" -> "8f0ce9fe-daa0-4d67-812b-ebee928b10f8",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_29 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_35 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "choosepathmodule",
		"X-COMMON-INTERACTION-ID" -> "88220335-18b0-4e1a-ae32-1033add2e6ad",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_45 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "frame",
		"X-COMMON-INTERACTION-ID" -> "6fa0b119-81e0-4a47-b894-1a501f640780",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_46 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "start",
		"X-COMMON-INTERACTION-ID" -> "b5dd7c97-46d6-45b1-808a-a215dac84596",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_49 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "6c124131-5f90-4cbb-965a-c0f66096dc95",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_50 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "d67ac217-ec09-4788-9d70-a41d970d83fa",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_51 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "040ba3ae-f688-47d3-9407-c428ec5d45df",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_52 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "f4c1a420-444b-46fc-a089-f22ae1c84d1e",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_60 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "d9e1df54-ff3c-4d5f-b6d5-aab91fbaf9b0",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_62 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "7e1288ea-2997-4a79-80ee-46cfa07d227a",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_64 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "864429c6-c742-4791-9f4e-b70ea0018959",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_65 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "accountverification",
		"X-COMMON-INTERACTION-ID" -> "e8aec5bf-ff87-4fe1-a4b3-b56ab8368c5a",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_67 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "abfa965b-cad0-4030-ab50-1726eff82fc7",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_68 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "deviceTradeIn",
		"X-COMMON-INTERACTION-ID" -> "f5e29095-b62d-4a2e-85e9-ef1e79b64d41",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_73 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "4924fab9-cb7a-4c12-88b3-d089c01e93e9",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_75 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "a7cc3941-a101-4623-9997-50e77ec049ec",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_76 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "upgraderesults",
		"X-COMMON-INTERACTION-ID" -> "ce1bd7ef-a358-49f0-b5a3-061c2c4e7f1d",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_77 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_78 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "bff9a831-55ef-4597-8a7a-2f6b026f5381",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2",
		"cartId" -> "799334070")

	val headers_80 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "c0e71f31-7105-4dae-ab2d-690a07ec6886",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_82 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "paymentoptions",
		"X-COMMON-INTERACTION-ID" -> "9ed57a1c-522f-4a00-98b8-c35987b0fbcc",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_83 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "scan",
		"X-COMMON-INTERACTION-ID" -> "f8d9d006-ba80-4496-b712-6ca294b9db43",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_85 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "paymentoptions",
		"X-COMMON-INTERACTION-ID" -> "86efc557-20f8-4722-9bd8-88fd1f6256cb",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_87 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "paymentoptions",
		"X-COMMON-INTERACTION-ID" -> "1c1d15d5-6ed6-47c3-a18e-adb48c4d911b",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_89 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_116 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_203 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "start",
		"X-COMMON-INTERACTION-ID" -> "7e11b489-a56e-4b2f-a0ca-4f85243ec9c4",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_204 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "frame",
		"X-COMMON-INTERACTION-ID" -> "60fcd183-1199-4d3e-a0a1-1d2817463982",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_207 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "80b6ee40-9712-4472-b5e2-14ed372cb6c3",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_208 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "be94cfbd-8b0e-46a6-968b-87d6cfe8e283",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_209 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "424872b3-b976-4fc0-988e-5556d895e229",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_210 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-INTERACTION-ID" -> "0411ecb8-8abd-4c33-8772-96e553e346f8",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_211 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "30fd4c41-3872-4aff-bb14-51c114f32e26",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_215 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "GET",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_216 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "83f9ee55-ef96-46cd-838d-c8d342d8dbb1",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2",
		"sessionId" -> "799334070")

	val headers_218 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type,x-common-flow-type,x-common-interaction-id,x-common-retail-store-id,x-common-salesrep-id",
		"Access-Control-Request-Method" -> "PATCH",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36")

	val headers_219 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "c73f0264-f565-4421-a7fa-aacadaaf19ed",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2",
		"cartId" -> "799334070")

	val headers_221 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://integration-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "installmentdetails",
		"X-COMMON-INTERACTION-ID" -> "74384304-ddb1-4d96-85fe-00d00a34ce03",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_369 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://poa-dev1dbctarget.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_453 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Origin" -> "https://poa-dev1dbctarget.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_534 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://poa-dev1dbctarget.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "home",
		"X-COMMON-INTERACTION-ID" -> "5e54a838-5d78-43e8-a0b8-faeb38471964",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_545 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "home",
		"X-COMMON-INTERACTION-ID" -> "aaf81767-6990-4a8a-ab9f-3a388f2117a6",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_546 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "home",
		"X-COMMON-INTERACTION-ID" -> "00a7c1e0-7f11-4d27-ab7d-4f36b17c49d8",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_547 = Map(
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

	val headers_548 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "electronicServiceAgreement",
		"X-COMMON-INTERACTION-ID" -> "806cfbe2-1139-453d-8dcd-556a39c61175",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_552 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "financeContracts",
		"X-COMMON-INTERACTION-ID" -> "7c6ae385-91b2-412a-9936-6f6db26681da",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_553 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "financeContracts",
		"X-COMMON-INTERACTION-ID" -> "1aee7bfb-7fac-4888-9a6c-ca47473d2f1f",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_563 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "orderSummary",
		"X-COMMON-INTERACTION-ID" -> "0aba8dcf-2937-4e16-af6c-615f237f65c1",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_564 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://poa-dev1dbctarget.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "orderSummary",
		"X-COMMON-INTERACTION-ID" -> "8a244685-9192-4a3d-9826-a4a7f4e8bd68",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_566 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "orderSummary",
		"X-COMMON-INTERACTION-ID" -> "3c8a7715-6559-490e-b0e4-59eeda5d527a",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

	val headers_567 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Mobile Safari/537.36",
		"X-COMMON-FLOW-TYPE" -> "orderSummary",
		"X-COMMON-INTERACTION-ID" -> "22373279-b4d3-467d-a5a8-d6c5565888e0",
		"X-COMMON-RETAIL-STORE-ID" -> "0003",
		"X-COMMON-SALESREP-ID" -> "tadmin2")

    val uri1 = "https://integration-dsom.consensuscorpdev.com"
    val uri3 = "https://fonts.gstatic.com/s/lato/v13"
    val uri4 = "https://integration-ui.consensuscorpdev.com/shopping"
    val uri5 = "https://fonts.googleapis.com/css"

	val scn = scenario("SprintUpgradeE2E")
		.exec(http("request_0")
			.post("/retail/")
			.headers(headers_0)
			.formParam("redirectUrl", "https://integration-ui.consensuscorpdev.com/shopping/")
			.formParam("userAction", "shopping")
			.resources(http("request_1")
			.get(uri4 + "/build/css_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_2")
			.get(uri4 + "/build/bundle_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_3")
			.get(uri4 + "/assets/img/cloader.gif")
			.headers(headers_3),
            http("request_4")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_4),
            http("request_5")
			.get(uri3 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
			.headers(headers_5),
            http("request_6")
			.get(uri4 + "/config.json")
			.headers(headers_6),
            http("request_7")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_8")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7),
            http("request_9")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_9)
			.body(RawFileBody("SprintUpgradeE2E_0009_request.txt")),
            http("request_10")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_10)
			.body(RawFileBody("SprintUpgradeE2E_0010_request.txt")),
            http("request_11")
			.get("/retail/orderassembly/controller/process.php")
			.headers(headers_11),
            http("request_12")
			.get(uri4 + "/build/css_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_13")
			.get(uri4 + "/build/bundle_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_14")
			.get(uri4 + "/assets/img/cloader.gif")
			.headers(headers_3),
            http("request_15")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_4),
            http("request_16")
			.get(uri3 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
			.headers(headers_5),
            http("request_17")
			.get(uri4 + "/config.json")
			.headers(headers_6),
            http("request_18")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_19")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7),
            http("request_20")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_20)
			.body(RawFileBody("SprintUpgradeE2E_0020_request.txt")),
            http("request_21")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_21)
			.body(RawFileBody("SprintUpgradeE2E_0021_request.txt")),
            http("request_22")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_23")
			.get(uri4 + "/build/ch_27793ba201682a382830_min.js")
			.headers(headers_1),
            http("request_24")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_24)
			.body(RawFileBody("SprintUpgradeE2E_0024_request.txt")),
            http("request_25")
			.get(uri4 + "/app/pages/frame/header/header.html")
			.headers(headers_25),
            http("request_26")
			.get(uri4 + "/app/pages/frame/footer/footer.html")
			.headers(headers_26),
            http("request_27")
			.get(uri4 + "/app/pages/choosepath/choosepath.html")
			.headers(headers_27),
            http("request_28")
			.get(uri4 + "/app/pages/choosepath/partials/optionscolumn.html")
			.headers(headers_28),
            http("request_29")
			.get(uri4 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
			.headers(headers_29),
            http("request_30")
			.get(uri3 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
			.headers(headers_5),
            http("request_31")
			.get(uri4 + "/assets/img/bullseye.svg")
			.headers(headers_3),
            http("request_32")
			.get("/img/brands/target/retail/sign_up_new_red.svg")
			.headers(headers_3),
            http("request_33")
			.get("/img/brands/target/retail/upgrade_new_red.svg")
			.headers(headers_3)))
		.pause(1)
		.exec(http("request_34")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7)
			.resources(http("request_35")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_35)
			.body(RawFileBody("SprintUpgradeE2E_0035_request.txt")),
            http("request_36")
			.get("/retail/orderassembly/controller/process.php?planType=contractExt&action=buyTypeChosen")
			.headers(headers_11),
            http("request_37")
			.get(uri4 + "/build/css_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_38")
			.get(uri4 + "/build/bundle_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_39")
			.get(uri4 + "/assets/img/cloader.gif")
			.headers(headers_3),
            http("request_40")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_4),
            http("request_41")
			.get(uri3 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
			.headers(headers_5),
            http("request_42")
			.get(uri4 + "/config.json")
			.headers(headers_6),
            http("request_43")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_44")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7),
            http("request_45")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_45)
			.body(RawFileBody("SprintUpgradeE2E_0045_request.txt")),
            http("request_46")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_46)
			.body(RawFileBody("SprintUpgradeE2E_0046_request.txt")),
            http("request_47")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_48")
			.get(uri4 + "/build/ch_523e04986e5df68da3af_min.js")
			.headers(headers_1),
            http("request_49")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_49)
			.body(RawFileBody("SprintUpgradeE2E_0049_request.txt")),
            http("request_50")
			.get(uri4 + "/app/pages/frame/header/header.html")
			.headers(headers_50),
            http("request_51")
			.get(uri4 + "/app/pages/frame/footer/footer.html")
			.headers(headers_51),
            http("request_52")
			.get(uri4 + "/app/pages/accountverification/accountverification.html")
			.headers(headers_52),
            http("request_53")
			.get(uri4 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
			.headers(headers_29),
            http("request_54")
			.get(uri3 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
			.headers(headers_5),
            http("request_55")
			.get(uri4 + "/assets/img/bullseye.svg")
			.headers(headers_3),
            http("request_56")
			.get(uri4 + "/assets/img/verizon.svg")
			.headers(headers_3),
            http("request_57")
			.get(uri4 + "/assets/img/att.svg")
			.headers(headers_3),
            http("request_58")
			.get(uri4 + "/assets/img/sprint.svg")
			.headers(headers_3)))
		.pause(1)
		.exec(http("request_59")
			.options(uri1 + "/dsom-app/v1/isWidgetEnabledEx")
			.headers(headers_7)
			.resources(http("request_60")
			.post(uri1 + "/dsom-app/v1/isWidgetEnabledEx")
			.headers(headers_60)
			.body(RawFileBody("SprintUpgradeE2E_0060_request.txt"))))
		.pause(8)
		.exec(http("request_61")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7)
			.resources(http("request_62")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_62)
			.body(RawFileBody("SprintUpgradeE2E_0062_request.txt"))))
		.pause(9)
		.exec(http("request_63")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7)
			.resources(http("request_64")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_64)
			.body(RawFileBody("SprintUpgradeE2E_0064_request.txt")),
            http("request_65")
			.get(uri4 + "/app/pages/upgraderesults/upgraderesults.html")
			.headers(headers_65),
            http("request_66")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_67")
			.get(uri4 + "/app/pages/upgraderesults/partials/urtile.html")
			.headers(headers_67),
            http("request_68")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_68)
			.body(RawFileBody("SprintUpgradeE2E_0068_request.txt")),
            http("request_69")
			.get(uri4 + "/assets/img/1-imeitooltip.svg")
			.headers(headers_3),
            http("request_70")
			.get(uri4 + "/assets/img/2-imeitooltip.svg")
			.headers(headers_3),
            http("request_71")
			.get(uri4 + "/assets/img/3-imeitooltip.svg")
			.headers(headers_3)))
		.pause(4)
		.exec(http("request_72")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7)
			.resources(http("request_73")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_73)
			.body(RawFileBody("SprintUpgradeE2E_0073_request.txt")),
            http("request_74")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_75")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_75)
			.body(RawFileBody("SprintUpgradeE2E_0075_request.txt")),
            http("request_76")
			.get(uri4 + "/app/pages/scan/scan.html")
			.headers(headers_76)))
		.pause(10)
		.exec(http("request_77")
			.options(uri1 + "/session/dsom/v1/cart/item")
			.headers(headers_77)
			.resources(http("request_78")
			.post(uri1 + "/session/dsom/v1/cart/item")
			.headers(headers_78)
			.body(RawFileBody("SprintUpgradeE2E_0078_request.txt")),
            http("request_79")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7),
            http("request_80")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_80)
			.body(RawFileBody("SprintUpgradeE2E_0080_request.txt")),
            http("request_81")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_82")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_82)
			.body(RawFileBody("SprintUpgradeE2E_0082_request.txt")),
            http("request_83")
			.get(uri4 + "/app/pages/paymentoptions/paymentoptions.html")
			.headers(headers_83),
            http("request_84")
			.options(uri1 + "/dsom-app/v1/getPaymentDetails")
			.headers(headers_7),
            http("request_85")
			.post(uri1 + "/dsom-app/v1/getPaymentDetails")
			.headers(headers_85)
			.body(RawFileBody("SprintUpgradeE2E_0085_request.txt"))))
		.pause(3)
		.exec(http("request_86")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7)
			.resources(http("request_87")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_87)
			.body(RawFileBody("SprintUpgradeE2E_0087_request.txt")),
            http("request_88")
			.get("/retail/orderassembly/controller/process.php")
			.headers(headers_11),
            http("request_89")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_90")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_91")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_92")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_93")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_94")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_95")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_96")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_97")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_98")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_99")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_100")
			.get("/js/retail/creditcheck.js")
			.headers(headers_1),
            http("request_101")
			.get("/js/retail/checkoutinit.js")
			.headers(headers_1),
            http("request_102")
			.get("/js/datechange.js")
			.headers(headers_1),
            http("request_103")
			.get("/js/retail/numport.php?devices=")
			.headers(headers_1),
            http("request_104")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_105")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_106")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_107")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_108")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_109")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_110")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_3),
            http("request_111")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_112")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_113")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_114")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_115")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_116")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381014463")
			.headers(headers_116)))
		.pause(9)
		.exec(http("request_117")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(headers_0)
			.formParam("creditCheckToolArray[1034][newOrExisting]", "existing")
			.formParam("creditCheckToolArray[1034][addLineType]", "addExistingPlan")
			.formParam("currentPageCOPId", "439")
			.formParam("secretSubmit", "")
			.formParam("creditCheckTool", "1")
			.formParam("edit", "")
			.formParam("Lines_To_Be_Activated", "1")
			.formParam("creditCheckToolArray[1034][numOfNewLines]", "1")
			.formParam("creditCheckToolArray[1034][numOfExistingLines]", "3")
			.formParam("Billing_Address_Radio", "unfinished")
			.formParam("Ecom_BillTo_Postal_Name_First", "Teddy")
			.formParam("Ecom_BillTo_Postal_Name_Middle", "")
			.formParam("Ecom_BillTo_Postal_Name_Last", "McTest")
			.formParam("Ecom_BillTo_Postal_Street_Line1", "278 Bella Vista Way")
			.formParam("Ecom_BillTo_Postal_Street_Line2", "")
			.formParam("Ecom_BillTo_Postal_City", "San Francisco")
			.formParam("Ecom_BillTo_Postal_StateProv", "CA")
			.formParam("Ecom_BillTo_Postal_PostalCode", "94127")
			.formParam("Ecom_BillTo_Telecom_Phone_Number", "4158419060")
			.formParam("Ecom_BillTo_Online_Email", "nobody@letstalk.com")
			.formParam("Date_of_Birth[1]", "02")
			.formParam("Date_of_Birth[2]", "20")
			.formParam("Date_of_Birth[3]", "1970")
			.formParam("Social_Security", "231304079")
			.formParam("Identification_Type", "licns")
			.formParam("Identification_State", "CA")
			.formParam("Identification_Number", "123456789")
			.formParam("Identification_Expiration_Month", "12")
			.formParam("Identification_Expiration_Year", "2020")
			.formParam("Drivers_license_Checkbox", "Y")
			.formParam("Agree_To_Credit_Check", "Y")
			.formParam("Agree_To_Credit_Check_Hidden", "Y")
			.formParam("checkoutSubmitType", "continue")
			.resources(http("request_118")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_119")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_120")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_121")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_122")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_123")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_124")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_125")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_126")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_127")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_128")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_129")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_3),
            http("request_130")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_131")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_132")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_133")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_134")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_135")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_136")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_137")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_138")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_139")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_140")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_141")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381030352")
			.headers(headers_116),
            http("request_142")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_11),
            http("request_143")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_144")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_145")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_146")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_147")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_148")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_149")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_150")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_151")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_152")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_153")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_154")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_3),
            http("request_155")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_156")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_157")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_158")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_159")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_160")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_161")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_162")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_163")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_164")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_165")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_166")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381042504")
			.headers(headers_116),
            http("request_167")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_11),
            http("request_168")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_169")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_170")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_171")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_172")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_173")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_174")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_175")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_176")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_177")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_178")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_179")
			.get("/js/retail/creditcheckresult.js")
			.headers(headers_1),
            http("request_180")
			.get("/img/corpLogos/plLg545.gif")
			.headers(headers_3),
            http("request_181")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_182")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_183")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_184")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_185")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_186")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_187")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_3),
            http("request_188")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_189")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_190")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_191")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_192")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_193")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381045032")
			.headers(headers_116)))
		.pause(7)
		.exec(http("request_194")
			.post("/retail/creditcheck/result.htm")
			.headers(headers_0)
			.formParam("submitType", "continue")
			.formParam("acceptCorp", "545")
			.formParam("acceptType", "passed")
			.formParam("secondRun", "")
			.formParam("numofline_to_activate", "1")
			.formParam("checkbox-1", "on")
			.resources(http("request_195")
			.get(uri4 + "/build/css_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_196")
			.get(uri4 + "/build/bundle_977b366a07134c693178_min.js")
			.headers(headers_1),
            http("request_197")
			.get(uri4 + "/assets/img/cloader.gif")
			.headers(headers_3),
            http("request_198")
			.get(uri5 + "?family=Lato:400,700,400italic,700italic&subset=latin")
			.headers(headers_4),
            http("request_199")
			.get(uri3 + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
			.headers(headers_5),
            http("request_200")
			.get(uri4 + "/config.json")
			.headers(headers_6),
            http("request_201")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_202")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7),
            http("request_203")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_203)
			.body(RawFileBody("SprintUpgradeE2E_0203_request.txt")),
            http("request_204")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_204)
			.body(RawFileBody("SprintUpgradeE2E_0204_request.txt")),
            http("request_205")
			.options(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_7),
            http("request_206")
			.get(uri4 + "/build/ch_523e04986e5df68da3af_min.js")
			.headers(headers_1),
            http("request_207")
			.post(uri1 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_207)
			.body(RawFileBody("SprintUpgradeE2E_0207_request.txt")),
            http("request_208")
			.get(uri4 + "/app/pages/frame/header/header.html")
			.headers(headers_208),
            http("request_209")
			.get(uri4 + "/app/pages/frame/footer/footer.html")
			.headers(headers_209),
            http("request_210")
			.get(uri4 + "/app/pages/installmentdetails/installmentdetails.html")
			.headers(headers_210),
            http("request_211")
			.get(uri4 + "/app/components/channel/channel.html")
			.headers(headers_211),
            http("request_212")
			.get(uri4 + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2")
			.headers(headers_29),
            http("request_213")
			.get(uri3 + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2")
			.headers(headers_5),
            http("request_214")
			.get(uri4 + "/assets/img/bullseye.svg")
			.headers(headers_3),
            http("request_215")
			.options(uri1 + "/dsom-app/v1/paymentPlans")
			.headers(headers_215),
            http("request_216")
			.get(uri1 + "/dsom-app/v1/paymentPlans")
			.headers(headers_216)))
		.pause(2)
		.exec(http("request_217")
			.get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png")
			.headers(headers_3))
		.pause(23)
		.exec(http("request_218")
			.options(uri1 + "/session/dsom/v1/cart/item/1")
			.headers(headers_218)
			.resources(http("request_219")
			.patch(uri1 + "/session/dsom/v1/cart/item/1")
			.headers(headers_219)
			.body(RawFileBody("SprintUpgradeE2E_0219_request.txt")),
            http("request_220")
			.options(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_7),
            http("request_221")
			.post(uri1 + "/dsom-app/v1/getNextState")
			.headers(headers_221)
			.body(RawFileBody("SprintUpgradeE2E_0221_request.txt")),
            http("request_222")
			.get("/retail/orderassembly/controller/process.php")
			.headers(headers_11)))
		.pause(1)
		.exec(http("request_223")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89)
			.resources(http("request_224")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_225")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_226")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_227")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_228")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_229")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_230")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_231")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_232")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_233")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_234")
			.get("/js/retail/plans.js")
			.headers(headers_1),
            http("request_235")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_236")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_237")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_238")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_239")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_240")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_241")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_242")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_243")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_244")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_245")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_246")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381089197")
			.headers(headers_116)))
		.pause(6)
		.exec(http("request_247")
			.get("/retail/orderassembly/controller/process.php?addServicePrIds=41922")
			.headers(headers_11))
		.pause(1)
		.exec(http("request_248")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89)
			.resources(http("request_249")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_250")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_251")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_252")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_253")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_254")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_255")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_256")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_257")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_258")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_259")
			.get("/js/retail/cart.js")
			.headers(headers_1),
            http("request_260")
			.get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png")
			.headers(headers_3),
            http("request_261")
			.get("/img/retail/corps/plLgs545.png")
			.headers(headers_3),
            http("request_262")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_263")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_264")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_265")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_266")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_267")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_268")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_3),
            http("request_269")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_270")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_271")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_272")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_273")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_274")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381098962")
			.headers(headers_116)))
		.pause(9)
		.exec(http("request_275")
			.post("/retail/orderassembly/cart.htm")
			.headers(headers_0)
			.formParam("action", "continue")
			.formParam("continueOnConfirm", "")
			.formParam("phonenumber-1", "7407078913")
			.resources(http("request_276")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_277")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_278")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_279")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_280")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_281")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_282")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_283")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_284")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_285")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_286")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_287")
			.get("/js/popupfunctions.js")
			.headers(headers_1),
            http("request_288")
			.get("/ajax/addtocartpopt.js")
			.headers(headers_1),
            http("request_289")
			.get("/js/init.js")
			.headers(headers_1),
            http("request_290")
			.get("/js/track.php?pageTag=$pageTag")
			.headers(headers_1),
            http("request_291")
			.get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png")
			.headers(headers_3),
            http("request_292")
			.get("/js/ajaxfunctions.js")
			.headers(headers_1),
            http("request_293")
			.get("/ajax/addtocartfunctions.js")
			.headers(headers_1),
            http("request_294")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_295")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_296")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_297")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_298")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_299")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_300")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_3),
            http("request_301")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_302")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_303")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_304")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_305")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_306")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381146757")
			.headers(headers_116)))
		.pause(5)
		.exec(http("request_307")
			.post("/retail/orderassembly/features.htm")
			.headers(headers_0)
			.formParam("posted", "1")
			.formParam("shownPoptIds[99536]", "99536")
			.resources(http("request_308")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_309")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_310")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_311")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_312")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_313")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_314")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_315")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_316")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_317")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_318")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_319")
			.get("/js/popupfunctions.js")
			.headers(headers_1),
            http("request_320")
			.get("/ajax/addtocartpopt.js")
			.headers(headers_1),
            http("request_321")
			.get("/js/init.js")
			.headers(headers_1),
            http("request_322")
			.get("/js/track.php?pageTag=RTLDO")
			.headers(headers_1),
            http("request_323")
			.get("/img/retail/corps/corp_logo_634.png")
			.headers(headers_3),
            http("request_324")
			.get("/js/ajaxfunctions.js")
			.headers(headers_1),
            http("request_325")
			.get("/ajax/addtocartfunctions.js")
			.headers(headers_1),
            http("request_326")
			.get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png")
			.headers(headers_3),
            http("request_327")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_328")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_329")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_330")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_331")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_332")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_333")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_334")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_3),
            http("request_335")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_336")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_337")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_338")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_339")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381155253")
			.headers(headers_116)))
		.pause(16)
		.exec(http("request_340")
			.get("/ajax/tracking/trackpageview.php?trk=RMPOP&trkFrom=RTLDO&isNoResponse=1")
			.headers(headers_1))
		.pause(2)
		.exec(http("request_341")
			.post("/retail/orderassembly/controller/process.php?action=featureAdded")
			.headers(headers_0)
			.formParam("isNoResponse", "1")
			.formParam("doNotRequest", "0")
			.formParam("isNoInsuranceSelected", "1")
			.formParam("isInStore", "")
			.formParam("shownPoptIds[99485]", "99485")
			.formParam("addPurchaseOptionsArr[1][42588][259]", "")
			.formParam("guestReview", "on")
			.formParam("continueButton", "continue"))
		.pause(1)
		.exec(http("request_342")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89)
			.resources(http("request_343")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_344")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_345")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_346")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_347")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_348")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_349")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_350")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_351")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_352")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_353")
			.get("/js/printfunctions.js")
			.headers(headers_1),
            http("request_354")
			.get("/js/retail/orderconfirm.js?antiCacheStr=bb6cbd38d678c79bf3edc67fc56b5325")
			.headers(headers_1),
            http("request_355")
			.get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_thumb.png")
			.headers(headers_3),
            http("request_356")
			.get("/img/retail/corps/plLgs545.png")
			.headers(headers_3),
            http("request_357")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_358")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_359")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_360")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_361")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_362")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_363")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_364")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_365")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_366")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_367")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_368")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381177657")
			.headers(headers_116)))
		.pause(9)
		.exec(http("request_369")
			.post("/retail/checkout/controller/panicbuttonprocess.php")
			.headers(headers_369)
			.formParam("storeRepId", "12345678")
			.resources(http("request_370")
			.get("/retail/checkout/termsconditions.htm")
			.headers(headers_11)))
		.pause(1)
		.exec(http("request_371")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89)
			.resources(http("request_372")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_373")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_374")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_375")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_376")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_377")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_378")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_379")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_380")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_381")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_382")
			.get("/retail/public/styles/jquery.signaturepad.css")
			.headers(headers_89),
            http("request_383")
			.get("/js/printfunctions.js")
			.headers(headers_1),
            http("request_384")
			.get("/jslibs/signature/signaturepad.php")
			.headers(headers_1),
            http("request_385")
			.get("/jslibs/signature/json2.php")
			.headers(headers_1),
            http("request_386")
			.get("/js/retail/tandc.js")
			.headers(headers_1),
            http("request_387")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_388")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_389")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_390")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_391")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_392")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_393")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_3),
            http("request_394")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_395")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_396")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_397")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_398")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_399")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381190085")
			.headers(headers_116),
            http("request_400")
			.get("/retail/public/styles/pen.cur")
			.headers(headers_3)))
		.pause(9)
		.exec(http("request_401")
			.post("/retail/checkout/termsconditions.htm")
			.headers(headers_0)
			.formParam("acceptGcTermsConditions", "")
			.formParam("termsConditions[carrier]", "Y")
			.formParam("termsConditions[lt]", "Y")
			.formParam("output", """[{"lx":402,"ly":31,"mx":402,"my":30},{"lx":404,"ly":32,"mx":402,"my":31},{"lx":409,"ly":35,"mx":404,"my":32},{"lx":419,"ly":39,"mx":409,"my":35},{"lx":429,"ly":44,"mx":419,"my":39},{"lx":444,"ly":49,"mx":429,"my":44},{"lx":466,"ly":56,"mx":444,"my":49},{"lx":497,"ly":64,"mx":466,"my":56},{"lx":525,"ly":68,"mx":497,"my":64},{"lx":563,"ly":68,"mx":525,"my":68},{"lx":609,"ly":69,"mx":563,"my":68},{"lx":627,"ly":69,"mx":609,"my":69},{"lx":638,"ly":69,"mx":627,"my":69},{"lx":641,"ly":69,"mx":638,"my":69},{"lx":642,"ly":69,"mx":641,"my":69},{"lx":642,"ly":70,"mx":642,"my":69}]""")
			.formParam("sigStr", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyAAAAB4CAYAAAAKRZZvAAAMj0lEQVR4Xu3d34ucVxkH8Gd/JhJjgrQh2VBtloohDV5UEiFFaVC07VVBYw1e6V0peKFS8C9QRBELuRARLzctAcELY/EiKVK1qQXBVhOx2UhoIpsKTWPV7E85786su0k3bJyZZ9955zOwzP543/Oc8znPzZczMzu0tLS0FB4ECBAgQIAAAQIECBBIEBgSQBKUlSBAgAABAgQIECBAoBIQQDQCAQIECBAgQIAAAQJpAgJIGrVCBAgQIECAAAECBAgIIHqAAAECBAgQIECAAIE0AQEkjVohAgQIECBAgAABAgQEED1AgAABAgQIECBAgECagACSRq0QAQIECBAgQIAAAQICiB4gQIAAAQIECBAgQCBNQABJo1aIAAECBAgQIECAAAEBRA8QIECAAAECBAgQIJAmIICkUStEgAABAgQIECBAgIAAogcIECBAgAABAgQIEEgTEEDSqBUiQIAAAQIECBAgQEAA0QMECBAgQIAAAQIECKQJCCBp1AoRIECAAAECBAgQICCA6AECBAgQIECAAAECBNIEBJA0aoUIECBAgAABAgQIEBBA9AABAgQIECBAgAABAmkCAkgatUIECBAgQIAAAQIECAggeoAAAQIECBAgQIAAgTQBASSNWiECBAgQIECAAAECBAQQPUCAAAECBAgQIECAQJqAAJJGrRABAgQIECBAgAABAgKIHiBAgAABAgQIECBAIE1AAEmjVogAAQIECBAgQIAAAQFEDxAgQIAAAQIECBAgkCYggKRRK0SAAAECBAgQIECAgACiBwgQIECAAAECBAgQSBMQQNKoFSJAgEDzBHZ94URMTuyM3z375eYtzooIECBAoCcCAkhPWA1KgACB5gssLUXsOnaiWuizT386jh/d3/xFWyEBAgQIdCwggHRMaAACBAgMpsDqAFIEto6Pxk++8bn47MfvH0wQqyZAgACBDQkIIBtichEBAgQIvJdACSFTZ/4cz/z4xbg5t1BdcuxTH41vHf9E3HfvdmgECBAgQOA2AQFEUxAgQIBAVwR++LNX49tTL8fC4lKMjgxXIeRrTzzUlbENQoAAAQLNERBAmrOXVkKAAIFNF/jbzDvxnamX49Sv/1LNZcvYSHzz2KF48pH9seeD2zZ9fiZAgAABApsvIIBs/h6YAQECBBon8MLvL8VXv//LmG29LKss8IkjD1RB5DMPfbhx67UgAgQIENi4gACycStXEiBAgMBdCvzq1Utx8uyF+Plv/7py5wMTO6sg4lTkLjFdToAAgYYICCAN2UjLIECAQJ0Frvzjn/Hc2Qvx3Nnz8cbVt1em6lSkzrtmbgQIEOiNgADSG1ejEiBAgMA6Au91KjI2Mhw/eOpodSriQYAAAQLNFhBAmr2/VkeAAIHaCrRPRb536pWV94p8aNf2eOaLhwWR2u6aiREgQKBzAQGkc0MjECBAgECHAifPnI/vPn8uLl+7UY0kiHQI6nYCBAjUWEAAqfHmmBoBAgQGTUAQGbQdt14CBAZRQAAZxF23ZgIECNRcQBCp+QaZHgECBDoQEEA6wHMrAQIECPRW4NYgMj46El959GB86ZH9cfD+e3pb3OgECBAg0BMBAaQnrAYlQIAAgW4KlCDy9R+dibn5xZVhy/tEHjs8KYx0E9pYBAgQSBAQQBKQlSBAgACB7gi8dumtmDpzPk6fu7jyhvUysjDSHV+jECBAIENAAMlQVoMAAQIEui4gjHSd1IAECBBIERBAUpgVIUCAAIFeCggjvdQ1NgECBLorIIB019NoBAgQILDJAuuFkfYb2B8/PBlHDkxs8iyVJ0CAwOAKCCCDu/dWToAAgcYLtMPIT1/445o3sO/YtiUeP7yvehP7Y4f2Nd7BAgkQIFAnAQGkTrthLgQIECDQM4H1TkbaYeThB/fGo4f2RfnZgwABAgR6JyCA9M7WyAQIECBQU4HLMzfiF+cuxtTZ8/H6pbfWzLK8RKucjggjNd080yJAoO8FBJC+30ILIECAAIFOBNphpASS3/zpypqhyqlI9VKtQ5Nx367tnZRxLwECBAi0BAQQrUCAAAECBFoC19+9GafPTVenI6dfmV7jUv7z+vGj+4UR3UKAAIEOBQSQDgHdToAAAQLNFGiHkZdef7MKJO/8a3Zlof7xYTP33KoIEMgREEBynFUhQIAAgT4XqE5FWqcjq8NI+Xjfz3/yI1FernXkwF4v1erzfTZ9AgR6LyCA9N5YBQIECBBomMDyqch03PrxvmWZ5XSkhBGBpGGbbjkECHRNQADpGqWBCBAgQGAQBcrH+7702ptRQkn5Wn06UjzKe0cePtgOJBM+5ncQm8SaCRBYIyCAaAgCBAgQINBFAYGki5iGIkCgkQICSCO31aIIECBAoC4C7ZORckpy68f8ljm2X65VTkmOHJioy7TNgwABAj0TEEB6RmtgAgQIECBwu4BAoisIEBh0AQFk0DvA+gkQIEBg0wTKR/0uB5Ir1fOt/5V9x7YtrROSiTjy4N7q/SQeBAgQ6HcBAaTfd9D8CRAgQKAxAgJJY7bSQggQuIOAAKI9CBAgQIBATQUuz9xY+XStckJy+dqNNTMdGR6Kj03eG/t274zJPTti3+7W154dcc8H3lfTVZkWAQKDLiCADHoHWD8BAgQI9I3A6kDy/IsXYnFpad2573z/llYgEU76ZoNNlMCACAggA7LRlkmAAAECzRO4dv3fMX317Zj++/Xq62J5vrr8fXk513oP4aR5vWBFBPpJQADpp90yVwIECBAgsEEB4WSDUC4jQCBdQABJJ1eQAAECBAhsrsD/G07KrIeGNnfut1Zf/Sq0bVvHYnx0JEZHhmN8bDjGRkdibKQ8D1fP5W/V9+3n6m/LvxsfHV6+r9xf/dy6tn1Na8z2Nctjtsdr3VfdP3yH+1tzGx2OreOj9YI0GwKJAgJIIrZSBAgQIECg7gLrhZM/vDFT96n35fw6DXTtALaRcVZf2/6+BKkrJ5/qSzuT7l8BAaR/987MCRAgQIBAmsAd3u+eNod1Cw1F3Jydj9n5xZhfWIzZuYWYW1iMufn282LMzi/E/Pxi6/fLP8+Vn+dbfyv3lWuq+9vX3X7/yjWte0uNdt2qXmu85fr/G6eMWY09vxDv/mdu881WzeDaqadrNR+Tab6AANL8PbZCAgQIECBAoGYC3Qp0ZZyNnH6U5a++dnExYveTJ6K8om5GAKlZdzR/OgJI8/fYCgkQIECAAAECtwnczcu38BHopoAA0k1NYxEgQIAAAQIECBAgcEcBAUSDECBAgAABAgQIECCQJiCApFErRIAAAQIECBAgQICAAKIHCBAgQIAAAQIECBBIExBA0qgVIkCAAAECBAgQIEBAANEDBAgQIECAAAECBAikCQggadQKESBAgAABAgQIECAggOgBAgQIECBAgAABAgTSBASQNGqFCBAgQIAAAQIECBAQQPQAAQIECBAgQIAAAQJpAgJIGrVCBAgQIECAAAECBAgIIHqAAAECBAgQIECAAIE0AQEkjVohAgQIECBAgAABAgQEED1AgAABAgQIECBAgECagACSRq0QAQIECBAgQIAAAQICiB4gQIAAAQIECBAgQCBNQABJo1aIAAECBAgQIECAAAEBRA8QIECAAAECBAgQIJAmIICkUStEgAABAgQIECBAgIAAogcIECBAgAABAgQIEEgTEEDSqBUiQIAAAQIECBAgQEAA0QMECBAgQIAAAQIECKQJCCBp1AoRIECAAAECBAgQICCA6AECBAgQIECAAAECBNIEBJA0aoUIECBAgAABAgQIEBBA9AABAgQIECBAgAABAmkCAkgatUIECBAgQIAAAQIECAggeoAAAQIECBAgQIAAgTQBASSNWiECBAgQIECAAAECBAQQPUCAAAECBAgQIECAQJqAAJJGrRABAgQIECBAgAABAgKIHiBAgAABAgQIECBAIE1AAEmjVogAAQIECBAgQIAAAQFEDxAgQIAAAQIECBAgkCYggKRRK0SAAAECBAgQIECAgACiBwgQIECAAAECBAgQSBMQQNKoFSJAgAABAgQIECBAQADRAwQIECBAgAABAgQIpAkIIGnUChEgQIAAAQIECBAgIIDoAQIECBAgQIAAAQIE0gQEkDRqhQgQIECAAAECBAgQEED0AAECBAgQIECAAAECaQICSBq1QgQIECBAgAABAgQICCB6gAABAgQIECBAgACBNAEBJI1aIQIECBAgQIAAAQIEBBA9QIAAAQIECBAgQIBAmoAAkkatEAECBAgQIECAAAECAogeIECAAAECBAgQIEAgTeC/GR9l1R1LSmEAAAAASUVORK5CYII=")
			.formParam("vzwStr", "no sig"))
		.pause(1)
		.exec(http("request_402")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89)
			.resources(http("request_403")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_404")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_405")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_406")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_407")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_408")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_409")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_410")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_411")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_412")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_413")
			.get("/js/printfunctions.js")
			.headers(headers_1),
            http("request_414")
			.get("/img/brands/target/retail/printed-logo.png")
			.headers(headers_3),
            http("request_415")
			.get("/barcode.htm?code=15/25508033100799990000001890&width=360&height=90&type=C128B&font=1")
			.headers(headers_3),
            http("request_416")
			.get("/barcode.htm?code=9881257290054569&height=90&type=C128B&font=1")
			.headers(headers_3),
            http("request_417")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_418")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_419")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_420")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_421")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_422")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_423")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_424")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_425")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_426")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_427")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381208132")
			.headers(headers_116)))
		.pause(2)
		.exec(http("request_428")
			.get("/retail/controller/saleassocflowcontroller.php?activate=1")
			.headers(headers_11)
			.resources(http("request_429")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_430")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_431")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_432")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_433")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_434")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_435")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_436")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_437")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_438")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_439")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_440")
			.get("/js/retail/receiptscan.js")
			.headers(headers_1),
            http("request_441")
			.get("/img/brands/target/retail/tooltips/receipt.png")
			.headers(headers_3),
            http("request_442")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_443")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_444")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_445")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_446")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_447")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_448")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_449")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_450")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_451")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_452")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381212658")
			.headers(headers_116)))
		.pause(1)
		.exec(http("request_453")
			.post("/ajax/retail/fakereceipt.php")
			.headers(headers_453))
		.pause(1)
		.exec(http("request_454")
			.post("/retail/receiptscan.htm")
			.headers(headers_0)
			.formParam("receiptId", "757898935042135485")
			.resources(http("request_455")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_456")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_457")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_458")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_459")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_460")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_461")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_462")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_463")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_464")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_465")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_466")
			.get("/js/retail/activationqc.js")
			.headers(headers_1),
            http("request_467")
			.get("/img/retail/tooltips/imei-outsidebox.jpg")
			.headers(headers_3),
            http("request_468")
			.get("/img/retail/tooltips/esn-outsidebox.jpg")
			.headers(headers_3),
            http("request_469")
			.get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png")
			.headers(headers_3),
            http("request_470")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_471")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_472")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_473")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_474")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_475")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_476")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_477")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_478")
			.get("/img/retail/icons-18-white.png")
			.headers(headers_3),
            http("request_479")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_480")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_481")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381220394")
			.headers(headers_116)))
		.pause(12)
		.exec(http("request_482")
			.post("/retail/checkout/activationscan.htm")
			.headers(headers_0)
			.formParam("serial", "")
			.formParam("device[99000578827997]", "Y")
			.formParam("deviceScanInfo[6025526_42588_1_1][sim]", "89011201000218620498")
			.formParam("isRequiredSIMValidation", "1"))
		.pause(1)
		.exec(http("request_483")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89)
			.resources(http("request_484")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_485")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_486")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_487")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_488")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_489")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_490")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_491")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_492")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_493")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_494")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_3),
            http("request_495")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_496")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_497")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_498")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_499")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_500")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_501")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_502")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_503")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_504")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_505")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381235899")
			.headers(headers_116),
            http("request_506")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1506381236172&storeId=0003")
			.headers(headers_116)))
		.pause(1)
		.exec(http("request_507")
			.get("/retail/controller/saleassocflowcontroller.php?parking=1")
			.headers(headers_11)
			.resources(http("request_508")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_89),
            http("request_509")
			.get("/jslibs/jquery.php?ver=1.8.2")
			.headers(headers_1),
            http("request_510")
			.get("/jslibs/modernizr.php")
			.headers(headers_1),
            http("request_511")
			.get("/jslibs/jquerymobile.php")
			.headers(headers_1),
            http("request_512")
			.get("/template/public/styles/new.main.css")
			.headers(headers_89),
            http("request_513")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(headers_89),
            http("request_514")
			.get("/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_515")
			.get("/js/retail/topnav.php")
			.headers(headers_1),
            http("request_516")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_517")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(headers_89),
            http("request_518")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(headers_89),
            http("request_519")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(headers_3),
            http("request_520")
			.get("/img/retail/ajax-loader.gif")
			.headers(headers_3),
            http("request_521")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_522")
			.get("/retail/public/img/alertsprite.png")
			.headers(headers_3),
            http("request_523")
			.get("/retail/public/img/reservesprite.png")
			.headers(headers_3),
            http("request_524")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_525")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_526")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_527")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_528")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_529")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_530")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381241024")
			.headers(headers_116),
            http("request_531")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1506381241463&storeId=0003")
			.headers(headers_116)))
		.pause(1)
		.exec(http("request_532")
			.get("/retail/controller/saleassocflowcontroller.php?parking=1")
			.headers(headers_11))
		.pause(3)
		.exec(http("request_533")
			.get("/retail/ng/POA/config.json")
			.headers(headers_6)
			.resources(http("request_534")
			.post("/webservices/external/poa_rest/index.php/sales/v1/order")
			.headers(headers_534)
			.body(RawFileBody("SprintUpgradeE2E_0534_request.txt")),
            http("request_535")
			.get("/img/retail/home.png")
			.headers(headers_3),
            http("request_536")
			.get("/img/retail/inventory-management.png")
			.headers(headers_3),
            http("request_537")
			.get("/img/retail/customer-lookup.png")
			.headers(headers_3),
            http("request_538")
			.get("/img/retail/save.png")
			.headers(headers_3),
            http("request_539")
			.get("/img/retail/lock.png")
			.headers(headers_3),
            http("request_540")
			.get("/img/brands/target/retail/logo-mini.png")
			.headers(headers_3),
            http("request_541")
			.get("/img/retail/setting.png")
			.headers(headers_3),
            http("request_542")
			.get("/img/retail/cart.png")
			.headers(headers_3),
            http("request_543")
			.get("/img/retail/faqs.png")
			.headers(headers_3),
            http("request_544")
			.get("/img/retail/logout.png")
			.headers(headers_3)))
		.pause(37)
		.exec(http("request_545")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/6025526")
			.headers(headers_545))
		.pause(2)
		.exec(http("request_546")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/6025526/contracts")
			.headers(headers_546))
		.pause(2)
		.exec(http("request_547")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/6025526/status")
			.headers(headers_547))
		.pause(2)
		.exec(http("request_548")
			.get("/legacy/v1/index.php/strings?pageTags=%5B%22WCAGR%22%5D")
			.headers(headers_548))
		.pause(1)
		.exec(http("request_549")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=wca&page=1")
			.headers(headers_3)
			.resources(http("request_550")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=wca&page=2")
			.headers(headers_3),
            http("request_551")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=wca&page=3")
			.headers(headers_3)))
		.pause(11)
		.exec(http("request_552")
			.get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLTC%22%5D")
			.headers(headers_552)
			.resources(http("request_553")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/6025526/productimage")
			.headers(headers_553)))
		.pause(1)
		.exec(http("request_554")
			.get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png")
			.headers(headers_3)
			.resources(http("request_555")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=1&ordiIndex=1")
			.headers(headers_3),
            http("request_556")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=2&ordiIndex=1")
			.headers(headers_3),
            http("request_557")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=3&ordiIndex=1")
			.headers(headers_3),
            http("request_558")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=4&ordiIndex=1")
			.headers(headers_3),
            http("request_559")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=5&ordiIndex=1")
			.headers(headers_3),
            http("request_560")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=6&ordiIndex=1")
			.headers(headers_3)))
		.pause(2)
		.exec(http("request_561")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=7&ordiIndex=1")
			.headers(headers_3)
			.resources(http("request_562")
			.get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=8&ordiIndex=1")
			.headers(headers_3)))
		.pause(12)
		.exec(http("request_563")
			.get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLRC%22%5D")
			.headers(headers_563)
			.resources(http("request_564")
			.post("/webservices/external/poa_rest/index.php/sales/v1/order/6025526/signatures")
			.headers(headers_564)
			.body(RawFileBody("SprintUpgradeE2E_0564_request.txt")),
            http("request_565")
			.get("/img/brands/target/retail/printed-logo.png")
			.headers(headers_3)))
		.pause(64)
		.exec(http("request_566")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/6025526/status")
			.headers(headers_566))
		.pause(1)
		.exec(http("request_567")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/6025526")
			.headers(headers_567))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
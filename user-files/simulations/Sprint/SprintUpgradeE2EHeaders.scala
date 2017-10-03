
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._


object SprintUpgradeE2EHeaders {

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

}
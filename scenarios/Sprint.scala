
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

//class Common extends Simulation {
object Sprint{
	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

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
	val Sprintflowheaders0 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val Sprintflowheaders1 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val Sprintflowheaders2 = Map("Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val Sprintflowheaders3 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val Sprintflowheaders4 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val Sprintflowheaders6 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/",
		"X-Requested-With" -> "XMLHttpRequest")

	val Sprintflowheaders8 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/")

	val Sprintflowheaders9 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm")

	val Sprintflowheaders10 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm")

	val Sprintflowheaders12 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val Sprintflowheaders13 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/pickyourpath.htm")

	val Sprintflowheaders22 = Map(
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val Sprintflowheaders23 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")

	val Sprintflowheaders37 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val Sprintflowheaders38 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val Sprintflowheaders41 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val Sprintflowheaders42 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val Sprintflowheaders43 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val Sprintflowheaders44 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val Sprintflowheaders46 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val Sprintflowheaders53 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val Sprintflowheaders54 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val Sprintflowheaders56 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val Sprintflowheaders57 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val Sprintflowheaders64 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"If-Modified-Since" -> "Fri, 17 Feb 2017 22:03:25 GMT",
		"If-None-Match" -> """"65d03-139c-548c115316540"""",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val Sprintflowheaders65 = Map(
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val Sprintflowheaders66 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"sessionId" -> "${p_sessionid}")

	val Sprintflowheaders67 = Map(
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "PATCH",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val Sprintflowheaders68 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json; charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")

	val Sprintflowheaders72 = Map(
		"Accept" -> "*/*",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val Sprintflowheaders73 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val Sprintflowheaders75 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm",
		"X-Requested-With" -> "XMLHttpRequest")

    val uri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val Sprintflowuri2 = "https://perf-scale-dsom.consensuscorpdev.com:443"
    val Sprintflowuri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val SprintflowSprintflowuri2 = "https://perf-scale-dsom.consensuscorpdev.com:443"
    val Sprintflowuri3 = "https://perf-scale-ui.consensuscorpdev.com:443/shopping/app/components/channel/channel.html"
		// Scan
    
	val SprintScan=group("Sprint_Scan"){
		exec(http("Scan_30")
			.options(Sprintflowuri2 + "/session/dsom/v1/cart/item")
			.headers(headers_30))
		.exec(http("Scan_31")
			.post(Sprintflowuri2 + "/session/dsom/v1/cart/item")
			.headers(headers_31)
			.body(ElFileBody("Sprint_0031_request.txt")))
		//.pause(307 milliseconds)
		.exec(http("Scan_32")
			.options(Sprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(headers_22))
		.exec(http("Scan_33")
			.post(Sprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(headers_23)
			.body(ElFileBody("Sprint_0033_request.txt")))
		.exec(http("Scan_34")
			.options(Sprintflowuri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_22))
		.exec(http("Scan_35")
			.post(Sprintflowuri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_23)
			.body(ElFileBody("Sprint_0035_request.txt")))
		.exec(http("Scan_36")
			.options(Sprintflowuri2 + "/dsom-app/v1/getPaymentDetails")
			.headers(headers_22))
		.exec(http("Scan_37")
			.post(Sprintflowuri2 + "/dsom-app/v1/getPaymentDetails")
			.check(substring("Sprint 24-Month Installments is an affordable"))
			.headers(headers_23)
			.body(ElFileBody("Sprint_0037_request.txt")))
		//.pause(1, 14)
	}
	
	val PO=group("${carrier}_PaymentOptions"){
		exec(http("${carrier}_PaymentOptions")
			.options(SprintflowSprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders0))
		.exec(http("request_31")
			.post(SprintflowSprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0031_request.txt")))
		.exec(http("request_32")
			.options(Sprintflowuri2 + "/dsom-app/v1/getContentForAisle")
			.headers(Sprintflowheaders0))
		.exec(http("request_33")
			.post(Sprintflowuri2 + "/dsom-app/v1/getContentForAisle")
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0033_request.txt")))
		//.pause(1, 15)
	}
		// SprintCW
	val CW=group("${carrier}_Cartwheel"){
		exec(http("Cartwheel")
			.options(SprintflowSprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders0))
		.exec(http("request_35")
			.post(SprintflowSprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0035_request.txt")))
		.exec(http("request_36")
			.get("/retail/orderassembly/controller/process.php")
			.headers(Sprintflowheaders2))
		.exec(http("request_37")
			.get("/jslibs/modernizr.php")
			.headers(Sprintflowheaders37))
		.exec(http("request_38")
			.get("/retail/public/styles/normalize.php")
			.headers(Sprintflowheaders38))
		.exec(http("request_39")
			.get("/js/retail/topnav.php")
			.headers(Sprintflowheaders37))
		.exec(http("request_40")
			.get("/js/retail/numport.php?devices=")
			.headers(Sprintflowheaders37))
		.exec(http("request_41")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489183018697")
			.headers(Sprintflowheaders41))
		//.pause(1, 15)
	}
		// SprintCC
	val CC=group("${carrier}_CreditCheck"){
		exec(http("CredtCheck")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(Sprintflowheaders42)
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
			.formParam("Ecom_BillTo_Postal_Street_Line2", "GANGSTA")
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
		.exec(http("request_43")
			.get("/jslibs/modernizr.php")
			.headers(Sprintflowheaders43))
		.exec(http("request_44")
			.get("/retail/public/styles/normalize.php")
			.headers(Sprintflowheaders44))
		.exec(http("request_45")
			.get("/js/retail/topnav.php")
			.headers(Sprintflowheaders43))
		.exec(http("request_46")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489183051149")
			.headers(Sprintflowheaders46))
		.exec(http("request_47")
			.get("/retail/creditcheck/controller/runprecreditcheck.php"))
		.exec(http("request_48")
			.get("/retail/public/styles/normalize.php")
			.headers(Sprintflowheaders44))
		.exec(http("request_49")
			.get("/jslibs/modernizr.php")
			.headers(Sprintflowheaders43))
		.exec(http("request_50")
			.get("/js/retail/topnav.php")
			.headers(Sprintflowheaders43))
		.exec(http("request_51")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489183059635")
			.headers(Sprintflowheaders46))
		.exec(http("request_52")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful.")))
		.exec(http("request_53")
			.get("/retail/public/styles/normalize.php")
			.headers(Sprintflowheaders53))
		.exec(http("request_54")
			.get("/jslibs/modernizr.php")
			.headers(Sprintflowheaders54))
		.exec(http("request_55")
			.get("/js/retail/topnav.php")
			.headers(Sprintflowheaders54))
		//.pause(129 milliseconds)
		.exec(http("request_56")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489183061546")
			.headers(Sprintflowheaders56))
		//.pause(1, 13)
	}
		// SprintCC2IDP
	val CC2IDP=group("${carrier}_CreditCheck_to_IDP"){
		exec(http("CreditCheck_to_IDP_57")
			.post("/retail/creditcheck/result.htm")
			.headers(Sprintflowheaders57)
			.formParam("submitType", "continue")
			.formParam("acceptCorp", "545")//originally 545
			.formParam("acceptType", "passed")
			.formParam("secondRun", "")
			.formParam("numofline_to_activate", "1")
			.formParam("checkbox-1", "on"))
		.exec(http("CreditCheck_to_IDP_58")
			.options(Sprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders0))
		.exec(http("CreditCheck_to_IDP_59")
			.post(Sprintflowuri2 + "/dsom-app/v1/getContentForAisle")
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0059_request.txt")))
		.exec(http("CreditCheck_to_IDP_60")
			.post(Sprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0060_request.txt")))
		.exec(http("CreditCheck_to_IDP_61")
			.options(Sprintflowuri2 + "/dsom-app/v1/getJSONAisles")
			.headers(Sprintflowheaders0))
		.exec(http("CreditCheck_to_IDP_62")
			.post(Sprintflowuri2 + "/dsom-app/v1/getJSONAisles")
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0062_request.txt")))
		.exec(http("CreditCheck_to_IDP_63")
			.post(Sprintflowuri2 + "/dsom-app/v1/getContentForAisle")
			.check(substring("Sales tax based on full"))
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0063_request.txt")))
		.exec(http("CreditCheck_to_IDP_64")
			.get(Sprintflowuri3 + "")
			.headers(Sprintflowheaders64))
		.exec(http("CreditCheck_to_IDP_65")
			.options(Sprintflowuri2 + "/dsom-app/v1/paymentPlans")
			.headers(Sprintflowheaders65))
		.exec(http("CreditCheck_to_IDP_66")
			.get(Sprintflowuri2 + "/dsom-app/v1/paymentPlans")
			.headers(Sprintflowheaders66))
		//.pause(1, 17)
	}
		// SprintIDP2Plan
	val IDP2Plan=group("${carrier}_IDP_to_Plan"){
		exec(http("request_67")
			.options(Sprintflowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(Sprintflowheaders67))
		.exec(http("request_68")
			.patch(Sprintflowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(Sprintflowheaders68)
			.body(ElFileBody("Sprintflow_0068_request.txt")))
		.exec(http("request_69")
			.options(Sprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders0))
		.exec(http("request_70")
			.post(Sprintflowuri2 + "/dsom-app/v1/getNextState")
			.headers(Sprintflowheaders1)
			.body(ElFileBody("Sprintflow_0070_request.txt")))
		.exec(http("request_71")
			.get("/retail/orderassembly/controller/process.php")
			.headers(Sprintflowheaders2))
		.exec(http("request_72")
			.get("/jslibs/modernizr.php")
			.headers(Sprintflowheaders72))
		.exec(http("request_73")
			.get("/retail/public/styles/normalize.php")
			.headers(Sprintflowheaders73))
		.exec(http("request_74")
			.get("/js/retail/topnav.php")
			.headers(Sprintflowheaders72))
		.exec(http("request_75")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489183098690")
			.headers(Sprintflowheaders75))
	}
}

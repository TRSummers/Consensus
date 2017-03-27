
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

  object VZWPO2Activation{

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

	val headers_100 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache")

	val headers_101 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json;charset=utf-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Pragma" -> "no-cache",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

	val headers_106 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/")

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

	val headers_1027 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_1034 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "content-type,sessionid",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val headers_1035 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"sessionId" -> "${p_sessionid}")

	val headers_1036 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Access-Control-Request-Headers" -> "cartid,content-type",
		"Access-Control-Request-Method" -> "PATCH",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com")

	val headers_1037 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json; charset=UTF-8",
		"Origin" -> "https://perf-scale-ui.consensuscorpdev.com",
		"Referer" -> "https://perf-scale-ui.consensuscorpdev.com/shopping/",
		"cartId" -> "${p_sessionid}")

	val headers_1041 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val headers_1042 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val headers_1044 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_1045 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/plans.htm")

	val headers_1046 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val headers_1047 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val headers_1049 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_1050 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/cart.htm")

	val headers_1051 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val headers_1052 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm")

	val headers_1055 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/orderassembly/features.htm",
		"X-Requested-With" -> "XMLHttpRequest")

    val VZWFlowuri1 = "https://poa-perf-scale.consensuscorpdev.com:443"
    val VZWFlowuri2 = "https://perf-scale-dsom.consensuscorpdev.com:443"


		// CC
    val CC=group("${carrier}_CC"){
		exec(http("CreditCheck_12")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(headers_1012)
			.formParam("creditCheckToolArray[1008][newOrExisting]", "new")
			.formParam("creditCheckToolArray[1008][addLineType]", "addNewPlan")
			.formParam("currentPageCOPId", "563")
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
			.headers(headers_1013))
		.exec(http("CreditCheck_14")
			.get("/jslibs/modernizr.php")
			.headers(headers_1014))
		.exec(http("CreditCheck_15")
			.get("/js/retail/topnav.php")
			.headers(headers_1014))
		.exec(http("CreditCheck_16")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019095749")
			.headers(headers_1016))
		.exec(http("CreditCheck_17")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_1017))
		.exec(http("CreditCheck_18")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1013))
		.exec(http("CreditCheck_19")
			.get("/jslibs/modernizr.php")
			.headers(headers_1014))
		.exec(http("CreditCheck_20")
			.get("/js/retail/topnav.php")
			.headers(headers_1014))
		//.pause(101 milliseconds)
		.exec(http("CreditCheck_21")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019104573")
			.headers(headers_1016))
		.exec(http("CreditCheck_22")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful."))
			.headers(headers_1017))
		.exec(http("CreditCheck_23")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1023))
		.exec(http("CreditCheck_24")
			.get("/jslibs/modernizr.php")
			.headers(headers_1024))
		.exec(http("CreditCheck_25")
			.get("/js/retail/topnav.php")
			.headers(headers_1024))
		.pause(140 milliseconds)
		.exec(http("CreditCheck_26")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019106381")
			.headers(headers_1026))
	}
		//.pause(5, 16)}
		// CC2IDP
    val CC2IDP=group("${carrier}_CreditCheck_IDP"){
		exec(http("CreditCheck_IDP_27")
			.post("/retail/creditcheck/result.htm")
			.headers(headers_1027)
			.formParam("submitType", "continue")
			.formParam("acceptCorp", "660")
			.formParam("acceptType", "passed")
			.formParam("secondRun", "")
			.formParam("numofline_to_activate", "1")
			.formParam("checkbox-1", "on"))
		.exec(http("CreditCheck_IDP_28")
			.post(VZWFlowuri2 + "/dsom-app/v1/getContentForAisle")
			.headers(headers_101)
			.body(ElFileBody("VZWPO2Activation_0028_request.txt")))
		.exec(http("CreditCheck_IDP_29")
			.options(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(headers_100))
		.exec(http("CreditCheck_IDP_30")
			.post(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(headers_101)
			.body(ElFileBody("VZWPO2Activation_0030_request.txt")))
		.exec(http("CreditCheck_IDP_31")
			.options(VZWFlowuri2 + "/dsom-app/v1/getJSONAisles")
			.headers(headers_100))
		.exec(http("CreditCheck_IDP_32")
			.post(VZWFlowuri2 + "/dsom-app/v1/getJSONAisles")
			.headers(headers_101)
			.body(ElFileBody("VZWPO2Activation_0032_request.txt")))
		.exec(http("CreditCheck_IDP_33")
			.post(VZWFlowuri2 + "/dsom-app/v1/getContentForAisle")
			.check(substring("Sales tax based on full"))
			.headers(headers_101)
			.body(ElFileBody("VZWPO2Activation_0033_request.txt")))
		.pause(144 milliseconds)
		.exec(http("CreditCheck_IDP_34")
			.options(VZWFlowuri2 + "/dsom-app/v1/paymentPlans")
			.headers(headers_1034))
		.exec(http("CreditCheck_IDP_35")
			.get(VZWFlowuri2 + "/dsom-app/v1/paymentPlans")
			.headers(headers_1035))
		//.pause(5, 15)
	}
		// IDP2Plan
	val IDP2Plan=group("${carrier}_IDP_Plan"){
		exec(http("IDP_Plan36")
			.options(VZWFlowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(headers_1036))
		.exec(http("IDP_Plan37")
			.patch(VZWFlowuri2 + "/session/dsom/v1/cart/item/1")
			.headers(headers_1037)
			.body(ElFileBody("VZWPO2Activation_0037_request.txt")))
		.exec(http("IDP_Plan38")
			.options(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(headers_100))
		.exec(http("IDP_Plan39")
			.post(VZWFlowuri2 + "/dsom-app/v1/getNextState")
			.headers(headers_101)
			.body(ElFileBody("VZWPO2Activation_0039_request.txt")))
		.exec(http("IDP_Plan40")
			.get("/retail/orderassembly/controller/process.php")
			.check(substring("Pick the perfect plan to stay connected wherever you"))
			.headers(headers_106))
		.exec(http("IDP_Plan41")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1041))
		.exec(http("IDP_Plan42")
			.get("/jslibs/modernizr.php")
			.headers(headers_1042))
		.exec(http("IDP_Plan43")
			.get("/js/retail/topnav.php")
			.headers(headers_1042))
		.exec(http("IDP_Plan44")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019148728")
			.headers(headers_1044))
		////.pause(10, 15)
	}
		// Plan
	val SelectPlan=group("SelectPlan"){
		exec(http("SelectPlan_45")
			.get("/retail/orderassembly/controller/process.php?addServicePrIds=42340")
			.check(substring("Your Cart"))
			.headers(headers_1045))
		.exec(http("SelectPlan_46")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1046))
		.exec(http("SelectPlan_47")
			.get("/jslibs/modernizr.php")
			.headers(headers_1047))
		.exec(http("SelectPlan_48")
			.get("/js/retail/topnav.php")
			.headers(headers_1047))
		.exec(http("SelectPlan_49")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019193820")
			.headers(headers_1049))
		//.pause(5, 15)
	}
		// YourCart
	val YourCart=group("YourCart"){
		exec(http("YourCart_50")
			.post("/retail/orderassembly/cart.htm")
			.check(substring("Select Plan Features and Access Fees"))
			.headers(headers_1050)
			.formParam("action", "continue")
			.formParam("continueOnConfirm", ""))
		.exec(http("YourCart_51")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1051))
		.exec(http("YourCart_52")
			.get("/jslibs/modernizr.php")
			.headers(headers_1052))
		.exec(http("YourCart_53")
			.get("/js/track.php?pageTag=$pageTag")
			.headers(headers_1052))
		.exec(http("YourCart_54")
			.get("/js/retail/topnav.php")
			.headers(headers_1052))
		.exec(http("YourCart_55")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1489019212493")
			.headers(headers_1055))
	}
//	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
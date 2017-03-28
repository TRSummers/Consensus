
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object vzwcconly{

	val httpProtocol = http
		.baseURL("https://poa-perf-scale.consensuscorpdev.com")
		.disableAutoReferer
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditcheck.htm")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val headers_2 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm")

	val headers_4 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/creditprocess.htm",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_5 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_11 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_12 = Map("Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm")

	val headers_14 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Referer" -> "https://poa-perf-scale.consensuscorpdev.com/retail/creditcheck/result.htm",
		"X-Requested-With" -> "XMLHttpRequest")

    val uri1 = "https://poa-perf-scale.consensuscorpdev.com:443"

//	val scn = scenario("vzwcconly")
		// cc
    val CC=group("CC"){
		exec(http("CC_0")
			.post("/retail/creditcheck/creditcheck.htm")
			.headers(headers_0)
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
			.headers(headers_1))
		.exec(http("CC_2")
			.get("/jslibs/modernizr.php")
			.headers(headers_2))
		.exec(http("CC_3")
			.get("/js/retail/topnav.php")
			.headers(headers_2))
		.pause(106 milliseconds)
		.exec(http("CC_4")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490215046074")
			.headers(headers_4))
		.exec(http("CC_5")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.headers(headers_5))
		.exec(http("CC_6")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_1))
		.exec(http("CC_7")
			.get("/jslibs/modernizr.php")
			.headers(headers_2))
		.exec(http("CC_8")
			.get("/js/retail/topnav.php")
			.headers(headers_2))
		.pause(111 milliseconds)
		.exec(http("CC_9")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490215055419")
			.headers(headers_4))
		.exec(http("CC_10")
			.get("/retail/creditcheck/controller/runprecreditcheck.php")
			.check(substring("Carrier credit check successful. Continue with Verizon Wireless"))
			.headers(headers_5))
		.exec(http("CC_11")
			.get("/retail/public/styles/normalize.php")
			.headers(headers_11))
		.exec(http("CC_12")
			.get("/jslibs/modernizr.php")
			.headers(headers_12))
		.exec(http("CC_13")
			.get("/js/retail/topnav.php")
			.headers(headers_12))
		.pause(135 milliseconds)
		.exec(http("CC_14")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1490215057302")
			.headers(headers_14))
}
}
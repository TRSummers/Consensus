import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object ATTUpgradePages{

	val ChoosePathToUpgradeEligibilityCheck = group("ChoosePath->UpgradeCheck") {
		exec(
			http("#0").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#1").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_1).body(ElFileBody("ATT/ATTUpgrade_0001_request.json"))
					.resources(
						http("#2").get("/retail/orderassembly/controller/process.php?planType=contractExt&action=buyTypeChosen").headers(ATTUpgradeHeaders.headers_2),
						http("#3").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(ATTUpgradeHeaders.headers_3),
						http("#4").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(ATTUpgradeHeaders.headers_3),
						http("#5").get(Common.uri_ui + "/assets/img/cloader.gif").headers(ATTUpgradeHeaders.headers_5)))
			.exec(
				http("#6").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(ATTUpgradeHeaders.headers_6))
			.exec(
				http("#8").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#9").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#11").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_11).body(ElFileBody("ATT/ATTUpgrade_0011_request.json")))
			.exec(
				http("#12").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_12).body(ElFileBody("ATT/ATTUpgrade_0012_request.json")))
			.exec(
				http("#13").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#15").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_15).body(ElFileBody("ATT/ATTUpgrade_0015_request.json"))
					.resources(
						http("#7").get(Common.uri_ui + "/config.json").headers(ATTUpgradeHeaders.headers_7),
						http("#10").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(ATTUpgradeHeaders.headers_10),
						http("#14").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(ATTUpgradeHeaders.headers_3),
						http("#16").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(ATTUpgradeHeaders.headers_16),
						http("#17").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(ATTUpgradeHeaders.headers_17),
						http("#18").get(Common.uri_ui + "/app/pages/accountverification/accountverification.html").headers(ATTUpgradeHeaders.headers_18),
						http("#19").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(ATTUpgradeHeaders.headers_19),
						http("#20").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(ATTUpgradeHeaders.headers_10),
						http("#21").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(ATTUpgradeHeaders.headers_5),
						http("#22").get(Common.uri_ui + "/assets/img/verizon.svg").headers(ATTUpgradeHeaders.headers_5),
						http("#23").get(Common.uri_ui + "/assets/img/att.svg").headers(ATTUpgradeHeaders.headers_5),
						http("#24").get(Common.uri_ui + "/assets/img/sprint.svg").headers(ATTUpgradeHeaders.headers_5)))
	}

	val UpgradeEligibilityCheckToL_UpgradeEligibilityCheck = group("UpgradeCheck->L_UpgradeCheck") {
		exec(
			http("#25").options(Common.uri_dsom_no_port + "/dsom-app/v1/isWidgetEnabledEx").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#26").post(Common.uri_dsom_no_port + "/dsom-app/v1/isWidgetEnabledEx").headers(ATTUpgradeHeaders.headers_26).body(ElFileBody("ATT/ATTUpgrade_0026_request.json")))
			.exec(
				http("#27").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#28").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_28).body(ElFileBody("ATT/ATTUpgrade_0028_request.json"))
					.resources(
						http("#29").get("/retail/eligibility/eligibility.htm").headers(ATTUpgradeHeaders.headers_2),
						http("#30").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30),
						http("#31").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#32").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#33").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#34").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#35").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#36").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#37").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#38").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#39").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#40").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#41").get("/js/retail/eligibility.js").headers(ATTUpgradeHeaders.headers_3),
						http("#42").get("/img/retail/notification-img.png").headers(ATTUpgradeHeaders.headers_5),
						http("#43").get("/img/retail/corps/plLgs596.png").headers(ATTUpgradeHeaders.headers_5),
						http("#44").get("/img/retail/corps/plLgs545.png").headers(ATTUpgradeHeaders.headers_5),
						http("#45").get("/img/retail/corps/plLgs660.png").headers(ATTUpgradeHeaders.headers_5),
						http("#46").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#47").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#48").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#49").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#50").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#51").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#52").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#53").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#54").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#55").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#56").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#57").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#58").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487044561").headers(ATTUpgradeHeaders.headers_58),
						http("#59").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1509487044836&storeId=0003").headers(ATTUpgradeHeaders.headers_58)))
	}

	val L_UpgradeEligibilityCheckToEligibilityResults = group("L_UpgradeCheck->EligibilityResults") {
		exec(
			http("#60").post("/retail/eligibility/eligibility.htm").headers(ATTUpgradeHeaders.headers_60)
				.formParam("corpId", "596")
				.formParam("phoneNumber", "2106025090")
				.formParam("pNum", "2106025090")
				.formParam("last4SSN", "9999")
				.formParam("accountzip", "78242")
				.formParam("password", "1234")
				.formParam("eligibility", "runcheck"))
			.exec(
				http("#61").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#62").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#63").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#64").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#65").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#66").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#67").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#68").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#69").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#70").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#71").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#72").get("/js/retail/eligibility.js").headers(ATTUpgradeHeaders.headers_3)))
			.exec(
				http("#73").get("/img/brands/target/retail/ajax-loader-l.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#74").get("/img/retail/dummyphone.gif").headers(ATTUpgradeHeaders.headers_5)))
			.exec(
				http("#75").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#76").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#77").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#78").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#79").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#80").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#81").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#82").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#83").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#84").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#85").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#86").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#87").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487094706").headers(ATTUpgradeHeaders.headers_58),
						http("#88").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1509487094827&storeId=0003").headers(ATTUpgradeHeaders.headers_58)))
	}

	val EligibilityResultsToScanDevice = group("EligibilityResults->ScanDevice") {
		exec(
			http("#89").post("/retail/eligibility/eligibility.htm").headers(ATTUpgradeHeaders.headers_60)
				.formParam("corpId", "596")
				.formParam("financeBuddyUpgradeAvailable", "1")
				.formParam("upgradeOptIn[2106025090]", "2106025090")
				.formParam("isTradeInFinal[2106025090]", "FALSE")
				.formParam("isShareUpgrade[2106025090]", "N")
				.formParam("isPaymentRequired[2106025090]", "")
				.formParam("eligibility", "proceedWithUpgrade")
				.resources(
					http("#90").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(ATTUpgradeHeaders.headers_3),
					http("#91").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(ATTUpgradeHeaders.headers_3),
					http("#92").get(Common.uri_ui + "/assets/img/cloader.gif").headers(ATTUpgradeHeaders.headers_5)))
			.exec(
				http("#93").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(ATTUpgradeHeaders.headers_6))
			.exec(
				http("#94").get(Common.uri_ui + "/config.json").headers(ATTUpgradeHeaders.headers_7))
			.exec(
				http("#95").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#96").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#98").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_98).body(ElFileBody("ATT/ATTUpgrade_0098_request.json")))
			.exec(
				http("#99").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_99).body(ElFileBody("ATT/ATTUpgrade_0099_request.json")))
			.exec(
				http("#100").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#102").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_102).body(ElFileBody("ATT/ATTUpgrade_0102_request.json"))
					.resources(
						http("#97").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(ATTUpgradeHeaders.headers_10),
						http("#101").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(ATTUpgradeHeaders.headers_3),
						http("#103").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(ATTUpgradeHeaders.headers_103),
						http("#104").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(ATTUpgradeHeaders.headers_104),
						http("#105").get(Common.uri_ui + "/app/pages/scan/scan.html").headers(ATTUpgradeHeaders.headers_105),
						http("#106").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(ATTUpgradeHeaders.headers_19),
						http("#107").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(ATTUpgradeHeaders.headers_10),
						http("#108").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(ATTUpgradeHeaders.headers_5)))
	}

	val ScanDeviceToPaymentOptions = group("ScanDevice->PaymentOpt") {
		exec(
			http("#109").options(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(ATTUpgradeHeaders.headers_109))
			.exec(
				http("#110").post(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(ATTUpgradeHeaders.headers_110).body(ElFileBody("ATT/ATTUpgrade_0110_request.json")))
			.exec(
				http("#111").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#112").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_112).body(ElFileBody("ATT/ATTUpgrade_0112_request.json")))
			.exec(
				http("#113").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#114").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(ATTUpgradeHeaders.headers_114).body(ElFileBody("ATT/ATTUpgrade_0114_request.json")))
			.exec(
				http("#115").get(Common.uri_ui + "/app/pages/paymentoptions/paymentoptions.html").headers(ATTUpgradeHeaders.headers_115))
			.exec(
				http("#116").options(Common.uri_dsom_no_port + "/dsom-app/v1/getPaymentDetails").headers(ATTUpgradeHeaders.headers_0))
			.exec(
				http("#117").post(Common.uri_dsom_no_port + "/dsom-app/v1/getPaymentDetails").headers(ATTUpgradeHeaders.headers_117).body(ElFileBody("ATT/ATTUpgrade_0117_request.json")))
			.exec(
				http("#118").get(Common.uri_ui + "/assets/img/att.svg").headers(ATTUpgradeHeaders.headers_5))
	}

	val PaymentOptionsToInstallmentDetails = group("PaymentOpt->IDP") {
		exec(
			http("#119").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_0)
				.resources(
					http("#120").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(ATTUpgradeHeaders.headers_120).body(ElFileBody("ATT/ATTUpgrade_0120_request.json"))))
			.exec(
				http("#121").get("/retail/orderassembly/controller/process.php").headers(ATTUpgradeHeaders.headers_2))
			.exec(
				http("#122").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#123").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#124").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#125").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#126").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#127").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#128").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#129").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#130").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#131").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#132").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#133").get("/js/retail/installmentdetail.js").headers(ATTUpgradeHeaders.headers_3),
						http("#134").get("/img/prod/cell-phones/apple/iphone-7-black_front_med.png").headers(ATTUpgradeHeaders.headers_5),
						http("#135").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#136").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#137").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#138").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#139").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#140").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#141").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#142").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#143").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#144").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#145").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#146").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#147").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487231108").headers(ATTUpgradeHeaders.headers_58)))
	}

	val InstallmentDetailsToPlans = group("IDP->Plans") {
		exec(
			http("#148").post("/retail/orderassembly/installmentdetail.htm").headers(ATTUpgradeHeaders.headers_60)
				.formParam("custDownpayment", "")
				.formParam("radio-choice-program", "22")
				.formParam("continue", "continue")
				.formParam("chosenFPId", "22")
				.formParam("chosenDownpayment", " 0.00")
				.formParam("chosenInstallment", "22.92")
				.formParam("devicePrice", "549.99")
				.formParam("chosenFirstMonthInstallment", "22.92")
				.formParam("chosenLastMonthInstallment", "22.83")
				.formParam("chosenInitialFirstMonthInstallment", "22.92")
				.formParam("chosenInitialLastMonthInstallment", "22.83")
				.formParam("chosenFinancingPartnerRequiredDownpayment", "")
				.formParam("chosenExtraInfos", """{"loanMinAmount":"24.0"}""")
				.formParam("customerDownpaymentWarning", """<span class="screen-reader-only">Error Message </span>The down payment amount is invalid. Please re-enter an amount that is greater than the minimum down payment amount and not equal or greater than the full retail price.""")
				.formParam("customerDownpaymentRetrievalError", """<span class="screen-reader-only">Error Message </span>Please re-enter suggested down payment or select the default amount""")
				.formParam("customerMaxDownpaymentWarning", """<span class="screen-reader-only">Error Message </span>Invalid down payment amount. Please enter a down payment that is less than $downpaymentmax$.""")
				.formParam("minRequiredDownpayment", "0")
				.formParam("minLoanAmount", "30.0")
				.formParam("maxLoanAmount", "")
				.formParam("chosenFinancingLoanFirstInstallmentDueDate", "")
				.formParam("chosenFinancingLoanLastInstallmentDueDate", "")
				.formParam("isExpectedCorpId", "Y")
				.formParam("promotionalDownPaymentAmount", "")
				.formParam("chosenInitialMonthlyInstallmentAmount", "22.92"))
			.exec(
				http("#149").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#150").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#151").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#152").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#153").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#154").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#155").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#156").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#157").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#158").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#159").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#160").get("/js/retail/plans.js").headers(ATTUpgradeHeaders.headers_3)))
			.exec(
				http("#161").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#162").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#163").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#164").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#165").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#166").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#167").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#168").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#169").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#170").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#171").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#172").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487284923").headers(ATTUpgradeHeaders.headers_58)))
	}

	val PlansToCart = group("Plans->Cart") {
		exec(
			http("#173").get("/retail/orderassembly/controller/process.php?addServicePrIds=41704").headers(ATTUpgradeHeaders.headers_2))
			.exec(
				http("#174").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#175").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#176").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#177").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#178").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#179").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#180").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#181").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#182").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#183").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#184").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#185").get("/js/retail/cart.js").headers(ATTUpgradeHeaders.headers_3),
						http("#186").get("/img/prod/cell-phones/apple/iphone-7-black_front_med.png").headers(ATTUpgradeHeaders.headers_5),
						http("#187").get("/img/retail/corps/plLgs596.png").headers(ATTUpgradeHeaders.headers_5),
						http("#188").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#189").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#190").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#191").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#192").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#193").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#194").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#195").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#196").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#197").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#198").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#199").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#200").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487334348").headers(ATTUpgradeHeaders.headers_58)))
	}

	val CartToPlanFeatures = group("Cart->Features") {
		exec(
			http("#201").post("/retail/orderassembly/cart.htm").headers(ATTUpgradeHeaders.headers_60)
				.formParam("action", "continue")
				.formParam("continueOnConfirm", "")
				.formParam("phonenumber-1", "2106025090"))
			.exec(
				http("#202").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#203").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#204").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#205").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#206").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#207").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#208").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#209").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#210").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#211").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#212").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#213").get("/js/popupfunctions.js").headers(ATTUpgradeHeaders.headers_3),
						http("#214").get("/ajax/addtocartpopt.js").headers(ATTUpgradeHeaders.headers_3),
						http("#215").get("/js/init.js").headers(ATTUpgradeHeaders.headers_3),
						http("#216").get("/js/track.php?pageTag=$pageTag").headers(ATTUpgradeHeaders.headers_3),
						http("#217").get("/js/dynamiccat.js").headers(ATTUpgradeHeaders.headers_3),
						http("#218").get("/img/prod/cell-phones/apple/iphone-7-black_front_med.png").headers(ATTUpgradeHeaders.headers_5),
						http("#219").get("/js/ajaxfunctions.js").headers(ATTUpgradeHeaders.headers_3),
						http("#220").get("/ajax/addtocartfunctions.js").headers(ATTUpgradeHeaders.headers_3),
						http("#221").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#222").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#223").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#224").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#225").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#226").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#227").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#228").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#229").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#230").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#231").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#232").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#233").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487378684").headers(ATTUpgradeHeaders.headers_58)))
	}

	val PlanFeaturesToDeviceOptions = group("Features->DeviceOpt") {
		exec(
			http("#234").post("/retail/orderassembly/features.htm").headers(ATTUpgradeHeaders.headers_60)
				.formParam("posted", "1")
				.formParam("shownPoptIds[99085]", "99085")
				.formParam("shownPoptIds[99087]", "99087")
				.formParam("shownPoptIds[99088]", "99088")
				.formParam("shownPoptIds[99089]", "99089")
				.formParam("shownPoptIds[99090]", "99090")
				.formParam("shownPoptIds[99092]", "99092")
				.formParam("shownPoptIds[99093]", "99093")
				.formParam("shownPoptIds[99094]", "99094")
				.formParam("shownPoptIds[99095]", "99095")
				.formParam("shownPoptIds[99096]", "99096")
				.resources(
					http("#235").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30),
					http("#236").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
					http("#237").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
					http("#238").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
					http("#239").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#240").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
					http("#241").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#242").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
					http("#243").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#244").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#245").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#246").get("/js/popupfunctions.js").headers(ATTUpgradeHeaders.headers_3),
					http("#247").get("/ajax/addtocartpopt.js").headers(ATTUpgradeHeaders.headers_3),
					http("#248").get("/js/init.js").headers(ATTUpgradeHeaders.headers_3),
					http("#249").get("/js/track.php?pageTag=RTLDO").headers(ATTUpgradeHeaders.headers_3),
					http("#250").get("/img/retail/corps/corp_logo_634.png").headers(ATTUpgradeHeaders.headers_5),
					http("#251").get("/img/retail/corps/corp_logo_697.png").headers(ATTUpgradeHeaders.headers_5),
					http("#252").get("/img/prod/cell-phones/apple/iphone-7-black_front_med.png").headers(ATTUpgradeHeaders.headers_5),
					http("#253").get("/js/ajaxfunctions.js").headers(ATTUpgradeHeaders.headers_3),
					http("#254").get("/ajax/addtocartfunctions.js").headers(ATTUpgradeHeaders.headers_3),
					http("#255").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
					http("#256").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
					http("#257").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
					http("#258").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
					http("#259").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
					http("#260").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
					http("#261").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
					http("#262").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
					http("#263").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
					http("#264").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
					http("#265").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
					http("#266").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
					http("#267").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487418118").headers(ATTUpgradeHeaders.headers_58)))
	}

	val DeviceOptionsToIdenityCheck = group("DeviceOpt->IDCheck") {
		exec(
			http("#268").get("/ajax/tracking/trackpageview.php?trk=RMPOP&trkFrom=RTLDO&isNoResponse=1").headers(ATTUpgradeHeaders.headers_3))
			.exec(
				http("#269").post("/retail/orderassembly/controller/process.php?action=featureAdded").headers(ATTUpgradeHeaders.headers_60)
					.formParam("isNoResponse", "1")
					.formParam("doNotRequest", "0")
					.formParam("isNoInsuranceSelected", "1")
					.formParam("isInStore", "")
					.formParam("shownPoptIds[99485]", "99485")
					.formParam("shownPoptIds[99550]", "99550")
					.formParam("addPurchaseOptionsArr[1][42409][259]", "")
					.formParam("guestReview", "on")
					.formParam("continueButton", "continue"))
			.exec(
				http("#270").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#271").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#272").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#273").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#274").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#275").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#276").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#277").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#278").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#279").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#280").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#281").get("/js/retail/checkoutinit.js").headers(ATTUpgradeHeaders.headers_3),
						http("#282").get("/js/datechange.js").headers(ATTUpgradeHeaders.headers_3),
						http("#283").get("/js/retail/numport.php?devices=%7B%221%22%3A%7B%22service%22%3A%7B%2241704%22%3A41704%7D%2C%22device%22%3A%7B%2242409%22%3A42409%7D%7D%7D").headers(ATTUpgradeHeaders.headers_3)))
			.exec(
				http("#284").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#285").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#286").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#287").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#288").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#289").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#290").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#291").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#292").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#293").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#294").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#295").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#296").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487454968").headers(ATTUpgradeHeaders.headers_58)))
	}

	val IdenityCheckToOrderConfirm = group("IDCheck->OrderConfirm") {
		exec(
			http("#297").post("/retail/checkout/checkout.htm?copId=437").headers(ATTUpgradeHeaders.headers_60)
				.formParam("currentPageCOPId", "437")
				.formParam("secretSubmit", "")
				.formParam("creditCheckTool", "")
				.formParam("edit", "")
				.formParam("Service_Billing_Address_Radio", "unfinished")
				.formParam("Srv_Bill_First_Name", "Teddy")
				.formParam("Srv_Bill_Middle_Initial", "")
				.formParam("Srv_Bill_Last_Name", "Consumer Two")
				.formParam("Ecom_BillTo_Online_Email", "nobody@letstalk.com")
				.formParam("Identification_Type", "licns")
				.formParam("Identification_State", "CA")
				.formParam("Identification_Number", "123456789")
				.formParam("Identification_Expiration_Month", "12")
				.formParam("Identification_Expiration_Year", "2020")
				.formParam("Drivers_license_Checkbox", "Y")
				.formParam("checkoutSubmitType", "continue"))
			.exec(
				http("#298").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#299").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#300").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#301").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#302").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#303").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#304").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#305").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#306").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#307").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#308").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#309").get("/js/printfunctions.js").headers(ATTUpgradeHeaders.headers_3),
						http("#310").get("/js/retail/orderconfirm.js?antiCacheStr=bb6cbd38d678c79bf3edc67fc56b5325").headers(ATTUpgradeHeaders.headers_3),
						http("#311").get("/img/prod/cell-phones/apple/iphone-7-black_front_thumb.png").headers(ATTUpgradeHeaders.headers_5),
						http("#312").get("/img/retail/corps/plLgs596.png").headers(ATTUpgradeHeaders.headers_5),
						http("#313").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#314").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#315").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#316").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#317").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#318").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#319").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#320").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#321").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#322").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#323").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#324").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487490406").headers(ATTUpgradeHeaders.headers_58)))
	}

	val OrderConfirmToTermsAndConditions = group("OrderConfirm->T&C") {
		exec(
			http("#325").get("/retail/checkout/termsconditions.htm").headers(ATTUpgradeHeaders.headers_2))
			.exec(
				http("#326").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#327").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#328").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#329").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#330").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#331").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#332").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#333").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#334").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#335").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#336").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#337").get("/retail/public/styles/jquery.signaturepad.css").headers(ATTUpgradeHeaders.headers_30),
						http("#338").get("/js/printfunctions.js").headers(ATTUpgradeHeaders.headers_3),
						http("#339").get("/jslibs/signature/signaturepad.php").headers(ATTUpgradeHeaders.headers_3),
						http("#340").get("/jslibs/signature/json2.php").headers(ATTUpgradeHeaders.headers_3),
						http("#341").get("/js/retail/tandc.js").headers(ATTUpgradeHeaders.headers_3)))
			.exec(
				http("#342").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#343").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#344").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#345").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#346").get("/img/retail/cart.png").headers(ATTUpgradeHeaders.headers_5),
						http("#347").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#348").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#349").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#350").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#351").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#352").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#353").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#354").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487548840").headers(ATTUpgradeHeaders.headers_58),
						http("#355").get("/retail/public/styles/pen.cur").headers(ATTUpgradeHeaders.headers_5)))
	}

	val TermsAndConditionsToMSS = group("T&C->MSS") {
		exec(
			http("#356").post("/retail/checkout/termsconditions.htm").headers(ATTUpgradeHeaders.headers_60)
				.formParam("acceptGcTermsConditions", "")
				.formParam("termsConditions[carrier]", "Y")
				.formParam("termsConditions[lt]", "Y")
				.formParam("output", """[{"lx":638,"ly":70,"mx":638,"my":69},{"lx":638,"ly":70,"mx":638,"my":69}]""")
				.formParam("sigStr", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyAAAAB4CAYAAAAKRZZvAAAIRElEQVR4Xu3XwU0DURBEwcWCEBCJIXJAxEMOHIiLCznYCIeArFajLu549tfM5d1dLpfL4Y8AAQIECBAgQIAAAQIBgTsBElA2ggABAgQIECBAgACBq4AAcQgECBAgQIAAAQIECMQEBEiM2iACBAgQIECAAAECBASIGyBAgAABAgQIECBAICYgQGLUBhEgQIAAAQIECBAgIEDcAAECBAgQIECAAAECMQEBEqM2iAABAgQIECBAgAABAeIGCBAgQIAAAQIECBCICQiQGLVBBAgQIECAAAECBAgIEDdAgAABAgQIECBAgEBMQIDEqA0iQIAAAQIECBAgQECAuAECBAgQIECAAAECBGICAiRGbRABAgQIECBAgAABAgLEDRAgQIAAAQIECBAgEBMQIDFqgwgQIECAAAECBAgQECBugAABAgQIECBAgACBmIAAiVEbRIAAAQIECBAgQICAAHEDBAgQIECAAAECBAjEBARIjNogAgQIECBAgAABAgQEiBsgQIAAAQIECBAgQCAmIEBi1AYRIECAAAECBAgQICBA3AABAgQIECBAgAABAjEBARKjNogAAQIECBAgQIAAAQHiBggQIECAAAECBAgQiAkIkBi1QQQIECBAgAABAgQICBA3QIAAAQIECBAgQIBATECAxKgNIkCAAAECBAgQIEBAgLgBAgQIECBAgAABAgRiAgIkRm0QAQIECBAgQIAAAQICxA0QIECAAAECBAgQIBATECAxaoMIECBAgAABAgQIEBAgboAAAQIECBAgQIAAgZiAAIlRG0SAAAECBAgQIECAgABxAwQIECBAgAABAgQIxAQESIzaIAIECBAgQIAAAQIEBIgbIECAAAECBAgQIEAgJiBAYtQGESBAgAABAgQIECAgQNwAAQIECBAgQIAAAQIxAQESozaIAAECBAgQIECAAAEB4gYIECBAgAABAgQIEIgJCJAYtUEECBAgQIAAAQIECAgQN0CAAAECBAgQIECAQExAgMSoDSJAgAABAgQIECBAQIC4AQIECBAgQIAAAQIEYgICJEZtEAECBAgQIECAAAECAsQNECBAgAABAgQIECAQExAgMWqDCBAgQIAAAQIECBAQIG6AAAECBAgQIECAAIGYgACJURtEgAABAgQIECBAgIAAcQMECBAgQIAAAQIECMQEBEiM2iACBAgQIECAAAECBASIGyBAgAABAgQIECBAICYgQGLUBhEgQIAAAQIECBAgIEDcAAECBAgQIECAAAECMQEBEqM2iAABAgQIECBAgAABAeIGCBAgQIAAAQIECBCICQiQGLVBBAgQIECAAAECBAgIEDdAgAABAgQIECBAgEBMQIDEqA0iQIAAAQIECBAgQECAuAECBAgQIECAAAECBGICAiRGbRABAgQIECBAgAABAgLEDRAgQIAAAQIECBAgEBMQIDFqgwgQIECAAAECBAgQECBugAABAgQIECBAgACBmIAAiVEbRIAAAQIECBAgQICAAHEDBAgQIECAAAECBAjEBARIjNogAgQIECBAgAABAgQEiBsgQIAAAQIECAwIPD6/Hw/3p+Pr43XgtZ7YLCBAmrfj2wgQIECAAAECNxA4n4/j6eX9+kvfn283+EU/QeDvAgLk73b+kwABAgQIECDwLwQEyL9Y08xHCpCZVXsoAQIECBAgsCzwGyGn07KAt7cICJCWTfgOAgQIECBAgAABAgMCAmRgyZ5IgAABAgQIECBAoEVAgLRswncQIECAAAECBAgQGBAQIANL9kQCBAgQIECAAAECLQICpGUTvoMAAQIECBAgQIDAgIAAGViyJxIgQIAAAQIECBBoERAgLZvwHQQIECBAgAABAgQGBATIwJI9kQABAgQIECBAgECLgABp2YTvIECAAAECBAgQIDAgIEAGluyJBAgQIECAAAECBFoEBEjLJnwHAQIECBAgQIAAgQEBATKwZE8kQIAAAQIECBAg0CIgQFo24TsIECBAgAABAgQIDAgIkIEleyIBAgQIECBAgACBFgEB0rIJ30GAAAECBAgQIEBgQECADCzZEwkQIECAAAECBAi0CAiQlk34DgIECBAgQIAAAQIDAgJkYMmeSIAAAQIECBAgQKBFQIC0bMJ3ECBAgAABAgQIEBgQECADS/ZEAgQIECBAgAABAi0CAqRlE76DAAECBAgQIECAwICAABlYsicSIECAAAECBAgQaBEQIC2b8B0ECBAgQIAAAQIEBgQEyMCSPZEAAQIECBAgQIBAi4AAadmE7yBAgAABAgQIECAwICBABpbsiQQIECBAgAABAgRaBARIyyZ8BwECBAgQIECAAIEBAQEysGRPJECAAAECBAgQINAiIEBaNuE7CBAgQIAAAQIECAwICJCBJXsiAQIECBAgQIAAgRYBAdKyCd9BgAABAgQIECBAYEBAgAws2RMJECBAgAABAgQItAgIkJZN+A4CBAgQIECAAAECAwICZGDJnkiAAAECBAgQIECgRUCAtGzCdxAgQIAAAQIECBAYEBAgA0v2RAIECBAgQIAAAQItAgKkZRO+gwABAgQIECBAgMCAgAAZWLInEiBAgAABAgQIEGgRECAtm/AdBAgQIECAAAECBAYEBMjAkj2RAAECBAgQIECAQIuAAGnZhO8gQIAAAQIECBAgMCAgQAaW7IkECBAgQIAAAQIEWgQESMsmfAcBAgQIECBAgACBAQEBMrBkTyRAgAABAgQIECDQIiBAWjbhOwgQIECAAAECBAgMCAiQgSV7IgECBAgQIECAAIEWAQHSsgnfQYAAAQIECBAgQGBAQIAMLNkTCRAgQIAAAQIECLQI/ADIDO2ojcAPKwAAAABJRU5ErkJggg==")
				.formParam("vzwStr", "no sig")
				.resources(
					http("#357").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30),
					http("#358").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
					http("#359").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
					http("#360").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
					http("#361").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#362").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
					http("#363").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#364").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
					http("#365").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#366").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#367").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#368").get("/js/printfunctions.js").headers(ATTUpgradeHeaders.headers_3),
					http("#369").get("/img/brands/target/retail/printed-logo.png").headers(ATTUpgradeHeaders.headers_5),
					http("#370").get("/barcode.htm?code=15/25514074000699990000001890&width=360&height=90&type=C128B&font=1").headers(ATTUpgradeHeaders.headers_5),
					http("#371").get("/barcode.htm?code=9881257290041392&height=90&type=C128B&font=1").headers(ATTUpgradeHeaders.headers_5),
					http("#372").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
					http("#373").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
					http("#374").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
					http("#375").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
					http("#376").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
					http("#377").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
					http("#378").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
					http("#379").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
					http("#380").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
					http("#381").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
					http("#382").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487612166").headers(ATTUpgradeHeaders.headers_58)))
	}

	val MSSToScanReceipt = group("MSS->ScanReceipt") {
		exec(
			http("#383").get("/retail/controller/saleassocflowcontroller.php?activate=1").headers(ATTUpgradeHeaders.headers_2)
				.resources(
					http("#384").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30),
					http("#385").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
					http("#386").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
					http("#387").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
					http("#388").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#389").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
					http("#390").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#391").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
					http("#392").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#393").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#394").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#395").get("/js/retail/receiptscan.js").headers(ATTUpgradeHeaders.headers_3),
					http("#396").get("/img/brands/target/retail/tooltips/receipt.png").headers(ATTUpgradeHeaders.headers_5),
					http("#397").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
					http("#398").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
					http("#399").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
					http("#400").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
					http("#401").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
					http("#402").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
					http("#403").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
					http("#404").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
					http("#405").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
					http("#406").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
					http("#407").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487643053").headers(ATTUpgradeHeaders.headers_58)))
	}

	val ScanReceiptToActivationScan = group("ScanReceipt->ActScan") {
		exec(
			http("#408").post("/ajax/retail/fakereceipt.php").headers(ATTUpgradeHeaders.headers_408))
			.exec(
				http("#409").post("/retail/receiptscan.htm").headers(ATTUpgradeHeaders.headers_60)
					.check(regex("#(.+?)</h3>").saveAs("p_orderid"))
					.formParam("receiptId", "373108141312839590"))
			.exec(
				http("#410").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#411").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#412").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#413").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#414").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#415").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#416").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#417").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#418").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#419").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#420").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#421").get("/js/retail/activationqc.js").headers(ATTUpgradeHeaders.headers_3),
						http("#422").get("/img/retail/tooltips/imei-outsidebox.jpg").headers(ATTUpgradeHeaders.headers_5),
						http("#423").get("/img/retail/tooltips/esn-outsidebox.jpg").headers(ATTUpgradeHeaders.headers_5),
						http("#424").get("/img/prod/cell-phones/apple/iphone-7-black_front_med.png").headers(ATTUpgradeHeaders.headers_5),
						http("#425").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#426").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#427").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#428").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#429").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#430").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#431").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#432").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#433").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#434").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#435").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#436").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487687900").headers(ATTUpgradeHeaders.headers_58)))
	}

	val ActivationScanToFinanceContract = group("ActScan->FinanceContract") {
		exec(
			http("#437").post("/retail/checkout/activationscan.htm").headers(ATTUpgradeHeaders.headers_60)
				.formParam("serial", "")
				.formParam("device[359214070000112]", "Y")
				.formParam("deviceScanInfo[${p_orderid}_42409_1_1][sim]", "12345678901234567890")
				.formParam("isRequiredSIMValidation", "1")
				.resources(
					http("#438").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30),
					http("#439").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
					http("#440").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
					http("#441").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
					http("#442").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#443").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
					http("#444").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
					http("#445").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
					http("#446").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#447").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
					http("#448").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30)))
			.exec(
				http("#449").get("/img/brands/target/retail/ajax-loader-l.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#450").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#451").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#452").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#453").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#454").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#455").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#456").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#457").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#458").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#459").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#460").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487743113").headers(ATTUpgradeHeaders.headers_58)))
			.exec(
				http("#461").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1509487744717&storeId=0003").headers(ATTUpgradeHeaders.headers_58))
			.exec(
				http("#462").get("/retail/controller/saleassocflowcontroller.php?parking=1").headers(ATTUpgradeHeaders.headers_2)
					.resources(
						http("#463").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30),
						http("#464").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#465").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#466").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#467").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#468").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#469").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#470").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#471").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#472").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#473").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30)))
			.exec(
				http("#474").get("/img/brands/target/retail/ajax-loader-l.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#475").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#476").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#477").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#478").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#479").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#480").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#481").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#482").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#483").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#484").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#485").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487751988").headers(ATTUpgradeHeaders.headers_58),
						http("#486").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1509487752279&storeId=0003").headers(ATTUpgradeHeaders.headers_58)))
			.exec(
				http("#487").get("/retail/controller/saleassocflowcontroller.php?parking=1").headers(ATTUpgradeHeaders.headers_2))
			.exec(
				http("#488").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
					.resources(
						http("#489").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#490").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#491").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#492").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#493").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#494").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#495").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#496").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#497").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#498").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#499").get("/retail/public/styles/jquery.signaturepad.css").headers(ATTUpgradeHeaders.headers_30),
						http("#500").get("/js/printfunctions.js").headers(ATTUpgradeHeaders.headers_3),
						http("#501").get("/jslibs/signature/signaturepad.php").headers(ATTUpgradeHeaders.headers_3),
						http("#502").get("/jslibs/signature/json2.php").headers(ATTUpgradeHeaders.headers_3),
						http("#503").get("/js/retail/tandc.js").headers(ATTUpgradeHeaders.headers_3)))
			.exec(
				http("#504").get("/img/prod/cell-phones/apple/iphone-7-black_front_med.png").headers(ATTUpgradeHeaders.headers_5))
			.exec(
				http("#505").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5)
					.resources(
						http("#506").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#507").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#508").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#509").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#510").get("/img/retail/icons-18-white.png").headers(ATTUpgradeHeaders.headers_5),
						http("#511").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#512").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#513").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#514").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#515").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#516").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487763109").headers(ATTUpgradeHeaders.headers_58)))
			.exec(
				http("#517").get("/retail/public/styles/pen.cur").headers(ATTUpgradeHeaders.headers_5))
	}

	val DeviceFinancingInstallmentContractToOrderSummary = group("FinanceContract->OrderSummary") {
		exec(
			http("#518").post("/retail/checkout/termsconditions.htm?rtdfc=1").headers(ATTUpgradeHeaders.headers_60)
				.formParam("acceptGcTermsConditions", "")
				.formParam("termsConditions[contractFile]", "Y")
				.formParam("output", """[{"lx":498,"ly":69,"mx":498,"my":68},{"lx":498,"ly":69,"mx":498,"my":68},{"lx":541,"ly":69,"mx":541,"my":68},{"lx":541,"ly":69,"mx":541,"my":68}]""")
				.formParam("sigStr", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyAAAAB4CAYAAAAKRZZvAAAIB0lEQVR4Xu3ZsU3DYBhFUcc7oEjMBYgVEPMgVqBgLhp2sJEjCgrK+Mq/chjAn314BVec1nVdJz8ECBAgQIAAAQIECBAIBE4CJFB2ggABAgQIECBAgACBi4AAMQQCBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgQIECBAgIAAsQECBAgQIECAAAECBDIBAZJRO0SAAAECBAgQIECAgACxAQIECBAgQIAAAQIEMgEBklE7RIAAAQIECBAgQICAALEBAgQIECBAgAABAgQyAQGSUTtEgAABAgSuK3D//H554NfHy3UfvMPTRnrXHT7fIwkQ+CMgQMyBAAECBAgMKLAs03R+eru8+ffn6+G/4O5hnHc9PKYXJDC4gAAZ/Bfo9QkQIEDgNgWWdZrOj+P8US9AbnOnvprAfwICxC4IECBAgMCgAluEbD/z6fgfsP3HZp6P/57ekACB/QUEyP7GLhAgQIAAAQIECBAg8CsgQEyBAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECAgQGyAAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECAgQGyAAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECAgQGyAAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECAgQGyAAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECAgQGyAAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECAgQGyAAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECAgQGyAAAECBAgQIECAAIFMQIBk1A4RIECAAAECBAgQICBAbIAAAQIECBAgQIAAgUxAgGTUDhEgQIAAAQIECBAgIEBsgAABAgQIECBAgACBTECAZNQOESBAgAABAgQIECDwA/H9+KggtCmTAAAAAElFTkSuQmCC")
				.formParam("vzwStr", "no sig")
					.resources(
						http("#519").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30),
						http("#520").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
						http("#521").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
						http("#522").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
						http("#523").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#524").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
						http("#525").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#526").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
						http("#527").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#528").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
						http("#529").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
						http("#530").get("/img/brands/target/retail/ajax-loader-l.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#531").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
						http("#532").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
						http("#533").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#534").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
						http("#535").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
						http("#536").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
						http("#537").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
						http("#538").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
						http("#539").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
						http("#540").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
						http("#541").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487807552").headers(ATTUpgradeHeaders.headers_58)))
				.exec(
					http("#542").get("/retail/checkout/controller/activationprocess.php?activating=").headers(ATTUpgradeHeaders.headers_2))
				.exec(
					http("#543").get("/retail/public/styles/normalize.php").headers(ATTUpgradeHeaders.headers_30)
						.resources(
							http("#544").get("/jslibs/jquery.php?ver=1.8.2").headers(ATTUpgradeHeaders.headers_3),
							http("#545").get("/jslibs/modernizr.php").headers(ATTUpgradeHeaders.headers_3),
							http("#546").get("/jslibs/jquerymobile.php").headers(ATTUpgradeHeaders.headers_3),
							http("#547").get("/template/public/styles/new.main.css").headers(ATTUpgradeHeaders.headers_30),
							http("#548").get("/template/css/semantic.jqmsafe.min.css").headers(ATTUpgradeHeaders.headers_30),
							http("#549").get("/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
							http("#550").get("/js/retail/topnav.php").headers(ATTUpgradeHeaders.headers_3),
							http("#551").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
							http("#552").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(ATTUpgradeHeaders.headers_30),
							http("#553").get("/brands/target/retail/public/styles/main.css").headers(ATTUpgradeHeaders.headers_30),
							http("#554").get("/js/printfunctions.js").headers(ATTUpgradeHeaders.headers_3),
							http("#555").get("/retail/public/styles/carriers/attstyles.css").headers(ATTUpgradeHeaders.headers_30),
							http("#556").get("/img/brands/target/retail/printed-logo.png").headers(ATTUpgradeHeaders.headers_5),
							http("#557").get("/img/retail/corps/plLgs596.png").headers(ATTUpgradeHeaders.headers_5),
							http("#558").get("/img/retail/ajax-loader.gif").headers(ATTUpgradeHeaders.headers_5),
							http("#559").get("/img/brands/target/retail/logo-mini.png").headers(ATTUpgradeHeaders.headers_5),
							http("#560").get("/retail/public/img/alertsprite.png").headers(ATTUpgradeHeaders.headers_5),
							http("#561").get("/retail/public/img/reservesprite.png").headers(ATTUpgradeHeaders.headers_5),
							http("#562").get("/img/retail/setting.png").headers(ATTUpgradeHeaders.headers_5),
							http("#563").get("/img/retail/home.png").headers(ATTUpgradeHeaders.headers_5),
							http("#564").get("/img/retail/customer-lookup.png").headers(ATTUpgradeHeaders.headers_5),
							http("#565").get("/img/retail/inventory-management.png").headers(ATTUpgradeHeaders.headers_5),
							http("#566").get("/img/retail/save.png").headers(ATTUpgradeHeaders.headers_5),
							http("#567").get("/img/retail/lock.png").headers(ATTUpgradeHeaders.headers_5),
							http("#568").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1509487819838").headers(ATTUpgradeHeaders.headers_58)))

	}

	val TabulateResults = group("Results"){
		exec(http("Shipped Orders")
			.get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status")
			.check(substring("COMPLETED"))
			.headers(CommonHeaders.status_call))
	}
}

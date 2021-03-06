package Sprint.Target.Upgrade

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import CarrierCommon.Target.Common
import CarrierCommon.Target.CommonHeaders

object SprintTargetUpgradeGroups {

  val ChoosePathToUpgradeEligibilityCheck = group("ChoosePath->UpgradeCheck") {
    exec(http("${p_sessionid}").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#35").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_35).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0035_request.json")))
      .exec(http("#36").get("/retail/orderassembly/controller/process.php?planType=contractExt&action=buyTypeChosen").headers(SprintTargetUpgradeHeaders.headers_11))
      .exec(http("#42").get(Common.uri_ui + "/config.json").headers(SprintTargetUpgradeHeaders.headers_6))
      .exec(http("#43").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#44").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#45").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_45).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0045_request.json")))
      .exec(http("#46").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_46).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0046_request.json")))
      .exec(http("#47").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#49").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_49).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0049_request.json")))
      .exec(http("#52").get(Common.uri_ui + "/app/pages/accountverification/accountverification.html").headers(SprintTargetUpgradeHeaders.headers_52)
        .resources(
          //          http("#37")
          //          .get(Common.uri_ui + "/build/css_977b366a07134c693178_min.js")
          //          .headers(SprintTargetUpgradeHeaders.headers_1),
          //          http("#38")
          //          .get(Common.uri_ui + "/build/bundle_977b366a07134c693178_min.js")
          //          .headers(SprintTargetUpgradeHeaders.headers_1),
          http("#39").get(Common.uri_ui + "/assets/img/cloader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#40").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(SprintTargetUpgradeHeaders.headers_4),
          http("#41").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(SprintTargetUpgradeHeaders.headers_5),
          //          http("#48")
          //          .get(Common.uri_ui + "/build/ch_523e04986e5df68da3af_min.js")
          //          .headers(SprintTargetUpgradeHeaders.headers_1),
          http("#50").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(SprintTargetUpgradeHeaders.headers_50),
          http("#51").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(SprintTargetUpgradeHeaders.headers_51),
          http("#53").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(SprintTargetUpgradeHeaders.headers_29),
          http("#54").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(SprintTargetUpgradeHeaders.headers_5),
          http("#55").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#56").get(Common.uri_ui + "/assets/img/verizon.svg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#57").get(Common.uri_ui + "/assets/img/att.svg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#58").get(Common.uri_ui + "/assets/img/sprint.svg").headers(SprintTargetUpgradeHeaders.headers_3)))
  }

  val UpgradeEligibilityCheckToScanDevice = group("UpgradeCheck->ScanDevice") {
    exec(http("#59").options(Common.uri_dsom_no_port + "/dsom-app/v1/isWidgetEnabledEx").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#60").post(Common.uri_dsom_no_port + "/dsom-app/v1/isWidgetEnabledEx").headers(SprintTargetUpgradeHeaders.headers_60).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0060_request.json")))
      .exec(http("#61").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#62").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_62).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0062_request.json")))
      .exec(http("#63").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#64").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_64).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0064_request.json")))
      .exec(http("#65").get(Common.uri_ui + "/app/pages/upgraderesults/upgraderesults.html").headers(SprintTargetUpgradeHeaders.headers_65))
      .exec(http("#66").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#68").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_68).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0068_request.json")))
      .exec(http("#72").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#73").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_73).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0073_request.json")))
      .exec(http("#74").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#75").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_75).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0075_request.json"))
        .resources(http("#67").get(Common.uri_ui + "/app/pages/upgraderesults/partials/urtile.html").headers(SprintTargetUpgradeHeaders.headers_67),
          http("#69").get(Common.uri_ui + "/assets/img/1-imeitooltip.svg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#70").get(Common.uri_ui + "/assets/img/2-imeitooltip.svg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#71").get(Common.uri_ui + "/assets/img/3-imeitooltip.svg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#76").get(Common.uri_ui + "/app/pages/scan/scan.html").headers(SprintTargetUpgradeHeaders.headers_76)))
  }

  val ScanDeviceToPaymentOptions = group("ScanDevice->PaymentOpt") {
    exec(http("#77").options(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(SprintTargetUpgradeHeaders.headers_77))
      .exec(http("#78").post(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(SprintTargetUpgradeHeaders.headers_78).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0078_request.json")))
      .exec(http("#79").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#80").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_80).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0080_request.json")))
      .exec(http("#81").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#82").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_82).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0082_request.json")))
      .exec(http("#83").get(Common.uri_ui + "/app/pages/paymentoptions/paymentoptions.html").headers(SprintTargetUpgradeHeaders.headers_83))
      .exec(http("#84").options(Common.uri_dsom_no_port + "/dsom-app/v1/getPaymentDetails").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#85").post(Common.uri_dsom_no_port + "/dsom-app/v1/getPaymentDetails").headers(SprintTargetUpgradeHeaders.headers_85).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0085_request.json")))
  }

  val PaymentOptionsToCreditCheck = group("PaymentOpt->CC") {
    exec(http("#86").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#87").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_87).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0087_request.json")))
      .exec(http("#88").get("/retail/orderassembly/controller/process.php").headers(SprintTargetUpgradeHeaders.headers_11)
        .resources(http("#89").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#90").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#91").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#92").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#93").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#94").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#95").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#96").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#97").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#98").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#99").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#100").get("/js/retail/creditcheck.js").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#101").get("/js/retail/checkoutinit.js").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#102").get("/js/datechange.js").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#103").get("/js/retail/numport.php?devices=").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#104").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#105").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#106").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#107").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#108").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#109").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#110").get("/img/retail/icons-18-white.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#111").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#112").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#113").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#114").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#115").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#116").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381014463").headers(SprintTargetUpgradeHeaders.headers_116)))
  }

  val CreditCheckToCreditCheckResult = group("CC->CCResult") {
    exec(http("#117").post("/retail/creditcheck/creditcheck.htm").headers(SprintTargetUpgradeHeaders.headers_0)
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
      .formParam("Ecom_BillTo_Online_Email", "${p_sessionid}@letstalk.com")
      .formParam("Date_of_Birth[1]", "02")
      .formParam("Date_of_Birth[2]", "20")
      .formParam("Date_of_Birth[3]", "1970")
      .formParam("Social_Security", "${nationalId}")
      .formParam("Identification_Type", "licns")
      .formParam("Identification_State", "CA")
      .formParam("Identification_Number", "123456789")
      .formParam("Identification_Expiration_Month", "12")
      .formParam("Identification_Expiration_Year", "2020")
      .formParam("Drivers_license_Checkbox", "Y")
      .formParam("Agree_To_Credit_Check", "Y")
      .formParam("Agree_To_Credit_Check_Hidden", "Y")
      .formParam("checkoutSubmitType", "continue"))
      //      .exec(http("#142")
      //        .get("/retail/creditcheck/controller/runprecreditcheck.php")
      //        .headers(SprintTargetUpgradeHeaders.headers_11))
      .exec(http("#167").get("/retail/creditcheck/controller/runprecreditcheck.php").headers(SprintTargetUpgradeHeaders.headers_11)
      .resources(http("#118").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#119").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#120").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#121").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#122").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#123").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#124").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#125").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#126").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#127").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#128").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#129").get("/img/brands/target/retail/ajax-loader-l.gif").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#130").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#131").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#132").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#133").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#134").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#135").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#136").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#137").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#138").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#139").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#140").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#141").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381030352").headers(SprintTargetUpgradeHeaders.headers_116),
        http("#143").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#144").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#145").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#146").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#147").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#148").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#149").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#150").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#151").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#152").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#153").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#154").get("/img/brands/target/retail/ajax-loader-l.gif").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#155").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#156").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#157").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#158").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#159").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#160").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#161").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#162").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#163").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#164").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#165").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#166").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381042504").headers(SprintTargetUpgradeHeaders.headers_116),
        http("#168").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#169").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#170").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#171").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#172").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#173").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#174").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#175").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#176").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#177").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#178").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#179").get("/js/retail/creditcheckresult.js").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#180").get("/img/corpLogos/plLg545.gif").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#181").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#182").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#183").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#184").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#185").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#186").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#187").get("/img/retail/icons-18-white.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#188").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#189").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#190").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#191").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#192").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#193").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381045032").headers(SprintTargetUpgradeHeaders.headers_116)))
  }

  val CreditCheckResultToInstallmentDetails = group("CCResult->IDP") {
    exec(http("#194").post("/retail/creditcheck/result.htm").headers(SprintTargetUpgradeHeaders.headers_0)
      .formParam("submitType", "continue")
      .formParam("acceptCorp", "545")
      .formParam("acceptType", "passed")
      .formParam("secondRun", "")
      .formParam("numofline_to_activate", "1")
      .formParam("checkbox-1", "on"))
      .exec(http("#200").get(Common.uri_ui + "/config.json").headers(SprintTargetUpgradeHeaders.headers_6))
      .exec(http("#201").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#202").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#203").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_203).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0203_request.json")))
      .exec(http("#204").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_204).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0204_request.json")))
      .exec(http("#205").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_7))
      .exec(http("#207").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_207).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0207_request.json")))
      .exec(http("#210").get(Common.uri_ui + "/app/pages/installmentdetails/installmentdetails.html").headers(SprintTargetUpgradeHeaders.headers_210))
      .exec(http("#215").options(Common.uri_dsom_no_port + "/dsom-app/v1/paymentPlans").headers(SprintTargetUpgradeHeaders.headers_215))
      .exec(http("#216").get(Common.uri_dsom_no_port + "/dsom-app/v1/paymentPlans").headers(SprintTargetUpgradeHeaders.headers_216)
        .resources(
          //          http("#195")
          //          .get(Common.uri_ui + "/build/css_977b366a07134c693178_min.js")
          //          .headers(SprintTargetUpgradeHeaders.headers_1),
          //          http("#196")
          //          .get(Common.uri_ui + "/build/bundle_977b366a07134c693178_min.js")
          //          .headers(SprintTargetUpgradeHeaders.headers_1),
          http("#197").get(Common.uri_ui + "/assets/img/cloader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#198").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(SprintTargetUpgradeHeaders.headers_4),
          http("#199").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(SprintTargetUpgradeHeaders.headers_5),
          //          http("#206")
          //          .get(Common.uri_ui + "/build/ch_523e04986e5df68da3af_min.js")
          //          .headers(SprintTargetUpgradeHeaders.headers_1),
          http("#208").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(SprintTargetUpgradeHeaders.headers_208),
          http("#209").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(SprintTargetUpgradeHeaders.headers_209),
          http("#211").get(Common.uri_ui + "/app/components/channel/channel.html").headers(SprintTargetUpgradeHeaders.headers_211),
          http("#212").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(SprintTargetUpgradeHeaders.headers_29),
          http("#213").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(SprintTargetUpgradeHeaders.headers_5),
          http("#214").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(SprintTargetUpgradeHeaders.headers_3)))
      .exec(http("#217").get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png").headers(SprintTargetUpgradeHeaders.headers_3))
  }

  val InstallmentDetailsToPlans = group("IDP->Plans") {
    exec(
      http("#184").options(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item/1").headers(SprintTargetUpgradeHeaders.headers_A184))
      .exec(http("#185").patch(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item/1").headers(SprintTargetUpgradeHeaders.headers_A185).body(ElFileBody("Sprint/Upgrade/sprintupg_0185_request.json")))
      .exec(http("#186").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(http("#187").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A187).body(ElFileBody("Sprint/Upgrade/sprintupg_0187_request.json")))
      .exec(
        http("#188").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A0)
          .resources(
            http("#189").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A189).body(ElFileBody("Sprint/Upgrade/sprintupg_0189_request.json"))))
      .exec(
        http("#190").get(Common.uri_ui + "/app/pages/selectproduct/selectservice.html").headers(SprintTargetUpgradeHeaders.headers_A190)
          .resources(
            http("#191").get(Common.uri_ui + "/app/components/contempiler/config.json").headers(SprintTargetUpgradeHeaders.headers_A191),
            http("#192").get(Common.uri_ui + "/app/components/contempiler/contempiler.html").headers(SprintTargetUpgradeHeaders.headers_A192),
            http("#193").get(Common.uri_ui + "/assets/img/sprint_cropped.svg").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#194").get(Common.uri_ui + "/app/components/contempiler/contemloader.html").headers(SprintTargetUpgradeHeaders.headers_A194),
            http("#195").get(Common.uri_ui + "/app/components/contempiler/sets/carrierinfo/stylesheet.css").headers(SprintTargetUpgradeHeaders.headers_A55).check(status.is(404)),
            http("#196").get(Common.uri_ui + "/app/components/contempiler/sets/carrierinfo/sprint_hide.html").headers(SprintTargetUpgradeHeaders.headers_A196)))
  }

  val PlansToCart = group("Plans->Cart") {
    exec(
      http("#197").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A0)
        .resources(
          http("#198").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A198).body(ElFileBody("Sprint/Upgrade/sprintupg_0198_request.json"))))
      .exec(
        http("#199").get("/retail/orderassembly/controller/process.php").headers(SprintTargetUpgradeHeaders.headers_A2))
      .exec(
        http("#200").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_A55)
          .resources(
            http("#201").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#202").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#203").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#204").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#205").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#206").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#207").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#208").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#209").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#210").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#211").get("/js/retail/cart.js").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#212").get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#213").get("/img/retail/corps/plLgs545.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#214").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#215").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#216").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#217").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#218").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#219").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#220").get("/img/retail/icons-18-white.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#221").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#222").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#223").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#224").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#225").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#226").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508892091195").headers(SprintTargetUpgradeHeaders.headers_A82)))
  }

  val CartToPlanFeatures = group("Cart->Features") {
    exec(
      http("#227").post("/retail/orderassembly/cart.htm").headers(SprintTargetUpgradeHeaders.headers_A83)
        .formParam("action", "continue")
        .formParam("continueOnConfirm", "")
        .formParam("phonenumber-1", "7407078913")
        .resources(
          //          http("#228").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(SprintTargetUpgradeHeaders.headers_A3),
          //          http("#229").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(SprintTargetUpgradeHeaders.headers_A3),
          http("#230").get(Common.uri_ui + "/assets/img/cloader.gif").headers(SprintTargetUpgradeHeaders.headers_A5)))
      .exec(
        http("#231").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(SprintTargetUpgradeHeaders.headers_A6))
      .exec(
        http("#232").get(Common.uri_ui + "/config.json").headers(SprintTargetUpgradeHeaders.headers_A7))
      .exec(
        http("#233").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(
        http("#234").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(
        http("#235").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(SprintTargetUpgradeHeaders.headers_A10))
      .exec(
        http("#236").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A236).body(ElFileBody("Sprint/Upgrade/sprintupg_0236_request.json")))
      .exec(
        http("#237").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A237).body(ElFileBody("Sprint/Upgrade/sprintupg_0237_request.json")))
      .exec(
        http("#238").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A0)
          .resources(
            //            http("#239").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#240").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A240).body(ElFileBody("Sprint/Upgrade/sprintupg_0240_request.json"))))
      .exec(
        http("#241").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(SprintTargetUpgradeHeaders.headers_A241)
          .resources(
            http("#242").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(SprintTargetUpgradeHeaders.headers_A242),
            http("#243").get(Common.uri_ui + "/app/pages/addons/serviceaddon.html").headers(SprintTargetUpgradeHeaders.headers_A243),
            http("#244").get(Common.uri_ui + "/app/components/contempiler/config.json").headers(SprintTargetUpgradeHeaders.headers_A244),
            http("#245").get(Common.uri_ui + "/app/components/contempiler/contempiler.html").headers(SprintTargetUpgradeHeaders.headers_A245),
            http("#246").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(SprintTargetUpgradeHeaders.headers_A19),
            http("#247").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(SprintTargetUpgradeHeaders.headers_A10),
            http("#248").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#249").get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#250").get(Common.uri_ui + "/app/components/contempiler/contemloader.html").headers(SprintTargetUpgradeHeaders.headers_A250),
            http("#251").get(Common.uri_ui + "/app/components/contempiler/sets/empty.html").headers(SprintTargetUpgradeHeaders.headers_A251)))
  }

  val PlanFeaturesToDeviceOptions = group("Features->DeviceOpt") {
    exec(
      http("#252").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A0)
        .resources(
          http("#253").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A253).body(ElFileBody("Sprint/Upgrade/sprintupg_0253_request.json"))))
      .exec(
        http("#254").get("/retail/orderassembly/controller/process.php").headers(SprintTargetUpgradeHeaders.headers_A2)
          .resources(
            //            http("#255").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(SprintTargetUpgradeHeaders.headers_A3),
            //            http("#256").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#257").get(Common.uri_ui + "/assets/img/cloader.gif").headers(SprintTargetUpgradeHeaders.headers_A5)))
      .exec(
        http("#258").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(SprintTargetUpgradeHeaders.headers_A6))
      .exec(
        http("#259").get(Common.uri_ui + "/config.json").headers(SprintTargetUpgradeHeaders.headers_A7))
      .exec(
        http("#260").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(
        http("#261").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(
        http("#262").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(SprintTargetUpgradeHeaders.headers_A10))
      .exec(
        http("#263").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A263).body(ElFileBody("Sprint/Upgrade/sprintupg_0263_request.json")))
      .exec(
        http("#264").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A264).body(ElFileBody("Sprint/Upgrade/sprintupg_0264_request.json")))
      .exec(
        http("#265").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(
        http("#267").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(SprintTargetUpgradeHeaders.headers_A267).body(ElFileBody("Sprint/Upgrade/sprintupg_0267_request.json")))
      .exec(
        http("#273").options(Common.uri_dsom_no_port + "/dsom-app/v1/getAddOnOptions").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(
        http("#277").post(Common.uri_dsom_no_port + "/dsom-app/v1/getAddOnOptions").headers(SprintTargetUpgradeHeaders.headers_A277).body(ElFileBody("Sprint/Upgrade/sprintupg_0277_request.json"))
          .resources(
            //            http("#266").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#268").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(SprintTargetUpgradeHeaders.headers_A268),
            http("#269").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(SprintTargetUpgradeHeaders.headers_A269),
            http("#270").get(Common.uri_ui + "/app/pages/addons/device.html").headers(SprintTargetUpgradeHeaders.headers_A270),
            http("#271").get(Common.uri_ui + "/app/components/showhide/showhide.html").headers(SprintTargetUpgradeHeaders.headers_A271),
            http("#272").get(Common.uri_ui + "/app/components/productoptions/partials/productchoices.html").headers(SprintTargetUpgradeHeaders.headers_A272),
            http("#274").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(SprintTargetUpgradeHeaders.headers_A19),
            http("#275").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(SprintTargetUpgradeHeaders.headers_A10),
            http("#276").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#278").get(Common.uri_ui + "/app/components/contempiler/config.json").headers(SprintTargetUpgradeHeaders.headers_A278),
            http("#279").get(Common.uri_ui + "/app/components/contempiler/contempiler.html").headers(SprintTargetUpgradeHeaders.headers_A279),
            http("#280").get(Common.uri_ui + "/app/components/contempiler/contemloader.html").headers(SprintTargetUpgradeHeaders.headers_A280),
            http("#281").get(Common.uri_ui + "/app/components/selectioninputs/partials/choices.html").headers(SprintTargetUpgradeHeaders.headers_A281),
            http("#282").get(Common.uri_ui + "/app/components/contempiler/sets/blurb/squaretrade.json").headers(SprintTargetUpgradeHeaders.headers_A282),
            http("#283").get(Common.uri_ui + "/app/components/contempiler/sets/blurb/default.html").headers(SprintTargetUpgradeHeaders.headers_A283),
            http("#284").get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png").headers(SprintTargetUpgradeHeaders.headers_A5)))
      .exec(
        http("#285").get(Common.uri_ui + "/assets/img/squaretrade_logo_325x160.png").headers(SprintTargetUpgradeHeaders.headers_A5))
  }

  val DeviceOptionsToOrderConfirm = group("DeviceOpt->OrderConfirm") {
    exec(
      http("#286").options(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(SprintTargetUpgradeHeaders.headers_A43))
      .exec(
        http("#287").post(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(SprintTargetUpgradeHeaders.headers_A287).body(ElFileBody("Sprint/Upgrade/sprintupg_0287_request.json")))
      .exec(
        http("#288").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A0))
      .exec(
        http("#289").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(SprintTargetUpgradeHeaders.headers_A289).body(ElFileBody("Sprint/Upgrade/sprintupg_0289_request.json")))
      .exec(
        http("#290").get("/retail/orderassembly/controller/process.php").headers(SprintTargetUpgradeHeaders.headers_A2))
      .exec(
        http("#291").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_A55)
          .resources(
            http("#292").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#293").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#294").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#295").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#296").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#297").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#298").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#299").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#300").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#301").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_A55),
            http("#302").get("/js/printfunctions.js").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#303").get("/js/retail/orderconfirm.js?antiCacheStr=bb6cbd38d678c79bf3edc67fc56b5325").headers(SprintTargetUpgradeHeaders.headers_A3),
            http("#304").get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_thumb.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#305").get("/img/retail/corps/plLgs545.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#306").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#307").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#308").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#309").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#310").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#311").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#312").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#313").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#314").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#315").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#316").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_A5),
            http("#317").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508892203713").headers(SprintTargetUpgradeHeaders.headers_A82)))
  }

  val OrderConfirmToTermsAndConditions = group("OrderConfirm->T&C") {
    exec(
      http("#369").post("/retail/checkout/controller/panicbuttonprocess.php").headers(SprintTargetUpgradeHeaders.headers_369)
        .formParam("storeRepId", "12345678")
        .resources(http("#370").get("/retail/checkout/termsconditions.htm").headers(SprintTargetUpgradeHeaders.headers_11)))
      .exec(http("#371").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89)
        .resources(http("#372").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#373").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#374").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#375").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#376").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#377").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#378").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#379").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#380").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#381").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#382").get("/retail/public/styles/jquery.signaturepad.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#383").get("/js/printfunctions.js").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#384").get("/jslibs/signature/signaturepad.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#385").get("/jslibs/signature/json2.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#386").get("/js/retail/tandc.js").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#387").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#388").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#389").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#390").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#391").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#392").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#393").get("/img/retail/icons-18-white.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#394").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#395").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#396").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#397").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#398").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#399").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381190085").headers(SprintTargetUpgradeHeaders.headers_116),
          http("#400").get("/retail/public/styles/pen.cur").headers(SprintTargetUpgradeHeaders.headers_3)))
  }

  val TermsAndConditionsToMSS = group("T&C->MSS") {
    exec(http("#401").post("/retail/checkout/termsconditions.htm").headers(SprintTargetUpgradeHeaders.headers_0)
      .formParam("acceptGcTermsConditions", "")
      .formParam("termsConditions[carrier]", "Y")
      .formParam("termsConditions[lt]", "Y")
      .formParam("output", """[{"lx":402,"ly":31,"mx":402,"my":30},{"lx":404,"ly":32,"mx":402,"my":31},{"lx":409,"ly":35,"mx":404,"my":32},{"lx":419,"ly":39,"mx":409,"my":35},{"lx":429,"ly":44,"mx":419,"my":39},{"lx":444,"ly":49,"mx":429,"my":44},{"lx":466,"ly":56,"mx":444,"my":49},{"lx":497,"ly":64,"mx":466,"my":56},{"lx":525,"ly":68,"mx":497,"my":64},{"lx":563,"ly":68,"mx":525,"my":68},{"lx":609,"ly":69,"mx":563,"my":68},{"lx":627,"ly":69,"mx":609,"my":69},{"lx":638,"ly":69,"mx":627,"my":69},{"lx":641,"ly":69,"mx":638,"my":69},{"lx":642,"ly":69,"mx":641,"my":69},{"lx":642,"ly":70,"mx":642,"my":69}]""")
      .formParam("sigStr", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyAAAAB4CAYAAAAKRZZvAAAMj0lEQVR4Xu3d34ucVxkH8Gd/JhJjgrQh2VBtloohDV5UEiFFaVC07VVBYw1e6V0peKFS8C9QRBELuRARLzctAcELY/EiKVK1qQXBVhOx2UhoIpsKTWPV7E85786su0k3bJyZZ9955zOwzP543/Oc8znPzZczMzu0tLS0FB4ECBAgQIAAAQIECBBIEBgSQBKUlSBAgAABAgQIECBAoBIQQDQCAQIECBAgQIAAAQJpAgJIGrVCBAgQIECAAAECBAgIIHqAAAECBAgQIECAAIE0AQEkjVohAgQIECBAgAABAgQEED1AgAABAgQIECBAgECagACSRq0QAQIECBAgQIAAAQICiB4gQIAAAQIECBAgQCBNQABJo1aIAAECBAgQIECAAAEBRA8QIECAAAECBAgQIJAmIICkUStEgAABAgQIECBAgIAAogcIECBAgAABAgQIEEgTEEDSqBUiQIAAAQIECBAgQEAA0QMECBAgQIAAAQIECKQJCCBp1AoRIECAAAECBAgQICCA6AECBAgQIECAAAECBNIEBJA0aoUIECBAgAABAgQIEBBA9AABAgQIECBAgAABAmkCAkgatUIECBAgQIAAAQIECAggeoAAAQIECBAgQIAAgTQBASSNWiECBAgQIECAAAECBAQQPUCAAAECBAgQIECAQJqAAJJGrRABAgQIECBAgAABAgKIHiBAgAABAgQIECBAIE1AAEmjVogAAQIECBAgQIAAAQFEDxAgQIAAAQIECBAgkCYggKRRK0SAAAECBAgQIECAgACiBwgQIECAAAECBAgQSBMQQNKoFSJAgEDzBHZ94URMTuyM3z375eYtzooIECBAoCcCAkhPWA1KgACB5gssLUXsOnaiWuizT386jh/d3/xFWyEBAgQIdCwggHRMaAACBAgMpsDqAFIEto6Pxk++8bn47MfvH0wQqyZAgACBDQkIIBtichEBAgQIvJdACSFTZ/4cz/z4xbg5t1BdcuxTH41vHf9E3HfvdmgECBAgQOA2AQFEUxAgQIBAVwR++LNX49tTL8fC4lKMjgxXIeRrTzzUlbENQoAAAQLNERBAmrOXVkKAAIFNF/jbzDvxnamX49Sv/1LNZcvYSHzz2KF48pH9seeD2zZ9fiZAgAABApsvIIBs/h6YAQECBBon8MLvL8VXv//LmG29LKss8IkjD1RB5DMPfbhx67UgAgQIENi4gACycStXEiBAgMBdCvzq1Utx8uyF+Plv/7py5wMTO6sg4lTkLjFdToAAgYYICCAN2UjLIECAQJ0Frvzjn/Hc2Qvx3Nnz8cbVt1em6lSkzrtmbgQIEOiNgADSG1ejEiBAgMA6Au91KjI2Mhw/eOpodSriQYAAAQLNFhBAmr2/VkeAAIHaCrRPRb536pWV94p8aNf2eOaLhwWR2u6aiREgQKBzAQGkc0MjECBAgECHAifPnI/vPn8uLl+7UY0kiHQI6nYCBAjUWEAAqfHmmBoBAgQGTUAQGbQdt14CBAZRQAAZxF23ZgIECNRcQBCp+QaZHgECBDoQEEA6wHMrAQIECPRW4NYgMj46El959GB86ZH9cfD+e3pb3OgECBAg0BMBAaQnrAYlQIAAgW4KlCDy9R+dibn5xZVhy/tEHjs8KYx0E9pYBAgQSBAQQBKQlSBAgACB7gi8dumtmDpzPk6fu7jyhvUysjDSHV+jECBAIENAAMlQVoMAAQIEui4gjHSd1IAECBBIERBAUpgVIUCAAIFeCggjvdQ1NgECBLorIIB019NoBAgQILDJAuuFkfYb2B8/PBlHDkxs8iyVJ0CAwOAKCCCDu/dWToAAgcYLtMPIT1/445o3sO/YtiUeP7yvehP7Y4f2Nd7BAgkQIFAnAQGkTrthLgQIECDQM4H1TkbaYeThB/fGo4f2RfnZgwABAgR6JyCA9M7WyAQIECBQU4HLMzfiF+cuxtTZ8/H6pbfWzLK8RKucjggjNd080yJAoO8FBJC+30ILIECAAIFOBNphpASS3/zpypqhyqlI9VKtQ5Nx367tnZRxLwECBAi0BAQQrUCAAAECBFoC19+9GafPTVenI6dfmV7jUv7z+vGj+4UR3UKAAIEOBQSQDgHdToAAAQLNFGiHkZdef7MKJO/8a3Zlof7xYTP33KoIEMgREEBynFUhQIAAgT4XqE5FWqcjq8NI+Xjfz3/yI1FernXkwF4v1erzfTZ9AgR6LyCA9N5YBQIECBBomMDyqch03PrxvmWZ5XSkhBGBpGGbbjkECHRNQADpGqWBCBAgQGAQBcrH+7702ptRQkn5Wn06UjzKe0cePtgOJBM+5ncQm8SaCRBYIyCAaAgCBAgQINBFAYGki5iGIkCgkQICSCO31aIIECBAoC4C7ZORckpy68f8ljm2X65VTkmOHJioy7TNgwABAj0TEEB6RmtgAgQIECBwu4BAoisIEBh0AQFk0DvA+gkQIEBg0wTKR/0uB5Ir1fOt/5V9x7YtrROSiTjy4N7q/SQeBAgQ6HcBAaTfd9D8CRAgQKAxAgJJY7bSQggQuIOAAKI9CBAgQIBATQUuz9xY+XStckJy+dqNNTMdGR6Kj03eG/t274zJPTti3+7W154dcc8H3lfTVZkWAQKDLiCADHoHWD8BAgQI9I3A6kDy/IsXYnFpad2573z/llYgEU76ZoNNlMCACAggA7LRlkmAAAECzRO4dv3fMX317Zj++/Xq62J5vrr8fXk513oP4aR5vWBFBPpJQADpp90yVwIECBAgsEEB4WSDUC4jQCBdQABJJ1eQAAECBAhsrsD/G07KrIeGNnfut1Zf/Sq0bVvHYnx0JEZHhmN8bDjGRkdibKQ8D1fP5W/V9+3n6m/LvxsfHV6+r9xf/dy6tn1Na8z2Nctjtsdr3VfdP3yH+1tzGx2OreOj9YI0GwKJAgJIIrZSBAgQIECg7gLrhZM/vDFT96n35fw6DXTtALaRcVZf2/6+BKkrJ5/qSzuT7l8BAaR/987MCRAgQIBAmsAd3u+eNod1Cw1F3Jydj9n5xZhfWIzZuYWYW1iMufn282LMzi/E/Pxi6/fLP8+Vn+dbfyv3lWuq+9vX3X7/yjWte0uNdt2qXmu85fr/G6eMWY09vxDv/mdu881WzeDaqadrNR+Tab6AANL8PbZCAgQIECBAoGYC3Qp0ZZyNnH6U5a++dnExYveTJ6K8om5GAKlZdzR/OgJI8/fYCgkQIECAAAECtwnczcu38BHopoAA0k1NYxEgQIAAAQIECBAgcEcBAUSDECBAgAABAgQIECCQJiCApFErRIAAAQIECBAgQICAAKIHCBAgQIAAAQIECBBIExBA0qgVIkCAAAECBAgQIEBAANEDBAgQIECAAAECBAikCQggadQKESBAgAABAgQIECAggOgBAgQIECBAgAABAgTSBASQNGqFCBAgQIAAAQIECBAQQPQAAQIECBAgQIAAAQJpAgJIGrVCBAgQIECAAAECBAgIIHqAAAECBAgQIECAAIE0AQEkjVohAgQIECBAgAABAgQEED1AgAABAgQIECBAgECagACSRq0QAQIECBAgQIAAAQICiB4gQIAAAQIECBAgQCBNQABJo1aIAAECBAgQIECAAAEBRA8QIECAAAECBAgQIJAmIICkUStEgAABAgQIECBAgIAAogcIECBAgAABAgQIEEgTEEDSqBUiQIAAAQIECBAgQEAA0QMECBAgQIAAAQIECKQJCCBp1AoRIECAAAECBAgQICCA6AECBAgQIECAAAECBNIEBJA0aoUIECBAgAABAgQIEBBA9AABAgQIECBAgAABAmkCAkgatUIECBAgQIAAAQIECAggeoAAAQIECBAgQIAAgTQBASSNWiECBAgQIECAAAECBAQQPUCAAAECBAgQIECAQJqAAJJGrRABAgQIECBAgAABAgKIHiBAgAABAgQIECBAIE1AAEmjVogAAQIECBAgQIAAAQFEDxAgQIAAAQIECBAgkCYggKRRK0SAAAECBAgQIECAgACiBwgQIECAAAECBAgQSBMQQNKoFSJAgAABAgQIECBAQADRAwQIECBAgAABAgQIpAkIIGnUChEgQIAAAQIECBAgIIDoAQIECBAgQIAAAQIE0gQEkDRqhQgQIECAAAECBAgQEED0AAECBAgQIECAAAECaQICSBq1QgQIECBAgAABAgQICCB6gAABAgQIECBAgACBNAEBJI1aIQIECBAgQIAAAQIEBBA9QIAAAQIECBAgQIBAmoAAkkatEAECBAgQIECAAAECAogeIECAAAECBAgQIEAgTeC/GR9l1R1LSmEAAAAASUVORK5CYII=")
      .formParam("vzwStr", "no sig"))
      .exec(http("#402").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89)
        .resources(http("#403").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#404").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#405").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#406").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#407").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#408").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#409").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#410").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#411").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#412").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#413").get("/js/printfunctions.js").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#414").get("/img/brands/target/retail/printed-logo.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#415").get("/barcode.htm?code=15/25508033100799990000001890&width=360&height=90&type=C128B&font=1").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#416").get("/barcode.htm?code=9881257290054569&height=90&type=C128B&font=1").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#417").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#418").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#419").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#420").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#421").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#422").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#423").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#424").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#425").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#426").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#427").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381208132").headers(SprintTargetUpgradeHeaders.headers_116)))
  }

  val MSSToScanReceipt = group("MSS->ScanReceipt") {
    exec(http("#428").get("/retail/controller/saleassocflowcontroller.php?activate=1").headers(SprintTargetUpgradeHeaders.headers_11)
      .resources(http("#429").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#430").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#431").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#432").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#433").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#434").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#435").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#436").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#437").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#438").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#439").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
        http("#440").get("/js/retail/receiptscan.js").headers(SprintTargetUpgradeHeaders.headers_1),
        http("#441").get("/img/brands/target/retail/tooltips/receipt.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#442").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#443").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#444").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#445").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#446").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#447").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#448").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#449").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#450").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#451").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
        http("#452").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381212658").headers(SprintTargetUpgradeHeaders.headers_116)))
  }

  val ScanReceiptToActivationScan = group("ScanReceipt->ActScan") {
    exec(http("#453").post("/ajax/retail/fakereceipt.php").headers(SprintTargetUpgradeHeaders.headers_453))
      .exec(http("#454").post("/retail/receiptscan.htm").check(regex("#(.+?)</h3>").saveAs("p_orderid")).headers(SprintTargetUpgradeHeaders.headers_0)
        .formParam("receiptId", "757898935042135485"))
      .exec(http("#455").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89)
        .resources(http("#456").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#457").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#458").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#459").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#460").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#461").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#462").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#463").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#464").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#465").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#466").get("/js/retail/activationqc.js").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#467").get("/img/retail/tooltips/imei-outsidebox.jpg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#468").get("/img/retail/tooltips/esn-outsidebox.jpg").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#469").get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#470").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#471").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#472").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#473").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#474").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#475").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#476").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#477").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#478").get("/img/retail/icons-18-white.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#479").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#480").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#481").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381220394").headers(SprintTargetUpgradeHeaders.headers_116)))
  }

  val ActivationScanToWirelessCustomerAgreement = group("ActScan->WCA") {
    exec(http("#482").post("/retail/checkout/activationscan.htm").headers(SprintTargetUpgradeHeaders.headers_0)
      .formParam("serial", "")
      .formParam("device[98765432112345]", "Y")
      .formParam("deviceScanInfo[${p_orderid}_42249_1_1][sim]", "89011201000218620498")
      .formParam("isRequiredSIMValidation", "1"))
      .exec(http("#483").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89)
        .resources(http("#484").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#485").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#486").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#487").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#488").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#489").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#490").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#491").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#492").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#493").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#494").get("/img/brands/target/retail/ajax-loader-l.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#495").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#496").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#497").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#498").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#499").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#500").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#501").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#502").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#503").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#504").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#505").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381235899").headers(SprintTargetUpgradeHeaders.headers_116),
          http("#506").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1506381236172&storeId=0003").headers(SprintTargetUpgradeHeaders.headers_116)))
      .exec(http("#507").get("/retail/controller/saleassocflowcontroller.php?parking=1").headers(SprintTargetUpgradeHeaders.headers_11)
        .resources(http("#508").get("/retail/public/styles/normalize.php").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#509").get("/jslibs/jquery.php?ver=1.8.2").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#510").get("/jslibs/modernizr.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#511").get("/jslibs/jquerymobile.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#512").get("/template/public/styles/new.main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#513").get("/template/css/semantic.jqmsafe.min.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#514").get("/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#515").get("/js/retail/topnav.php").headers(SprintTargetUpgradeHeaders.headers_1),
          http("#516").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#517").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#518").get("/brands/target/retail/public/styles/main.css").headers(SprintTargetUpgradeHeaders.headers_89),
          http("#519").get("/img/brands/target/retail/ajax-loader-l.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#520").get("/img/retail/ajax-loader.gif").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#521").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#522").get("/retail/public/img/alertsprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#523").get("/retail/public/img/reservesprite.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#524").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#525").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#526").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#527").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#528").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#529").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#530").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1506381241024").headers(SprintTargetUpgradeHeaders.headers_116),
          http("#531").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1506381241463&storeId=0003").headers(SprintTargetUpgradeHeaders.headers_116)))
      .exec(http("#532").get("/retail/controller/saleassocflowcontroller.php?parking=1").headers(SprintTargetUpgradeHeaders.headers_11))
      .exec(http("#533").get("/retail/ng/POA/config.json").headers(SprintTargetUpgradeHeaders.headers_6))
      .exec(http("#534").post("/webservices/external/poa_rest/index.php/sales/v1/order").headers(SprintTargetUpgradeHeaders.headers_534).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0533_request.json"))
        .resources(http("#535").get("/img/retail/home.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#536").get("/img/retail/inventory-management.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#537").get("/img/retail/customer-lookup.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#538").get("/img/retail/save.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#539").get("/img/retail/lock.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#540").get("/img/brands/target/retail/logo-mini.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#541").get("/img/retail/setting.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#542").get("/img/retail/cart.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#543").get("/img/retail/faqs.png").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#544").get("/img/retail/logout.png").headers(SprintTargetUpgradeHeaders.headers_3)))
  }

  val WirelessCustomerAgreementToDeviceFinancingInstallmentContract = group("WCA->FinanceContract") {
    exec(http("#545").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}").headers(SprintTargetUpgradeHeaders.headers_545))
      .exec(http("#546").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/contracts").headers(SprintTargetUpgradeHeaders.headers_546))
      .exec(http("#547").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status").headers(SprintTargetUpgradeHeaders.headers_547))
      .exec(http("#548").get("/legacy/v1/index.php/strings?pageTags=%5B%22WCAGR%22%5D").headers(SprintTargetUpgradeHeaders.headers_548))
      .exec(http("#549").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=wca&page=1").headers(SprintTargetUpgradeHeaders.headers_3)
        .resources(http("#550").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=wca&page=2").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#551").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=wca&page=3").headers(SprintTargetUpgradeHeaders.headers_3)))

  }

  val DeviceFinancingInstallmentContractToOrderSummary = group("FinanceContract->OrderSummary") {
    exec(http("#552").get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLTC%22%5D").headers(SprintTargetUpgradeHeaders.headers_552)
      .resources(http("#553").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/productimage").headers(SprintTargetUpgradeHeaders.headers_553)))
      .exec(http("#554").get("/img/prod/cell-phones/samsung/samsung-s8-orchidgrey_front_med.png").headers(SprintTargetUpgradeHeaders.headers_3)
        .resources(http("#555").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=1&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#556").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=2&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#557").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=3&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#558").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=4&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#559").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=5&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3),
          http("#560").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=6&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3)))
      .exec(http("#561").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=7&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3)
        .resources(http("#562").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8bba81433c31bc34&code=finance&page=8&ordiIndex=1").headers(SprintTargetUpgradeHeaders.headers_3)))
      .exec(http("#563").get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLRC%22%5D").headers(SprintTargetUpgradeHeaders.headers_563))
      .exec(http("#564").post("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/signatures").headers(SprintTargetUpgradeHeaders.headers_564).body(ElFileBody("Sprint/Upgrade/SprintUpgradeE2E_0563_request.json"))
        .resources(http("#565").get("/img/brands/target/retail/printed-logo.png").headers(SprintTargetUpgradeHeaders.headers_3)))
      .exec(http("#566").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status").headers(SprintTargetUpgradeHeaders.headers_566))
      .exec(http("#567").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}").headers(SprintTargetUpgradeHeaders.headers_567))
  }

  val TabulateResults = group("Results"){
    exec(http("Shipped Orders").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status").check(substring("COMPLETED")).headers(CommonHeaders.status_call))
  }

//Added below for legacy
	val ActivationScanToWirelessCustomerAgreement_LEGACY = group("ActivationScanToWirelessCustomerAgreement"){
	  exec(http("request_0")
			.post("/retail/checkout/activationscan.htm")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_0))
		.exec(http("request_1")
			.get("/retail/public/styles/normalize.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_1))
		.exec(http("request_2")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_3")
			.get("/jslibs/modernizr.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_4")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_5")
			.get("/js/retail/topnav.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_6")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.pause(574 milliseconds)
		.exec(http("request_7")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_8")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_9")
			.get("/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_10")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_11")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_12")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_13")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_14")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_15")
			.get("/img/retail/setting.png"))
		.exec(http("request_16")
			.get("/img/retail/home.png"))
		.exec(http("request_17")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_18")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_19")
			.get("/img/retail/save.png"))
		.exec(http("request_20")
			.get("/img/retail/lock.png"))
		.exec(http("request_21")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510786012173")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_21))
		.pause(179 milliseconds)
		.exec(http("request_22")
			.get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1510786012370&storeId=0003")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_21))
	//	.pause(6)
		.exec(http("request_23")
			.get("/retail/controller/saleassocflowcontroller.php?parking=1")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_23))
		.exec(http("request_24")
			.get("/retail/public/styles/normalize.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_1))
		.exec(http("request_25")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_26")
			.get("/jslibs/modernizr.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_27")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_28")
			.get("/template/public/styles/new.main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_29")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_30")
			.get("/retail/public/styles/main.css"))
		.exec(http("request_31")
			.get("/js/retail/topnav.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_32")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css"))
		.exec(http("request_33")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css"))
		.exec(http("request_34")
			.get("/brands/target/retail/public/styles/main.css"))
		.exec(http("request_35")
			.get("/retail/public/styles/jquery.signaturepad.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_36")
			.get("/js/printfunctions.js")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_37")
			.get("/jslibs/signature/signaturepad.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_38")
			.get("/jslibs/signature/json2.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_39")
			.get("/js/retail/tandc.js")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_40")
			.get("/img/prod/cell-phones/sprint/samsung/samsung-galaxy-s7-edge-gold_front_med.png"))
		.pause(546 milliseconds)
		.exec(http("request_41")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_42")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_43")
			.get("/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_44")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.pause(388 milliseconds)
		.exec(http("request_45")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_46")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_47")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_48")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_49")
			.get("/img/retail/setting.png"))
		.exec(http("request_50")
			.get("/img/retail/icons-18-white.png"))
		.exec(http("request_51")
			.get("/img/retail/home.png"))
		.exec(http("request_52")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_53")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_54")
			.get("/img/retail/save.png"))
		.exec(http("request_55")
			.get("/img/retail/lock.png"))
		.exec(http("request_56")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510786020175")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_21))
	}
	//	.pause(20)
		val WirelessCustomerAgreementToDeviceFinancingInstallmentContract_LEGACY = group("WirelessCustomerAgreementToDeviceFinancingInstallmentContract"){
		  exec(http("request_57")
			.get("/retail/public/styles/pen.cur")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		//.pause(29)
		.exec(http("request_58")
			.post("/retail/checkout/termsconditions.htm?rtdfc=1")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_0))
		.exec(http("request_59")
			.get("/retail/public/styles/normalize.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_1))
		.exec(http("request_60")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_61")
			.get("/jslibs/modernizr.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_62")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_63")
			.get("/template/public/styles/new.main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_64")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_65")
			.get("/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_66")
			.get("/js/retail/topnav.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_67")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_68")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_69")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_70")
			.get("/img/brands/target/retail/ajax-loader-l.gif")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.pause(747 milliseconds)
		.exec(http("request_71")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_72")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_73")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_74")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_75")
			.get("/img/retail/setting.png"))
		.exec(http("request_76")
			.get("/img/retail/home.png"))
		.exec(http("request_77")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_78")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_79")
			.get("/img/retail/save.png"))
		.exec(http("request_80")
			.get("/img/retail/lock.png"))
		.exec(http("request_81")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510786070879")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_21))
		}

		val DeviceFinancingInstallmentContractToOrderSummary_LEGACY = group("DeviceFinancingInstallmentContractToOrderSummary"){
		 exec(http("request_82")
			.get("/retail/checkout/controller/activationprocess.php?activating=")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_23))
		.exec(http("request_83")
			.get("/retail/public/styles/normalize.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_1))
		.exec(http("request_84")
			.get("/jslibs/jquery.php?ver=1.8.2"))
		.exec(http("request_85")
			.get("/jslibs/modernizr.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_86")
			.get("/jslibs/jquerymobile.php"))
		.exec(http("request_87")
			.get("/template/public/styles/new.main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_88")
			.get("/template/css/semantic.jqmsafe.min.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_89")
			.get("/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_90")
			.get("/js/retail/topnav.php")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_3))
		.exec(http("request_91")
			.get("/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_92")
			.get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_93")
			.get("/brands/target/retail/public/styles/main.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_94")
			.get("/js/printfunctions.js")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_95")
			.get("/img/brands/target/retail/printed-logo.png")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_96")
			.get("/retail/public/styles/carriers/sprintstyles.css")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.exec(http("request_97")
			.get("/img/retail/spr-esa-logo.jpg")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_6))
		.pause(640 milliseconds)
		.exec(http("request_98")
			.get("/img/retail/ajax-loader.gif"))
		.exec(http("request_99")
			.get("/img/brands/target/retail/logo-mini.png"))
		.exec(http("request_100")
			.get("/retail/public/img/alertsprite.png"))
		.exec(http("request_101")
			.get("/retail/public/img/reservesprite.png"))
		.exec(http("request_102")
			.get("/img/retail/setting.png"))
		.exec(http("request_103")
			.get("/img/retail/home.png"))
		.exec(http("request_104")
			.get("/img/retail/inventory-management.png"))
		.exec(http("request_105")
			.get("/img/retail/customer-lookup.png"))
		.exec(http("request_106")
			.get("/img/retail/save.png"))
		.exec(http("request_107")
			.get("/img/retail/lock.png"))
		.exec(http("request_108")
			.get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1510786082181")
			.headers(SprintTargetUpgradeHeaders.SPTLegacyHeaders_21))
		}



}

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object VerizonUpgradePages {


    val ChoosePathToUpgradeEligibilityCheck = group("ChoosePath->UpgradeCheck") {
        exec(
            http("#0").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#1").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_1).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0001_request.json"))
                .resources(
                    http("#2").get("/retail/orderassembly/controller/process.php?planType=contractExt&action=buyTypeChosen").headers(VerizonUpgradeHeaders.headers_2),
                    http("#3").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#4").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#5").get(Common.uri_ui + "/assets/img/cloader.gif").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#6").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(VerizonUpgradeHeaders.headers_6))
          .exec(
              http("#8").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#9").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#11").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_11).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0011_request.json")))
          .exec(
              http("#12").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_12).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0012_request.json")))
          .exec(
              http("#13").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#15").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_15).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0015_request.json"))
                .resources(
                    http("#7").get(Common.uri_ui + "/config.json").headers(VerizonUpgradeHeaders.headers_7),
                    http("#10").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(VerizonUpgradeHeaders.headers_10),
                    http("#14").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#16").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(VerizonUpgradeHeaders.headers_16),
                    http("#17").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(VerizonUpgradeHeaders.headers_17),
                    http("#18").get(Common.uri_ui + "/app/pages/accountverification/accountverification.html").headers(VerizonUpgradeHeaders.headers_18),
                    http("#19").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(VerizonUpgradeHeaders.headers_19),
                    http("#20").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(VerizonUpgradeHeaders.headers_10),
                    http("#21").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#22").get(Common.uri_ui + "/assets/img/verizon.svg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#23").get(Common.uri_ui + "/assets/img/att.svg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#24").get(Common.uri_ui + "/assets/img/sprint.svg").headers(VerizonUpgradeHeaders.headers_5)))
    }

    val UpgradeEligibilityCheckToScanDevice = group("UpgradeCheck->ScanDevice") {
        exec(
            http("#25").options(Common.uri_dsom_no_port + "/dsom-app/v1/isWidgetEnabledEx").headers(VerizonUpgradeHeaders.headers_0)
              .resources(
                  http("#26").post(Common.uri_dsom_no_port + "/dsom-app/v1/isWidgetEnabledEx").headers(VerizonUpgradeHeaders.headers_26).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0026_request.json"))))
          .exec(
              http("#27").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0)
                .resources(
                    http("#28").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_28).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0028_request.json"))))
          .exec(
              http("#29").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#30").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_30).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0030_request.json")))
          .exec(
              http("#32").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#34").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_34).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0034_request.json"))
                .resources(
                    http("#31").get(Common.uri_ui + "/app/pages/upgraderesults/upgraderesults.html").headers(VerizonUpgradeHeaders.headers_31),
                    http("#33").get(Common.uri_ui + "/app/pages/upgraderesults/partials/urtile.html").headers(VerizonUpgradeHeaders.headers_33)))
    }

    val ScanDeviceToPaymentOptions = group("ScanDevice->PaymentOpt") {
        exec(
            http("#35").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0)
              .resources(
                  http("#36").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_36).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0036_request.json"))))
          .exec(
              http("#37").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#38").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_38).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0038_request.json"))
                .resources(
                    http("#39").get(Common.uri_ui + "/app/pages/scan/scan.html").headers(VerizonUpgradeHeaders.headers_39)))
          .exec(
              http("#40").options(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(VerizonUpgradeHeaders.headers_40))
          .exec(
              http("#41").post(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(VerizonUpgradeHeaders.headers_41).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0041_request.json")))
          .exec(
              http("#42").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#43").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_43).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0043_request.json")))
          .exec(
              http("#44").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#45").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_45).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0045_request.json")))
          .exec(
              http("#46").get(Common.uri_ui + "/app/pages/paymentoptions/paymentoptions.html").headers(VerizonUpgradeHeaders.headers_46))
          .exec(
              http("#47").options(Common.uri_dsom_no_port + "/dsom-app/v1/getPaymentDetails").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#48").post(Common.uri_dsom_no_port + "/dsom-app/v1/getPaymentDetails").headers(VerizonUpgradeHeaders.headers_48).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0048_request.json"))
                .resources(
                    http("#46").get(Common.uri_ui + "/app/pages/paymentoptions/paymentoptions.html").headers(VerizonUpgradeHeaders.headers_46)))
    }

    val PaymentOptionsToCreditCheck = group("PaymentOpt->CC") {
        exec(
            http("#49").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0)
              .resources(
                  http("#50").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_50).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0050_request.json"))))
          .exec(
              http("#51").get("/retail/orderassembly/controller/process.php").headers(VerizonUpgradeHeaders.headers_2))
          .exec(
              http("#52").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52)
                .resources(
                    http("#53").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#54").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#55").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#56").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#57").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#58").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#59").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#60").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#61").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#62").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#63").get("/js/retail/creditcheck.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#64").get("/js/retail/checkoutinit.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#65").get("/js/datechange.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#66").get("/js/retail/numport.php?devices=").headers(VerizonUpgradeHeaders.headers_3),
                    http("#67").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                    http("#68").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#69").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#70").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#71").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#72").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#73").get("/img/retail/icons-18-white.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#74").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#75").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#76").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#77").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#78").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#79").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508521834789").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val CreditCheckToCreditCheckResult = group("CC->CCResult") {
        exec(
            http("#80").post("/retail/creditcheck/creditcheck.htm").headers(VerizonUpgradeHeaders.headers_80)
              .formParam("creditCheckToolArray[1008][newOrExisting]", "existing")
              .formParam("creditCheckToolArray[1008][addLineType]", "addExistingPlan")
              .formParam("currentPageCOPId", "439")
              .formParam("secretSubmit", "")
              .formParam("creditCheckTool", "1")
              .formParam("edit", "")
              .formParam("Lines_To_Be_Activated", "1")
              .formParam("creditCheckToolArray[1008][numOfNewLines]", "1")
              .formParam("creditCheckToolArray[1008][numOfExistingLines]", "1")
              .formParam("Billing_Address_Radio", "unfinished")
              .formParam("Ecom_BillTo_Postal_Name_First", "Teddy")
              .formParam("Ecom_BillTo_Postal_Name_Middle", "")
              .formParam("Ecom_BillTo_Postal_Name_Last", "McTest")
              .formParam("Ecom_BillTo_Postal_Street_Line1", "226 Granville Way")
              .formParam("Ecom_BillTo_Postal_Street_Line2", "")
              .formParam("Ecom_BillTo_Postal_City", "San Francisco")
              .formParam("Ecom_BillTo_Postal_StateProv", "CA")
              .formParam("Ecom_BillTo_Postal_PostalCode", "94127")
              .formParam("Ecom_BillTo_Telecom_Phone_Number", "4158419060")
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
              .formParam("checkoutSubmitType", "continue")
              .resources(
                  http("#81").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52),
                  http("#82").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                  http("#83").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#84").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#85").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#86").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#87").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#88").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#89").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#90").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#91").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#92").get("/img/brands/target/retail/ajax-loader-l.gif").headers(VerizonUpgradeHeaders.headers_5),
                  http("#93").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                  http("#94").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#95").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#96").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#97").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#98").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#99").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#100").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#101").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#102").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#103").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#104").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508521872612").headers(VerizonUpgradeHeaders.headers_79),
                  http("#105").get("/retail/creditcheck/controller/runprecreditcheck.php").headers(VerizonUpgradeHeaders.headers_2),
                  http("#106").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52),
                  http("#107").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                  http("#108").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#109").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#110").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#111").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#112").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#113").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#114").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#115").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#116").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#117").get("/img/brands/target/retail/ajax-loader-l.gif").headers(VerizonUpgradeHeaders.headers_5),
                  http("#118").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                  http("#119").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#120").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#121").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#122").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#123").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#124").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#125").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#126").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#127").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#128").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#129").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508521876763").headers(VerizonUpgradeHeaders.headers_79),
                  http("#130").get("/retail/creditcheck/controller/runprecreditcheck.php").headers(VerizonUpgradeHeaders.headers_2)))
          .exec(
              http("#131").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52)
                .resources(
                    http("#132").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#133").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#134").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#135").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#136").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#137").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#138").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#139").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#140").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#141").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#142").get("/js/retail/creditcheckresult.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#143").get("/img/corpLogos/plLg660.gif").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#144").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5)
                .resources(
                    http("#145").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#146").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#147").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#148").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#149").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#150").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#151").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#152").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#153").get("/img/retail/icons-18-white.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#154").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#155").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#156").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508521880529").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val CreditCheckResultToInstallmentDetails = group("CCResult->IDP") {
        exec(
            http("#157").post("/retail/creditcheck/result.htm").headers(VerizonUpgradeHeaders.headers_80)
              .formParam("submitType", "continue")
              .formParam("acceptCorp", "660")
              .formParam("acceptType", "passed")
              .formParam("secondRun", "")
              .formParam("numofline_to_activate", "1")
              .formParam("checkbox-1", "on")
              .resources(
                  http("#158").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                  http("#159").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                  http("#160").get(Common.uri_ui + "/assets/img/cloader.gif").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#161").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(VerizonUpgradeHeaders.headers_6))
          .exec(
              http("#162").get(Common.uri_ui + "/config.json").headers(VerizonUpgradeHeaders.headers_7))
          .exec(
              http("#163").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#164").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#165").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_165).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0165_request.json")))
          .exec(
              http("#166").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_166).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0166_request.json")))
          .exec(
              http("#167").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#169").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_169).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0169_request.json"))
                .resources(
                    http("#168").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(VerizonUpgradeHeaders.headers_3)))
          .exec(
              http("#170").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(VerizonUpgradeHeaders.headers_170))
          .exec(
              http("#178").options(Common.uri_dsom_no_port + "/dsom-app/v1/paymentPlans").headers(VerizonUpgradeHeaders.headers_178)
                .resources(
                    http("#171").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(VerizonUpgradeHeaders.headers_171),
                    http("#172").get(Common.uri_ui + "/app/pages/installmentdetails/installmentdetails.html").headers(VerizonUpgradeHeaders.headers_172),
                    http("#173").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(VerizonUpgradeHeaders.headers_10),
                    http("#174").get(Common.uri_ui + "/app/components/channel/channel.html").headers(VerizonUpgradeHeaders.headers_174),
                    http("#175").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#176").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(VerizonUpgradeHeaders.headers_19),
                    http("#177").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(VerizonUpgradeHeaders.headers_10),
                    http("#179").get(Common.uri_dsom_no_port + "/dsom-app/v1/paymentPlans").headers(VerizonUpgradeHeaders.headers_179),
                    http("#180").get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png").headers(VerizonUpgradeHeaders.headers_5)))
    }

    val InstallmentDetailsToPlans = group("IDP->Plans") {
        exec(
            http("#181").options(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item/1").headers(VerizonUpgradeHeaders.headers_181))
          .exec(
              http("#182").patch(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item/1").headers(VerizonUpgradeHeaders.headers_182).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0182_request.json")))
          .exec(
              http("#183").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#184").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_184).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0184_request.json")))
          .exec(
              http("#185").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#186").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_186).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0186_request.json"))
                .resources(
                    http("#187").get(Common.uri_ui + "/app/pages/selectproduct/selectservice.html").headers(VerizonUpgradeHeaders.headers_187),
                    http("#188").get(Common.uri_ui + "/app/components/contempiler/config.json").headers(VerizonUpgradeHeaders.headers_188),
                    http("#189").get(Common.uri_ui + "/app/components/contempiler/contempiler.html").headers(VerizonUpgradeHeaders.headers_189),
                    http("#190").get("/img/retail/corps/plLgs660.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#191").get(Common.uri_ui + "/app/components/contempiler/contemloader.html").headers(VerizonUpgradeHeaders.headers_191),
                    //below line had 400 status check in generated script, removed manually
//                    http("#192").get(Common.uri_ui + "/app/components/contempiler/sets/carrierinfo/stylesheet.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#193").get(Common.uri_ui + "/app/components/contempiler/sets/carrierinfo/verizon_hide.html").headers(VerizonUpgradeHeaders.headers_193)))
    }

    val PlansToCart = group("Plans->Cart") {
        exec(
            http("#194").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0)
              .resources(
                  http("#195").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_195).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0195_request.json"))))
          .exec(
              http("#196").get("/retail/orderassembly/controller/process.php").headers(VerizonUpgradeHeaders.headers_2))
          .exec(
              http("#197").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52)
                .resources(
                    http("#198").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#199").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#200").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#201").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#202").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#203").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#204").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#205").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#206").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#207").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#208").get("/js/retail/cart.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#209").get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#210").get("/img/retail/corps/plLgs660.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#211").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                    http("#212").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#213").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#214").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#215").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#216").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#217").get("/img/retail/icons-18-white.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#218").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#219").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#220").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#221").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#222").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#223").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522052968").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val CartToPlanFeatures = group("Cart->Features") {
        exec(
            http("#224").post("/retail/orderassembly/cart.htm").headers(VerizonUpgradeHeaders.headers_80)
              .formParam("action", "continue")
              .formParam("continueOnConfirm", "")
              .formParam("phonenumber-1", "2106278804")
              .resources(
                  http("#225").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                  http("#226").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                  http("#227").get(Common.uri_ui + "/assets/img/cloader.gif").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#228").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(VerizonUpgradeHeaders.headers_6))
          .exec(
              http("#229").get(Common.uri_ui + "/config.json").headers(VerizonUpgradeHeaders.headers_7))
          .exec(
              http("#230").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#231").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#232").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(VerizonUpgradeHeaders.headers_10))
          .exec(
              http("#233").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_233).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0233_request.json")))
          .exec(
              http("#234").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_234).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0234_request.json")))
          .exec(
              http("#235").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#237").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_237).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0237_request.json"))
                .resources(
                    http("#236").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#238").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(VerizonUpgradeHeaders.headers_238),
                    http("#239").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(VerizonUpgradeHeaders.headers_239),
                    http("#240").get(Common.uri_ui + "/app/pages/addons/serviceaddon.html").headers(VerizonUpgradeHeaders.headers_240),
                    http("#241").get(Common.uri_ui + "/app/components/contempiler/config.json").headers(VerizonUpgradeHeaders.headers_241),
                    http("#242").get(Common.uri_ui + "/app/components/contempiler/contempiler.html").headers(VerizonUpgradeHeaders.headers_242),
                    http("#243").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(VerizonUpgradeHeaders.headers_19),
                    http("#244").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(VerizonUpgradeHeaders.headers_10),
                    http("#245").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#246").get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#247").get(Common.uri_ui + "/app/components/contempiler/contemloader.html").headers(VerizonUpgradeHeaders.headers_247),
                    http("#248").get(Common.uri_ui + "/app/components/contempiler/sets/empty.html").headers(VerizonUpgradeHeaders.headers_248)))
    }

    val PlanFeaturesToDeviceOptions = group("Features->DeviceOpt") {
        exec(
            http("#249").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0)
              .resources(
                  http("#250").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_250).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0250_request.json"))))
          .exec(
              http("#251").get("/retail/orderassembly/controller/process.php").headers(VerizonUpgradeHeaders.headers_2)
                .resources(
                    http("#252").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#253").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#254").get(Common.uri_ui + "/assets/img/cloader.gif").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#255").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(VerizonUpgradeHeaders.headers_6))
          .exec(
              http("#256").get(Common.uri_ui + "/config.json").headers(VerizonUpgradeHeaders.headers_7))
          .exec(
              http("#257").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#258").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#259").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(VerizonUpgradeHeaders.headers_10))
          .exec(
              http("#260").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_260).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0260_request.json")))
          .exec(
              http("#261").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_261).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0261_request.json")))
          .exec(
              http("#262").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0)
                .resources(
                    http("#263").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#264").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_264).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0264_request.json"))))
          .exec(
              http("#265").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(VerizonUpgradeHeaders.headers_265))
          .exec(
              http("#270").options(Common.uri_dsom_no_port + "/dsom-app/v1/getAddOnOptions").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#276").post(Common.uri_dsom_no_port + "/dsom-app/v1/getAddOnOptions").headers(VerizonUpgradeHeaders.headers_276).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0276_request.json"))
                .resources(
                    http("#266").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(VerizonUpgradeHeaders.headers_266),
                    http("#267").get(Common.uri_ui + "/app/pages/addons/device.html").headers(VerizonUpgradeHeaders.headers_267),
                    http("#268").get(Common.uri_ui + "/app/components/showhide/showhide.html").headers(VerizonUpgradeHeaders.headers_268),
                    http("#269").get(Common.uri_ui + "/app/components/productoptions/partials/productchoices.html").headers(VerizonUpgradeHeaders.headers_269),
                    http("#271").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(VerizonUpgradeHeaders.headers_19),
                    http("#272").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(VerizonUpgradeHeaders.headers_10),
                    http("#273").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#274").get(Common.uri_ui + "/app/components/contempiler/config.json").headers(VerizonUpgradeHeaders.headers_274),
                    http("#275").get(Common.uri_ui + "/app/components/contempiler/contempiler.html").headers(VerizonUpgradeHeaders.headers_275),
                    http("#277").get(Common.uri_ui + "/app/components/contempiler/contemloader.html").headers(VerizonUpgradeHeaders.headers_277),
                    http("#278").get(Common.uri_ui + "/app/components/selectioninputs/partials/choices.html").headers(VerizonUpgradeHeaders.headers_278),
                    http("#279").get(Common.uri_ui + "/app/components/contempiler/sets/blurb/squaretrade.json").headers(VerizonUpgradeHeaders.headers_279),
                    http("#280").get(Common.uri_ui + "/app/components/contempiler/sets/blurb/default.html").headers(VerizonUpgradeHeaders.headers_280),
                    http("#281").get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#282").get(Common.uri_ui + "/assets/img/squaretrade_logo_325x160.png").headers(VerizonUpgradeHeaders.headers_5)))
    }

    val DeviceOptionsToOrderConfirm = group("DeviceOpt->OrderConfirm") {
        exec(
            http("#283").options(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(VerizonUpgradeHeaders.headers_40))
          .exec(
              http("#284").post(Common.uri_dsom_no_port + "/session/dsom/v1/cart/item").headers(VerizonUpgradeHeaders.headers_284).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0284_request.json")))
          .exec(
              http("#285").options(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#286").post(Common.uri_dsom_no_port + "/dsom-app/v1/getNextState").headers(VerizonUpgradeHeaders.headers_286).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0286_request.json")))
          .exec(
              http("#287").get("/retail/orderassembly/controller/process.php").headers(VerizonUpgradeHeaders.headers_2))
          .exec(
              http("#288").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52)
                .resources(
                    http("#289").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#290").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#291").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#292").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#293").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#294").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#295").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#296").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#297").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#298").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#299").get("/js/printfunctions.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#300").get("/js/retail/orderconfirm.js?antiCacheStr=bb6cbd38d678c79bf3edc67fc56b5325").headers(VerizonUpgradeHeaders.headers_3),
                    http("#301").get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_thumb.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#302").get("/img/retail/corps/plLgs660.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#303").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                    http("#304").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#305").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#306").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#307").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#308").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#309").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#310").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#311").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#312").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#313").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#314").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522199571").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val OrderConfirmToTermsAndConditions = group("OrderConfirm->T&C") {
        exec(
            http("#315").get("/retail/checkout/termsconditions.htm").headers(VerizonUpgradeHeaders.headers_2))
          .exec(
              http("#316").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52)
                .resources(
                    http("#317").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#318").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#319").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#320").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#321").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#322").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#323").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#324").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#325").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#326").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#327").get("/js/printfunctions.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#328").get("/js/retail/tandc_sigweb.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#329").get("/jslibs/signature/SigWebTablet.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#330").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                    http("#331").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#332").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#333").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#334").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#335").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#336").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#337").get("/img/retail/icons-18-white.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#338").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#339").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#340").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#341").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#342").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522231439").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val TermsAndConditionsToMSS = group("T&C->MSS") {
        exec(
            http("#343").post("/retail/checkout/termsconditions.htm").headers(VerizonUpgradeHeaders.headers_80)
              .formParam("acceptGcTermsConditions", "")
              .formParam("termsConditions[lt]", "Y"))
          .exec(
              http("#344").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52)
                .resources(
                    http("#345").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#346").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#347").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#348").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#349").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#350").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#351").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#352").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#353").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#354").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#355").get("/js/printfunctions.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#356").get("/img/brands/target/retail/printed-logo.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#357").get("/barcode.htm?code=15/25504056500799990000001890&width=360&height=90&type=C128B&font=1").headers(VerizonUpgradeHeaders.headers_5),
                    http("#358").get("/barcode.htm?code=9881257290052308&height=90&type=C128B&font=1").headers(VerizonUpgradeHeaders.headers_5),
                    http("#359").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                    http("#360").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#361").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#362").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#363").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#364").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#365").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#366").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#367").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#368").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#369").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522278873").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val MSSToScanReceipt = group("MSS->ScanReceipt") {
        exec(
            http("#370").get("/retail/controller/saleassocflowcontroller.php?activate=1").headers(VerizonUpgradeHeaders.headers_2)
              .resources(
                  http("#371").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52),
                  http("#372").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                  http("#373").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#374").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#375").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#376").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#377").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#378").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#379").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#380").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#381").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#382").get("/js/retail/receiptscan.js").headers(VerizonUpgradeHeaders.headers_3),
                  http("#383").get("/img/brands/target/retail/tooltips/receipt.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#384").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                  http("#385").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#386").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#387").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#388").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#389").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#390").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#391").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#392").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#393").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#394").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522345174").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val ScanReceiptToActivationScan = group("ScanReceipt->ActScan") {
        exec(
            http("#395").post("/ajax/retail/fakereceipt.php").headers(VerizonUpgradeHeaders.headers_395))
          .exec(
              http("#396").post("/retail/receiptscan.htm").headers(VerizonUpgradeHeaders.headers_80)
                .check(regex("#(.+?)</h3>").saveAs("p_orderid"))
                .formParam("receiptId", "171548474701257062")
                .resources(
                    http("#397").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52),
                    http("#398").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#399").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#400").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#401").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#402").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#403").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#404").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#405").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#406").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#407").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#408").get("/js/retail/activationqc.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#409").get("/img/retail/tooltips/imei-outsidebox.jpg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#410").get("/img/retail/tooltips/esn-outsidebox.jpg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#411").get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#412").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                    http("#413").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#414").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#415").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#416").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#417").get("/img/retail/icons-18-white.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#418").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#419").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#420").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#421").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#422").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#423").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522394062").headers(VerizonUpgradeHeaders.headers_79)))
    }

    val ActivationScanToWirelessCustomerAgreement = group("ActScan->WCA") {
        exec(
            http("#424").post("/retail/checkout/activationscan.htm").headers(VerizonUpgradeHeaders.headers_80)
              .formParam("serial", "")
              .formParam("device[99000088304056]", "Y")
              .formParam("deviceScanInfo[${p_orderid}_42252_1_1][sim]", "12345678901234567890")
              .formParam("isRequiredSIMvalidation", "0")
              .resources(
                  http("#425").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52),
                  http("#426").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                  http("#427").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#428").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#429").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#430").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#431").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#432").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                  http("#433").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#434").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#435").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                  http("#436").get("/img/brands/target/retail/ajax-loader-l.gif").headers(VerizonUpgradeHeaders.headers_5),
                  http("#437").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5),
                  http("#438").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#439").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#440").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#441").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#442").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#443").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#444").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#445").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#446").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                  http("#447").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522434854").headers(VerizonUpgradeHeaders.headers_79),
                  http("#448").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1508522435032&storeId=0003").headers(VerizonUpgradeHeaders.headers_79))
        )
          .exec(
              http("#449").get("/retail/controller/saleassocflowcontroller.php?parking=1").headers(VerizonUpgradeHeaders.headers_2)
                .resources(
                    http("#450").get("/retail/public/styles/normalize.php").headers(VerizonUpgradeHeaders.headers_52),
                    http("#451").get("/jslibs/jquery.php?ver=1.8.2").headers(VerizonUpgradeHeaders.headers_3),
                    http("#452").get("/jslibs/modernizr.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#453").get("/jslibs/jquerymobile.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#454").get("/template/public/styles/new.main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#455").get("/template/css/semantic.jqmsafe.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#456").get("/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#457").get("/js/retail/topnav.php").headers(VerizonUpgradeHeaders.headers_3),
                    http("#458").get("/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#459").get("/brands/target/retail/public/styles/jquery.mobile-1.2.0.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#460").get("/brands/target/retail/public/styles/main.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#461").get("/img/brands/target/retail/ajax-loader-l.gif").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#462").get("/img/retail/ajax-loader.gif").headers(VerizonUpgradeHeaders.headers_5)
                .resources(
                    http("#463").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#464").get("/retail/public/img/alertsprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#465").get("/retail/public/img/reservesprite.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#466").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#467").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#468").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#469").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#470").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#471").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#472").get("/js/retail/getactivealerts.php?reqType=getactivealerts&cacheVar=1508522440173").headers(VerizonUpgradeHeaders.headers_79),
                    http("#473").get("/js/retail/getnotifications.php?reqType=getreservationcount&cacheVar=1508522440365&storeId=0003").headers(VerizonUpgradeHeaders.headers_79)))
          .exec(
              http("#474").get("/retail/controller/saleassocflowcontroller.php?parking=1").headers(VerizonUpgradeHeaders.headers_2)
                .resources(
                    http("#475").get("/retail/ng/POA/styles.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#476").get("/retail/ng/POA/ngPOA.semantic.min.css").headers(VerizonUpgradeHeaders.headers_52),
                    http("#477").get("/retail/ng/POA/bower/jquery/dist/jquery.min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#478").get("/retail/ng/POA/bower/semantic/dist/semantic.min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#479").get("/retail/ng/POA/assets/js/sigPlusWeb.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#480").get("/retail/ng/POA/vendor.bundle.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#481").get("/retail/ng/POA/bundle.js").headers(VerizonUpgradeHeaders.headers_3)))
          .exec(
              http("#482").get("/retail/ng/POA/config.json").headers(VerizonUpgradeHeaders.headers_7)
                .resources(
                    http("#483").post("/webservices/external/poa_rest/index.php/sales/v1/order").headers(VerizonUpgradeHeaders.headers_483).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0483_request.json")),
                    http("#484").get("/img/brands/target/retail/logo-mini.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#485").get("/img/retail/cart.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#486").get("/img/retail/setting.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#487").get("/img/retail/faqs.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#488").get("/img/retail/logout.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#489").get("/img/retail/inventory-management.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#490").get("/img/retail/customer-lookup.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#491").get("/img/retail/save.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#492").get("/img/retail/home.png").headers(VerizonUpgradeHeaders.headers_5),
                    http("#493").get("/img/retail/lock.png").headers(VerizonUpgradeHeaders.headers_5)))
    }

    val WirelessCustomerAgreementToDeviceFinancingInstallmentContract = group("WCA->FinanceContract") {
        exec(
            http("#494").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}").headers(VerizonUpgradeHeaders.headers_494)
              .resources(
                  http("#495").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/contracts").headers(VerizonUpgradeHeaders.headers_495)))
          .exec(
              http("#496").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status").headers(VerizonUpgradeHeaders.headers_496))
          .exec(
              http("#497").get("/legacy/v1/index.php/strings?pageTags=%5B%22WCAGR%22%5D").headers(VerizonUpgradeHeaders.headers_497))
    }

    val DeviceFinancingInstallmentContractToOrderSummary = group("FinanceContract->AddOnPayment") {
        exec(
            http("#498").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8d1921a78153fc3a&code=wca&page=1")
              .headers(VerizonUpgradeHeaders.headers_5)
              .resources(
                  http("#499").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8d1921a78153fc3a&code=wca&page=2").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#500").get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLTC%22%5D").headers(VerizonUpgradeHeaders.headers_500)
                .resources(
                    http("#501").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/productimage").headers(VerizonUpgradeHeaders.headers_501)))
          .exec(
              http("#502").get("/img/prod/cell-phones/verizonwireless/samsung/samsung-galaxy-s7-edge-black_front_med.png").headers(VerizonUpgradeHeaders.headers_5)
                .resources(
                    http("#503").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8d1921a78153fc3a&code=finance&page=1&ordiIndex=1").headers(VerizonUpgradeHeaders.headers_5),
                    http("#504").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8d1921a78153fc3a&code=finance&page=2&ordiIndex=1").headers(VerizonUpgradeHeaders.headers_5),
                    http("#505").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8d1921a78153fc3a&code=finance&page=3&ordiIndex=1").headers(VerizonUpgradeHeaders.headers_5),
                    http("#506").get("/webservices/external/poa_rest/poa_rest_stream.php?ordId=8d1921a78153fc3a&code=finance&page=4&ordiIndex=1").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#507").get("/legacy/v1/index.php/strings?pageTags=%5B%22RTLRC%22%5D").headers(VerizonUpgradeHeaders.headers_507))
          .exec(
              http("#508").post("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/signatures").headers(VerizonUpgradeHeaders.headers_508).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0508_request.json"))
                .resources(
                    http("#509").get("/img/brands/target/retail/printed-logo.png").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#510").get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status").headers(VerizonUpgradeHeaders.headers_510)
                .resources(
                    http("#511").get(Common.uri_ui + "/").headers(VerizonUpgradeHeaders.headers_2)))
          .exec(
              http("#512").get(Common.uri_ui + "/build/bundle_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3)
                .resources(
                    http("#513").get(Common.uri_ui + "/build/css_a575200e0eb7d10c68d1_min.js").headers(VerizonUpgradeHeaders.headers_3),
                    http("#514").get(Common.uri_ui + "/assets/img/cloader.gif").headers(VerizonUpgradeHeaders.headers_5)))
          .exec(
              http("#515").get(Common.uri_google + "?family=Lato:400,700,400italic,700italic&subset=latin").headers(VerizonUpgradeHeaders.headers_6))
          .exec(
              http("#516").get(Common.uri_ui + "/config.json").headers(VerizonUpgradeHeaders.headers_7))
          .exec(
              http("#517").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#518").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#519").get(Common.uri_ui + "/build/ch_e87f4acfabb2708fcad9_min.js").headers(VerizonUpgradeHeaders.headers_3))
          .exec(
              http("#520").options(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_0))
          .exec(
              http("#521").get(Common.uri_gstatic + "/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2").headers(VerizonUpgradeHeaders.headers_10))
          .exec(
              http("#522").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_522).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0522_request.json")))
          .exec(
              http("#523").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_523).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0523_request.json")))
          .exec(
              http("#524").post(Common.uri_dsom_no_port + "/dsom-app/v1/getContentForAisle").headers(VerizonUpgradeHeaders.headers_524).body(ElFileBody("Verizon/Upgrade/VerizonUpgrade_0524_request.json")))
          .exec(
              http("#525").get(Common.uri_ui + "/app/pages/frame/header/header.html").headers(VerizonUpgradeHeaders.headers_525)
                .resources(
                    http("#526").get(Common.uri_ui + "/app/pages/frame/footer/footer.html").headers(VerizonUpgradeHeaders.headers_526),
                    http("#527").get(Common.uri_ui + "/app/pages/addonpayment/addonpayment.html").headers(VerizonUpgradeHeaders.headers_527),
                    http("#528").get(Common.uri_gstatic + "/MgNNr5y1C_tIEuLEmicLmwLUuEpTyoUstqEm5AMlJo4.woff2").headers(VerizonUpgradeHeaders.headers_10),
                    http("#529").get(Common.uri_ui + "/build/font_af7ae505a9eed503f8b8e6982036873e.woff2").headers(VerizonUpgradeHeaders.headers_19),
                    http("#530").get(Common.uri_ui + "/assets/img/bullseye.svg").headers(VerizonUpgradeHeaders.headers_5),
                    http("#531").get("/img/brands/target/retail/EMV-machine.png").headers(VerizonUpgradeHeaders.headers_5)))
    }

  val TabulateResults = group("Results"){
    exec(http("Shipped Orders")
      .get("/webservices/external/poa_rest/index.php/sales/v1/order/${p_orderid}/status")
      .check(substring("INSURANCE_ACTIVATION_NEEDED"))
      .headers(CommonHeaders.status_call))
  }
}
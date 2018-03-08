@echo off
set TGTVNA=%1
set TGTSNA=%2
set TGTTNA=%3
set TGTVUG=%4
set TGTSUG=%5
set TGTTUG=%6
set TGTVAL=%7
set TGTSAL=%8
set TGTTAL=%9
shift
set SOHOSNA=%9
shift
set SOHOSUG=%9
shift
set SOHOSAL=%9
shift
set RAMP=%9
shift
set ITERATIONS=%9
shift
set USERFILESLOCATION=%9

echo ******************************************
echo ******************************************
echo ***
echo ***   TGT   Verizon  NA   Users:...%TGTVNA%
echo ***   TGT   Sprint   NA   Users:...%TGTSNA%
echo ***   TGT   ATT      NA   Users:...%TGTTNA%
echo ***
echo ***   TGT   Verizon  UPG  Users:...%TGTVUG%
echo ***   TGT   Sprint   UPG  Users:...%TGTSUG%
echo ***   TGT   ATT      UPG  Users:...%TGTTUG%
echo ***
echo ***   TGT   Verizon  AAL  Users:...%TGTVAL%
echo ***   TGT   Sprint   AAL  Users:...%TGTSAL%
echo ***   TGT   ATT      AAL  Users:...%TGTTAL%
echo ***
echo ***   SOHO  Verizon  NA   Users:...%SOHOSNA%
echo ***   SOHO  Sprint   UPG  Users:...%SOHOSUG%
echo ***   SOHO  ATT      AAL  Users:...%SOHOSAL%
echo ***
echo ***   Iterations:..................%ITERATIONS%
echo ***   Ramp:........................%RAMP%
echo ***
echo ******************************************
echo ******************************************


set gatling.http.ssl.keyStore.type=PKCS12
set gatling.http.ssl.keyStore.file=%USERFILESLOCATION%\user-files\simulations\Jenkins\gatling.p12
set gatling.http.ssl.keyStore.password=changeit
set GATLING_DATA=%USERFILESLOCATION%\user-files\bodies

c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf %USERFILESLOCATION%\user-files\simulations -bdf %USERFILESLOCATION%\user-files\bodies -bf %USERFILESLOCATION%\binaries -on VZW_%VNAUSERS%_%ITERATIONS%_Iterations -s Jenkins.ModularTest

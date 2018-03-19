@echo off
set TGTCR=%1
set TGTVNA=%2
set TGTSNA=%3
set TGTTNA=%4
set TGTVUG=%5
set TGTSUG=%6
set TGTTUG=%7
set TGTVAL=%8
set TGTSAL=%9
shift
set TGTTAL=%9
shift
set SOHOCR=%9
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
echo ***   TGT   CR Setup...............%TGTCR%
echo ***
echo ***   TGT   Verizon  NA   Users....%TGTVNA%
echo ***   TGT   Sprint   NA   Users....%TGTSNA%
echo ***   TGT   ATT      NA   Users....%TGTTNA%
echo ***
echo ***   TGT   Verizon  UPG  Users....%TGTVUG%
echo ***   TGT   Sprint   UPG  Users....%TGTSUG%
echo ***   TGT   ATT      UPG  Users....%TGTTUG%
echo ***
echo ***   TGT   Verizon  AAL  Users....%TGTVAL%
echo ***   TGT   Sprint   AAL  Users....%TGTSAL%
echo ***   TGT   ATT      AAL  Users....%TGTTAL%
echo ***
echo ***   SOHO  CR Setup...............%SOHOCR%
echo ***
echo ***   SOHO  Verizon  NA   Users....%SOHOSNA%
echo ***   SOHO  Sprint   UPG  Users....%SOHOSUG%
echo ***   SOHO  ATT      AAL  Users....%SOHOSAL%
echo ***
echo ***   Ramp:........................%RAMP%
echo ***
echo ***   Iterations:..................%ITERATIONS%
echo ***
echo ******************************************
echo ******************************************

set GATLING_DATA=%USERFILESLOCATION%\user-files\bodies

c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf %USERFILESLOCATION%\user-files\simulations -bdf %USERFILESLOCATION%\user-files\bodies -bf %USERFILESLOCATION%\binaries -on VZW_%VNAUSERS%_%ITERATIONS%_Iterations -s Jenkins.ModularTest

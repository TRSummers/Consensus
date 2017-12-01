@REM set [/p] <Variable>=[<PromptString>]
@echo off

rem set VNAUSERS=%1
rem set SNAUSERS=%2
rem set TNAUSERS=%3

rem set VUGUSERS=%4
rem set SUGUSERS=%5
rem set TUGUSERS=%6

rem set VALUSERS=%7
rem set SALUSERS=%8
rem set TALUSERS=%9

rem shift
rem set RAMP=%9
rem shift
rem set ITERATIONS=%9
rem shift
set USERFILESLOCATION=%1

:passiton
cls
echo *****************************************
echo *****************************************
echo ***                                                
echo ***   Setting All expectations
echo ***                                               
echo *****************************************
echo *****************************************

set GATLING_DATA=%USERFILESLOCATION%\user-files\bodies
c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf %USERFILESLOCATION%\user-files\simulations -bdf %USERFILESLOCATION%\user-files\bodies -bf %USERFILESLOCATION%\binaries -on VZW_%VNAUSERS%_%ITERATIONS%_Iterations -s AllCRSetupSim




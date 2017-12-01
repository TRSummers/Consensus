@REM set [/p] <Variable>=[<PromptString>]
@echo off

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
c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf %USERFILESLOCATION%\user-files\simulations -bdf %USERFILESLOCATION%\user-files\bodies -bf %USERFILESLOCATION%\binaries -s AllCRSetupSim




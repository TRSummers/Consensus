@REM set [/p] <Variable>=[<PromptString>]
@echo off
set VNAUSERS=%1
set SNAUSERS=%2
set TNAUSERS=%3
set VUGUSERS=%4
set SUGUSERS=%5
set TUGUSERS=%6
set VALUSERS=%7
set SALUSERS=%8
set TALUSERS=%9
shift
set RAMP=%9
shift
set ITERATIONS=%9
shift
set USERFILESLOCATION=%9
rem set BUYTYPE1=%7
rem if "%9%" == "A" goto setbuytype3
rem if "%9%" == "N" goto setbuytype3
rem if "%9%" == "U" goto setbuytype3
rem if "%8%" == "A" goto setbuytype2
rem if "%8%" == "N" goto setbuytype2
rem if "%8%" == "U" goto setbuytype2
:setbuytype2
set BUYTYPE1=%7
set BUYTYPE2=%8
rem set CARRIER1=%8
rem set CARRIER2=%9
rem shift
rem set CARRIER3=%9
goto passiton
:setbuytype3
echo setbuytype3
set BUYTYPE1=%7
set BUYTYPE2=%8
set BUYTYPE3=%9
goto passiton
:passiton
cls
echo *****************************************
echo *****************************************
echo ***
echo ***   Verizon New Activation Uses:...%VNAUSERS%
echo ***   Sprint New Activation Users:...%SNAUSERS%
echo ***   ATT New Activation Users:......%TNAUSERS%
echo ***
echo ***   Verizon Upgrade Users:.........%VUGUSERS%
echo ***   Sprint Upgrade Users:..........%SUGUSERS%
echo ***   ATT Upgrade Users:.............%TUGUSERS%
echo ***
echo ***   Verizon Add a Line:............%VALUSERS%
echo ***   Sprint Add a Line:.............%SALUSERS%
echo ***   ATT Add a Line:................%TALUSERS%
echo ***
echo ***   iterations:....................%ITERATIONS%
echo ***   ramp:..........................%RAMP%
echo ***
echo *****************************************
echo *****************************************
rem echo c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf %USERFILESLOCATION%\user-files\simulations -bdf %USERFILESLOCATION%\user-files\bodies -s %SIMULATION% -rd %SIMULATION% -on d:/results/%SIMULATION%_%USERS%_%ITERATIONS% -bf %USERFILESLOCATION%\binaries
rem c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf %USERFILESLOCATION%\user-files\simulations -bdf %USERFILESLOCATION%\user-files\bodies -s %SIMULATION% -rd %SIMULATION% -on d:/results/%SIMULATION%_%USERS% -bf %USERFILESLOCATION%\binaries
rem Uday's CL c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf c:\Users\Administrator\git\Gatling-POA\user-files\simulations -bdf c:\Users\Administrator\git\Gatling-POA\user-files\bodies -s End_to_End_Scenario
set GATLING_DATA=%USERFILESLOCATION%\user-files\bodies
c:/gatling/gatling-charts-highcharts-bundle-2.2.3/bin/gatling.bat -sf %USERFILESLOCATION%\user-files\simulations -bdf %USERFILESLOCATION%\user-files\bodies -bf %USERFILESLOCATION%\binaries -on VZW_%VNAUSERS%_%ITERATIONS%_Iterations -s ModularTest
GOTO End1
@ECHO OFF
@cls
echo ****************************************
echo ****************************************
@echo.
set /p USERS="Number of users (Default is 10): "
set /p RAMP="Ramp up time in seconds (Default is 100): "
echo Enter the carriers for the simulation (Default is Verizon)
echo Enter any combination of "V", "S" and "T" that you need.
echo  Verizon - V
echo  Sprint  - S
echo  Att     - T
echo.
set /p CARRIER="Enter the carrier(s) here: "
@echo.
rem setx USERS "%u1%"
rem setx RAMP "%r1%"
rem setx CARRIER "%c1%"
rem[Environment]::SetEnvironmentVariable("USERS", "7", "User")
rem cmd.exe set USERS=%u%
@rem Powershell -NoExit -Command "$env:USERS=16"
rem $env:RAMP=%r%
echo Running with the following
echo Users = %USERS%
echo Ramp up time = %RAMP%
echo Carrier = %CARRIER%
echo.
rem $env:CARRIER = Q
powershell.exe
REM gatling.bat
:End1
echo.
echo Seven ain't heaven, It's ONE.
echo Buh-bye!
echo.
echo.
:End2
echo.
echo Seven ain't heaven, It's TWO.
echo Buh-bye!
echo.
:End3
echo.
echo Seven ain't heaven, It's THREE.
echo Buh-bye!
echo.
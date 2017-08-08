@echo on


setlocal


for /f "tokens=3" %%g in ('java -version 2^>^&1 ^| findstr /i "version"') do (
    rem @echo Debug Output: %%g
    set JAVAVER=%%g
)

set JAVAVER=%JAVAVER:"=%
for /f "delims=. tokens=1-3" %%v in ("%JAVAVER%") do (
    set current_minor=%%w
)

for /f "delims=. tokens=1-3" %%v in ("%MINIMAL_VERSION%") do (
    set minimal_minor=%%w
)


rem @echo Debug: CURRENT=%current_minor% 

if .%JM_LAUNCH% == . set JM_LAUNCH=java.exe



:winNT1
rem On NT/2K grab all arguments at once
set JMETER_CMD_LINE_ARGS=%*

rem The following link describes the -XX options:
rem http://www.oracle.com/technetwork/java/javase/tech/vmoptions-jsp-140102.html
rem http://java.sun.com/developer/TechTips/2000/tt1222.html has some more descriptions
rem Unfortunately TechTips no longer seem to be available

rem See the unix startup file for the rationale of the following parameters,
rem including some tuning recommendations
set HEAP=-Xms1024m -Xmx1536m
set NEW=-XX:NewSize=128m -XX:MaxNewSize=128m
set SURVIVOR=-XX:SurvivorRatio=8 -XX:TargetSurvivorRatio=50%
set TENURING=-XX:MaxTenuringThreshold=2
rem Java 8 remove Permanent generation, don't settings the PermSize
if %current_minor% LEQ "8" (
    rem Increase MaxPermSize if you use a lot of Javascript in your Test Plan :
    set PERM=-XX:PermSize=64m -XX:MaxPermSize=128m
)

set CLASS_UNLOAD=-XX:+CMSClassUnloadingEnabled
rem set DEBUG=-verbose:gc -XX:+PrintTenuringDistribution

rem Always dump on OOM (does not cost anything unless triggered)
set DUMP=-XX:+HeapDumpOnOutOfMemoryError

rem Additional settings that might help improve GUI performance on some platforms
rem See: http://java.sun.com/products/java-media/2D/perf_graphics.html

set DDRAW=
rem  Setting this flag to true turns off DirectDraw usage, which sometimes helps to get rid of a lot of rendering problems on Win32.
rem set DDRAW=%DDRAW% -Dsun.java2d.noddraw=true

rem  Setting this flag to false turns off DirectDraw offscreen surfaces acceleration by forcing all createVolatileImage calls to become createImage calls, and disables hidden acceleration performed on surfaces created with createImage .
rem set DDRAW=%DDRAW% -Dsun.java2d.ddoffscreen=false

rem Setting this flag to true enables hardware-accelerated scaling.
rem set DDRAW=%DDRAW% -Dsun.java2d.ddscale=true

rem Server mode
rem Collect the settings defined above
set ARGS=%DUMP% %HEAP% %NEW% %SURVIVOR% %TENURING% %PERM% %CLASS_UNLOAD% %DDRAW%

set JENKINS_MASTER="http://jenkins.consensuscorpdev.com:8080/computer/jmeter-win2/slave-agent.jnlp"
set JENKINS_KEY="cdcafe2606960ca191cbc47acec4a32181746451d486a486c56eb8b86a3b33dd"

cd /jenkins

%JM_START% %JM_LAUNCH% -jar "slave.jar" -jnlpUrl %JENKINS_MASTER% -secret %JENKINS_KEY%


rem If the errorlevel is not zero, then display it and pause

if NOT errorlevel 0 goto pause
if errorlevel 1 goto pause

goto end

:pause
echo errorlevel=%ERRORLEVEL%
pause

:end


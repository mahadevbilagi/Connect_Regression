set projectLocation=D:\WORK\CitrixPOM
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Annotaions_testng.xml
pause
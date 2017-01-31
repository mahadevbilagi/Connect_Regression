set projectLocation=C:\Users\mahadev\git\Connect_Regression\Connect_Regression
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\regression_testng.xml
pause
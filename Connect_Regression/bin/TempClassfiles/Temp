/*package Connect.General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Connect.PageFactory.LoginPage;
import Connect.PageFactory.LogoutPage;

public class ConnectBaseSetup {
	
	protected WebDriver driver;
	static String driverPath ="D:\\WORK\\CitrixPOM\\";
	
	protected String baseUrl;
	protected LoginPage loginPage;
	protected LogoutPage logoutPage;

	
	public WebDriver getDriver(){
		return driver;
		
	}
	
	private void setDriver(String browserType, String appURL){
		
		switch(browserType){
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
			
		default:
			System.out.println("Broser : "+ browserType + "is Invalid, Launching Firefox as browser .." );
			driver = initFirefoxDriver(appURL);
			
		}
		
	}

	private WebDriver initFirefoxDriver(String appURL) {
		// TODO Auto-generated method stub
		System.out.println("Launching google chrome with new profile");
		System.setProperty("webdriver.chrome.driver",driverPath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private WebDriver initChromeDriver(String appURL) {
		// TODO Auto-generated method stub
		System.out.println("Launching Firefox Browser ..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	
	
	@Parameters({"browserType" , "appURL"})
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL){
		try{
			setDriver(browserType,appURL);
		} catch(Exception e) {
			System.out.println("Error" + e.getStackTrace());
		}
	}
	
	@AfterClass
	public void teaDown(){
		driver.quit();
	}
	
	
	
}*/
package base;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import objectRepo.BlogAssignment;
import objectRepo.LoginPage;
import objectRepo.LogoutPage;
import objectRepo.Selectsection;
import objectRepo.SpeechAssignment;
import objectRepo.WebActivityAssignment;
import objectRepo.WritingAssignment;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import sun.rmi.runtime.Log;
import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })
public class ConnectBaseSetup {	
	
			public static WebDriver driver;	
			
			protected String Dev2URL = "https://connectdev2.mheducation.com/connect/shortUrl.do";
			protected String QaStgURL = "https://connectqastg.mheducation.com/connect/shortUrl.do";
			protected String QaLiveURL = "https://connectqalv.mheducation.com/connect/shortUrl.do";
			
			protected static String Dev2SectionURL = "http://connectdev2.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=241484236";			
			protected static String QaStgSectionURL = "http://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515805475";
			
			{
				System.setProperty("atu.reporter.config", "C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\ATUPropertyfile\\atu.properties");
			}
			
			public LoginPage loginPage;
			public LogoutPage logoutPage;
			public Selectsection selectsection;
			public BlogAssignment BlogCreate;
			public WritingAssignment WriteCreate;
			public SpeechAssignment SpeechCreate;
			public WebActivityAssignment WebActivityCreate;
			
			public static Logger Log = Logger.getLogger(Log.class.getName(), null);
		//	public static org.apache.log4j.Logger Log = LogManager.getLogger(Log.class.getName());			
		//  static final Logger logger = LogManager.getLogger(Bar.class.getName());
	
		
			@BeforeMethod
			public void LaunchBrowserwithURL()
			{
				DOMConfigurator.configure("log4j.xml"); 
				
				System.setProperty("webdriver.gecko.driver","C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\geckodriver.exe");     // Gecko driver path setup					
				System.setProperty("webdriver.chrome.driver","C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\chromedriver.exe"); 	// Chrome driver path setup	
				
				/*driver = new FirefoxDriver();
				Log.info("Welcome Firefox browser!");		
				waitforApge();*/
								
				driver = new ChromeDriver();			
				Log.info("Welcome Chrome browser!");		
				waitforApge();
				
				driver.manage().deleteAllCookies();
				
		//		driver.get(Dev2URL);
				
				try{
				driver.get(QaStgURL);
				}catch(Exception e){
					e.printStackTrace();
				}
				
				
		//		driver.get(QaLiveURL);
				
				// ATU Reports
				ATUReports.setWebDriver(driver);
				ATUReports.indexPageDescription = "MGHConnect_Test Project";			
				
				loginPage = PageFactory.initElements(driver, LoginPage.class);
				logoutPage = PageFactory.initElements(driver, LogoutPage.class);	
				selectsection = PageFactory.initElements(driver, Selectsection.class);
				BlogCreate = PageFactory.initElements(driver, BlogAssignment.class);
				WriteCreate = PageFactory.initElements(driver, WritingAssignment.class);
				SpeechCreate= PageFactory.initElements(driver, SpeechAssignment.class);
				WebActivityCreate= PageFactory.initElements(driver, WebActivityAssignment.class);
						
			}					

			@AfterMethod
			public void CloseBrowser()
			{
					if(driver!=null) {
			//		driver.close();					
					driver.quit();
				}				
				Log.info("Closing the Firefox!");
			}
			
			// ATU Reports Method			
			public void testNewLogs() throws AWTException, IOException {
		 
				ATUReports.add("INfo Step", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				ATUReports.add("Pass Step", LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
				WebElement element = driver.findElement(By.xpath("/html/body/div/h1/a"));
				ATUReports.add("Warning Step", LogAs.WARNING,new CaptureScreen(element));
				ATUReports.add("Fail step", LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
			}
			
			public static void waitforApge()
			{
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
			}	
	
}
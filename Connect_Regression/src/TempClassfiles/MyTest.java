package TempClassfiles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyTest  {

	private static final String currentWindowHandle = null;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\geckodriver.exe");     // Gecko driver path setup	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\chromedriver.exe"); 	// Chrome driver path setup	
		driver = new ChromeDriver();	
		driver.manage().deleteAllCookies();	
		
		System.out.println("started hi");	
		driver.manage().window().maximize();

		driver.get("http://connectqastg.mheducation.com/connect/shortUrl.do");         						//  Environment: Dev2			
		//			        driver.get("http://connectqastg.mheducation.com/connect/shortUrl.do");         //  Environment: QA Staging Cloud 
		//					driver.get("http://connectqalv.mheducation.com/connect/shortUrl.do");         //  Environment: QA Live Cloud

		driver.findElement(By.id("userName")).click();
		driver.findElement(By.id("userName")).sendKeys("rahul_stgins01@gmail.com");

		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Aa123456");
		
		System.out.println("started hi 1");
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//input[contains(@value,'Sign in')]")).click();
		Thread.sleep(1000);					


		for(int j=1; j<=100; j++)
		{

			Thread.sleep(1000);
			driver.navigate().to("http://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515807808");     
			Thread.sleep(1000);	

			java.lang.String Assignmentname =("Web Activity -" +j);
			
			System.out.println("started hi 2");										

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[@id='tabassign_2']/a")).click();
			Thread.sleep(1000);
			
			// ----------------------------------------------------------------------------
			
			Actions action = new Actions(driver);
			WebElement ABC = driver.findElement(By.id("facebox_overlay"));
			action.moveToElement(ABC).moveToElement(driver.findElement(By.id("facebox_overlay"))).sendKeys(Keys.ESCAPE).perform();
	     	//	action.sendKeys(Keys.ESCAPE).perform();
			
			Thread.sleep(500);
			driver.findElement(By.xpath("//a[@class='btn-typ-two']")).click();				
			
			// -----------------------------------------------------------------------------
			driver.findElement(By.xpath("//a[contains(.,'web activity')]")).click();
			Thread.sleep(1000);

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.id("assignmentTitle")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.id("assignmentTitle")).sendKeys(Assignmentname);

			driver.findElement(By.id("note")).click();
			driver.findElement(By.id("note")).sendKeys("Web-Assignment");

			driver.findElement(By.id("webLinkName")).click();
			driver.findElement(By.id("webLinkName")).sendKeys("Selenium-Wiki-info-Link");

			driver.findElement(By.id("webLinkURL")).click();
			Thread.sleep(300);
			driver.findElement(By.id("webLinkURL")).clear();
			driver.findElement(By.id("webLinkURL")).clear();
			Thread.sleep(200);
			driver.findElement(By.id("webLinkURL")).sendKeys("http://en.wikipedia.org/wiki/Selenium");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//span [@class='buttons btbl']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//li [@class='assign-blue-btn_cntr buttons btbl' and text()='assign']")).click();

			System.out.println(" Web activity assignment created successfylly for : "+j);

			Thread.sleep(2000);
			//	driver.findElement(By.xpath("//a[contains(.,'Sign out')]")).click();         // from Course list page
			//	driver.findElement(By.xpath("//a[contains(.,'Sign out')]")).click();		 // from SHP page
			Thread.sleep(1000);

		}

	}

}


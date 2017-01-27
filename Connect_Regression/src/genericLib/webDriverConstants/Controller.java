package genericLib.webDriverConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Controller 
{
	public static WebDriver driver;
	
	public static WebDriver getBrowser() throws InterruptedException
	{
		if(Constants.browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\BrowserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (Constants.browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else
		{
			System.setProperty("webdriver.gecko.driver", "F:\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			Thread.sleep(1000);
		}
		
		return driver;
	}
	
	public static WebDriver closeBrowser()
	{
		driver.quit();
		return driver;
	}

}
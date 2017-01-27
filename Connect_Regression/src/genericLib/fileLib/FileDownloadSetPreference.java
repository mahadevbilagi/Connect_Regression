package genericLib.fileLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadSetPreference {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\geckodriver.exe");     // Gecko driver path setup
		
		FirefoxProfile p = new FirefoxProfile();
		p.setPreference("browser.download.folderList", 2);
		p.setPreference("browser.helperapps.neverask.savetodisk", "application/zip");
		p.setPreference("browser.download.dir" , "D:\\Files\\");
		
		WebDriver driver = new FirefoxDriver(p);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
				
	}

}

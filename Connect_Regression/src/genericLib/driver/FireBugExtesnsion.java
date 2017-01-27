package genericLib.driver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FireBugExtesnsion {
	
	public static void main(String[] args){
		
		WebDriver driver;
		
		FirefoxProfile p = new FirefoxProfile();
		
		File f = new File("C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\Firefox Setup Stub 51.0.1.exe");
		
		p.addExtension(f);		
		p.setPreference("extensions.firebug.currentversion", "2.0.18");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\resources\\geckodriver.exe");     // Gecko driver path setup
		
		driver = new FirefoxDriver(p);		
		driver.get("https://google.com");
		
	}

}

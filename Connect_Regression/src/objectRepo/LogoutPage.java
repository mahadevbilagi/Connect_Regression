package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ConnectBaseSetup;

public class LogoutPage extends ConnectBaseSetup {
	
	 
	@SuppressWarnings("static-access")
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
 		 
	@FindBy(xpath = ".//*[@id='headerStripe']/div/ul/li[4]/a")
	WebElement LogoutButton;
	
	public void ClickonLogoutButton() {
		LogoutButton.click();		
		Log.info("LogoutButton found");
		waitforApge();		
	}	
		
}
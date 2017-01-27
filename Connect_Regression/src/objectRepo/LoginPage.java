package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ConnectBaseSetup;

public class LoginPage extends ConnectBaseSetup {	
	
	@FindBy(id = "userName")
	WebElement UserName;
	 
	@FindBy(id = "password")
	WebElement Password;
	 
	@FindBy(xpath = "//input[@value='Sign in']")					 
	WebElement SignInButton;
		 
	@FindBy( id = "clientFormError")
	WebElement ErrorMessage;
	
	@SuppressWarnings("static-access")
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	public void EnterUsername(String username) {
		UserName.click();
		Log.info("UserName field found");
		UserName.sendKeys(username);
		
	}

	public void EnterPassword(String password) {
		Password.click();
		Log.info("Password field found");
		Password.sendKeys(password);
		
	}
	
	public void ClickonSigninButton() {
		SignInButton.click();		
		Log.info("SignInButton found");
		
	}	
	
	public void CheckLoginWithValidCred(String Username, String PassWord)
	{
		UserName.sendKeys(Username);
		Log.info("UserName field found");
		Password.sendKeys(PassWord);
		Log.info("Password field found");
		SignInButton.click();	
		Log.info("SignInButton found");
		waitforApge();		
				
	}
	
	public void CheckLoginWithInValidCred(String Username, String PassWord)
	{
		UserName.sendKeys(Username);
		Log.info("UserName field found");
		Password.sendKeys(PassWord);
		Log.info("Password field found");
		SignInButton.click();		
		Log.info("SignInButton found");
		if(ErrorMessage.isDisplayed())
		{		
			System.out.println("Login Failed!");
		}
				
	}

}
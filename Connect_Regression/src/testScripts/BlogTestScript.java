package testScripts;

import org.testng.annotations.Test;

import base.ConnectBaseSetup;

public class BlogTestScript extends ConnectBaseSetup {			

	@SuppressWarnings("static-access")
	@Test 
	public void BlogCreate() throws InterruptedException
	{	
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		

		BlogCreate.CreateBlog();		
		Log.info("BlogAssignment created successfully! ");

		waitforApge();			
		logoutPage.ClickonLogoutButton();		

		waitforApge();			
	}		
}
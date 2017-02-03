package testScripts;

import org.testng.annotations.Test;

import base.ConnectBaseSetup;

public class WritingTestScript extends ConnectBaseSetup {			

	@SuppressWarnings("static-access")
	@Test 
	public void Writing_ComposeOnline() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		

		String type = "composeonline";		
		WriteCreate.CreateWritingAssignment(type);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();		

		waitforApge();	

	}

	@SuppressWarnings("static-access")
	@Test 
	public void Writing_AttachDocument() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		

		String type = "attachdocument";	
		WriteCreate.CreateWritingAssignment(type);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();		

		waitforApge();	

	}

	@SuppressWarnings("static-access")
	@Test 
	public void Writing_Both() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		

		String type = "both";	
		WriteCreate.CreateWritingAssignment(type);		

		waitforApge();			
		logoutPage.ClickonLogoutButton();		

		waitforApge();	

	}	

}
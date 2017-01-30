package testScripts;

import org.testng.annotations.Test;

import base.ConnectBaseSetup;

public class DBATestScript extends ConnectBaseSetup {	
	
	@SuppressWarnings("static-access")
	@Test (invocationCount=1)
	public void DBACreate_TestIDNow() throws InterruptedException
	{	
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		
		
		String Title = "DBA assignment - 01";
		String Description = "DBA assignment description ...";
		String Score = "100";
		boolean AvailabilityNowORLater = true;		
		String StartDate = "02/05/2017";		// Assignment start date later 
		String DueDate = "02/10/2017";		    // Assignment due date
		
		DBACreate.CreateDBAAssignment(Title, Description,Score, AvailabilityNowORLater,DueDate,StartDate);		
		Log.info("Web Activity Assignment created successfully! ");
		
		waitforApge();			
		logoutPage.ClickonLogoutButton();		
		
		waitforApge();			
	}
	
	@SuppressWarnings("static-access")
	@Test (invocationCount=1)
	public void DBACreate_TestIDLater() throws InterruptedException
	{	
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		
		
		String Title = "DBA assignment - 02";
		String Description = "DBA assignment description ...";
		String Score = "100";
		boolean AvailabilityNowORLater = false;		
		String StartDate = "01/30/2017";		// Assignment start date later 
		String DueDate = "02/10/2017";		    // Assignment due date
		
		DBACreate.CreateDBAAssignment(Title, Description,Score, AvailabilityNowORLater,DueDate,StartDate);		
		Log.info("Web Activity Assignment created successfully! ");
		
		waitforApge();			
		logoutPage.ClickonLogoutButton();		
		
		waitforApge();			
	}
	
	
}

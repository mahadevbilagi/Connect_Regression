package testScripts;

import org.testng.annotations.Test;

import base.ConnectBaseSetup;

public class WebActivityTestScript extends ConnectBaseSetup {			

	
	@SuppressWarnings("static-access")
	@Test (invocationCount=1)
	public void WebActivityCreateNew_Pass() throws InterruptedException
	{	
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		
		
		String Title = "Web Activity assignment - 01";
		String Description = "Web Activity assignment description ...";
		String WebLinkNameOne = "Google";
		String WebLinkURLOne = "https://www.google.com";
		String WebLinkNameTwo = "Yahoo";
		String WebLinkURLTwo = "https://www.Yahoo.com";
		String StartDate = "02/10/2017";
		String DueDate = "02/15/2017";
		
		WebActivityCreate.CreateWebActivityAssignmentNew(Title, Description, WebLinkNameOne, WebLinkURLOne, WebLinkNameTwo, WebLinkURLTwo, StartDate, DueDate);		
		Log.info("Web Activity Assignment created successfully! ");
		
		waitforApge();			
		logoutPage.ClickonLogoutButton();		
		
		waitforApge();			
	}
	
	@SuppressWarnings("static-access")
	@Test (invocationCount=1)
	public void WebActivityCreateNew_Fail() throws InterruptedException
	{	
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		
		
		String Title = "Web Activity assignment - 01";
		String Description = "Web Activity assignment description ...";
		String WebLinkNameOne = "Google";
		String WebLinkURLOne = "https://www.google.com";
		String WebLinkNameTwo = "Yahoo";
		String WebLinkURLTwo = "https://www.Yahoo.com";
		String StartDate = "01/21/2017";   // Error start date
		String DueDate = "02/15/2017";
		
		WebActivityCreate.CreateWebActivityAssignmentNew(Title, Description, WebLinkNameOne, WebLinkURLOne, WebLinkNameTwo, WebLinkURLTwo, StartDate, DueDate);		
		Log.info("Web Activity Assignment created successfully! ");
		
		waitforApge();			
		logoutPage.ClickonLogoutButton();		
		
		waitforApge();			
	}	
	
}
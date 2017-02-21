package testScripts;

import org.apache.poi.ss.util.DateFormatConverter;
import org.testng.annotations.Test;

import genericLib.webDriverConstants.DateandTime;

import java.util.Date;

import base.ConnectBaseSetup;

public class Date_WebActivityTestScript extends ConnectBaseSetup {			

	Date d = new Date();
	
	
	@SuppressWarnings("static-access")
	@Test (invocationCount=1)
	public void WebActivityCreateNew_Pass() throws InterruptedException
	{	
		DateandTime Dates = new DateandTime();
	//	String datestring = DateFormatConverter(d); 
		
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
		Date StartDate = Dates.currentDate();
		String DueDate = "02/15/2017";

		WebActivityCreate.CreateWebActivityAssignmentNew(Title, Description, WebLinkNameOne, WebLinkURLOne, WebLinkNameTwo, WebLinkURLTwo, StartDate, DueDate);		
		Log.info("Web Activity Assignment created successfully! ");

		waitforApge();			
		logoutPage.ClickonLogoutButton();		

		waitforApge();			
	}


	private String DateFormatConverter(Date d2) {
		// TODO Auto-generated method stub
		return null;
	}	

}
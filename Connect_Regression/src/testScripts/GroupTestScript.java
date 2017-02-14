package testScripts;

import org.testng.annotations.Test;

import base.ConnectBaseSetup;

public class GroupTestScript extends ConnectBaseSetup {			


	@SuppressWarnings("static-access")
	@Test (invocationCount=1)
	public void GroupCreateNew_Pass() throws InterruptedException
	{	
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		

		String Title = "Group assignment - 01";
		String Description = "Group description ...";
		String Score = "50";
		String StartDate = "02/14/2017";   // Start date   -- format  MM/DD/YYYY
		String Start_Hour = "08";
		String Start_Min = "08";
		String AM_PM = "AM";
		String EndDate = "02/19/2017";   // End date   -- format  MM/DD/YYYY
		String Due_Hour = "10";
		String Due_Min = "10";
		String AMandPM = "PM";
		String NumberOfStd = "30";
		String Topic = "JAVA";		

		GroupCreate.createGroupAssignment(Title, Description, Score, StartDate, Start_Hour, Start_Min, AM_PM , EndDate, Due_Hour, Due_Min , AMandPM , NumberOfStd , Topic);		
		Log.info(" Group assignment created successfully! ");

		waitforApge();			
		logoutPage.ClickonLogoutButton();		

		waitforApge();			
	}

}
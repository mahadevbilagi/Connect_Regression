package testScripts;

import org.testng.annotations.Test;

import base.ConnectBaseSetup;

public class SpeechTestScript extends ConnectBaseSetup {			

	/*	@SuppressWarnings("static-access")
	@Test // TestID01
	public void Speech_Now_InClass_On_On_On_EveryOne() throws InterruptedException  
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID02
	public void Speech_Now_InClass_On_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID03
	public void Speech_Now_InClass_On_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID04
	public void Speech_Now_InClass_On_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID05
	public void Speech_Now_InClass_Off_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID06
	public void Speech_Now_InClass_Off_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID07
	public void Speech_Now_InClass_Off_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID08
	public void Speech_Now_InClass_Off_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}
	 */

	@SuppressWarnings("static-access")
	@Test // TestID09
	public void Speech_Now_Online_On_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	/*
	@SuppressWarnings("static-access")
	@Test // TestID10
	public void Speech_Now_Online_On_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID11
	public void Speech_Now_Online_On_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID12
	public void Speech_Now_Online_On_On_Off_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID13
	public void Speech_Now_Online_On_On_Off_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID14
	public void Speech_Now_Online_On_On_Off_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID15
	public void Speech_Now_Online_On_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID16
	public void Speech_Now_Online_Off_Off_Off_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, false, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID17
	public void Speech_Now_Online_Off_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID18
	public void Speech_Now_Online_Off_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID19
	public void Speech_Now_Online_Off_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID20
	public void Speech_Now_Online_Off_On_Off_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID21
	public void Speech_Now_Online_Off_On_Off_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID22
	public void Speech_Now_Online_Off_On_Off_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID23
	public void Speech_Now_Online_Off_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID24
	public void Speech_Later_InClass_On_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID25
	public void Speech_Later_InClass_On_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID26
	public void Speech_Later_InClass_On_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID27
	public void Speech_Later_InClass_On_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID28
	public void Speech_Later_InClass_Off_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID29
	public void Speech_Later_InClass_Off_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID30
	public void Speech_Later_InClass_Off_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID31
	public void Speech_Later_InClass_Off_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "InClass";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID32
	public void Speech_Later_Online_On_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID33
	public void Speech_Later_Online_On_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID34
	public void Speech_Later_Online_On_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID35
	public void Speech_Later_Online_On_On_Off_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID36
	public void Speech_Later_Online_On_On_Off_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID37
	public void Speech_Later_Online_On_On_Off_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID38
	public void Speech_Later_Online_On_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID39
	public void Speech_Later_Online_Off_Off_Off_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, false, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID40
	public void Speech_Later_Online_Off_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID41
	public void Speech_Later_Online_Off_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID42
	public void Speech_Later_Online_Off_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID43
	public void Speech_Later_Online_Off_On_Off_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "EveryOne";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID44
	public void Speech_Later_Online_Off_On_Off_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "SpeakerandInstructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID45
	public void Speech_Later_Online_Off_On_Off_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "Instructor";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, true, false, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}

	@SuppressWarnings("static-access")
	@Test // TestID46
	public void Speech_Later_Online_Off_Off_On_null() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");

		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	

		String AvailableType = "Later";
		String SpeechType = "Online";
		waitforApge();	

		String show_comments_and_rubric_to = "null";

		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, false, false, true, show_comments_and_rubric_to);	

		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}*/

}
package objectRepo;

import org.openqa.selenium.WebDriver;

import base.ConnectBaseSetup;

public class Selectsection extends ConnectBaseSetup {	
	
	@SuppressWarnings("static-access")
	public Selectsection(WebDriver driver){
		this.driver = driver;
	}
	
	public static void navigatetosection()
	{		
		waitforApge();	
		
		//driver.navigate().to("http://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515805475");				  // Staging
		
		//driver.navigate().to("http://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515805475");				  // Dev2
		
		driver.navigate().to(QaStgSectionURL);                  // Dev2
		
		waitforApge();					
	}
}
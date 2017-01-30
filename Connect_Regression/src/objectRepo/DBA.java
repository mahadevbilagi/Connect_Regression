package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ConnectBaseSetup;

public class DBA extends ConnectBaseSetup {
		
	private static final String String = null;

	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;
	
	@FindBy(xpath = "//div[@id='addassignment_icon_ctr']/div[8]/h2/a")   // DBA assignment
	WebElement DBAAssignment;
	
	@FindBy(xpath = "//input[@id='assignmentTitle']")
	WebElement AssignmentTitle;
	
	@FindBy(id = "tinymce")
	WebElement DBADescription;
	
	@FindBy(id = "pointValue")
	WebElement DBAValue;
	
	@FindBy(id = "availablity_now")
	WebElement DBAAvailabilityNow;
	
	@FindBy(id = "dueDate")
	WebElement AvailableDueDate;
	
	@FindBy(id = "duetime")
	WebElement AvailableDueTime;
	
	@FindBy(id = "availablity_later")
	WebElement DBAAvailabilityLater;
	
	@FindBy(id = "startDate")
	WebElement AvailableStartDate;
	
	@FindBy(id = "starttime")
	WebElement AvailableStarttime;
	
	@FindBy(id = "exit")
	WebElement Exit;
	
	@FindBy(xpath = "//span[@id='saveexit']")
	WebElement SaveandExit;		
	
	@FindBy(xpath = "//span[@id='reviewassign']")
	WebElement ReviewandAssign;
	
	@FindBy(xpath = "//a[@class='buttons btgy font-normal']")
	WebElement PreviousSetupAssignment;
	
	@FindBy(xpath = "//a[@class='buttons btgy']")
	WebElement SaveandExitRVPage;
	
	@FindBy(xpath = "//a[@class='buttons btbl assign']")
	WebElement Assign;
		
	@SuppressWarnings("static-access")
	public DBA(WebDriver driver){
		this.driver = driver;
	}

	public void clickaddassignment(){
		AddAssignment.isEnabled();	
		AddAssignment.click();
		Log.info("Click on Add assignment");	
	}
	
	public void clickDBAAssignment(){
		DBAAssignment.isEnabled();	
		DBAAssignment.click();
		Log.info("Click on Web Assignment");	
	}
	
	public void enterAssignmentTitle(String Title){
		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys(Title);
		Log.info("Entering the assignment title name");	
	}
	
	public void enterDBADescription(String Description){
		
		waitforApge();
		driver.switchTo().frame(driver.findElement(By.id("note_ifr")));
		DBADescription.clear();
		DBADescription.sendKeys(Keys.ENTER);
		DBADescription.sendKeys(Description);
		Log.info("Entering the assignment description");	
		driver.switchTo().parentFrame();
	}
	
	public void enterScore(String Score){
		DBAValue.clear();
		DBAValue.sendKeys(Score);
		Log.info("Entering the assignment score");	
	}	
	
	public void clickDBAAvailabilityNow(){
		DBAAvailabilityNow.click();
		Log.info("Click on DBA availability NOW");	
	}
	
	public void enterDueDate(String DueDate){
		AvailableDueDate.click();
		AvailableDueDate.sendKeys(DueDate);
		Log.info("Entering start date");	
	}
	
	public void enterDueTime(String DueTime){
		AvailableDueDate.click();
		AvailableDueDate.sendKeys(DueTime);
		Log.info("Entering start date");	
	}	
	
	public void clickDBAAvailabilityLater(){
		DBAAvailabilityLater.click();
		Log.info("Click on DBA availability Later");	
	}
	
	public void enterStartDate(String DueDate){
		AvailableStartDate.click();
		AvailableStartDate.sendKeys(DueDate);
		Log.info("Entering start date");	
	}
	
	public void enterStartTime(String DueTime){
		AvailableStarttime.click();
		AvailableStarttime.sendKeys(DueTime);
		Log.info("Entering start date");	
	}	
	
	public void clickReviewandAssign(){
		ReviewandAssign.click();
		Log.info("Click on Review and Assign button");	
	}
		
	public void clickAssign(){
		Assign.click();
		Log.info("Click on Assign button");	
	}	
	
public void CreateDBAAssignment(String Title,String Description,String Score,boolean AvailabilityNowORLater,String DueDate,String StartDate) throws InterruptedException{	
		
			try{							
					clickaddassignment();
					waitforApge();
					
					clickDBAAssignment();
					waitforApge();
					
					enterAssignmentTitle(Title);
					
				//	enterDBADescription(Description);					
					waitforApge();
								
					enterScore(Score);
					
					if(AvailabilityNowORLater){    
						clickDBAAvailabilityNow();   // true
					}else{
						clickDBAAvailabilityLater();   // false
					}
					enterStartDate(StartDate);   // if Start date = Later
					enterDueDate(DueDate);		// assignment due date
										
					clickReviewandAssign();
					waitforApge();		
							
					waitforApge();
					clickAssign();
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
		}	
}	
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

	@FindBy(id = "reviewassign")
	WebElement ReviewAssign;

	@FindBy(xpath = "//a[@class='buttons btgy font-normal']")
	WebElement PreviousSetupAssignment;

	@FindBy(xpath = "//a[@class='buttons btgy']")
	WebElement SaveandExitRVPage;

	@FindBy(xpath = "//a[text()='Assign']")
	WebElement AssignButton;

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
		AssignmentTitle.clear();
		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys(Title);
		Log.info("Entering the assignment title name");	
	}

	public void enterDBADescription(String Description) throws InterruptedException{

		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("note_ifr")));
		Thread.sleep(100);
		DBADescription.clear();
		DBADescription.sendKeys(Keys.ENTER); 
		Thread.sleep(500);
		DBADescription.sendKeys(Description);
		Log.info("Entering the assignment description");
		Thread.sleep(500);
		driver.switchTo().parentFrame();
		Thread.sleep(500);
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
		Log.info("Entering DueDate");	
	}

	public void enterDueTime(String DueTime) throws InterruptedException{
		Thread.sleep(500);
		//	AvailableDueDate.click();
		AvailableDueDate.sendKeys(DueTime);
		Thread.sleep(500);
		Log.info("Entering Duetime");	
	}	

	public void clickDBAAvailabilityLater(){
		DBAAvailabilityLater.click();
		Log.info("Click on DBA availability Later");	
	}

	public void enterStartDate(String StartDate) throws InterruptedException{
		Thread.sleep(500);
		AvailableStartDate.click();
		Thread.sleep(500);
		AvailableStartDate.sendKeys(StartDate);
		Thread.sleep(500);
		Log.info("Entering StartDate");	
	}

	public void enterStartTime(String Starttime){
		//AvailableStarttime.click();
		AvailableStarttime.sendKeys(Starttime);
		Log.info("Entering StartDate");	
	}	

	public void clickReviewandAssign(){
		ReviewAssign.click();
		Log.info("Click on Review and Assign button");	
	}

	public void clickAssign(){
		AssignButton.click();
		Log.info("Click on Assign button");	
	}	

	public void CreateDBAAssignment(String Title,String Description,String Score,boolean AvailabilityNowORLater,String DueDate,String StartDate) throws InterruptedException{	

		try{							
			Thread.sleep(2000);
			clickaddassignment();
			Thread.sleep(1000);

			clickDBAAssignment();
			waitforApge();							

			enterScore(Score);
			waitforApge();

			if(AvailabilityNowORLater){    
				clickDBAAvailabilityNow();   // true
				Thread.sleep(1000);
				enterDueDate(DueDate);		// assignment due date
				waitforApge();
			}else{
				clickDBAAvailabilityLater();   // false
				Thread.sleep(1000);
				enterStartDate(StartDate);   // if Start date = Later
				Thread.sleep(1000);
				enterDueDate(DueDate);		// assignment due date
			}					

			Thread.sleep(500);
			enterAssignmentTitle(Title);
			Thread.sleep(500);

			enterDBADescription(Description);					
			Thread.sleep(500);

			Thread.sleep(500);
			clickReviewandAssign();
			Thread.sleep(500);
			waitforApge();		

			waitforApge();
			clickAssign();
			Thread.sleep(500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}	
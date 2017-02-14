package objectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.ConnectBaseSetup;

public class GroupAssignment extends ConnectBaseSetup {

	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;

	@FindBy(xpath = "//a[contains(text(),'group')]")
	WebElement Groupassignment;

	@FindBy(xpath = "//input[@id='assignmentName']")
	WebElement AssignmentTitle;

	@FindBy(xpath = "//textarea[@id='assignmentInstructions']")
	WebElement StudentInstruction;

	@FindBy(xpath = "//a[@class='btntwo']/span")
	WebElement NextSetPolicies;

	@FindBy(xpath = "//input[@id='points']")
	WebElement Points;

	@FindBy(xpath = "//input[@id='scheduleDateStart']")
	WebElement ScheduleDateStart;
	
	@FindBy(id = "startHour")
	WebElement StartHour;
	
	@FindBy(id = "startMin")
	WebElement StartMin;

	@FindBy(xpath = "//select[@class='inputbox']")
	WebElement AMandPM;	

	@FindBy(xpath = "//input[@id='scheduleDateEnd']")
	WebElement ScheduleDateEnd;
	
	@FindBy(id = "duetxtHour")
	WebElement DuetxtHour;
	
	@FindBy(id = "duetxtMinute")
	WebElement DuetxtMinute;

	@FindBy(xpath = "//select[@class='inputbox']")
	WebElement AM_PM;	
	
	@FindBy(xpath = "//a[@class='btntwo']/span")
	WebElement Next_DefineGroups;

	@FindBy(xpath = "//div[@class='defineGroup']/p[contains(text(),'number')]")
	WebElement TextRead;
	
	@FindBy(id = "studentsPerGroup")
	WebElement NumberOfStudentsPerGroup;
	
	@FindBy(xpath = "//li[@class='assign-blue-btn_cntr']")
	WebElement AddTopicsClick;
	
	@FindBy(xpath = "//input[@id='0']")
	WebElement TopicName;

	@FindBy(xpath = "//li[@id='saveTopics']")
	WebElement AddTopicButtons;
	
	@FindBy(xpath = "//a[@class='btntwo']")
	WebElement ReviewAssign;	
	
	@FindBy(xpath = "//a[@class='buttons btbl']")
	WebElement AssignButton;	

	@SuppressWarnings("static-access")
	public GroupAssignment(WebDriver driver){
		this.driver = driver;
	}	

	public void clickAddAssignment()
	{		
		AddAssignment.isEnabled();	
		AddAssignment.click();		
		System.out.println("Add assignment Found in the Current Section!");		
	}

	public void clickGroupLink()
	{				
		Groupassignment.isEnabled();	
		Groupassignment.click();		
		System.out.println("Group assignment Found in the Current Section!");
	}	
	
	public void enterAssignmentTitle(String Title){
		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys(Title);
		Log.info("Entering the assignment title name");	
	}

	public void enterGroupDescritpion(String Description){
		StudentInstruction.clear();
		StudentInstruction.sendKeys(Keys.ENTER);
		StudentInstruction.sendKeys(Description);
		Log.info("Entering the assignment description");	
	}
	
	public void clickOnNextPolicies()
	{				
		NextSetPolicies.isEnabled();	
		NextSetPolicies.click();		
		System.out.println("Click on Next Policies button");
	}
	
	public void enterPoints(String Score){
		Points.sendKeys(Score);
		Log.info("Entering the assignment score value");	
	}

	public void enterScheduleDateStart(String StartDate){
		ScheduleDateStart.click();
		ScheduleDateStart.sendKeys(StartDate);
		Log.info("Entering start date");	
	}
	
	public void enterStartHour(String Start_Hour){
		StartHour.click();
		StartHour.sendKeys(Start_Hour);
		Log.info("Entering start hour");	
	}

	public void enterStartMin(String Start_Min){
		StartMin.click();
		StartMin.sendKeys(Start_Min);
		Log.info("Entering start min");	
	}
	
	public void enterAMandPM(String AM_PM){
		AMandPM.click();
		AMandPM.sendKeys(AM_PM);
		Log.info("Selecting AM and PM value");	
	}
	
	public void enterScheduleDateEnd(String EndDate){
		ScheduleDateEnd.click();
		ScheduleDateEnd.sendKeys(EndDate);
		Log.info("Entering start date");	
	}
	
	public void enterDuetxtHour(String Due_Hour){
		DuetxtHour.click();
		DuetxtHour.sendKeys(Due_Hour);
		Log.info("Entering due hour");	
	}

	public void enterDuetxtMinute(String Due_Min){
		DuetxtMinute.click();
		DuetxtMinute.sendKeys(Due_Min);
		Log.info("Entering due min");
	}
	
	public void enterAM_PM(String AMandPM){
		AM_PM.click();
		AM_PM.sendKeys(AMandPM);
		Log.info("Selecting AM and PM value");	
	}
	
	public void clickNext_DefineGroups(){
		Next_DefineGroups.click();
		Log.info("Click on Next Define group");	
	}
	
	public void enterStudentsPerGroup(String NumberOfStd) throws InterruptedException{
		
		Boolean e = TextRead.isDisplayed();
		if(e)
		{			
			System.out.println(TextRead.getText());
			Thread.sleep(4000);		
			NumberOfStudentsPerGroup.click();			
			Thread.sleep(2000);		
			Select se=new Select(NumberOfStudentsPerGroup);		
			se.selectByVisibleText(NumberOfStd);	
			Thread.sleep(1000);		
			Log.info("Entering StudentsPerGroup value");	
			
		}else
		{
			System.out.println("Not found");
		}		
	}
	
	public void clickAddTopics(){
		AddTopicsClick.click();
		Log.info("Click on StudentPerGroup dropdown");	
	}
	
	public void enterTopicName(String Topic){
		/*String WindowHandle = driver.getWindowHandle();
		driver.switchTo().window(WindowHandle);		*/
		TopicName.click();
		TopicName.sendKeys(Topic);
		Log.info("Entering Groups Topic name");	
	}
	
	public void clickAddTopicButtons(){
	/*	String WindowHandle = driver.getWindowHandle();
		driver.switchTo().window(WindowHandle);*/
		AddTopicButtons.click();
		Log.info("Click on Add Topic Button");	
	//	driver.switchTo().defaultContent();
	}
	
	public void clickReviewAssign(){
		ReviewAssign.click();
		Log.info("Click on Review & Assign button");	
	}
	
	public void clickAssignButton(){
		AssignButton.click();
		Log.info("Click on Assign button");	
	}

	public void createGroupAssignment(String Title,String Description,String Score,String StartDate,String Start_Hour,String Start_Min,String AM_PM ,String EndDate,String Due_Hour,String Due_Min ,String AMandPM ,String NumberOfStd ,String Topic) throws InterruptedException{	
		
		try{		

			Thread.sleep(2000);
			clickAddAssignment();
			Thread.sleep(1000);
			clickGroupLink();
			waitforApge();

			enterAssignmentTitle(Title);
			Thread.sleep(2000);
			enterGroupDescritpion(Description);
			Thread.sleep(2000);
			waitforApge();

			clickOnNextPolicies();
			Thread.sleep(2000);
			enterPoints(Score);

			enterScheduleDateStart(StartDate);
			waitforApge();
			enterStartHour(Start_Hour);
			waitforApge();
			enterStartMin(Start_Min);
			waitforApge();
			enterAMandPM(AM_PM);
			waitforApge();
			
			enterScheduleDateEnd(EndDate);
			waitforApge();
			enterDuetxtHour(Due_Hour);
			waitforApge();
			enterDuetxtMinute(Due_Min);
			waitforApge();
			enterAM_PM(AMandPM);
			waitforApge();

			clickNext_DefineGroups();
			Thread.sleep(2000);
			enterStudentsPerGroup(NumberOfStd);
			Thread.sleep(2000);
			
			clickAddTopics();
			Thread.sleep(2000);
			enterTopicName(Topic);
			
			clickAddTopicButtons();
			Thread.sleep(2000);
			
			clickReviewAssign();
			Thread.sleep(2000);
			clickAssignButton();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	

}


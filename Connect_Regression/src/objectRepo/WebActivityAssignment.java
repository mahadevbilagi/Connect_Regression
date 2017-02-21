package objectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ConnectBaseSetup;

public class WebActivityAssignment extends ConnectBaseSetup {

	private static final String String = null;

	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;

	@FindBy(xpath = "//a[contains(text(),'web activity')]")
	WebElement WebAssignment;

	@FindBy(xpath = "//input[@id='assignmentTitle']")
	WebElement AssignmentTitle;

	@FindBy(xpath = "//textarea[@id='note']")
	WebElement WebDescritpion;

	@FindBy(xpath = "//input[@id='webLinkName']")
	WebElement WebLinkName1;

	@FindBy(xpath = "//input[@id='webLinkURL']")
	WebElement WebLinkURL1;

	@FindBy(xpath = "//a[@class='addweblinks']")
	WebElement AddNewWeblink;

	@FindBy(xpath = "//div[@class='weblinkcontainer padtop13']/div/div/input[@id='webLinkName']")
	WebElement WebLinkName2;

	@FindBy(xpath = "//div[@class='weblinkcontainer padtop13']/div/div/input[@id='webLinkURL']")
	WebElement WebLinkURL2;

	@FindBy(xpath = "//span[@class='buttons btgy bkbtn']")
	WebElement Cancel;

	@FindBy(xpath = "//span[@class='buttons btgy']")
	WebElement SaveandExit;		

	@FindBy(xpath = "//span[@class='buttons btbl']/span")
	WebElement NextAssign;

	@FindBy(xpath = "//input[@id='scheduleDateStart']")
	WebElement AvailableStartDate;

	@FindBy(xpath = "//input[@id='scheduleDateEnd']")
	WebElement AvailableDueDate;

	@FindBy(xpath = "//li[@class='grey_cntr bkbtn webassignmentprevious buttons btgy']/span")
	WebElement PreviousSetupAssignment;

	@FindBy(xpath = "//li[@class='grey_cntr bkbtn buttons btgy']")
	WebElement SaveandExitRVPage;

	//@FindBy(xpath = "//li[@class='assign-blue-btn_cntr buttons btbl']")
	@FindBy(xpath = "//li [@class='assign-blue-btn_cntr buttons btbl' and text()='assign']")
	WebElement Assign;

	@SuppressWarnings("static-access")
	public WebActivityAssignment(WebDriver driver){
		this.driver = driver;
	}

	public void clickaddassignment(){
		AddAssignment.isEnabled();	
		AddAssignment.click();
		Log.info("Click on Add assignment");	
	}

	public void clickWebAssignment(){
		WebAssignment.isEnabled();	
		WebAssignment.click();
		Log.info("Click on Web Assignment");	
	}

	public void enterAssignmentTitle(String Title){
		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys(Title);
		Log.info("Entering the assignment title name");	
	}

	public void enterWebDescritpion(String Description){
		WebDescritpion.clear();
		WebDescritpion.sendKeys(Keys.ENTER);
		WebDescritpion.sendKeys(Description);
		Log.info("Entering the assignment description");	
	}

	public void enterWebLinkName1(String WebLinkNameOne){		
		WebLinkName1.sendKeys(WebLinkNameOne);
		Log.info("Entering the WebLinkOne Name");
	}

	public void enterWebLinkURL1(String WebLinkURLOne){
		WebLinkURL1.clear();
		WebLinkURL1.sendKeys(WebLinkURLOne);
		Log.info("Entering the WebURLOne Link");	
	}

	public void clickAddNewWeblink(){
		AddNewWeblink.click();
		Log.info("Click on Add new WebLink");
		waitforApge();	
	}

	public void enterWebLinkName2(String WebLinkNameTwo){		
		WebLinkName2.sendKeys(WebLinkNameTwo);
		Log.info("Entering the WebLinkTwo Name");
	}

	public void enterWebLinkURL2(String WebLinkURLTwo){
		WebLinkURL2.clear();
		WebLinkURL2.sendKeys(WebLinkURLTwo);
		Log.info("Entering the WebURLTwo Link");	
	}

	public void clickNextAssign(){
		NextAssign.click();
		Log.info("Click on NextAssign button");	
	}

	public void enterAvailableStartDate(String StartDate){
		AvailableStartDate.click();
		AvailableStartDate.sendKeys(StartDate);
		Log.info("Entering start date");	
	}

	public void enterAvailableDueDate(String DueDate){
		AvailableDueDate.click();
		AvailableDueDate.sendKeys(DueDate);
		Log.info("Entering Due Date");	
	}

	public void clickAssign(){
		Assign.isEnabled();
		Assign.click();
		Log.info("Click on Assign button");	
	}	

	public void CreateWebActivityAssignmentNew(String Title,String Description,String WebLinkNameOne,String WebLinkURLOne,String WebLinkNameTwo,String WebLinkURLTwo,String StartDate,String DueDate) throws InterruptedException{	

		try{		

			Thread.sleep(2000);
			clickaddassignment();
			Thread.sleep(1000);
			clickWebAssignment();
			waitforApge();

			enterAssignmentTitle(Title);
			enterWebDescritpion(Description);
			waitforApge();

			enterWebLinkName1(WebLinkNameOne);
			enterWebLinkURL1(WebLinkURLOne);

			clickAddNewWeblink();

			enterWebLinkName2(WebLinkNameTwo);
			enterWebLinkURL2(WebLinkURLTwo);

			clickNextAssign();
			waitforApge();		
			enterAvailableStartDate(StartDate);
			enterAvailableDueDate(DueDate);

			Thread.sleep(2000);
			clickAssign();

		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}	
}

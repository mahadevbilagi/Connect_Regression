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
	
	@FindBy(xpath = "//li[@class='assign-blue-btn_cntr buttons btbl']")
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
		Assign.click();
		Log.info("Click on Assign button");	
	}	
	
public void CreateWebActivityAssignmentNew(String Title,String Description,String WebLinkNameOne,String WebLinkURLOne,String WebLinkNameTwo,String WebLinkURLTwo,String StartDate,String DueDate) throws InterruptedException{	
		
		try{
			
		
		clickaddassignment();
		waitforApge();
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
		
		waitforApge();
		clickAssign();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}
	
/*	public void CreateWebActivityAssignment() throws InterruptedException{	
		
		AddAssignment.isEnabled();	
		AddAssignment.click();
		Log.info("Click on Add assignment");
		
		WebAssignment.isEnabled();	
		WebAssignment.click();						
		Log.info("Click on Web Activity assignment");

		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys("Web Activity assignment - 01");	
		Log.info("Entering the Web Activity assignment title name");
		
		waitforApge();
		WebDescritpion.clear();
		WebDescritpion.sendKeys(Keys.ENTER);		
		WebDescritpion.sendKeys("Web Activity assignment description ...");
		waitforApge();
		Log.info("Entering the Web Activity assignment description");
		
		WebLinkName1.sendKeys("Google");
		Log.info("Entering the WebLink Name");
		WebLinkURL1.clear();
		WebLinkURL1.sendKeys("https://www.google.com");
		Log.info("Entering the WebURL Link");
		
		AddNewWeblink.click();
		Log.info("Click on Add new WebLink");
		waitforApge();
		
		WebLinkName2.sendKeys("Yahoo");
		Log.info("Entering the WebLink Name");
		WebLinkURL2.clear();
		WebLinkURL2.sendKeys("https://www.Yahoo.com");
		Log.info("Entering the WebURL Link");
		waitforApge();
		
		NextAssign.click();
		Log.info("Click Next assign button");		
		
		AvailableStartDate.click();
		AvailableStartDate.sendKeys("01/27/2017");
		Log.info("Entering the assignment Start date");
		
		AvailableDueDate.click();
		AvailableDueDate.sendKeys("12/31/2017");
		Log.info("Entering the assignment Due date");
		waitforApge();
		
		Assign.click();
		Log.info("Click on Assign button");			
	}*/	
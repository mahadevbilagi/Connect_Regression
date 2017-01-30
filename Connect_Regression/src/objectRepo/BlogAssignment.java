package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ConnectBaseSetup;

public class BlogAssignment extends ConnectBaseSetup {
		
	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;
	
	@FindBy(xpath = "//a[contains(text(),'blog')]")
	WebElement Blogassignment;
	
	@FindBy(id = "assignmentTitle")
	WebElement AssignmentTitle;
	
	@FindBy(id = "tinymce")
	WebElement BlogDescritpion;
	
	@FindBy(id = "pointValue")
	WebElement Score;
	
	@FindBy(id = "availablity_now")
	WebElement AvailableNow;
	
	@FindBy(id = "availablity_later")
	WebElement AvailablityLater;
	
	@FindBy(id = "dueDate")
	WebElement DueDate;	
	
	@FindBy(id = "duetime")
	WebElement DueTime;	
	
	@FindBy(id = "saveexit")
	WebElement SaveExit;
	
	@FindBy(id = "reviewassign")
	WebElement ReviewAssign;
	
	@FindBy(xpath = "//a[text()='Assign']")
	WebElement AssignButton;
	
	@SuppressWarnings("static-access")
	public BlogAssignment(WebDriver driver){
		this.driver = driver;
	}	
	
	public void CheckAddAssignment()
	{		
		AddAssignment.isEnabled();	
		AddAssignment.click();		
		System.out.println("Add assignment Found in the Current Section!");		
	}
	
	public void CheckBlogLink()
	{				
		Blogassignment.isEnabled();	
		Blogassignment.click();		
		System.out.println("Blog assignment Found in the Current Section!");
	}	
	
	public void CreateBlog() throws InterruptedException{	
		
		AddAssignment.isEnabled();	
		AddAssignment.click();
		Log.info("Click on Add assignment");
		
		Blogassignment.isEnabled();	
		Blogassignment.click();						
		Log.info("Click on Blog assignment");
		
		waitforApge();
		driver.switchTo().frame(driver.findElement(By.id("note_ifr")));
		waitforApge();
		BlogDescritpion.clear();
		BlogDescritpion.click();
		BlogDescritpion.sendKeys("Blog assignment description ...");
		Thread.sleep(2000);
		Log.info("Entering the Blog assignment description");
		
		driver.switchTo().parentFrame();
		
		Score.clear();
		Score.click();
		Score.sendKeys("50");
		Log.info("Entering the value of score");	
		
		AvailableNow.click();
		
		((JavascriptExecutor) driver).executeScript ("document.getElementById ('dueDate').removeAttribute('readonly',0);");
		WebElement Date= driver.findElement(By.id("dueDate"));
		Date.clear();
		Date.sendKeys("12/31/2017");       //   Enter this date details with valid date format  MM/DD/YYYY
		Log.info("Entering the due date");
		
		Thread.sleep(2000);
	
		AssignmentTitle.click();
		AssignmentTitle.clear();
		Thread.sleep(300);
		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys("Blog assignment - 01");
		Log.info("Entering the assignment title name");
		Thread.sleep(3500);
		
		ReviewAssign.click();		
		Log.info("Click on Review & assign button");
		Thread.sleep(5000);
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Assign']")));
		
		AssignButton.click();	
		Log.info("Click on Assign button");
	}	

}

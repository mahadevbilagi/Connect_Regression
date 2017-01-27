package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ConnectBaseSetup;

public class WritingAssignment extends ConnectBaseSetup {	
	
	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;
	
	@FindBy(xpath = "//a[contains(text(),'writing')]")
	WebElement WritingAssignment;
	
	@FindBy(id = "assignmentTitle")
	WebElement AssignmentTitle;
	
	@FindBy(id = "tinymce")
	WebElement WritingDescription;
	
	@FindBy(id = "pointValue")
	WebElement Score;
	
	@FindBy(id = "availablity_now")
	WebElement AvailablityNow;	
	
	@FindBy(id = "availablity_later")
	WebElement AvailablityLater;
	
	@FindBy(id = "composeOnline")
	WebElement ComposeOnline;
	
	@FindBy(id = "attachFile")
	WebElement AttachFile;
	
	@FindBy(id = "both")
	WebElement Both;
	
	@FindBy(xpath = "//span[contains(text(),'simple')]")
	WebElement Simple;
	
	@FindBy(xpath = "//span[contains(text(),'complex')]")
	WebElement Complex;
	
	@FindBy(id = "reviewassign")
	WebElement ReviewAssign;
	
	@FindBy(xpath = "//a[text()='Assign']")
	WebElement AssignButton;
	
	@SuppressWarnings("static-access")
	public WritingAssignment(WebDriver driver){
		this.driver = driver;		
	}
	
	public void CreateWritingAssignment(String type) throws InterruptedException{
		
		AddAssignment.isEnabled();
		AddAssignment.click();
		Log.info("Click on Add assignment");
		
		WritingAssignment.isEnabled();
		WritingAssignment.click();
		Log.info("Click on Writing assignment");
		
		driver.switchTo().frame(driver.findElement(By.id("note_ifr")));
		WritingDescription.clear();
		WritingDescription.click();
		WritingDescription.sendKeys("Writing assignment description ...");
		Thread.sleep(2000);
		Log.info("Entering the writing assignment description");
		
		driver.switchTo().parentFrame();
		
		Score.clear();
		Score.click();
		Score.sendKeys("50");
		Log.info("Entering the value of score");		
		
		AvailablityNow.click();		
		Log.info("Click on Available now");	
		
	switch(type){			
		case "composeonline":
		{
			ComposeOnline.click();		
			Log.info("Click on Compose online");
			
			Boolean S = Simple.isSelected();		
			if(S)
			{
				System.out.println("Text Editor Palette = Simple");
			}else
			{
				Simple.click();
				Log.info("Click on Simple text palette");
			}
			
		/*	Boolean C = Complex.isSelected();		
			if(C)
			{
				System.out.println("Text Editor Palette = Simple");
			}else
			{
				Complex.click();
			}*/					
			
			/*driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);     		
			Select dropdown = new Select(driver.findElement(By.className("draftsSelect")));									// select number of students in group
			dropdown.selectByValue("1");					
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); */
			
			AssignmentTitle.click();
			AssignmentTitle.clear();
			Thread.sleep(300);
			AssignmentTitle.sendKeys(Keys.ENTER);
			AssignmentTitle.sendKeys("Writing assignment (ComposeOnline) - 01");
			Log.info("Entering the assignment title name");
			Thread.sleep(3500);	
			
			break;		
		}
			
		case "both":
			{					
				Both.click();		
				Log.info("Click on both online");			
				
				Boolean S = Simple.isSelected();		
				if(S)
				{
					System.out.println("Text Editor Palette = Simple");
				}else
				{
					Simple.click();
					Log.info("Click on Simple text palette");
				}
				
			/*	Boolean C = Complex.isSelected();		
				if(C)
				{
					System.out.println("Text Editor Palette = Simple");
				}else
				{
					Complex.click();
				}*/		
				
				AssignmentTitle.click();
				AssignmentTitle.clear();
				Thread.sleep(300);
				AssignmentTitle.sendKeys(Keys.ENTER);
				AssignmentTitle.sendKeys("Writing assignment (Both) - 01");
				Log.info("Entering the assignment title name");
				Thread.sleep(3500);	
				
				break;		
			}

		case "attachdocument":
			{				
				AttachFile.click();		
				Log.info("Click on AttachFile online");		
				
				AssignmentTitle.click();
				AssignmentTitle.clear();
				Thread.sleep(300);
				AssignmentTitle.sendKeys(Keys.ENTER);
				AssignmentTitle.sendKeys("Writing assignment (Attach document) - 01");
				Log.info("Entering the assignment title name");
				Thread.sleep(3500);		
				
				break;		
			}
		
		}
	
		((JavascriptExecutor) driver).executeScript ("document.getElementById ('dueDate').removeAttribute('readonly',0);");
		WebElement Date= driver.findElement(By.id("dueDate"));
		Date.clear();
		Date.sendKeys("12/31/2017");       //   Enter this date details with valid date format  MM/DD/YYYY
		Log.info("Entering the due date");
		
		Thread.sleep(2000);
		
		ReviewAssign.click();
		Log.info("Click on Review & assign button");
		Thread.sleep(5000);
			
		AssignButton.click();
		Log.info("Click on Assign button");
		Log.info("Writing assignment with created type :" + type);
		
		
	}
}


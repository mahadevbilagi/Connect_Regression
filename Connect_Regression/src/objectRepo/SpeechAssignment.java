package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.ConnectBaseSetup;

public class SpeechAssignment extends ConnectBaseSetup {	
	
	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;
	
	@FindBy(xpath = "//a[contains(text(),'speech')]")
	WebElement SpeechAssignment;
	
	@FindBy(xpath = "//input[@id='assignmentTitle']")
	WebElement AssignmentTitle;
	
	@FindBy(xpath = "//input[@id='pointValue']")
	WebElement Score;
	
	@FindBy(xpath = "//input[@value='NOW']")
	WebElement AssignmentAvailabilityNOW;
	
	@FindBy(xpath = "//input[@value='LATER']")
	WebElement AssignmentAvailabilityLATER;
	
	@FindBy(xpath = "//input[@id='startDate']")
	WebElement StartDate;
	
	@FindBy(xpath = "//select[@id='starttime']")
	WebElement StartTime;	
	
	@FindBy(xpath = "//input[@id='assess_student_speeches_inclass']")
	WebElement InClass;
	
	@FindBy(xpath = "//input[@id='inClassDueDate']")
	WebElement InClassDueDate;
	
	@FindBy(xpath = "//select[@id='inClassDuetime']")
	WebElement InClassDueTime;
	
	@FindBy(xpath = "//input[@id='assess_student_speeches_online']")
	WebElement Online;
		
	@FindBy(xpath = "//input[@id='onlineDueDate']")
	WebElement OnlineDueDate;
	
	@FindBy(xpath = "//select[@id='onlineDuetime']")
	WebElement OnlineDuetime;
	
	@FindBy(xpath = "//div[@class='heading_block clearfix vertical_line']/span/a[@class='ico off_review']")
	WebElement StudentSelfReviewOff;
	
	@FindBy(xpath = "//div[@class='heading_block clearfix vertical_line']/span/a[@class='ico on_review']")
	WebElement StudentSelfReviewOn;
	
	// Rubric logic need to write	
	
	@FindBy(xpath = "//div[@id='peer_review_header']/div/div/div/span/a[@class='ico off_review']")
	WebElement StudentPeerReviewOff;
	
	@FindBy(xpath = "//div[@id='peer_review_header']/div/div/div/span/a[@class='ico on_review']")
	WebElement StudentPeerReviewOn;
	
	@FindBy(xpath = "//input[@id='peerReviewDueDate']")
	WebElement PeerReviewDueDate;
	
	@FindBy(xpath = "//select[@id='peerReviewDuetime']")
	WebElement PeerReviewDuetime;
	
	@FindBy(xpath = "//select[@id='noOfStudentsPerGroup']")
	WebElement NoOfStudentsPerGroup;
	
	@FindBy(xpath = "//input[@id='completely_open']")
	WebElement EveryOne;
	
	@FindBy(xpath = "//input[@id='partially_open']")
	WebElement SpeakerandInstructor;
	
	@FindBy(xpath = "//input[@id='private_open']")
	WebElement InstructorOnly;
	
	@FindBy(xpath = "//div[@id='instructor_review_header']/div/div/div/span/a[@class='ico off_review']")
	WebElement InstructorReviewOff;
	
	@FindBy(xpath = "//div[@id='instructor_review_header']/div/div/div/span/a[@class='ico on_review']")
	WebElement InstructorReviewOn;
		
	// Rubric logic need to write	
	
	@FindBy(xpath = "//textarea[@id='note']")
	WebElement MessagetoStudents;
	
	@FindBy(xpath = "//a[@id='exitAssignmentSetUp']/span")
	WebElement Exit;
	
	@FindBy(xpath = "//a[@id='saveExit']/span")	
	WebElement SaveandExit;
	
	@FindBy(xpath = "//a[@id='reviewAssign']/span")
	WebElement ReviewandAssign;
	
	@FindBy(xpath = "//a[@class='saveAssignbtn btntwo right btn_margin_space ']/span")
	WebElement Assign;
	
	@FindBy(xpath = "//input[@id='inClassStartDate']")
	WebElement InClassStartDate;
	
	@FindBy(xpath = "//input[@id='inClassStarttime']")
	WebElement InClassStarttime;
	
	@SuppressWarnings("static-access")
	public SpeechAssignment(WebDriver driver){
		this.driver = driver;		
	}
	
	@SuppressWarnings("unused")
	public void CreateSpeeachAssignment(String AvailableType,String SpeechType,boolean StudentSelf,
			boolean StudentPeer,boolean InstructorReview,String show_comments_and_rubric_to) throws InterruptedException{
		
		AddAssignment.isEnabled();
		AddAssignment.click();
		Log.info("Click on Add assignment");
		
		SpeechAssignment.isEnabled();
		SpeechAssignment.click();
		Log.info("Click on Speech assignment");
		
		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys("Speech Assignment-:",AvailableType,SpeechType);
		Log.info("Entering the assignment title name");
		
		Score.clear();
		Score.sendKeys("50");
		Log.info("Entering the valus of score");
		
				
		if(AvailableType=="NOW"){
			
			AssignmentAvailabilityNOW.click();
			Log.info("Click on assignment available NOW");
			
		}else{        
			
			AssignmentAvailabilityLATER.click();
			Log.info("Click on assignment available LATER!");
			
			StartDate.click();
			StartDate.sendKeys("");   // date
			Log.info("Enter the value of Start Date");
			
			StartTime.click();
			StartTime.sendKeys("");   // time			
		}

		if(SpeechType=="InClass"){

			InClass.click();
			 
			InClassDueDate.click();
			InClassDueDate.sendKeys("02/02/2017");  // date
			Log.info("Enter the value of InClass Due Date");
			Thread.sleep(2000);
			
//			InClassDueTime.click();
//			InClassDueTime.sendKeys("00:30 am");  // date		
			
			InClassStartDate.click();
			InClassStartDate.sendKeys("02/01/2017");  // date
			Log.info("Enter the value of InClass Start Date");
			Thread.sleep(2000);
			
//			InClassStarttime.click();
//			InClassStarttime.sendKeys("00:30 am");  // date
		}
		else {
				
			Online.click();
			Log.info("Click on Speech type = Online");
			
			OnlineDueDate.click();
			OnlineDueDate.sendKeys("");  // date
			Log.info("Enter the Online Due date ");
			
			OnlineDueDate.click();
			OnlineDueDate.sendKeys("01/31/2017");  // date
			Log.info("Enter the value of Online Start Date");
			
//			OnlineDuetime.click();
//			OnlineDuetime.sendKeys("00:30 am");  // date				
		}

		if(StudentSelf)
		{
			StudentSelfReviewOn.click();
			Log.info("Click on Student Self Review = ON");
			// Rubric logic need to write			
			waitforApge();
			
		}else{
			
			StudentPeerReviewOff.click();
			Log.info("Click on Student Self Review = OFF");
			// Rubric logic need to write
			waitforApge();
		}			

		if(StudentPeer)
		{
			StudentPeerReviewOn.click();
			Log.info("Click on Student Peer Review = ON");
			// Rubric logic need to write
			waitforApge();
			Thread.sleep(2000);
			
			Thread.sleep(500);
			PeerReviewDueDate.click();
			PeerReviewDueDate.sendKeys("02/03/2017");   // date
			Log.info("Enter the Peer Review Due date");
			Thread.sleep(2000);
			
//			PeerReviewDuetime.click(); 
//			PeerReviewDuetime.sendKeys("00:30 am");  // time		
										
			waitforApge();			
			
			Thread.sleep(2000);
			WebElement element=driver.findElement(By.name("noOfStudentsPerGroup"));
			Select se=new Select(element);	
			se.selectByValue("30");			
			
			waitforApge();		
			
			// Select values logic needed	
			Thread.sleep(2000);
			if(show_comments_and_rubric_to == "EveryOne"){
				EveryOne.click();
				Log.info("Click on Show Comments and Rubric to 'EveryOne'");
				waitforApge();
				Thread.sleep(2000);
			}else if(show_comments_and_rubric_to == "SpeakerandInstructor")
				{
					SpeakerandInstructor.click();
					Log.info("Click on Show Comments and Rubric to 'Speaker and Instructor'");
					waitforApge();
					Thread.sleep(2000);
				}else if(show_comments_and_rubric_to == "InstructorOnly"){
					InstructorOnly.click();
					Log.info("Click on Show Comments and Rubric to 'Instructor Only'");
					waitforApge();
					Thread.sleep(2000);
				}
			
		}else{
			
			StudentPeerReviewOff.click();
			Log.info("Click on Student Peer Review = OFF");
			// Rubric logic need to write
		}
						
		if(InstructorReview)
		{
			// InstructorReviewOn.click();   // default its on :) 
			Log.info("Click on Instructor Review = ON");
			// Rubric logic need to write
			waitforApge();
			Thread.sleep(2000);

		}else{
			
			InstructorReviewOff.click();	
			Log.info("Click on Instructor Review = OFF");
			waitforApge();
		}		
		
		MessagetoStudents.clear();
		MessagetoStudents.sendKeys("All the best !!");
		Log.info("Entering the message to students");
		Thread.sleep(2000);
		
		ReviewandAssign.click();
		Log.info("Click on Review&Assign button");
		waitforApge();		
		Thread.sleep(2000);
		
		Assign.click();		
		Log.info("Click on Assign button");
		waitforApge();
		Thread.sleep(2000);
		
	}	
	
}


package genericLib.webDriverConstants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ConnectBaseSetup;

public class WebdriverCommonlib extends ConnectBaseSetup {	
	{
	}
	public void waitForpageToLoad()
	{
		Controller.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public void waitForXpathToPresent(String wbXpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(wbXpath)));
	}

	public void waitForNameToPresent(String wbName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(wbName)));
	}

}
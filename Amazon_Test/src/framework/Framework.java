package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Framework 
{
	public static WebDriver Browser;
	public static void close_Browser()
	{
		
		Browser.quit();
	}
	public static void clickElement(By locator)
	{
		try{
			Wait<WebDriver> wait = new FluentWait<WebDriver>(Browser).withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(10, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class);
			WebElement element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
		}
		catch(Exception e){
			e.printStackTrace();

		}
	}

	public static void setElementText(By locator, String value)
	{

		try{
			Wait<WebDriver> wait = new FluentWait<WebDriver>(Browser).withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(10, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class);
			WebElement element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			element.clear();
			element.sendKeys(value);
			//		element.sendKeys(Keys.RETURN);

		}
		catch(Exception e){
	
			e.printStackTrace();

		}
	}
}

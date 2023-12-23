package GenericLib;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlzWebDriverCommonLib {
	
	static Alert alert;
	public static WebDriver driver= BlazeDrivers.driver;

	public void openURL(String url)
	{
		driver.get(url);
	}
	public static Boolean waitForElementTobePresent(By locator) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BlazeConstants.globalWait));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return true;
	}
	

	public static void clickElement(WebElement element) 
	{
		element.click();
	}
	
	public static WebElement getElement(By locator) 
	{
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public static Alert switchToAlert() 
	{
		alert = driver.switchTo().alert();
		return alert;
	}

	public static void dismissAlert() 
	{
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));	
		
		alert = switchToAlert();
		alert.dismiss();
	}

}

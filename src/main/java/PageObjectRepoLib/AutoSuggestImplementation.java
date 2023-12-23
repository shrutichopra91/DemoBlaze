package PageObjectRepoLib;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericLib.BlzWebDriverCommonLib;

public class AutoSuggestImplementation {
	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\DemoBlazeProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		driver.findElement(By.xpath("//div[@class='DRc6kd bdn4dc'] //button[text()='Stay signed out']")).click();
		
		driver.findElement(By.id("APjFqb")).sendKeys("india");
		List<WebElement> options = driver.findElements(By.className("sbct"));
		
		for (WebElement option : options)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}
}

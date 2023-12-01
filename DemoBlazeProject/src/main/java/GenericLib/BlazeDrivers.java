package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class BlazeDrivers {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String driverName)
	{
		if(driverName.equalsIgnoreCase("chrome"))
		System.setProperty("webdriver.chrome.driver",
				"..\\DemoBlazeProject\\Drivers\\chromedriver.exe" ); 
		driver = new ChromeDriver();
					
		System.out.println("Returning Browser");
		return driver;
	}
	
}

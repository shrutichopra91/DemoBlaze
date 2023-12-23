package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlazeDrivers {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String driverName)
	{
		if(driverName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"..\\DemoBlazeProject\\Drivers\\chromedriver.exe" ); 
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		}
		else if(driverName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"..\\DemoBlazeProject\\Drivers\\geckodriver.exe" );
			driver= new FirefoxDriver();
		}
		else if(driverName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",
					"..\\DemoBlazeProject\\Drivers\\msedgedriver.exe" );
			driver= new EdgeDriver();
		}
		System.out.println("Returning Browser");
		return driver;
	}
	
}

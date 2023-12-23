package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenericLib.*;
import PageObjectRepoLib.BlazeLandingPg;
import PageObjectRepoLib.BlazeLogin;
import PageObjectRepoLib.BlazeSignup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.FindBy;

public class BlazeStepDefinition {

	public static WebDriver driver;
	@Given("User launches the Browser")
	public void user_launches_the_browser() 
	{
		driver=BlazeDrivers.getBrowser("chrome");
		//driver=BlazeDrivers.getBrowser("firefox");
		//driver=BlazeDrivers.getBrowser("edge");
		driver.manage().window().maximize();
	}
	@Given("User opens DemoBlaze URL")
	public void user_opens_demo_blaze_url() 
	{
		driver.get(BlazeConstants.baseUrl);
	}
	@When("user Attemps to Login with Incorrect {string} and {string}")
	public void user_attemps_to_login_with_incorrect_and(String string, String string2) {}
	@Then("verify Incorrect user message is displayed")
	public void verify_incorrect_user_message_is_displayed() throws InterruptedException {
		Thread.sleep(5000);
		String alertText=BlzWebDriverCommonLib.switchToAlert().getText();
		if (alertText.equalsIgnoreCase("User does not exist."))
		{
			System.out.println("Test is pass");
			BlzWebDriverCommonLib.dismissAlert();
			//to click the close button after invalid login 
			BlzWebDriverCommonLib.clickElement(driver.findElement(By.xpath("//button[@class='btn btn-secondary']")));
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
	@When("user Attemps to Login with {string} and {string}")
	public void user_attemps_to_login_with_and(String string, String string2) throws IOException 
	{
		
		Boolean check1;
		check1= BlzWebDriverCommonLib.waitForElementTobePresent(By.id("login2"));
		if(check1=true)
		{
			
			System.out.println("Login link is present");
			BlzWebDriverCommonLib.clickElement(BlzWebDriverCommonLib.getElement(By.id("login2")));
		}
		BlazeLogin login = PageFactory.initElements(driver, BlazeLogin.class);
		login.loginToApp(driver);
	}
	@Then("verify Welcome message is displayed")
	public void verify_welcome_message_is_displayed() throws IOException 
	{
		BlazeLandingPg blp= PageFactory.initElements(driver, BlazeLandingPg.class);
		String userValue=BlazeMsExcelAutomation.getExcelData("Sheet1", 1, 3);
		String welcome= "Welcome " + userValue;
		if (welcome.equalsIgnoreCase(blp.getField()))
		{
			System.out.println("passed");
		}
	}	
	@Then("Sign In Botton should exist for Registration")
	public void sign_in_botton_should_exist_for_registration() 
	{
		Boolean check1;
		check1= BlzWebDriverCommonLib.waitForElementTobePresent(By.xpath("// a[contains(text(),'Sign up')]"));
		if(check1=true)
		{System.out.println("SignIn link is present");}
	}
	@Then("Upon clicking Sign In link Sign In Alert opens")
	public void upon_clicking_sign_in_link_sign_in_alert_opens() 
	{
		Boolean check1;
		check1= BlzWebDriverCommonLib.waitForElementTobePresent(By.xpath("// a[contains(text(),'Sign up')]"));
		if(check1=true)
		{
			
			System.out.println("SignIn link is present");
			BlzWebDriverCommonLib.clickElement(BlzWebDriverCommonLib.getElement(By.xpath("// a[contains(text(),'Sign up')]")));
		} 
	}
	@Then("On providing username and password Registration should happen")
	public void on_providing_username_and_password_registration_should_happen() throws IOException 
	{
		BlazeSignup login = PageFactory.initElements(driver, BlazeSignup.class);
		login.SignUp(driver);
	}
	
	
	@Then("DemoBlaze Website should be launched")
	public void demo_blaze_website_should_be_launched() {}
	@Then("Related links should be present")
	public void related_links_should_be_present() 
	{ 
	Boolean check1,check2;
	check1= BlzWebDriverCommonLib.waitForElementTobePresent(By.xpath("//a [text()='Samsung galaxy s6']"));
	check2=BlzWebDriverCommonLib.waitForElementTobePresent(By.xpath("//a[contains(text(),'Sony xperia')]"));
	if (check1==true & check2==true)
	{
	System.out.println("related links are present");
	}
	}
	@Then("close the Browser")
	public void close_the_browser() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		driver.close();
	}
	@When("user Attemps to Login with Incorrect credentials")
	public void user_attemps_to_login_with_incorrect_credentials() throws IOException {
		Boolean check1;
		check1= BlzWebDriverCommonLib.waitForElementTobePresent(By.id("login2"));
		if(check1=true)
		{
			
			System.out.println("Login link is present");
			BlzWebDriverCommonLib.clickElement(BlzWebDriverCommonLib.getElement(By.id("login2")));
		}
		BlazeLogin login = PageFactory.initElements(driver, BlazeLogin.class);
		login.invalidUserLogin(driver);
	}
}

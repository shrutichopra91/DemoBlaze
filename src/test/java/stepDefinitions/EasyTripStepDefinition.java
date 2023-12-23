package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BlazeConstants;
import GenericLib.BlazeDrivers;
import PageObjectRepoLib.BlazeLandingPg;
import PageObjectRepoLib.EasyTripFirstPg;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EasyTripStepDefinition
{
	public static WebDriver driver;
	@Given("I launch easy travel URL")
	public void I_launch_easy_travel_URL() 
	{
		driver=BlazeDrivers.getBrowser("chrome");
		driver.manage().window().maximize();
		driver.get(BlazeConstants.BookingsURL);
		
	}
	@When("I click on Traveller and Class")
	public void i_click_on_traveller_and_class() throws InterruptedException 
	{
		EasyTripFirstPg etp= PageFactory.initElements(driver, EasyTripFirstPg.class);
		etp.implement();
	}
	@Then("I should be able to add four adults")
	public void i_should_be_able_to_add_four_adults() 
	{
	   
	}
	@When("I select from dropdown")
	public void i_select_from_dropdown() throws InterruptedException 
	{
		EasyTripFirstPg etp= PageFactory.initElements(driver, EasyTripFirstPg.class);
		etp.toAndFrom();
	}
	@Then("I should be able to add from city and to city")
	public void i_should_be_able_to_add_from_city_and_to_city() 
	{
	}

}

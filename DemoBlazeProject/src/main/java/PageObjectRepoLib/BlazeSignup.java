package PageObjectRepoLib;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.BlzWebDriverCommonLib;
import GenericLib.BlazeConstants;
import GenericLib.BlazeDrivers;
import GenericLib.BlazeMsExcelAutomation;

public class BlazeSignup 
{
	@FindBy(id = "sign-username")
	private WebElement usernameBox;
	
	@FindBy(id = "sign-password")
	private WebElement passwordBox;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement SignUpButton;
	
	public void SignUp(WebDriver driver) throws IOException
	{
		System.out.println("Inside SignUp");
		String userValue=BlazeMsExcelAutomation.getExcelData("Sheet1", 1, 3);
		String passValue=BlazeMsExcelAutomation.getExcelData("Sheet1", 1, 4);
		System.out.println("userValue"+userValue);
		
		usernameBox.sendKeys(userValue);
		passwordBox.sendKeys(passValue);
		BlzWebDriverCommonLib.clickElement(SignUpButton);
		BlzWebDriverCommonLib.dismissAlert();
			
	}
	

}

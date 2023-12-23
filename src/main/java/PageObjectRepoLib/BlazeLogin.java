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

public class BlazeLogin 
{
	@FindBy(id = "loginusername")
	private WebElement usernameBox;
	
	@FindBy(id = "loginpassword")
	private WebElement passwordBox;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;
	
	public void loginToApp(WebDriver driver) throws IOException
	{
		System.out.println("Inside logintoApp");
		String userValue=BlazeMsExcelAutomation.getExcelData("Sheet1", 1, 3);
		String passValue=BlazeMsExcelAutomation.getExcelData("Sheet1", 1, 4);
		System.out.println("userValue"+userValue);
		
		usernameBox.sendKeys(userValue);
		passwordBox.sendKeys(passValue);
		BlzWebDriverCommonLib.clickElement(loginButton);
		//BlzWebDriverCommonLib.dismissAlert();
			
	}
	
	public void invalidUserLogin(WebDriver driver) throws IOException 
	{
		System.out.println("Inside invalidUserLogin");
		String userValue=BlazeMsExcelAutomation.getExcelData("Sheet1", 2, 3);
		String passValue=BlazeMsExcelAutomation.getExcelData("Sheet1", 2, 4);
		System.out.println("userValue"+userValue);
		
		usernameBox.sendKeys(userValue);
		passwordBox.sendKeys(passValue);
		BlzWebDriverCommonLib.clickElement(loginButton);
		
	}

	
	

}

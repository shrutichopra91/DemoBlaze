package PageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.BlzWebDriverCommonLib;

public class BlazeLandingPg 
{
	@FindBy(xpath = "//a[starts-with(text(),'Welcome')]")
	private WebElement welcomeField;

	public String getField() 
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	String field = welcomeField.getText();
	System.out.println("Field2: "+field);
	return field;
	}
}

package PageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EasyTripFirstPg 
{
	/* to select the traveller */
	@FindBy(id = "iDownArr")
	private WebElement travellerDropdown;
	// to add the traveller
	@FindBy(xpath="//button[@id='add' and @field='quantity']")
	private WebElement addButton;
	/* to click on 'from'
	@FindBy(xpath="//span[@class='flsctrhead' and text()='Goa(GOI)' and @xpath='1']")
	private WebElement fromField;
	*/
	@FindBy(id="FromSector_show")
	private WebElement fromTextField;
	
	//@FindBy(xpath="//input[@class='hide-txtbox input_city ac_input' and @placeholder='To']")
	//private WebElement toTextField;
	@FindBy(xpath="(//span[@class='flsctrhead' and text()='Goa(GOI)'])[1]")
	private WebElement fromField;
	@FindBy(xpath="(//span[@class='flsctrhead' and text()='Dubai(DXB)'])[2]")
	//private WebElement toField;
	//@FindBy(id="spn9")
	private WebElement toField;	
	public void implement() throws InterruptedException
	{
		Thread.sleep(5000);
		travellerDropdown.click();
		String field = travellerDropdown.getText();
		System.out.println("Element selected is: "+field);
		for (int i=1;i<=3;i++)
		{
		addButton.click();
		}
	}
	
	public void toAndFrom() throws InterruptedException
	{
		Thread.sleep(5000);
		fromTextField.click();
		fromField.click();
	//	toTextField.click();
		Thread.sleep(2000);
		toField.click();
	}
}

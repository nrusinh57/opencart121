package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
//Constructor
	public HomePage(WebDriver driver) {
		super(driver);	
	}
	//Locators
	@FindBy(xpath="//span[text()='My Account']")
	WebElement clickMyAcC;
	@FindBy(xpath="//a[text()='Register']")
	WebElement clickRegister;
	@FindBy(xpath="//a[text()='Login']")
	WebElement click_login;
	
	//Actions Method
	public void clickMyACC()
	{
		clickMyAcC.click();
	}
	public void clickRegister()
	{
		clickRegister.click();
	}
	public void clicklogin() {
		click_login.click();
	}
	

}

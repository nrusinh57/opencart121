package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {

	public MyAccount(WebDriver driver) {
		super(driver);

	}
	// Loacators

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmation_Message;

	@FindBy(xpath = "//h2[normalize-space()='My Orders']")
	WebElement txt_myAccount;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btn_logout;
	@FindBy(xpath = "//div[@id='content'] /h1")
	WebElement verify_LogOut;

//Action Method
	public boolean confirm_msg() {

		try {
			return (confirmation_Message.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean verifyLoginAccount() {
		try {
			return (txt_myAccount.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void logOut() {
		btn_logout.click();
	}

	public boolean verify_LogoutDone() {
		try {
			return (verify_LogOut.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
			assert false;
		}
		return false;
	}
}

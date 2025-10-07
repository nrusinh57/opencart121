package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {
	// constructor
	public AccountRegistration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// Locators

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txt_firstname;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txt_lastname;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_email;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txt_mobile;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_password;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txt_cnfpassword;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement btn_newsletter;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chk_privacy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btn_continue;

	// Actions Method
	public void set_FirstName(String fname) {
		txt_firstname.sendKeys(fname);
	}

	public void set_LastName(String lname) {
		txt_lastname.sendKeys(lname);
	}

	public void set_Email(String email) {
		txt_email.sendKeys(email);
	}

	public void set_Mobile(String mo) {
		txt_mobile.sendKeys(mo);
	}

	public void set_Password(String pwd) {
		txt_password.sendKeys(pwd);
	}

	public void set_cnfPassword(String pwd) {
		txt_cnfpassword.sendKeys(pwd);
	}

	public void radioBtn() {
		btn_newsletter.click();
	}

	public void chkboxPrivacy() {
		chk_privacy.click();
	}

	public void submit() {
		btn_continue.click();
	}
}

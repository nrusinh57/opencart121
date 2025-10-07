package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import masterClass.BaseClass;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccount;

public class TC002_LoginTest extends BaseClass {

	@Test(groups= {"sanity","regration","master"})
	public void login() {
		logger.info("****Tc002_LoginTest Started****");
		// HomePage
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyACC();
			hp.clicklogin();
			// Login Page
			LoginPage lp = new LoginPage(driver);
			lp.setemail(p.getProperty("username"));
			lp.setpassword(p.getProperty("password"));
			lp.clickLogin();
			// My Account
			MyAccount myacc = new MyAccount(driver);
			boolean target_Page = myacc.verifyLoginAccount();
			Assert.assertTrue(target_Page);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}

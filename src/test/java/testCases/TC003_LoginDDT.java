package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import masterClass.BaseClass;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccount;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class,groups={"data driven","master"})
	public void loginDDT(String user, String pwd, String exp) {
		logger.info("****TC003_LoginDDT STARTED****");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyACC();
			hp.clicklogin();
			// Login Page
			LoginPage lp = new LoginPage(driver);
			lp.setemail(user);
			lp.setpassword(pwd);
			lp.clickLogin();
			// My Account
			MyAccount myacc = new MyAccount(driver);
			boolean target_Page = myacc.verifyLoginAccount();

			// valid data--login pass--test pass--logout
			// --login fail--test fail
			// invalid Data --login pass--test fail--logOut
			// --login fail--test pass

			if (exp.equalsIgnoreCase("valid")) {
				if (target_Page == true) {
					myacc.logOut();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}

			}
			if (exp.equalsIgnoreCase("invalid")) {
				if (target_Page == true) {
					myacc.logOut();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("****TC003_LoginDDT Finished****");
	}

}

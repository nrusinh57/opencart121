package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import masterClass.BaseClass;
import pageObject.AccountRegistration;
import pageObject.HomePage;
import pageObject.MyAccount;

public class TC001_AccCreation extends BaseClass {

	@Test(groups={"sanity","master"})
	public void verifyAcc() throws Exception {

		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
		try {

			HomePage hp = new HomePage(driver);
			hp.clickMyACC();
			hp.clickRegister();
			logger.info("Clicked on Register Link.. ");
			AccountRegistration acc = new AccountRegistration(driver);

			logger.info("Providing customer details...");
			acc.set_FirstName(Alphabetic().toUpperCase());
			acc.set_LastName(Alphabetic().toUpperCase());
			acc.set_Email(Alphabetic() + "@gmail.com");
			acc.set_Mobile(numeric());
			String password = alphanumeric();
			acc.set_Password(password);
			acc.set_cnfPassword(password);
			acc.radioBtn();
			acc.chkboxPrivacy();
			acc.submit();
			MyAccount myacc = new MyAccount(driver);
			boolean cnfmessage = myacc.confirm_msg();

			logger.info("Validating expected message..");
			Assert.assertTrue(cnfmessage);

			logger.info("Test passed");
		} catch (Exception e) {

			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());

		}
		logger.info("***** Finished TC001_AccountRegistrationTest *****");

	}

}

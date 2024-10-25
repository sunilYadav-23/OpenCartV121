package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001AccountRegistrationTest extends BaseClass {

	@Test (groups = {"Master" ,"Regressipn"})
	public void Varify_account_registration() {

		logger.info("**** Statrting_TC001AccountRegistrationTest ****");
		try {
			HomePage hP = new HomePage(driver);

			hP.clickMyAccount();

			logger.info("Clicked On MyAccount");
			hP.clickRegister();

			logger.info("Clicked On Register");

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

			logger.info("Providing Customer Details");

			regpage.setFirstName(randomeString().toUpperCase());
			regpage.setSecondName(randomeString().toUpperCase());
			regpage.setEmail(randomeString() + "@gmail.com");
			regpage.setTelephone(randomeNumber());

			String Password = randomeAlphaNumberic();

			regpage.setPassword(Password);
			regpage.setConfirmPassword(Password);
			regpage.setPrivicyPolicy();
			regpage.clickContinue();

			logger.info("Validating Expected Message");
			String confmsg = regpage.getConfirmationMsg();

			if (confmsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);

			} else {
				logger.error(" Test Failed...");
				logger.debug("Debug logs...");
				Assert.assertTrue(false);

			}

		} catch (Exception e) {

			Assert.fail();
		}

		logger.info("**** Finished_TC001AccountRegistrationTest ****");

	}

}

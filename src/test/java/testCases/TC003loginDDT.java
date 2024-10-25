package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003loginDDT extends BaseClass {
	@Test 
	(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
 
	public void varify_loginDDT(String username, String pwd, String exp) {
		logger.info("***** Started TC003loginDDT ******");
		try {
			HomePage hP = new HomePage(driver);
			hP.clickMyAccount();
			hP.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword(pwd);
			lp.Clicklogin();

			MyAccountPage mcc = new MyAccountPage(driver);
			boolean targetpage = mcc.isMyAccountPageExist();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetpage == true) {
					mcc.Clicklogout();
					Assert.assertTrue(true);

				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("invalid")) {
				if (targetpage == true) {
					mcc.Clicklogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}

			}
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("***** Finished TC003loginDDT ******");

	}

}

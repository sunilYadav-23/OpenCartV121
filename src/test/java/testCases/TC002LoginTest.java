package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002LoginTest extends BaseClass {
	@Test (groups = {"Sanity" ,"Master"})
	public void varify_Login() {
		logger.info("***** Start TC002LoginTest ******");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp =new LoginPage(driver);
		lp.setUsername(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.Clicklogin();
		
		MyAccountPage mcc = new MyAccountPage(driver);
		boolean target = mcc.isMyAccountPageExist();
		Assert.assertTrue(target);
		
		mcc.Clicklogout();
		} catch (Exception e) {
			Assert.fail();
		}
		
		logger.info("***** Finished TC002LoginTest******");
		
		
		
		
		
	}
	

}

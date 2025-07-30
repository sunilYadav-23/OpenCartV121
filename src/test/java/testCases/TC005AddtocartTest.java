package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddtocartPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC005AddtocartTest extends BaseClass {
	@Test (groups = {"Master"})
	public void varify_addtocart() {
		logger.info("***** Starte TC005AddtocartTest *****");
		try {
			HomePage hp = new HomePage(driver);
			hp.productName(p.getProperty("searchProductName"));
			hp.clickSearch();
			AddtocartPage ap = new AddtocartPage(driver);
			ap.selectProduct();
			ap.clearQuanititycolumn();
			ap.setQuantity(p.getProperty("QuantityOfProduct"));
			ap.clickAddtocart();
			Assert.assertEquals(ap.confirmationmsg(), true);

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("***** Finished TC005AddtocartTest ******");

	}
}

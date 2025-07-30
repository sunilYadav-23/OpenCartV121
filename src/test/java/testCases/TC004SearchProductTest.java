package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.searchPage;
import testBase.BaseClass;

public class TC004SearchProductTest extends BaseClass {
	@Test (groups = {"Master"})
	public void varify_searchProduct() {
		logger.info("****Starting TC004SearchProductTest****");
		try {
			HomePage hp = new HomePage(driver);
			hp.productName(p.getProperty("searchProductName"));
			hp.clickSearch();
			searchPage sp = new searchPage(driver);
			sp.isProductExists();
			Assert.assertEquals(sp.isProductExists(), true);
			
		} catch (Exception e) {
			Assert.fail();
			
		}
		
		logger.info("****Finished TC004SearchProductTest****");
		
		
		
	}

}

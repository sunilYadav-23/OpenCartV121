package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchPage extends BasePage {

	public searchPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@class='product-thumb']")
	WebElement product;
	
	public boolean isProductExists() {
		try {
			
			return (product.isDisplayed());
		} catch (Exception e) {
			return false;
		}
		
	}
	
	
	
	

}

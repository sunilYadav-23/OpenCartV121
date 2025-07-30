package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtocartPage extends BasePage {

	public AddtocartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='product-thumb']")

	WebElement selectProduct;

	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement Quantity;
	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement quantitycolumn;

	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement lnkAddtocart;

//	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	@FindBy(xpath = "//a[normalize-space()='shopping cart']")
	WebElement confmsg;

	public void selectProduct() {
		selectProduct.click();
	}

	public void clearQuanititycolumn() {
		quantitycolumn.clear();

	}

	public void setQuantity(String quantity) {

		Quantity.sendKeys(quantity);

	}

	public void clickAddtocart() {
		lnkAddtocart.click();
	}

	public boolean confirmationmsg() {
		try {
			return (confmsg.isDisplayed());

		} catch (Exception e) {
			return false;
		}
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;
	public HomePage(WebDriver driver){
		super(driver);
	}
	@FindBy(xpath = ("//span[normalize-space()='My Account']"))
	
	WebElement lnkMyaccount;
	
	@FindBy(xpath="(//a[normalize-space()='Register'])[1]")
	
	
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement productName;
	
	@FindBy(xpath="//span[@class='input-group-btn']")
	WebElement lnksearch;
	
	public void clickMyAccount() {
		
	lnkMyaccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	

	public void productName(String product) {
		productName.sendKeys(product);
	}
	
	public void clickSearch() {
		lnksearch.click();
	}

}

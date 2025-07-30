package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnlogin;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement btnLogout;
	
	public void setUsername(String user) {

		txtusername.sendKeys(user);
	}

	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}

	public void Clicklogin() {
		btnlogin.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
		
	}

}

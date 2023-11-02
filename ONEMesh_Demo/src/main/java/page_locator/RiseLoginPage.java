package page_locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RiseLoginPage extends BasePageFactory {
	protected WebDriver driver;

	public RiseLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "email")
	WebElement txtUser;
	@FindBy(name = "password")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;
	
	
	
	public void clickLogin(String uservalue, String passwordvalue) {
		txtUser.clear();
		txtUser.sendKeys(uservalue);
		txtPassword.clear();
		txtPassword.sendKeys(passwordvalue);
		btnLogin.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

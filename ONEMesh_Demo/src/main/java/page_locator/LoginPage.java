package page_locator;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
}
}
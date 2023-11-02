package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
}
	//Properties
	By txtUser = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type = 'submit']");
	By NotifiLogin = By.xpath("//p[text() = 'Invalid credentials']");
	By ClickProfile = By.xpath("//i[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	By ClickLogout = By.xpath("//a[text() = 'Logout']");
//	public By getTxtUser() {
//		setTxtUser(txtUser);
//		return txtUser;
//	}
//	public void setTxtUser(By txtUser) {
//		this.txtUser = By.name("username");
//	}
//	public By getTxtPassword() {
//		setTxtPassword(txtPassword);
//		return txtPassword;
//	}
//	public void setTxtPassword(By txtPassword) {
//		this.txtPassword = By.name("password");
//	}
//	public By getBtnLogin() {
//		setBtnLogin(btnLogin);
//		return btnLogin;
//	}
//	public void setBtnLogin(By btnLogin) {
//		this.btnLogin = By.xpath("//button[@type = 'submit']");
//	}
	
	
	//Action
	public void setUserNameValue() {
		//WebElement userName = driver.findElement(getTxtUser());
		WebElement userName = driver.findElement(txtUser);
		userName.sendKeys("Admin");
	}
	public void setPasswordValue() {
		//WebElement password = driver.findElement(getTxtPassword());
		WebElement password = driver.findElement(txtPassword);
		password.sendKeys("admin123");
	}
	public void clickLogin() {
		//WebElement loginElement = driver.findElement(getBtnLogin());
		WebElement loginElement = driver.findElement(btnLogin);
		loginElement.click();
	}
	public void setUserNameValueFailed() {
		WebElement userName = driver.findElement(txtUser);
		userName.sendKeys("Admin1");
	}
	public void setPasswordValueFailed() {
		//WebElement password = driver.findElement(getTxtPassword());
		WebElement password = driver.findElement(txtPassword);
		password.sendKeys("admin12345");
	}
	public void Notification() {
		WebElement notifiElement = driver.findElement(NotifiLogin);
		System.out.println(notifiElement.getText());
	}
	public void ClickProfile() {
		WebElement clickProfile = driver.findElement(ClickProfile);
		clickProfile.click();
	}
	public void ClickLogout() {
		WebElement clickLogout = driver.findElement(ClickLogout);
		clickLogout.click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Link màn hình logout: " + currentUrl);
		if (currentUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("Đúng màn hình Logout/ Passed");
		} else {
			System.out.println("Sai màn hình Logout/ Failed");
		}
	}
}
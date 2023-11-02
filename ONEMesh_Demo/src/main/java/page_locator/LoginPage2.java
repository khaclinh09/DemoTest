package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BasePage {
	protected WebDriver driver;

	public LoginPage2(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Properties
	@FindBy(name = "txtLoginUsername")
	WebElement txtEmail;
	@FindBy(name = "txtLoginPassword")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement btnLogin;
	@FindBy(xpath = "//li[@id = 'showsub']//a[@rel = 'nofollow']")
	WebElement ClickProfile;
	@FindBy(xpath = "//a[text() = 'Chỉnh sửa thông tin']")
	WebElement InkEditUser;
	@FindBy(id = "txtnewpass")
	WebElement txtNewPassword;
	@FindBy(id = "txtrenewpass")
	WebElement txtReNewPassword;
	@FindBy(xpath = "//button[text() = 'Lưu mật khẩu mới']")
	WebElement btnSavePass;

	// Action
	public void clickLogin(String uservalue, String passwordvalue) {
		txtEmail.clear();
		txtEmail.sendKeys(uservalue);
		txtPassword.clear();
		txtPassword.sendKeys(passwordvalue);
		btnLogin.click();
	}
	public void clickProfile() {
		ClickProfile.click();

	}
	public void EditUser() {
		InkEditUser.click();

	}
	public void NewPassword(String newpasswordvalue) {
		txtNewPassword.sendKeys(newpasswordvalue);;

	}
	public void ReNewPassword(String renewpasswordvalue) {
		txtReNewPassword.sendKeys(renewpasswordvalue);;

	}
	public void clickbtnSavePass() {
		btnSavePass.click();

	}
	
}
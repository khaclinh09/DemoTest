package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.LoginPage2;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class Homework_14 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@Test
	@Ignore
	public void Login() {
		LoginPage2 login = new LoginPage2(driver);
		login.clickLogin("khaclinh09@gmail.com", "1234567890");
		cb.pause(2000);
	}
	@Test
	@Ignore
	public void ClickEditProfile() {
		LoginPage2 login = new LoginPage2(driver);
		login.clickLogin("khaclinh09@gmail.com", "1234567890");
		cb.pause(2000);
		login.clickProfile();
		cb.pause(2000);
		login.EditUser();
		cb.pause(2000);
	}
	@Test
	public void EditPassword() {
		LoginPage2 login = new LoginPage2(driver);
		login.clickLogin("khaclinh09@gmail.com", "1234567890");
		cb.pause(2000);
		login.clickProfile();
		cb.pause(2000);
		login.EditUser();
		cb.pause(2000);
		login.NewPassword("12345678");
		cb.pause(2000);
		login.ReNewPassword("12345678");
		cb.pause(2000);
		login.clickbtnSavePass();
		cb.pause(2000);
	}
	@Test
	@Ignore
	public void ReLogin() {
		LoginPage2 login = new LoginPage2(driver);
		login.clickLogin("khaclinh09@gmail.com", "12345678");
		cb.pause(2000);
	}
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(constants.Test1_WebInfo.aladaUrl);
		cb.pause(5000);
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}

package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Homework_13 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@Test
	@Ignore
	public void LoginPassed() {
		LoginPage login = new LoginPage(driver);
		login.setUserNameValue();
		login.setPasswordValue();
		login.clickLogin();
		cb.pause(2000);

	}

	@Test
	@Ignore
	public void LoginFailedByUser() {
		LoginPage login = new LoginPage(driver);
		login.setUserNameValueFailed();
		login.setPasswordValue();
		login.clickLogin();
		cb.pause(2000);
		login.Notification();
		cb.pause(2000);
	}
	@Test
	@Ignore
	public void LoginFailedByPassword() {
		LoginPage login = new LoginPage(driver);
		login.setUserNameValue();
		login.setPasswordValueFailed();
		login.clickLogin();
		cb.pause(2000);
		login.Notification();
		cb.pause(2000);
	}
	@Test
	@Ignore
	public void LoginFailedByPasswordAndUser() {
		LoginPage login = new LoginPage(driver);
		login.setUserNameValueFailed();
		login.setPasswordValueFailed();
		login.clickLogin();
		cb.pause(2000);
		login.Notification();
		cb.pause(2000);
	}
	@Test
	public void CheckLogout() {
		LoginPage login = new LoginPage(driver);
		login.setUserNameValue();
		login.setPasswordValue();
		login.clickLogin();
		cb.pause(2000);
		login.ClickProfile();
		cb.pause(2000);
		login.ClickLogout();
		
	}
	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(constants.Test1_WebInfo.orangeUrl);
		cb.pause(10000);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

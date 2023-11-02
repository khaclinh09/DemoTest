package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.RiseAddClientPage;
import page_locator.RiseClientPage;
import page_locator.RiseDashboardPage;
import page_locator.RiseLoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Homework_15 {
	CommonBrowser cb;
	WebDriver driver;
	CommonActions actions;

	@Test
	public void AddClient() {
		RiseLoginPage login = new RiseLoginPage(driver);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabClient();
		RiseClientPage client = new RiseClientPage(driver);
		client.addClient();
		RiseAddClientPage addClientForm = new RiseAddClientPage(driver);
		addClientForm.saveNewClient("123 Company", "HaNoi", "123", "111", "222");
		
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
		driver = cb.initChromeDriver(constants.Test1_WebInfo.riseUrl);
		cb.pause(4000);
	}

	@AfterTest
	public void afterTest() {
		cb.quitDriver(driver);
	}

}

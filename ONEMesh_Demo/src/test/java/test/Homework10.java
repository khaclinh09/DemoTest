package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Homework10 {
	WebDriver driver;
	CommonBrowser cb;
	CommonActions actions;

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
		driver = cb.initChromeDriver("https://alada.vn/tai-khoan/dang-nhap.html");
		cb.pause(10000);
	}

	@Test
	public void FillData() {
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id = 'txtLoginUsername']"));
		actions.sendKeys(txtEmail, "khaclinh09@gmail.com");
		cb.pause(1000);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id = 'txtLoginPassword']"));
		actions.sendKeys(txtPassword, "1234567890");
		cb.pause(1000);
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type = 'submit']"));
		btnLogin.click();
		cb.pause(10000);
	}

	@Test
	public void FillDataForHomework10_2() {

	}

	@AfterTest
	public void afterTest() {
		cb.quitDriver(driver);
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}

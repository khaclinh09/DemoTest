package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Homework_11 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;
@Test	
  public void Bai1() {
	  WebElement btnCheckbox = driver.findElement(By.id("isAgeSelected"));
	  cb.pause(1000);
 
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
	  public void initBrowser() {
			cb = new CommonBrowser();
			driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
  }

  @AfterTest
  public void afterTest() {
	  cb.quitDriver(driver);
  }

}

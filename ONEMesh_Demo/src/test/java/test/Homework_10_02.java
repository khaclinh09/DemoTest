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

public class Homework_10_02 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;
	
@Test
public void Bai2 ()
{
	WebElement btnRadio1 = driver.findElement(By.xpath("//div[@class = 'panel-body']//div//input[@value = 'Male']"));
	btnRadio1.click();
	cb.pause(1000);
	WebElement btnRadio2 = driver.findElement(By.xpath("//div[@class = 'panel-body']//div//input[@value = 'Female']"));
	btnRadio2.click();
	cb.pause(1000);
	WebElement btnRadio3 = driver.findElement(By.xpath("//div[@class = 'panel-body']//div//input[@value = '0 - 5']"));
	btnRadio3.click();
	cb.pause(1000);
	WebElement btnRadio4 = driver.findElement(By.xpath("//div[@class = 'panel-body']//div//input[@value = '5 - 15']"));
	btnRadio4.click();
	cb.pause(1000);
	WebElement btnRadio5 = driver.findElement(By.xpath("//div[@class = 'panel-body']//div//input[@value = '15 - 50']"));
	btnRadio5.click();
	cb.pause(1000);
	WebElement btnGet = driver.findElement(By.xpath("//button[@class = 'btn btn-default' and text() = 'Get values']"));
	btnGet.click();
	
	
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
		driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
  }

  @AfterTest
  public void afterTest() {
	  cb.quitDriver(driver);
  }

}

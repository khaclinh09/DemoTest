package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Homework_12 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;

	@Test
  public void f() {
	  
	  driver = cb.initChromeDriver("https://demo.seleniumeasy.com/input-form-demo.html");
		Select List1 = new Select(driver.findElement(By.xpath("//select[@name = 'state']")));
		List1.selectByIndex(2);
		cb.pause (2000);
		List1.selectByIndex(4);
		cb.pause(2000);
		List1.selectByIndex(6);
		cb.pause(2000);
		List1.selectByIndex(8);
		cb.pause(2000);
		List1.selectByIndex(10);
		cb.pause(2000);
		WebElement btnRadio1 = driver.findElement(By.xpath("//div[@class = 'radio']//input[@value = 'yes']"));
		if (!btnRadio1.isSelected()){
			btnRadio1.click();
		}
		cb.pause(2000);
		WebElement btnRadio2 = driver.findElement(By.xpath("//div[@class = 'radio']//input[@value = 'no']"));
		if (!btnRadio2.isSelected()){
			btnRadio2.click();
		}
		cb.pause(2000);
		
		
 }

	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
	}

	@AfterTest
	public void afterTest() {
		// cb.quitDriver(driver);
	}

}

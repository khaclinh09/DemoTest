package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit8_1 {

	public static void main(String[] args) {
		// TODO Locate element

		CommonBrowser cb = new CommonBrowser();
		String hrmURL = "https://selectorshub.com/xpath-practice-page/";
		WebDriver driver = cb.initChromeDriver(hrmURL);
		cb.pause(5000);
		WebElement txtuser = driver.findElement(By.id("userId")) ;
		txtuser.clear();
		txtuser.sendKeys("khaclinh09@gmail.com");
		WebElement passID = driver.findElement(By.id("pass")) ;
		passID.clear();
		passID.sendKeys("1234567890");
		WebElement txtcompany = driver.findElement(By.name("company")) ;
		txtcompany.clear();
		txtcompany.sendKeys("SMV");
		WebElement txtphone = driver.findElement(By.name("mobile number")) ;
		txtphone.clear();
		txtphone.sendKeys("0941228986");
		cb.pause(3000);
		cb.quitDriver(driver);
		
		
	}

}

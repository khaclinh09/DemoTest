package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String autoURL = "https://selectorshub.com/xpath-practice-page/";
		WebDriver driver = cb.initChromeDriver(autoURL);
		cb.pause(5000);
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='userId']"));
		txtemail.sendKeys("123@gmail.com");
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpass.sendKeys("1234567890");
		WebElement txtcompany = driver.findElement(By.xpath("//input[@name='company']"));
		
		txtcompany.sendKeys("VNPT");
		WebElement txtmobile = driver.findElement(By.xpath("//input[@name='mobile number']"));
		
		txtmobile.sendKeys("0941228986");
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
		btnSubmit.click();
		cb.pause(3000);
		cb.quitDriver(driver);
	}

}

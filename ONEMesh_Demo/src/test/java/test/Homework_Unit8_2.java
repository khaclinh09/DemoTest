package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String autoURL = "https://automationfc.github.io/basic-form/index.html";
		WebDriver driver = cb.initChromeDriver(autoURL);
		cb.pause(5000);
		WebElement txtname = driver.findElement(By.id("name")) ;
		txtname.clear();
		txtname.sendKeys("Nguyen Van A");
		WebElement textaddress = driver.findElement(By.id("address")) ;
		textaddress.clear();
		textaddress.sendKeys("123ABCD");
		WebElement txtemail = driver.findElement(By.id("email")) ;
		txtemail.clear();
		txtemail.sendKeys("khaclinh09@gmail.com");
		WebElement txtpass = driver.findElement(By.id("password")) ;
		txtpass.clear();
		txtpass.sendKeys("0941228986");
		cb.pause(3000);
		cb.quitDriver(driver);
	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String autoURL = "https://chercher.tech/practice/dynamic-table";
		WebDriver driver = cb.initChromeDriver(autoURL);
		cb.pause(5000);
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='blue']"));
		btn1.click();
		cb.pause(3000);
		WebElement btn2 = driver.findElement(By.xpath("//button[text() = 'Orange']"));
		btn2.click();
		cb.pause(3000);
		WebElement btn3 = driver.findElement(By.xpath("//button[text() = 'Juice']"));
		btn3.click();
		cb.pause(3000);
		WebElement btn4 = driver.findElement(By.xpath("//button[text() = 'banana']"));
		btn4.click();
		cb.pause(3000);
		WebElement btn5 = driver.findElement(By.xpath("//button[text() = 'Banana \"Juice']"));
		btn5.click();
		cb.pause(3000);
		WebElement btn6 = driver.findElement(By.xpath("//input[@value='     Zack    Snyder    ']"));
		btn6.click();
		cb.pause(3000);
		
		
		cb.pause(3000);
		cb.quitDriver(driver);
	}

}

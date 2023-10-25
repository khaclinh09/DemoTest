package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String autoURL = "https://www.google.com.vn/";
		WebDriver driver = cb.initChromeDriver(autoURL);
		cb.pause(5000);
		WebElement logo = driver.findElement(By.xpath("//div[@class = 'k1zIA rSk4se']//img[@class = 'lnXdpd']"));
		System.out.println(logo.getText());
		cb.pause(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class = 'a4bIc']//textarea[@class = 'gLFyf']"));
		text1.sendKeys("phone");
		cb.pause(3000);
		WebElement click = driver.findElement(By.xpath("//div[@class = 'L3eUgb']//div[@class = 'o3j99 ikrT4e om7nvf']"));
		click.click();
		WebElement btn1 = driver.findElement(By.xpath("//div[@class = 'FPdoLc lJ9FBc']//input[@class = 'gNO89b']"));
		btn1.click();

		cb.pause(3000);
		cb.quitDriver(driver);
	}

}

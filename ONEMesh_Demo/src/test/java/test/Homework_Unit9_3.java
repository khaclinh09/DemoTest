package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String autoURL = "https://selectorshub.com/xpath-practice-page/";
		WebDriver driver = cb.initChromeDriver(autoURL);
		cb.pause(5000);
		WebElement element1 = driver.findElement(By.xpath("//table[@id= 'resultTable']//td[@class= 'left']//a[text() = 'John.Smith']"));
		System.out.println(element1.getText());
		WebElement element2 = driver.findElement(By.xpath("//table[@id= 'resultTable']//td[@class= 'left']//a[text() = 'Jordan.Mathews']"));
		System.out.println(element2.getText());
		WebElement element3 = driver.findElement(By.xpath("//table[@id= 'resultTable']//td[@class= 'left']//a[text() = 'Kevin.Mathews']"));
		System.out.println(element3.getText());
		
		
		cb.pause(3000);
		cb.quitDriver(driver);
	}

}

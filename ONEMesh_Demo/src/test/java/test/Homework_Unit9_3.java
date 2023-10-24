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
		WebElement element1 = driver.findElement(By.xpath("//table[@id= 'resultTable']//td[@class= 'left']//a[3]"));
		System.out.println(element1.getText());
		
	
		
		
		cb.pause(3000);
		cb.quitDriver(driver);
	}

}

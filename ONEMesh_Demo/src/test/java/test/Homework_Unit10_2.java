package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String autoURL = "https://alada.vn/tai-khoan/dang-nhap.html";
		WebDriver driver = cb.initChromeDriver(autoURL);
		cb.pause(3000);
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id = 'txtLoginUsername']"));
		txtEmail.sendKeys("khaclinh09@gmail.com");
		cb.pause(1000);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id = 'txtLoginPassword']"));
		txtPassword.sendKeys("1234567890");
		cb.pause(1000);
		WebElement btnLogin = driver.findElement(By.xpath("//div[@class = 'field']//button[text() = 'ĐĂNG NHẬP']"));
		btnLogin.click();
		cb.pause(3000);
		//WebElement avatar = driver.findElement(By.xpath("//div[@class = 'avatar2']//i[@class = 'fa fa-caret-down']"));
		//avatar.click();
		//cb.pause(1000);
		WebElement EditProfile = driver.findElement(By.xpath("//div[@class = 'info']//a[text() = 'Chỉnh sửa thông tin']"));
		EditProfile.click();
		cb.pause(1000);
		
		
		
		
		cb.pause(3000);
		//cb.quitDriver(driver);
	}

}

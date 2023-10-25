package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonBrowser;

public class Homework_Unit10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String autoURL = "https://alada.vn/tai-khoan/dang-ky.html";
		WebDriver driver = cb.initChromeDriver(autoURL);
		cb.pause(5000);
		WebElement txtHoTen = driver.findElement(By.xpath("//input[@id = 'txtFirstname']"));
		txtHoTen.sendKeys("Nguyễn Khắc Linh");
		cb.pause(1000);
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id = 'txtEmail']"));
		txtEmail.sendKeys("khaclinh09@gmail.com");
		cb.pause(1000);
		WebElement txtNhaplaiEmail = driver.findElement(By.xpath("//input[@id = 'txtCEmail']"));
		txtNhaplaiEmail.sendKeys("khaclinh09@gmail.com");
		cb.pause(1000);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
		txtPassword.sendKeys("1234567890");
		cb.pause(1000);
		WebElement txtNhaplaiPassword = driver.findElement(By.xpath("//input[@id = 'txtCPassword']"));
		txtNhaplaiPassword.sendKeys("1234567890");
		cb.pause(1000);
		WebElement txtPhone = driver.findElement(By.xpath("//input[@id = 'txtPhone']"));
		txtPhone.sendKeys("0941228986");
		cb.pause(1000);
		WebElement btnDangky = driver.findElement(By.xpath("//div[@class = 'field_btn']//button[text() = 'ĐĂNG KÝ']"));
		btnDangky.click();
		cb.pause(3000);
		cb.quitDriver(driver);
	}

}

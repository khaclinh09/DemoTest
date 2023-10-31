package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class Homework_11 {
	CommonBrowser cb;
	CommonActions actions;
	WebDriver driver;
	
@Test	
@Ignore
  public void Checkbox() 
{
	driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html"); 
	List<WebElement> btnCheckbox = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
	  for (WebElement webElement : btnCheckbox){
	  if (!webElement.isSelected()){
		  webElement.click();
	  }
	}
	  cb.pause(2000);
}  
@Test
@Ignore
public void Checkbox1() 
{
	driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	WebElement btnCheckbox1 = driver.findElement(By.xpath("//input[@type = 'checkbox' and @id = 'isAgeSelected']"));
	  if (!btnCheckbox1.isSelected()){
		  btnCheckbox1.click();
	  }
	  cb.pause(2000);
}  
@Test
@Ignore
public void Checkbox2() 
{
	driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	WebElement btnCheckbox2 = driver.findElement(By.xpath("//input[@type = 'checkbox' and @class = 'cb1-element']"));
	  if (!btnCheckbox2.isSelected()){
		  btnCheckbox2.click();
	  }
	  cb.pause(2000);
}  
@Test
@Ignore
public void Checkbox3() 
{
	driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	WebElement btnCheckbox3 = driver.findElement(By.xpath("//input[@type = 'checkbox' and text() = 'Default Checked ']"));
	  if (!btnCheckbox3.isSelected()){
		  btnCheckbox3.click();
	  }
	  cb.pause(2000);
}  
@Test
@Ignore
public void DropDownList() 
{
	driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	Select List1 = new Select(driver.findElement(By.id("select-demo")));
	List1.selectByIndex(2);
	cb.pause (2000);
	List1.selectByValue("Thursday");
	cb.pause(2000);
}  
@Test
public void BT2() 
{
	driver = cb.initChromeDriver("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
	cb.pause(5000);
	WebElement btnRadio1 = driver.findElement(By.id("one-way-tab"));
	if (!btnRadio1.isSelected()){
		btnRadio1.click();}
	cb.pause(2000);
	WebElement btnRadio2 = driver.findElement(By.id("round-trip-tab"));
	if (!btnRadio2.isSelected()){
		btnRadio2.click();}
	cb.pause(2000);
	WebElement btnRadio3 = driver.findElement(By.id("multi-city-tab"));
	if (!btnRadio3.isSelected()){
		btnRadio3.click();}
	cb.pause(2000);
	WebElement btnRadio4 = driver.findElement(By.id("one-way-tab"));
	if (!btnRadio4.isSelected()){
		btnRadio4.click();}
	cb.pause(2000);
	WebElement txtFlyingFrom = driver.findElement(By.xpath("//div[@class = 'col-lg-6 pr-0']//input[@placeholder = 'City or airport']"));
	txtFlyingFrom.sendKeys("Ha Noi");
	cb.pause(2000);
	WebElement txtFlyingTo = driver.findElement(By.xpath("//div[@class = 'col-lg-6']//input[@placeholder = 'City or airport']"));
	txtFlyingTo.sendKeys("Ho Chi Minh");
	cb.pause(2000);
	WebElement Date = driver.findElement(By.xpath("//div[@class ='col-lg-3 pr-0']//input[@name = 'daterange-single']"));
	Date.click();
	cb.pause(2000);
	WebElement Passengers = driver.findElement(By.xpath("//div[@class ='col-lg-3 pr-0']//a[@class = 'dropdown-toggle dropdown-btn']"));
	Passengers.click();
	cb.pause(2000);
	WebElement clickPass = driver.findElement(By.xpath("//div[@class = 'qtyBtn d-flex align-items-center']//div[@class = 'qtyInc']"));
	clickPass.click();
	cb.pause(2000);
	WebElement btnCoach = driver.findElement(By.xpath("//div[@class = 'form-group select-contain w-auto']//button[@type = 'button' and @class = 'btn dropdown-toggle btn-light']"));
	btnCoach.click();
	cb.pause(2000);
	WebElement btnDrop = driver.findElement(By.xpath("//a[@id = 'bs-select-3-1']"));
	btnDrop.click();
	cb.pause(2000);
	WebElement btnSearch = driver.findElement(By.xpath("//a[@class = 'theme-btn w-100 text-center margin-top-20px']"));
	btnSearch.click();
	cb.pause(2000);
	
}  
  @BeforeTest
	  public void initBrowser() {
			cb = new CommonBrowser();
			//driver = cb.initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
  }

  @AfterTest
  public void afterTest() {
	  //cb.quitDriver(driver);
  }

}

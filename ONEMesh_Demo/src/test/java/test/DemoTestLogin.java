package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.CommonBrowser;
public class DemoTestLogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonBrowser cb = new CommonBrowser();
		String meshUrl = "http://mesh-staging.vnpt-technology.vn:9000/login";
		WebDriver driver = cb.initChromeDriver(meshUrl);
		cb.pause(3000);
		WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("one");
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("one@2019");
		WebElement paritalinkText = driver.findElement(By.name("login-submit"));
		paritalinkText.click();
		cb.pause(5000);
		WebElement linkText = driver.findElement(By.linkText("Dashboard"));
		linkText.click();
		cb.pause(5000);
		cb.quitDriver(driver);

	}

}

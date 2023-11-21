package page_locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RiseDashboardPage extends BasePageFactory{
	public RiseDashboardPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[contains(@href,'client')]")
	WebElement lbkClient;
	@FindBy(xpath = "//a[contains(@href,'all_projects')]")
	WebElement lbkProjects;
	
	
	public void ClickTabClient() {
	lbkClient.click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void ClickTabProjects() {
	lbkProjects.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
}

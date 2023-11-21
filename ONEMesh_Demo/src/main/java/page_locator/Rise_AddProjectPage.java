package page_locator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rise_AddProjectPage extends BasePageFactory {
	protected WebDriver driver;

	public Rise_AddProjectPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "title")
	WebElement txtTitle;
	@FindBy(id = "s2id_project-type-dropdown")
	WebElement ddlProjectType;
	@FindBy(xpath = "//div[@id='select2-result-label-89']")
	WebElement clkType1;
	@FindBy(xpath = "//div[@id='select2-result-label-90']")
	WebElement clkType2;
	@FindBy(id = "select2-results-80")
	WebElement ddlClient;
	@FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']")
	WebElement clkClient;
	@FindBy(xpath = "//div[@class='note-editable']")
	WebElement txtDes;
	@FindBy(id = "start_date")
	WebElement startdate;
	@FindBy(id = "deadline")
	WebElement deadline;
	@FindBy(name = "price")
	WebElement txtPrice;
	@FindBy(id = "s2id_autogen278")
	WebElement txtLabel;
	@FindBy(xpath = "//id[@s2id_project_labels']//dev[text() = 'High Priority']")
	WebElement clkLabel;
	
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement btnSave;
	@FindBy(id = "save-and-continue-button")
	WebElement btnContinue;
	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement btnClose;
	
	@FindBy(id = "title-error")
	WebElement errorTitle;
	
	//Thêm mới Project loại Client
	public void AddProject_ClientProject(String titlevalue, String Desvalue, String pricevalua, String labelvalua) {
		txtTitle.clear();
		txtTitle.sendKeys(titlevalue);
		ddlProjectType.click();
		clkType1.click();
		ddlClient.click();
		clkClient.click();
		txtDes.clear();
		txtDes.sendKeys(Desvalue);
		startdate. click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].removeAttribute('readonly','readonly');", startdate);
		startdate.clear();
		startdate.sendKeys("16112023");
		startdate.sendKeys(Keys.TAB);
		deadline.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("argument[0].removeAttribute('readonly','readonly');", deadline);
		deadline.clear();
		deadline.sendKeys("16112023");
		deadline.sendKeys(Keys.TAB);
		txtPrice.clear();
		txtPrice.sendKeys(pricevalua);
		txtLabel.click();
		clkLabel.click();
		btnSave.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Thêm mới Project loại Internal
	public void AddProject_InternalProject(String titlevalue, String Desvalue, String pricevalua, String labelvalua) {
		txtTitle.clear();
		txtTitle.sendKeys(titlevalue);
		ddlProjectType.click();
		clkType2.click();
		txtDes.clear();
		txtDes.sendKeys(Desvalue);
		startdate. click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].removeAttribute('readonly','readonly');", startdate);
		startdate.clear();
		startdate.sendKeys("16112023");
		startdate.sendKeys(Keys.TAB);
		deadline.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("argument[0].removeAttribute('readonly','readonly');", deadline);
		deadline.clear();
		deadline.sendKeys("16112023");
		deadline.sendKeys(Keys.TAB);
		txtPrice.clear();
		txtPrice.sendKeys(pricevalua);
		txtLabel.click();
		clkLabel.click();
		btnSave.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Thêm mới Project khi để trống các trường tham số
	public void AddProject_TitleError() {
		btnSave.click();
		WebElement error = errorTitle;
		System.out.println(error.getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



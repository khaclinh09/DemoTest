package page_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RiseProjectsListPage extends BasePageFactory {
	protected WebDriver driver;

	public RiseProjectsListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='Add project']")
	WebElement btnAddProject;
	@FindBy(xpath = "//a[@title='Manage labels']")
	WebElement btnManageLabel;
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement clkSearch;
	@FindBy(xpath = "//th[@class='w10p sorting_desc']")
	WebElement clkStartDate;
	@FindBy(xpath = "//div[@class='filter-item-box bookmarked-filter-button-wrapper']//button[text() = 'Upcoming']")
	WebElement keyFilter1;
	@FindBy(xpath = "//button[@class='btn btn-default buttons-excel buttons-html5']")
	WebElement clkExcel;
	@FindBy(xpath = "//button[@class = 'btn btn-default smart-filter-dropdown dropdown-toggle caret']")
	WebElement clkDropdownFilter;
	@FindBy(xpath = "//a[@class = 'dropdown-item smart-filter-item list-group-item clickable active ']")
	WebElement clkElementBoxFilter;
	@FindBy(xpath = "//button[@class = 'btn btn-default show-filter-form-button']")
	WebElement clkFullFilter;
	@FindBy(xpath = "//button[@class = 'btn btn-default cancel-filter-button']")
	WebElement clkCloseFilter;
	@FindBy(xpath = "//a[contains(@href,'view') and text() = '26']")
	WebElement viewID;
	@FindBy(xpath = "//a[contains(@href,'view') and text() = 'Infographic Creation and Visualizations']")
	WebElement viewTitle;
	@FindBy(xpath = "//a[contains(@href,'view') and text() = 'Alta Cassin']")
	WebElement viewClient;
	@FindBy(xpath = "////select[@name ='project_label']")
	WebElement FilterLabel;
	@FindBy(xpath = "//button[@class ='btn btn-default form-control']")
	WebElement FilterStartdate;
	@FindBy(xpath = "//button[@class ='btn btn-default dropdown-toggle caret']")
	WebElement FilterStatus;
	@FindBy(id = "project-table_processing")
	WebElement ViewList;

	public void clickAddProject() {
		btnAddProject.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickManageLabel() {
		btnManageLabel.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void SearchProject(String txtsearch) {
		clkSearch.clear();
		clkSearch.sendKeys(txtsearch);
		WebElement viewlist = ViewList;
		System.out.println(viewlist.getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void clickStartDate() {
		clkStartDate.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void keyFilter1() {
		keyFilter1.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement viewlist = ViewList;
		System.out.println(viewlist.getText());

	}

	public void clkExcel() {
		clkExcel.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clkDropdownFilter() {
		clkDropdownFilter.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clkElementBoxFilter.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement viewlist = ViewList;
		System.out.println(viewlist.getText());
	}

	public void FilterLabel() {
		clkFullFilter.click();
		Select List1 = new Select(FilterLabel);
		List1.selectByIndex(2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement viewlist = ViewList;
		System.out.println(viewlist.getText());
	}

	public void FilterStartdate() {
		clkFullFilter.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].removeAttribute('readonly','readonly');", FilterStartdate);
		FilterStartdate.clear();
		FilterStartdate.sendKeys("16112023");
		FilterStartdate.sendKeys(Keys.TAB);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement viewlist = ViewList;
		System.out.println(viewlist.getText());
	}
	public void FilterStatus() {
		clkFullFilter.click();
		Select List2 = new Select(FilterStatus);
		List2.selectByIndex(1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement viewlist = ViewList;
		System.out.println(viewlist.getText());
	}
	public void SearchInfo_Project(String txtsearch) {
		clkSearch.clear();
		clkSearch.sendKeys(txtsearch);
		
		WebElement viewlist1 = viewID;
		WebElement viewlist2 = viewTitle;
		WebElement viewlist3 = viewClient;
		System.out.println(viewlist1.getText());
		System.out.println(viewlist2.getText());
		System.out.println(viewlist3.getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

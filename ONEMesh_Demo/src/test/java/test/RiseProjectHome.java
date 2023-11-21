package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.RiseAddClientPage;
import page_locator.RiseClientPage;
import page_locator.RiseDashboardPage;
import page_locator.RiseLoginPage;
import page_locator.RiseProjectsListPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class RiseProjectHome {
	CommonBrowser cb;
	WebDriver driver;
	CommonActions actions;

	@Test
	public void AddProject() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.clickAddProject();
	}
	@Test
	public void ControlManageLabel() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.clickManageLabel();
	}
	@Test
	public void SearchProject() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.SearchProject("mobile");
	}
	@Test
	public void Sort() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.clickStartDate();
	}
	@Test
	public void Filter_Upcoming() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.keyFilter1();
	}
	
	@Test
	public void ButtonExcel() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.clkExcel();
	}
	@Test
	public void DropdownFilter() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.clkDropdownFilter();
	}
	
	@Test
	public void FilterLabel() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.FilterLabel();
	}
	@Test
	public void FilterStartDate() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.FilterStartdate();
	}
	@Test
	public void FilterStatus() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.FilterStatus();
	}
	@Test
	public void SearchInfo() {
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.SearchInfo_Project("N");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {
		cb = new CommonBrowser();
		actions = new CommonActions();
		driver = cb.initChromeDriver(constants.Test1_WebInfo.riseUrl);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void afterTest() {
		cb.quitDriver(driver);
	}

}

package test;

import org.testng.annotations.Test;

import common.CommonActions;
import common.CommonBrowser;
import page_locator.RiseDashboardPage;
import page_locator.RiseLoginPage;
import page_locator.RiseProjectsListPage;
import page_locator.Rise_AddProjectPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.annotations.AfterTest;

public class RiseAddProject {
	CommonBrowser cb;
	WebDriver driver;
	CommonActions actions;
	
	
  @Test
  public void ClientProject() {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Rise_AddProjectPage add1 = new Rise_AddProjectPage(driver);
		add1.AddProject_ClientProject("123", "123", "123","123");
	}
  @Test
  public void IntenalProject() {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Rise_AddProjectPage add2 = new Rise_AddProjectPage(driver);
		add2.AddProject_InternalProject("123", "123", "123","123");
	}
  @Test
  public void AddProjectError() {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Rise_AddProjectPage add3 = new Rise_AddProjectPage(driver);
		add3.AddProject_TitleError();
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
		RiseLoginPage login = new RiseLoginPage(driver);
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.clickLogin("admin@demo.com", "riseDemo");
		RiseDashboardPage dashboard = new RiseDashboardPage(driver);
		dashboard.ClickTabProjects();
		RiseProjectsListPage project = new RiseProjectsListPage(driver); 
		project.clickAddProject();
	}
  @AfterTest
  public void afterTest() {
		cb.quitDriver(driver);
	}
}

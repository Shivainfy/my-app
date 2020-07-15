package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.PageObjectModelClass;

public class LoginTest 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	}
	
	@Test
	public void LoginPageTest()
	{
		PageObjectModelClass page = new PageObjectModelClass(driver);
//		page.enterUsername("sbadiger");
//		page.clickOnContinue();
//		page.EnterPassword("Shiva@123");
//		page.ClickOnLogin();
		page.EnterUser("sbadiger");
		page.EnterPass("Shiva@123");
		
		String title = driver.getTitle();
		System.out.println("Tile is : " + title);
		
		Assert.assertEquals(title, "Log In — WordPress.com");
		System.out.println("Test case passed");
	}
	
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}
}

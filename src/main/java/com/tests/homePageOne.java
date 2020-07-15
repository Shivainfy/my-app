package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.POM.Homepage;

public class homePageOne extends LoginTest
{
	WebDriver driver;
	@Test
	public void homePageTest()
	{
		Homepage  home = new Homepage(driver);
		home.SearchPage("selenium tutorial");
		home.ClickLifeLink();
		driver.getTitle();
		driver.quit();
	}
}

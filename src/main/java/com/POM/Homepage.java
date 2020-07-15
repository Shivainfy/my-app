package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Homepage 
{
	WebDriver driver;
	
	By Search = By.id("search-component-1");
	By LifeLink = By.linkText("search-component-1");
	
	public Homepage(WebDriver driver) 
	{
		this.driver = driver;
	}

	@Test
	public void SearchPage(String str)
	{
		driver.findElement(Search).sendKeys(str);
	}
	
	public void ClickLifeLink()
	{
		driver.findElement(LifeLink).click();
	}
}

package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModelClass 
{
	public WebDriver driver;
	
	By username = By.xpath("//input[@name = 'usernameOrEmail']");
	By Continue = By.xpath("//button[@class= 'button form-button is-primary']");
	By password = By.xpath("//input[@id= 'password']");
	By LogIn = By.xpath("//button[@class= 'button form-button is-primary']");
	
		
	public PageObjectModelClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void EnterUser(String uid)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(Continue).click();
	}
	
	public void EnterPass(String pass)
	{
		driver.findElement(password).sendKeys(pass);
		driver.findElement(LogIn).click();
	}
	
	public void enterUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void clickOnContinue()
	{
		driver.findElement(Continue).click();
	}
	
	public void EnterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void ClickOnLogin()
	{
		driver.findElement(LogIn).click();
	}
	
}

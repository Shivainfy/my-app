package com.qtpselenium.core.base;
//import org.openqa.selenium.WebDriver;

public class BaseTest 
{
	//public WebDriver driver;
	
	public void Openbrowser(String btype)
	{
		if(btype.equalsIgnoreCase("Mozilla"))
		{
			//driver = new FirefoxDriver();
		} 
	}
	
	public void Navigate()
	{
		
	}
	
	public void click()
	{
		
	}
	
	public void type()
	{
		
	}
	/*****************************************validation******************************************/
	public boolean VerifyTitle()
	{
		return false;
	}
	
	public boolean isElementPresent()
	{
		return false;
	}
	
	public boolean VerifyText()
	{
		return false;
	}
	/****************************************Reporting*********************************************/
	public void reportPass(String msg)
	{
		
	}
	
	public void reportFail(String msg)
	{
		
	}
	
	public void TakeScreenshot()
	{
		
	}
}

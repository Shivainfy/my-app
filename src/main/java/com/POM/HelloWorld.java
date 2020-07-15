package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.freecrm.com");
		driver.manage().window().maximize();
		System.out.println("application maximized");
		driver.manage().deleteAllCookies();
		
		System.out.println("deleted cookies");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		System.out.println("Entered credentials");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Test case is passed");
		
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();

		String ContactTitle = driver.getTitle();
		System.out.println("Contact title is : " + ContactTitle);
		
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a
		
		
		String BeforeXpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[";
		String AfterXpath = "]/td[2]/a";
		
		for(int i=4; i<=20; i++)
		{
			String name = driver.findElement(By.xpath(BeforeXpath + i + AfterXpath)).getText();
			System.out.println("total names are : " + name);
		}
		
		
		
		
		driver.quit();
	}

}

package gridPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest
{
	@Test
	public void GridTestMethod() throws MalformedURLException
	{
		//new DesiredCapabilities();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		//ChromeDriver driver = new ChromeDriver();
		
		String url = "http://localhost:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(url), cap);
		
		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}

package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest2_gitpush {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new SafariDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void closingBrowser()
	{
		driver.quit();
	}
	
	
}

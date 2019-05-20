package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelbrowserTesting 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifypage(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webDriver.chrome.driver", "C:\\Users\\RAMESH\\Downloads\\Selenium driver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=gmail&ie=utf-8&oe=utf-8");
		System.out.println(driver.getTitle());
		driver.quit();
  }
}




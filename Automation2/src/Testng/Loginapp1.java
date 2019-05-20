package Testng;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapp1
{
	WebDriver driver;
	@Test
	public void StartApp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 String Currenturl=driver.getCurrentUrl();
		 assert.assertTrue(Currenturl.contains("www.facebook.com/"));
	}
    
	@Test(dependsOnMethods="StartApp")
	public void login()
	{
		
	}

	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}

}

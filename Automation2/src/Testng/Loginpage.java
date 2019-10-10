package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginpage 
{
	FirefoxDriver ff;
	@Test
	@Parameters({"url","username","pwd"})
	public void Loginpage1(String url, String username, String pwd)
	{
		        ff=new FirefoxDriver();
				ff.get(url);
				ff.findElement(By.name("username")).sendKeys(username);
				ff.findElement(By.name("pwd")).sendKeys(pwd);
	}

}


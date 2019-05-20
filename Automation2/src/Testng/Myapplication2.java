package Testng;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Myapplication2 
{
	FirefoxDriver ff;
    @BeforeClass	
	public void beforeclass()
	{
		ff=new FirefoxDriver();
	}
	
	@Test
	public void startapp()
	{
	ff.get("http://ramesh-pc/login.do");
	ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String currenturl=ff.getCurrentUrl();
	Assert.assertTrue(currenturl.contains("pc/login.do"));
	}
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		ff.findElement(By.name("username")).sendKeys("radha");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElementByClassName("menu_link").isDisplayed();
	}
	@Test(dependsOnMethods="login")
   	public void logout()
	{
	ff.findElementByClassName("logoutImg").click();
	Assert.assertTrue(ff.findElementByName("username").isDisplayed());
	}
	@AfterClass
	public void closebrowser()
		{
			ff.quit();
		}
		
	}

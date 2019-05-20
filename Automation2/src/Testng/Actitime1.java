package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actitime1
{
	FirefoxDriver ff;
	@Test()
	public void enterurl()
	{
		ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		String currenturl=ff.getCurrentUrl();
		Assert.assertTrue(currenturl.contains("pc/login.do"));
	}
	@Test(dependsOnMethods="enterurl")
	public void login()
	{
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertTrue(ff.findElement(By.linkText("Users")).isDisplayed());
	}


}




  
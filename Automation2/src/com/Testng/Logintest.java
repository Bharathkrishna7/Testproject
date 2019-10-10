package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logintest 
{
	FirefoxDriver ff;
	@Test
	@Parameters({"url","username","pwd"})
	public void login(String url,String username, String pwd)
	{
	 ff=new FirefoxDriver();
	 ff.get(url);
	 ff.findElement(By.name("username")).sendKeys(username);
	 ff.findElement(By.name("pwd")).sendKeys(pwd);
	 ff.findElement(By.xpath("//input[@type='submit']")).click();	
	}

}

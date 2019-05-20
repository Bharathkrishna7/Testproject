package com.actitime.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.pages.Loginpage01;
import com.actitime.pages.sample;

import Helper.BrowserFactory;

public class verifyproject
{
	
	@Test
public void	projects()
{
		WebDriver driver=BrowserFactory.startbrowser("Firefox", "http://ramesh-pc/login.do");
		driver.manage().window().maximize();
		Loginpage01 login=new Loginpage01(driver); 
		login.loginpag("admin", "manager");
	    sample pro=new sample(driver);
		pro.projects();
	    driver.quit();
	}
}

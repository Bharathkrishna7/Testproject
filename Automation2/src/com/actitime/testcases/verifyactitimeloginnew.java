package com.actitime.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pages.Loginpagenew;

import Helper.BrowserFactory;

public class verifyactitimeloginnew 
{
   @Test
	public void checkvaliduser()
	{
	   WebDriver driver=BrowserFactory.startbrowser("Firefox","http://ramesh-pc/login.do");
	   Loginpagenew login=PageFactory.initElements(driver, Loginpagenew.class);
	   login.loginactitime("admin", "manager");
	}
}









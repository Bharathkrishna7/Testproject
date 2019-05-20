package com.actitime.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pages.Billing;
import com.actitime.pages.Loginpagenew;

import Helper.BrowserFactory;

public class verifybilling 
{
	@Test
	public void verifylogin()
	{
	WebDriver driver=BrowserFactory.startbrowser("Firefox", "http://ramesh-pc/login.do");
	  Loginpagenew login=PageFactory.initElements(driver, Loginpagenew.class);
	  login.loginactitime("admin", "manager");
	  Billing login1=PageFactory.initElements(driver, Billing.class);
	  login1.enterbilling("selenium");
	   }
   }

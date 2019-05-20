package com.actitime.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pages.Gmaillogin;

import Helper.BrowserFactory;

public class Verifygmaillogin 
{
	@Test
	public void entergmail()
	{
	WebDriver driver=BrowserFactory.startbrowser("Firefox", "https://www.google.com/search?q=gmail&ie=utf-8&oe=utf-8");
	Gmaillogin login=PageFactory.initElements(driver, Gmaillogin.class);
	login.enterdata("9441044154");
	}

}

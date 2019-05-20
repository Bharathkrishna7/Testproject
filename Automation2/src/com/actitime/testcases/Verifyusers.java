package com.actitime.testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pages.Loginpage01;
import com.actitime.pages.Users;

import Helper.BrowserFactory;

public class Verifyusers 
{
	@Test
	public void verifyuser()
	{
		
	WebDriver driver=BrowserFactory.startbrowser("Firefox", "http://ramesh-pc/login.do");
	Loginpage01 login=PageFactory.initElements(driver, Loginpage01.class);	
	login.loginpag("admin", "manager");
	Users data=PageFactory.initElements(driver, Users.class);
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Radha");
	a1.add("nadini");
	a1.add("manawadu");
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("krishna");
	a2.add("krishna");
		
	}
	

}

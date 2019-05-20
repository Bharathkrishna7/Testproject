package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;

public class Loginverification 
{
	@Test
	public void enterdata()
	{
    WebDriver driver=BrowserFactory.startbrowser("Firefox","http://ramesh-pc/login.do");
	Loginapp login=PageFactory.initElements(driver, Loginapp.class);
		  login.loginvalues("admin", "manager");
		
	}

}

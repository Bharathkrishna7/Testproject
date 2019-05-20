package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpagenew 
{
	WebDriver driver;
	public Loginpagenew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="username") 
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.NAME,using="pwd")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']") 
	@CacheLookup
	WebElement loginbutton;
    
	public void loginactitime(String name,String pass)
	{
		username.sendKeys(name);
		password.sendKeys(pass);
		loginbutton.click();
	
	}
	
}

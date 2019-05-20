package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Gmaillogin 
{
	WebDriver driver;
	public Gmaillogin(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.LINK_TEXT,using="Gmail - Google") 
	WebElement page;
	@FindBy(how=How.XPATH,using=("//p[@class='uRhzae']")) 
	WebElement login;
	@FindBy(how=How.XPATH,using=("//input[@class='whsOnd zHQkBf']")) 
	WebElement password;
	@FindBy(how=How.XPATH,using=("//span[@class='RveJvd snByac']")) 
	WebElement enter;
 public void enterdata(String num)
 {
	 page.click();
	 login.click();
	 password.sendKeys(num);
 }
}

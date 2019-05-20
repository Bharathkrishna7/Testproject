package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Billing
{
	WebDriver driver;
	public Billing(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Settings") 
	WebElement setting;
	@FindBy(how=How.XPATH,using="//input[@type='button']") 
	WebElement button;
	@FindBy(how=How.NAME,using="name0") 
	WebElement billing;
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	WebElement create;
	
	public void enterbilling(String company)
	{
		setting.click();
		button.click();
		billing.sendKeys(company);
		create.click();
	}
	
}

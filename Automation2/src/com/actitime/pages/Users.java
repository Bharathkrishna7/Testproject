package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Users
{
	@FindBy(how=How.LINK_TEXT,using="Users") 
	WebElement user;
	@FindBy(how=How.XPATH,using=("//input[@type='button']")) 
	WebElement newuser;
	public void textField()
	{
	List<WebElement>textfieldgroup@FindBy(how=How.XPATH,using=("//input[@type='text']")) 
	WebElement Addnewuser;
	for(int i=0;i<=textfieldgroup.size()-1;i++)
	{
		String data=a1.get(i);
		textfieldgroup.get(i).sendKeys(data);
	}
	}
	public void passwordFiled()
	{
	List<WebElement>passwordfieldgroup@FindBy(how=How.XPATH,using=("//input[@type='password']")) 
	WebElement Addnewuser1;
	for(int j=0;j<=passwordfieldgroup.size()-1;j++)
	{
		String data=a2.get(j);
		passwordfieldgroup.get(j).sendKeys(data);
	}
	}
	@FindBy(how=How.XPATH,using=("//input[@type='submit']")) 
	WebElement createuser;
	
public void user()
{
		user.click();
		newuser.click();
	   createuser.click();
}		

}
	
}
 


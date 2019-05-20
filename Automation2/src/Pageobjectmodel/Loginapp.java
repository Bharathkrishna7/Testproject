package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginapp 
{
	WebDriver driver;
	public Loginapp(WebDriver driver)
	{
		this.driver=driver;
	}
  	@FindBy(how=How.NAME,using="username") 
  	WebElement username;
  	@FindBy(how=How.NAME,using="pwd") 
  	WebElement password;
  	@FindBy(how=How.XPATH,using="//input[@type='submit']") 
  	WebElement login;

  public void loginvalues(String name,String pass)
  {
	username.sendKeys(name);
	password.sendKeys(pass);
	login.click();

   }
}






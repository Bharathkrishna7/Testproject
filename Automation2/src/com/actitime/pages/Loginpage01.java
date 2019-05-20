/**
 * 
 */
package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author RAMESH
 * 
 * This class will store all the locators and methods of login page
 * 
 *
 */
public class Loginpage01 
{
	WebDriver driver;
     By username=By.name("username");
     By password=By.name("pwd");
     By login_button=By.xpath("//input[@type='submit']");
     
     public Loginpage01(WebDriver driver)
     {
    	 
    	 this.driver=driver;
    	 
     }
     
     public void loginpag(String uname,String pass)
     {
    	driver.findElement(username).sendKeys(uname);
    	driver.findElement(password).sendKeys(pass);
    	driver.findElement(login_button).click();
 	 }
    
}

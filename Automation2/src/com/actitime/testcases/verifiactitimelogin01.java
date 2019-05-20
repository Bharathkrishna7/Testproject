/**
 * 
 */
package com.actitime.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.pages.Loginpage01;

/**
 *
 * @author RAMESH
 *
 *  
 */
public class verifiactitimelogin01 
{             
	@Test
	public void verifyvalidlogin()
	{
		WebDriver driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("http://ramesh-pc/login.do");
		Loginpage01 login=new Loginpage01(driver);
		login.loginpag("admin", "manager");
		driver.quit();
				
	}
	
}

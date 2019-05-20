/**
 * 
 */
package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author RAMESH
 *
 */
public class sample 
{
	WebDriver driver;
	By project=By.linkText("Projects & Tasks");
	By button =By.xpath("//input[@type='button']");


public sample(WebDriver driver)
{
	
	this.driver=driver;
	
}

public void projects()
{
	
	driver.findElement(project).click();
	driver.findElement(button).click();
}


}



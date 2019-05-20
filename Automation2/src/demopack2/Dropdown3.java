package demopack2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 
{
	public static void main(String[] args)
	
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("https://www.google.co.in/");
	   ff.findElementByXPath("//input[@class='gLFyf gsfi']").sendKeys("fb.com");
	   ff.findElementByXPath("//input[@type='submit']").click();
       ff.findElementByClassName("sA5rQ").click();
		WebElement dayDropdown=ff.findElementByName("birthday_day");
	    WebElement monthDropdown=ff.findElementById("month");
	    WebElement yearDropdown=ff.findElementByClassName("_5dba");
		Select ddd=new Select(dayDropdown);
		Select mdd=new Select(monthDropdown);
		Select ydd=new Select(yearDropdown);
		ddd.selectByIndex(6);
		mdd.selectByValue("2");
		ydd.selectByVisibleText("1996");
	}

}

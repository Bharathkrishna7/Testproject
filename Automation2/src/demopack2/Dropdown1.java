package demopack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("file:///F:/html/Webpage03.html");
		ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement SubjectDropdown=ff.findElement(By.id("subject"));
	Select sdd=new Select(SubjectDropdown);
	sdd.selectByIndex(1);
	sdd.selectByIndex(4);
	}

}


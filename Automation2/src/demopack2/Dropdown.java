package demopack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement customerdropdown=ff.findElement(By.xpath("//select[@style='width: 350px']"));
		Select cdd=new Select(customerdropdown);
		cdd.selectByIndex(1);
		cdd.selectByValue("10");
		cdd.selectByVisibleText("park");
	    cdd.selectByValue("1");
	   
	}
	
	

}

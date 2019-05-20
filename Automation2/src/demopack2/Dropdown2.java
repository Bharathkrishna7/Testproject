package demopack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Reports")).click();
		WebElement DateDropDown=ff.findElement(By.name("firstGrouping"));
		Select ddd=new Select(DateDropDown);
		List<WebElement>alloptions=ddd.getOptions();
		for(int i=0;i<=alloptions.size()-1;i++)
		{
		String option=alloptions.get(i).getText();
		System.out.println(option);
	}
  }
}
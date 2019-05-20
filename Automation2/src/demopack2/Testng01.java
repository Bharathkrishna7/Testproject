package demopack2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng01 
{
	@Test
	@Parameters({"username","password","login"})
	public void login()
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
	ff.findElement(By.name("username")).sendKeys("admin");
	ff.findElement(By.name("pwd")).sendKeys("manager");
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	}

}

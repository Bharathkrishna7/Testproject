package naveentestng;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logintest 
{
	FirefoxDriver ff;
	@BeforeMethod
	public void login()
	{
		  ff=new FirefoxDriver();
		  ff.get("http://ramesh-pc/login.do");
		  ff.findElement(By.name("username")).sendKeys("admin");
		  ff.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		  ff.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Test (priority=1)
	public void googlelogo()
	{
		   ff.get("https://www.google.co.in/");
           boolean B=ff.findElement(By.id("hplogo")).isDisplayed();
           System.out.println(B);
          
	}
	@Test (priority=2)
	public void actitime()
	{
	 ff.findElement(By.linkText("Users")).click();
	 ff.findElement(By.xpath("//input[@type='button']")).click();
	}
	@Test (priority=3,dependsOnMethods="actitime",groups="task")
	public void task()
	{  
		System.out.println("tasks");
	}
	
    @AfterMethod
    public void logout()
    {
    	System.out.println("logout");
    	
    }
}

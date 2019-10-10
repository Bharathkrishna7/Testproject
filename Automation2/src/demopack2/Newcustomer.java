 package demopack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newcustomer 
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElementByName("username").sendKeys("admin");
		ff.findElementByXPath("//input[@type='password']").sendKeys("manager");
		ff.findElementByXPath("//input[@type='submit']").click();
		ff.findElementByLinkText("Projects & Customers").click();
		ff.findElementByXPath("//input[@type='button']").click();
		ff.findElement(By.name("name")).sendKeys("Nadini Radha");
		ff.findElement(By.name("description")).sendKeys("i like u radha");
		ff.findElement(By.name("createCustomerSubmit")).click();
	   String msg=ff.findElement(By.className("successmsg")).getText();
		System.out.println(msg);
		ff.findElement(By.className("logoutImg")).click();
		ff.close();
  }

}








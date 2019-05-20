package demopack2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcasesample
{
	private Object radha;
	private Object nadini;

	@Test
	 public void login()
	 {
		 FirefoxDriver ff=new FirefoxDriver();
		 ff.get("http://ramesh-pc/login.do");
		 ff.findElement(By.name("username")).sendKeys("admin");
		 ff.findElement(By.name("pwd")).sendKeys("manager");
		 ff.findElement(By.xpath("//input[@type='submit']")).click();
		 ff.findElement(By.linkText("Users")).click();
		 ff.findElement(By.xpath("//input[@type='button']")).click();
		 ff.findElement(By.name("username")).sendKeys("nadini");
		 Assert.assertEquals(radha, nadini);
		 
	  }
  }



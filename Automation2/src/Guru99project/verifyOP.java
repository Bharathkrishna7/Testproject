package Guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyOP 
{
	public static void main(String [] args)
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://www.demo.guru99.com/V4/");
		ff.findElement(By.name("uid")).sendKeys("mngr215403");
		ff.findElement(By.xpath("//input[@type='password']")).sendKeys("vupanyb");
		ff.findElement(By.name("btnLogin")).click();
		ff.findElement(By.xpath("//marquee[@class='heading3']"));
	}
	
}

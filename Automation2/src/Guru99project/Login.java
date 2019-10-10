package Guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login 
{
	public static void main(String[]args)
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://www.demo.guru99.com/V4/");
		ff.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr215403");
		ff.findElement(By.name("password")).sendKeys("vupanyb");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
	}
	 
	

}

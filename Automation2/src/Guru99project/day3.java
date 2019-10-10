package Guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day3 
{
	static FirefoxDriver ff;
	public static void main(String[] args)
	{
		 ff=new FirefoxDriver();
		ff.get("http://www.demo.guru99.com/V4/");
		ff.findElement(By.xpath("//input[@type='text']")).sendKeys("r215403");
		ff.findElement(By.name("password")).sendKeys("vupanyb");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.close();
	
	 ff=new FirefoxDriver();
	ff.get("http://www.demo.guru99.com/V4/");
	ff.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr215403");
	ff.findElement(By.name("password")).sendKeys("vupan");
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	ff.close();

	
	 ff=new FirefoxDriver();
	ff.get("http://www.demo.guru99.com/V4/");
	ff.findElement(By.xpath("//input[@type='text']")).sendKeys("r215403");
	ff.findElement(By.name("password")).sendKeys("vanyb");
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	ff.close();
	
	

	}	
	

}

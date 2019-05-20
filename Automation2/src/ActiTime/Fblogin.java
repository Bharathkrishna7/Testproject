package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fblogin
{
	public static void main(String[]args)
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("https://www.facebook.com/");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.id("email")).sendKeys("bharathntr777@gmail.com");
		ff.findElement(By.name("pass")).sendKeys("9441044154");
		ff.findElement(By.xpath("//input[@id='u_0_2']")).click();
		
	}

}

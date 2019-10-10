package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login 
{
	public static void main(String[]args)
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//*[@type='submit']")).click();
		//ff.findElement(By.xpath("//img[@class='logoutImg']")).click();
		//ff.findElement(By.className("logoutImg")).click();
	}
	
}

package demopack2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot 
{
	public static void main(String[] args) throws IOException
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.manage().window().maximize();
		ff.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Time-Track")).click();
		EventFiringWebDriver rv=new EventFiringWebDriver(ff);
		File f1=rv.getScreenshotAs(OutputType.FILE);
		File f2=new File("F:/images/Screenshot2.png");
		FileUtils.moveFile(f1,f2);
		
	}

}

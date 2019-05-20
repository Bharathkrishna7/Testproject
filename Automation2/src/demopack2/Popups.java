package demopack2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popups 
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Projects & Customers")).click();
		ff.findElement(By.xpath("input[@value='Archive Selected Customers & Projects']")).click();
		Alert a1=ff.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
   }
}

package demopack2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("file:///C:/Users/RAMESH/AppData/Roaming/Microsoft/Windows/Network%20Shortcuts/Webpage2.html");
		ff.findElement(By.name("manual")).click();
		ff.findElement(By.name("java")).click();
		ff.findElement(By.name("selenium")).click();
		ff.findElement(By.name("sql")).click();
		}
	 }


package demopack2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bulkelements2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Bharath krishna");
		a1.add("bharath");
		a1.add("krishna");
		a1.add("g");
		a1.add("Bharathkrishna534@gmail.com");
		a1.add("9642628313");
		a1.add("15446");
		a1.add("9866999117");
		a1.add("8461649");
		ArrayList<String> a2=new ArrayList<String>(); 
		a2.add("nadiniradha");
		a2.add("nadiniradha");
	    FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		ff.findElement(By.linkText("Users")).click();
		ff.findElement(By.xpath("//input[@type='button']")).click();
	List<WebElement>textfieldgroup=ff.findElements(By.xpath("//input[@type='text']"));
	List<WebElement>passwordfieldgroup=ff.findElements(By.xpath("//input[@type='password']"));
	for(int i=0;i<=textfieldgroup.size()-1;i++)
	{
		String data=a1.get(i);
		textfieldgroup.get(i).sendKeys(data);
    }
	for(int j=0;j<=passwordfieldgroup.size()-1;j++)
	{
		String data=a2.get(j);
		passwordfieldgroup.get(j).sendKeys(data);
	}
	ff.findElement(By.xpath("//input[@type='submit']")).click();
	
	}
}

package demopack2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bulkelements02
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		 a1.add("radha nadini");
		 a1.add("parkminyoung");
		 a1.add("krishna");
		 a1.add("p");
		 a1.add("bharatkrishna534@gmail.com");
		 a1.add("9441044154");
		 a1.add("9642628313");
		 a1.add("9866999117");
		 a1.add("9885737412");
		ArrayList<String> a2=new ArrayList<String>();
		 a2.add("bharath");
		 a2.add("bharath");
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("http://ramesh-pc/login.do");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ff.findElement(By.name("username")).sendKeys("admin");
		ff.findElement(By.name("pwd")).sendKeys("manager");
	    ff.findElement(By.xpath("//input[@type='submit']")).click();
	    ff.findElement(By.linkText("Users")).click();
	    ff.findElement(By.xpath("//input[@value='Add New User']")).click();
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
	ff.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	}		  
  }




package demopack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bulkelements1
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("file:///F:/html/Webpage2.html");
		List<webElement>allcheckBox=ff.findElement(By.xpath("//input[@type='checkbox']")).click();
		for(int i=0;i<=allcheckBox.size()-1;i++)
		{
			allcheckBox.get(i).click();
		}
	}     
	
}

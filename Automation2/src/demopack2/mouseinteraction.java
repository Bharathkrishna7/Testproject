package demopack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;

public class mouseinteraction
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("https://www.google.com/search?q=jr+ntr&ie=utf-8&oe=utf-8");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Action a1=new Action(ff);
		
		
		
	}

}

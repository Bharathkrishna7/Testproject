package demopack2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("https://www.facebook.com/");
		ff.findElementByClassName("Bharath").click();
		
	}

}

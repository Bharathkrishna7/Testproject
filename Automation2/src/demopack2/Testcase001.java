package demopack2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase001
{
  public static void main(String[] args) 
  {
	  FirefoxDriver ff=new FirefoxDriver();
	  ff.get("http://www.google.com/");
	  ff.close();	
}
	
} 
	

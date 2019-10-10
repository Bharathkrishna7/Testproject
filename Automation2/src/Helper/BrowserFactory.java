package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
 static	WebDriver driver;
	 
   public static WebDriver startbrowser(String browsername,String url)
   {
	   if(browsername.equalsIgnoreCase("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   else if(browsername.equalsIgnoreCase("chrome"))
	   {
		  
		   driver=new ChromeDriver();	   
		  	   
	   }
	   else if(browsername.equalsIgnoreCase("internetexplorer"))
	   {
		   driver=new InternetExplorerDriver();
	   }
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get(url);
	   return driver;
	   
  }
	
}

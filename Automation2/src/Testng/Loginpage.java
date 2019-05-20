package Testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginpage 
{
	@Test
	@Parameters("username,password")
	public void Loginpage(String username,String password)
	{
		         FirefoxDriver ff=new FirefoxDriver();
				 ff.get("http://ramesh-pc/login.do");
				 System.out.println(username);
				 System.out.println(password);
	}

}

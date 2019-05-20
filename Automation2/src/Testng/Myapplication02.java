package Testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Myapplication02 
{
	FirefoxDriver ff;
	@BeforeClass
	public void openbrowser()
	{
		ff=new FirefoxDriver();
	}
	

}

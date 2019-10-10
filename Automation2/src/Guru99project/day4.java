package Guru99project;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4
{
	FirefoxDriver ff;
	@BeforeMethod
	@Parameters({"url"})
	public void enterurl(String url)
	{
		 ff=new FirefoxDriver();
		 ff.get(url);
	}
	@Test(priority=3,groups="checklogin")
	@Parameters({"uname","pass"})
	public void invaliduser(String uname,String pass)
	{
		ff.findElement(By.xpath("//input[@type='text']")).sendKeys(uname);
		ff.findElement(By.name("password")).sendKeys(pass);
		ff.findElement(By.xpath("//input[@type='submit']")).click();
    }
	@Test(priority=4,groups="checklogin") 
	@Parameters({"uname1","pass1"})
	public void invalidpass(String uname1,String pass1)
	{
		ff.findElement(By.xpath("//input[@type='text']")).sendKeys(uname1);
		ff.findElement(By.name("password")).sendKeys(pass1);
		ff.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Test(priority=5,groups="checklogin")
	@Parameters({"uname2","pass2"})
	public void invaluserinvalpass(String uname2,String pass2)
	{
		ff.findElement(By.xpath("//input[@type='text']")).sendKeys(uname2);
		ff.findElement(By.name("password")).sendKeys(pass2);
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@AfterMethod
	public void nothing()
	{
	System.out.println("nothing");	
	}
	
}






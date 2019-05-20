package ListenersDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.TestngListener.class)
public class MyfirstTestcase 
{
	private Object nadini;
	private Object admin;
	private Object manager;
	@Test
	public void GoogleTitleverify()
	{
		FirefoxDriver ff=new FirefoxDriver();
		ff.manage().window().maximize();
		ff.get("http://www.google.com");
		System.out.println(ff.getTitle());
		ff.quit();
	}
	
	@Test
	public void TitleMatch()
	{
	System.out.println("Test 2 Dummy");
     Assert.assertTrue(false);
     }
	 @Test
	 public void login()
	 {
		 FirefoxDriver ff=new FirefoxDriver();
		 ff.get("http://ramesh-pc/login.do");
		Assert.assertEquals(admin, admin, "Test case pass");
		Assert.assertEquals(manager, manager, "test case pass");
		ff.findElement(By.xpath("//input[@type='submit']")).click();
	  }
	 @Test
	 public void radha()
	 {
		Assert.assertEquals(nadini, nadini, "Test case is pass");
	 }
	 @Test
	 public void booleans()
	 {
	Assert.assertEquals(2.0, 2.0);
	 }
  }
  
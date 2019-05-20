package Testng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginapp
{
	@Test
	public void StartApp()
	{
		Assert.assertEquals(10, 11);
		System.out.println("Starting app");
	}
    
	@Test(dependsOnMethods="StartApp")
	public void login()
	{
		System.out.println("Logging into app");
	}

	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("logging out app");
	}

}

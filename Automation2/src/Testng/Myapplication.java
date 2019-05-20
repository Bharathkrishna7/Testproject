package Testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Myapplication 
{
	@Test
	public void startapp()
	{
		Assert.assertEquals(4, 2);
		System.out.println("starting app");
	}
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("starting app");
	}
	@Test(dependsOnMethods="login") 
	public void logout()
	{
		System.out.println("logging out");
	}

}

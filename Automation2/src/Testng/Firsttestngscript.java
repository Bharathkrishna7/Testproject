package Testng;

import org.testng.annotations.Test;

public class Firsttestngscript 
{
	@Test(priority=1,description="this testcase is loggin in to the app")
	public void loggin()
	{
		System.out.println("logging in to the application");
	}

	@Test(priority=2,description="here we r performin the operation")
	public void select()
	{
		System.out.println("selecting in to the application");
	}

    @Test(priority=3,description="this testcase will logout from app")
	public void logout()
	{
		System.out.println("logout in to the application");
	}

}

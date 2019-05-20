package demopack2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng02 
{
	@Parameters("sample")
	@Test
	public void testB(String i)
	{
		System.out.println("String value is  "+i);
		System.out.println("Test B is running.....");
		
		
	}

}

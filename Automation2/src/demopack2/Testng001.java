package demopack2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng001 
{
	@Parameters({"n1","n2","n3"})
	@Test
	public void testc (int n1,String n2,Double n3)
	{
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}

package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener 
{

	@Override
	public void onFinish(ITestContext arg0) 
	{
		
		
	}

	@Override
	public void onStart(ITestContext arg0) 
	{
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
	{
	
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{

		
		System.out.println("Testcases failed and details are "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		
		System.out.println("Testcases Skipped and details are "+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result)
	{
		
		System.out.println("Testcase Started   and details are "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{

		
		System.out.println("Testcase Success and details are "+result.getName());
		
	}
	

}

package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is Failed"+ result.getName());
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test is failed"+ result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test is skipped"+ result.getName());
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started"+ result.getName());
	}
	
}

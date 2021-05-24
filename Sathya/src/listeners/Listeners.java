package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import base.baseClass;

public class Listeners extends baseClass implements ITestListener  
{
	public void onFinish(ITestContext arg0)
	{
		System.out.println("Test is Finished for sathya");	
	}
	public void onStart(ITestContext arg0) 
	{
		System.out.println("Test is starting for sathya");	
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		System.out.println("On Test Failed But Within  Having Success Percentage");	
	}
	public void onTestFailure(ITestResult arg0) 
	{
		System.out.println("Test is Failed");
		TakesScreenshot snap=((TakesScreenshot) driver);

		File Sourcefile=snap.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("C:\\Users\\admin\\Desktop\\TestNG\\screenshot.png");
		try 
		{
			FileHandler.copy(Sourcefile,destinationfile);			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}	
	}
	public void onTestSkipped(ITestResult arg0) 
	{
		System.out.println("Test is skipped");
	}
	public void onTestStart(ITestResult arg0) 
	{
		System.out.println("Test is going to begin ");
	}
	public void onTestSuccess(ITestResult arg0) 
	{	
		System.out.println("Test is success runnning");

	}
}

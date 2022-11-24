package test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ReportStats;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.ExtentReport;
import utility.Parametrization;
import utility.Screenshot;
import utility.ZerodhaPageElements;

@Listeners(utility.Listeners.class)
public class ZerodhaLogInPageTest extends ZerodhaPageElements
{

//	ExtentReports reports;
//	ExtentTest test;
//	i have declared above two variables as public static in utility class that is why i have put them in comment. 
	
	@BeforeTest
	public void createReports()
	{
		reports = ExtentReport.getReports();
	}
	
	
	@BeforeMethod
	public void openBrowser()
	{
		 driver = Browser.openChromeBrowser();
	}
	
//	@AfterMethod
//	public void takeScreenShot() throws IOException
//	{
//		
//		Screenshot.takesScreenShot(driver, "Zeodhakite");
//		
//	}
	
	@Test(priority = 1)
	public void validateZeodhaLogIn() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test= reports.createTest("validateZeodhaLogIn");//for extent reporter
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		zerodhaLoginPage.enterUserID(Parametrization.getExcelData("credentials", 0, 1));
		zerodhaLoginPage.enterpassword(Parametrization.getExcelData("credentials", 1, 1));
		zerodhaLoginPage.clickOnLogInButton();
		Thread.sleep(2000);
		zerodhaLoginPage.enterPIn(Parametrization.getExcelData("credentials", 2, 1), driver);
		zerodhaLoginPage.clickOnContinue();
		
	}
	
	@Test(priority = 2)
	public void validateForgotUserId()
	{
		test= reports.createTest("validateForgotUserId");//for extent reporter only
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		zerodhaLoginPage.clickOnforgotUserID();
		
	}
	
	@Test(priority = 3)
	public void validateSignupLink()
	{
		test= reports.createTest("validateSignupLink");//for extent reporter only
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUpNow();
	}
	
	@Test(priority = 4)
	public void validateProblemWirhPin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test= reports.createTest("validateProblemWirhPin");//for extent reporter only
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserID(Parametrization.getExcelData("credentials", 0, 1));
		zerodhaLoginPage.enterpassword(Parametrization.getExcelData("credentials", 1, 1));
		zerodhaLoginPage.clickOnLogInButton();
		Thread.sleep(2000);
		zerodhaLoginPage.clickOnProblemWithPin();
		Thread.sleep(1000);
		zerodhaLoginPage.clickForgot2FA();
		
	}
	
	
	@AfterMethod//for extent reporter only
	public void captureResults(ITestResult result)//listeners
	{
		if (result.getStatus()==ITestResult.SUCCESS)
		{
		test.log(Status.PASS, result.getName());
			
		}
		else if (result.getStatus()==ITestResult.FAILURE)
		{
		test.log(Status.FAIL,result.getName());	
		}
		
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	
	}

	@AfterTest//for extent reporter only
	public void flushResults()
	{
		reports.flush();
		
	}
}

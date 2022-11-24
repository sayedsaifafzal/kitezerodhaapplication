package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaDashboardPage;
import pom.ZerodhaLoginPage;
import utility.Parametrization;

public class ZerodhaDashBoardTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void openChrome()
	{
		driver = Browser.openChromeBrowser();	
	}
	

	@Test(priority = 1)
	public void validateZeodhaLogIn() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		zerodhaLoginPage.enterUserID(Parametrization.getExcelData("credentials", 0, 1));
		zerodhaLoginPage.enterpassword(Parametrization.getExcelData("credentials", 1, 1));
		zerodhaLoginPage.clickOnLogInButton();
		Thread.sleep(2000);
		zerodhaLoginPage.enterPIn(Parametrization.getExcelData("credentials", 2, 1));
		zerodhaLoginPage.clickOnContinue();
		
//		ZerodhaDashboardPage zerodhaDashboardPage = new ZerodhaDashboardPage(driver);
//		zerodhaDashboardPage.moveToSearchAndClick(driver);
//		Thread.sleep(1000);
//		zerodhaDashboardPage.searchStock("tata");
//		Thread.sleep(1000);
		
	}
	

//	public void validateSearchField() throws InterruptedException
//	{
//		ZerodhaDashboardPage zerodhaDashboardPage = new ZerodhaDashboardPage(driver);
//		zerodhaDashboardPage.moveToSearchAndClick(driver);
//		Thread.sleep(1000);
//		zerodhaDashboardPage.searchStock("tata");
//		Thread.sleep(1000);
//		
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

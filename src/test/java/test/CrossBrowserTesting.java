package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import pojo.CrossBrowser;
import pom.ZerodhaLoginPage;
import utility.Parametrization;
import utility.ZerodhaPageElements;

public class CrossBrowserTesting  extends ZerodhaPageElements
{
	@Test
	public void chromeBrowserTesting() throws EncryptedDocumentException, IOException
	{
		CrossBrowser.openBrowser("Chrome");
		
		
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserID(Parametrization.getExcelData("credentials", 0, 1));
		
	}
	
	@Test
	public void EdgeBrowserTesting() throws EncryptedDocumentException, IOException
	{
		CrossBrowser.openBrowser("Edge");
		
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserID(Parametrization.getExcelData("credentials", 0, 1));		
	}
}

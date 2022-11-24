package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ZerodhaPageElements;

public class CrossBrowser extends ZerodhaPageElements
{
	
	public static WebDriver openBrowser(String BrowserName)
	
	{
		if (BrowserName.equals("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=  new ChromeDriver();
		}
		
		else if (BrowserName.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		else if (BrowserName.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if (BrowserName.equals("Safari"))
		{
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
		}
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
		
		
		
	}
}

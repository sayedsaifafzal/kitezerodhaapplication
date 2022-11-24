package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Browser
{
	public static WebDriver openChromeBrowser()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe" );
		WebDriverManager.chromedriver().setup();// webdrivermanager manages the .exe file of browser.
		//it takes the webdriver file depending on the bowser version.
		
		ChromeOptions options = new ChromeOptions();//chrome option class gives us different options for chrome browser.
		options.addArguments("--disable-notifications");// for disabling notifications
		options.addArguments("headless");//for not opening browser on ui.Reduces load of the system.
		
		//Chrome Options & Desired Capabilities in Selenium Webdriver
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implicit wait is applicable for every instance of webdriver.
		//implicit wait: it wait for every element.and it keep on check element everytime.
		//it is useful when our website is slow. old website of irctc.
		
		//we donot use thread.sleep. because it stops the excution of java program.
		
		return driver;
	}
	
	
	
	
}

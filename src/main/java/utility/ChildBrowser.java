package utility;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;



public class ChildBrowser 
{
	public static void swtictochildbrowser(String title, WebDriver driver)
	{
		Set<String> handles = driver.getWindowHandles();// returns handles in the form of set of strings
		Iterator<String> i = handles.iterator();//with the help of iterator method of set interface which returns iterator interface.
		
		
		while (i.hasNext())
		{
			String handle = i.next();
			driver.switchTo().window(handle);
			String Actualtitle = driver.getTitle();
			
			if (Actualtitle.equals(title)) 
			{
				break;
			}
			
			
		}
		
		
		
	}
}
//Set<String> handles = driver.getWindowHandles();// returns handles in the form of set of strings
//Iterator<String> i = handles.iterator();//with the help of iterator method of set interface which returns iterator interface.
//
//while (i.hasNext())
//{
//	String handle = i.next();
//	driver.switchTo().window(handle);
//	String Actualtitle = driver.getTitle();
//	
//	if (Actualtitle.equals("Practice Page")) 
//	{
//		WebElement radioElement = driver.findElement(By.xpath("//input[@name='radio']"));
//		radioElement.click();
//	}
//	
//	
//}
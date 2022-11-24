package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashboardPage
{
	@FindBy (xpath = "//img[@alt='Kite logo']") private WebElement kiteLogo;
	@FindBy (xpath = "//a[@class='router-link-active']") private WebElement dashboard;
	@FindBy (xpath = "//a[@class='orders-nav-item']") private WebElement orders;
	@FindBy (xpath = "//span[text()='Holdings']")  private WebElement holdings;
	@FindBy (xpath = "//span[text()='Positions']") private WebElement positions;
	@FindBy (xpath = "//span[text()='Funds']") private WebElement funds;
	@FindBy (xpath = "//span[text()='Apps']") private WebElement apps;
	@FindBy (xpath = "//span[@class='user-id']") private WebElement account;
	@FindBy (xpath = "//input[@type='text']") private WebElement search;
	
	@FindBy (xpath = "(//li[contains(@class,search-result-item)])[1]") private WebElement searchedstock;//ForSearchedStock
	@FindBy (xpath = "(//button[@class='button-blue'])[1]") private WebElement buyButtonforSearchedStock;
	@FindBy (xpath = "(//button[@class='button-orange'])[1]") private WebElement sellButtonForSearchedStock;
	@FindBy (xpath = "(//span[@class='icon icon-trending-up'])[1]") private WebElement chartForSearchedStock;
	@FindBy (xpath = "(//span[@class='icon icon-align-center'])[1]") private WebElement marketDepthForSearchedStock;
	@FindBy (xpath = "(//span[@class='icon icon-check'])[1]") private WebElement addForSearchedStock;
	
	//watchlist
	
	@FindBy (xpath = "(//li[contains(@class,search-result-item)])[1]") private WebElement stock;
	@FindBy (xpath = "(//button[@type='button'])[1]") private WebElement buy;
	@FindBy (xpath = "(//button[@type='button'])[2]") private WebElement sell;
	@FindBy (xpath = "(//button[@type='button'])[3]") private WebElement chart;
	@FindBy (xpath = "(//button[@type='button'])[4]") private WebElement marketDepth;
	@FindBy (xpath = "(//button[@type='button'])[5]") private WebElement add;
	
	public ZerodhaDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void moveToSearchAndClick(WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(search);
		search.click();
	}
	
	public void searchStock(String stock) 
	{
		search.sendKeys(stock);
	}
	
	public void selectStock(WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(searchedstock);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package pom;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage
{

	@FindBy (xpath = "//input[@id='userid']") private WebElement useridElement;
	@FindBy (xpath="//input[@id='password']") private WebElement passwordElement;
	@FindBy (xpath = "//button[@type='submit']")private WebElement loginElement ;
	@FindBy(xpath = "//a[text()='Forgot user ID or password?']") private WebElement forgotElement;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signupElement;
	@FindBy(xpath = "//input[@type='password']") private WebElement pinElement;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submitPinElement;
	@FindBy (xpath = "//a[text()='Problem with PIN?']")private WebElement probelemWithPinElement;
	@FindBy (xpath = "//a[text()='Forgot 2FA?']") private WebElement forgot2faElement;
	
	public ZerodhaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserID(String user) 
	{
		useridElement.sendKeys(user);
	}
	
	public void enterpassword(String pass) 
	{
		passwordElement.sendKeys(pass);
	}
	
	public void clickOnLogInButton()
	{
		loginElement.click();
	}
	
	public void clickOnforgotUserID()
	{
		forgotElement.click();
	}
	
	public void clickOnSignUpNow()
	{
		signupElement.click();
	}
	
	public void enterPIn(String pin,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));// explicit wait
		wait.until(ExpectedConditions.visibilityOf(pinElement));
		//explicitly for pin element.
		//polling time is 500 milliseconds by default.
		pinElement.sendKeys(pin);
	}
	
	public void clickOnContinue()
	{
		submitPinElement.click();
	}
	
	public void clickOnProblemWithPin()
	{
		probelemWithPinElement.click();
	}
	
	public void clickForgot2FA()
	{
		forgot2faElement.click();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

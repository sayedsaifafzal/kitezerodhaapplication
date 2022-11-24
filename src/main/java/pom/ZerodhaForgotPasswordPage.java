package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPasswordPage 
{
	@FindBy (xpath = "//label[@for='radio-22']") private WebElement RememberMyUserID;
	@FindBy (xpath = "//label[@for='radio-23']") private WebElement ForgotMyUserID;
	@FindBy (xpath = "(//input[@type='text'])[1]") private WebElement panElement;
	@FindBy (xpath = "//label[@for='radio-27']") private WebElement EmailElement;
	@FindBy (xpath = "//label[@for='radio-28']") private WebElement smsElement;
	@FindBy (xpath = "(//input[@type='text'])[2]") private WebElement MobileNumberElement;
	@FindBy (xpath = "(//input[@type='text'])[3]") private WebElement captchaElement;
	@FindBy (xpath = "//button[@type='submit']") private WebElement resetElement;
	@FindBy (xpath = "//a[@class='text-xsmall text-light reset-account-button']") private WebElement BackToLogin;
	@FindBy (xpath = "//img[@alt='Kite Android']") private WebElement KiteAndroid;
	@FindBy (xpath = "//img[@alt='Kite iOS']") private WebElement KiteIOS;
	@FindBy (xpath = "//img[@alt='Zerodha']") private WebElement ZerodhaLogo;
	@FindBy (xpath = "//a[@class='text-light']") private WebElement SignUp;
	
	
	public ZerodhaForgotPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnRememberUserID()
	{
		RememberMyUserID.click();
	}
	
	public void clickOnForgotMyUserID() 
	{
		ForgotMyUserID.click();
	}
	
	public void EnterPanNumber(String pan)
	{
		panElement.sendKeys(pan);
	}
	
	public void clickOnEmail()
	{
		EmailElement.click();
	}
	
	public void clickOnSMS()
	{
		smsElement.click();
	}
	
	public void enterMObileNO(String mobile)
	{
		MobileNumberElement.sendKeys(mobile);	
	}
	
	public void enterCaptcha(String cap) 
	{
		captchaElement.sendKeys(cap);
	}
	
	public void clickOnReset() 
	{
		resetElement.click();
		
	}
	
	public void clickOnBackToLogin()
	{
		BackToLogin.click();
	}
	public void clickOnKiteAndroid() 
	{
		KiteAndroid.click();
	}
	
	public void clickOnKiteIOS() 
	{
		KiteIOS.click();
	}
	
	public void clickOnZerodhLOGO()
	{
		ZerodhaLogo.click();
	}
	
	public void clickOnSignUp()
	{
		SignUp.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

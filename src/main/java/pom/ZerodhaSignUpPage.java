package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage
{
	@FindBy (xpath = "//img[@alt='Zerodha logo']") private WebElement ZerodhaLogo;
	@FindBy (xpath = "(//a[text()='Signup'])[1]") private WebElement Signup;
	@FindBy (xpath = "(//a[text()='About'])[1]") private WebElement about;
	@FindBy (xpath = "(//a[text()='Products'])[3]") private WebElement products;
	@FindBy (xpath = "(//a[text()='Pricing'])[1]") private WebElement pricing;
	@FindBy (xpath = "(//a[text()='Support'])[1]") private WebElement support;
	@FindBy (xpath = "//div[@id='menu_btn']") private WebElement Menu;
	@FindBy (xpath = "//span[@class='mobile-prefix']") private WebElement MobilePrefix;
	@FindBy (xpath = "//input[@type='text']") private WebElement mobileNo;
	@FindBy (xpath = "//button[@id='open_account_proceed_form']") private WebElement continueElement;
	@FindBy (xpath = "//a[text()='Want to open an NRI account?']") private WebElement nriAccount;
	@FindBy (xpath = "//i[@class='icon-twitter']") private WebElement twitter;
	@FindBy (xpath = "//i[@class='icon-facebook-official']") private WebElement Facebook;
	@FindBy (xpath = "//i[@class='icon-instagram']") private WebElement instagram;
	@FindBy (xpath = "//i[@class='icon-linkedin']") private WebElement linkedin;
	@FindBy (xpath = "//i[@class='icon-telegram']") private WebElement telegram;
	@FindBy (xpath = "(//a[text()='About'])[3]") private WebElement aboutBottom;
	@FindBy (xpath = "(//a[text()='Products'])[3]") private WebElement productsBottom;
	@FindBy (xpath = "(//a[text()='Pricing'])[3]") private WebElement pricingBottom;
	@FindBy (xpath = "//a[text()='Referral programme']") private WebElement referral;
	@FindBy (xpath = "//a[text()='Careers']") private WebElement careers;
	@FindBy (xpath = "//a[text()='Zerodha.tech']") private WebElement zerodhatech;
	@FindBy (xpath = "//a[text()='Press & media']") private WebElement pressAndMedia;
	@FindBy (xpath = "//a[text()='Zerodha Cares (CSR)']") private WebElement ZerodhaCSR;
	@FindBy (xpath = "//a[text()='Contact']") private WebElement contact;
	@FindBy (xpath = "//a[text()='Support portal']") private WebElement SupportBelow;
	@FindBy (xpath = "(//a[text()='Z-Connect blog'])[1]") private WebElement zConnectBlog;
	@FindBy (xpath = "//a[text()='List of charges']") private WebElement ListOfCharges;
	@FindBy (xpath ="//a[text()='Downloads & resources']") private WebElement Download;
	@FindBy (xpath = "//a[text()='Videos']") private WebElement videos;
	@FindBy (xpath = "//a[text()='Market overview']") private WebElement marketOverview;
	@FindBy (xpath = "//a[text()='Open an account']") private WebElement openAccount;
	@FindBy (xpath = "//a[text()='Fund transfer']") private WebElement fundTransfer;
	@FindBy (xpath = "//a[text()='60 day challenge']") private WebElement challenege;
	@FindBy (xpath = "//a[@href='https://support.zerodha.com/category/your-zerodha-account/your-profile/articles/how-do-i-place-a-complaint-at-zerodha']") private WebElement ticket;
	@FindBy (xpath = "//a[text()='NSE']") private WebElement nse;
	@FindBy (xpath = "//a[text()='BSE']") private WebElement bse;
	@FindBy (xpath = "//a[text()='MCX']") private WebElement mcx;
	@FindBy (xpath = "//a[text()='Terms & conditions']") private WebElement termsNCondition;
	@FindBy (xpath = "//a[text()='Policies & procedures']") private WebElement policyAndProcedures;
	@FindBy (xpath = "//a[text()='Privacy policy']") private WebElement Privacypolicy;
	@FindBy (xpath = "//a[text()='Disclosure']") private WebElement Disclosure;
	@FindBy (xpath = "//a[text()='For investor's attention']") private WebElement investorattention;
	@FindBy (xpath = "//a[text()='Investor charter']") private WebElement InvestorCharter;
	
	public ZerodhaSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnZerodhaLogo() 
	{
		ZerodhaLogo.click();
	}
	
	public void clickOnSignUp()
	{
		Signup.click();
	}
	
	public void clickonAbout()
	{
		about.click();
	}
	
	public void clickOnProducts()
	{
		products.click();
	}
	
	public void clickOnPricing()
	{
		pricing.click();
	}
	
	public void clickOnSupport()
	{
		support.click();
	}
	
	public void clickOnMenu() 
	{
		Menu.click();
	}
	
	public void enterMobileNo(String mobile) 
	{
		mobileNo.sendKeys(mobile);
	}
	
	public void clickOnContinue()
	{
		continueElement.click();
	}
	
	public void clickOnNRIAccount() 
	{
		nriAccount.click();
	}
	
	public void clickOnTwitter() 
	{
		twitter.click();
	}
	
	public void clickOnFacebook()
	{
		Facebook.click();
	}
	
	public void clickOnInstagram()
	{
		instagram.click();
	}
	
	public void clickOnLinkedIn()
	{
		linkedin.click();
	}
	
	public void clickOnTelegram() 
	{
		telegram.click();
	}
	
	public void clickOnAboutBottom()
	{
		aboutBottom.click();
	}
	
	public void clickOnProductsBottom()
	{
		productsBottom.click();
	}
	
	public void clickOnPricingBottom()
	{
		pricingBottom.click();
	}
	
	public void clickOnReferralProgramme() 
	{
		referral.click();
	}
	
	public void clickOnCareers()
	{
		careers.click();
	}
	
	public void clickOnZerodhaTech()
	{
		zerodhatech.click();
	}
	
	public void clickOnContact()
	{
		contact.click();
	}
	
	public void clickOnSupportPortal()
	{
		support.click();
	}
	
	public void clickOnzConnectBlog()
	{
		zConnectBlog.click();
	}
	
	public void clickOnListOfCharges() 
	{
		ListOfCharges.click();
	}
	
	public void clickOnDownload()
	{
		Download.click();
	}
	
	public void clickOnVideos()
	{
		videos.click();
	}
	
	public void clickOnOpenAnAccount()
	{
		openAccount.click();
	}
	
	public void clickOnFundTransfer() 
	{
		fundTransfer.click();
	}
	
	public void clickOn60daysChallenge()
	{
		challenege.click();
	}
	
	public void clickOnCreateAticket() 
	{
		ticket.click();
	}
	
	public void ClickOnNse()
	{
		nse.click();
	}
	
	public void clickOnBse()
	{
		bse.click();
	}
	
	public void clickOnMCX()
	{
		mcx.click();
	}
	
	public void clickOnTermsNCondition()
	{
		termsNCondition.click();
	}
	
	public void clickOnPolicies()
	{
		policyAndProcedures.click();
	}
	
	public void clickOnPrivacyPolicy()
	{
		Privacypolicy.click();
	}
	
	public void clickOnDisclosures() 
	{
		Disclosure.click();
	}
	
	public void clickOnForInvestorAttention() 
	{
		investorattention.click();	
		
	}
	
	
	public void clickOnInvestorCharter()
	{
		InvestorCharter.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

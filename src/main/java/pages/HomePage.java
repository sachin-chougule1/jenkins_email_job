package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	static WebDriver driver ;
	 WebDriverWait wait;
	
//	//a[@id="nav-link-accountList"]/ancestor::div[@id="nav-belt"]
//	//a[@id="nav-link-accountList"]/preceding-sibling::a/parent::div
	
//	@FindBy(xpath="//div[@id=\"nav-cart-count-container\"]")
//	@FindBy(xpath="//div[@id=nav-cart-count-container\"]/parent::a")
	@FindBy(xpath="//a[@id=\"nav-logo-sprites\"]")
	private WebElement carticon;
	
	
	
	@FindBy(xpath="//a[@id=\"nav-link-accountList\"]")
	private WebElement helloSignin;
	
//my	@FindBy(xpath="//span[text()=\"Sign in\"]/ancestor::div[@id=\"nav-al-signin\"]")
	@FindBy(xpath="//a[@class=\"nav-action-signin-button\"]/parent::div[@id=\"nav-flyout-ya-signin\"]")
	private WebElement signinbutton;
	
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	private WebElement enterEmailPhone;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement continueButton;
	
	@FindBy(xpath="")
	private WebElement enterPassword;
	
	@FindBy(xpath="")
	private WebElement signinButton;
	
	@FindBy(xpath="//a[@aria-label=\"boAt\"]")
	private WebElement boatHeadphone;
	
//	constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		
	}
	
	public String getTitle(//String st
			) {
		
		String title=driver.getTitle();		
		System.out.println(title);
		return title;
		
		
	}

	public boolean verifyCartIcon()  {
		wait.until(ExpectedConditions.visibilityOf(carticon));
		boolean icon = carticon.isDisplayed();
		System.out.println(icon);
		return icon;
	}
	
	public void gotoSigninPage() {
		wait.until(ExpectedConditions.visibilityOf(helloSignin));
		Actions a =new Actions(driver);
		a.moveToElement(helloSignin).perform();
		signinbutton.click();
	}
	
	public void enterUsername(String user)
	{
		System.out.println(user);
		enterEmailPhone.sendKeys(user);
		continueButton.click();
	}
	

	@FindBy(xpath="//div[@class=\"nav-search-field \"]")
	private WebElement box; 
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox]\"]")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement clickOnSearch;
	
	
	public void searchItem(String item) throws InterruptedException {
		System.out.println("iteam in page-home page  class - "+ item);
		box.click();
	
		searchbox.sendKeys(item);		
		clickOnSearch.click();
	}
		
	
}

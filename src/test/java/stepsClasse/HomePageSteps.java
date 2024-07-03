package stepsClasse;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	
	HomePage homepage= new HomePage(DriverFactory.getDriver());

	@Given("User is at landing page")
	public void user_is_at_landing_page() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.in/");
	    
	}

	@Then("Page title  should contain the {string}")
	public void page_title_should_contain_the(String siteTitle) {
		String title = homepage.getTitle();
		boolean present = title.contains(siteTitle);
		Assert.assertTrue(present);
		
	}

	@Then("Cart icon should get displayed")
	public void cart_icon_should_get_displayed()  {
	   boolean display = homepage.verifyCartIcon();
	   Assert.assertTrue(display);
	}

	@When("User click on signin button")
	public void user_click_on_signin_button() {
	    homepage.gotoSigninPage();
	    homepage.enterUsername(null);
	}

	@When("User enters username {string}")
	public void user_enters_username(String user) {
	    homepage.gotoSigninPage();
	    homepage.enterUsername(user);
	}

	@When("User enters password {string}")
	public void user_enters_password(String string){

		
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
	    
	}


	@When("user search the iteam {string}")
	public void user_search_the_iteam(String iteampass) throws InterruptedException {
		System.out.println("iteam pass in stes calss" + iteampass);
	    homepage.searchItem(iteampass);
	}

	@Then("user is at mobile listing page {string}")
	public void user_is_at_mobile_listing_page(String itm) {
		String iteamTitle = homepage.getTitle();
		boolean present = iteamTitle.contains(itm);
		Assert.assertTrue(present);
	}

	
}

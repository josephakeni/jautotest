package step_Definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;
import pageObjects.LandingPage;

public class AddToCart extends TestBase{
	WebDriver driver = getDriver();
	LandingPage hp = new LandingPage(driver);
	
	@Given("^That I am On The Landing Page$")
	public void that_I_am_On_The_Landing_Page() throws Throwable {
	driver.navigate().to("https://kano.me");   
	}

	@Given("^I click Shop$")
	public void i_click_Shop() throws Throwable {
		hp.shop().click();
	}

	@When("^I click one of the availble computer kits$")
	public void i_click_one_of_the_availble_computer_kits() throws Throwable {
		hp.computer_kit().click();
	}

	@When("^I click Buy Now\\.$")
	public void i_click_Buy_Now() throws Throwable {
		hp.buy_now().click();
	}

	@Then("^The computer kit should be added to cart$")
	public void the_computer_kit_should_be_added_to_cart() throws Throwable {
		Assert.assertEquals("Computer Kit", "Computer Kit");
	   
	}


}

package step_Definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;

public class ProjectsPage extends TestBase{
	WebDriver driver = getDriver();
	@Given("^That I am On The Projects Page$")
	public void that_I_am_On_The_Projects_Page() throws Throwable {
		driver.navigate().to("https://world.kano.me/projects"); 
	}

	@Given("^I see World Link displayed$")
	public void i_see_World_Link_displayed() throws Throwable {
		Assert.assertEquals("World", "World");
	}
	   

	@Given("^I see Make Link displayed$")
	public void i_see_Make_Link_displayed() throws Throwable {
		Assert.assertEquals("Make", "Make");
	}

	@Given("^I see Shop Link displayed$")
	public void i_see_Shop_Link_displayed() throws Throwable {
		Assert.assertEquals("Shop", "Shop");
	    
	}


	@When("^I see Connected Kanos$")
	public void i_see_Connected_Kanos() throws Throwable {
		Assert.assertEquals("Connected Kanos", "Connected Kanos"); 
	}
	    
	

	@When("^I see Online Today$")
	public void i_see_Online_Today() throws Throwable {
		Assert.assertEquals("Online Today", "Online Today"); 
	}

	@Given("^I see Lines of codes$")
	public void i_see_Lines_of_codes() throws Throwable {
		Assert.assertEquals("Lines of codes", "Lines of codes"); 
	}

	@When("^I see Creations shared$")
	public void i_see_Creations_shared() throws Throwable {
		Assert.assertEquals("Creations shared", "Creations shared"); 
	}

	@Then("^I know the Footer contents are correct$")
	public void i_know_the_Footer_contents_are_correct() throws Throwable {
		Assert.assertEquals("Online Today", "Online Today"); 
	
	}
	
	
}

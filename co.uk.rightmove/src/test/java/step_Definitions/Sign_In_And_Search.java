package step_Definitions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;
import pageObjects.HomePage;
import pageObjects.Sign_In_Page;


public class Sign_In_And_Search extends TestBase {
	Sign_In_Page SignIn = PageFactory.initElements(driver, Sign_In_Page.class);
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	
	@And ("^I see a Sign In form displayed$")
	public void i_see_a_Sign_In_form_displayed() throws Throwable {
			SignIn.Check_Sign_In_Form_is_visible();
	    }
	@When ("^I enter my email \"([^\"]*)\" details$")
	public void i_enter_my_email_details(String email) throws Throwable {
		SignIn.Enter_Login_Email_Details(email);
	   	}
	@And ("^I enter my password \"([^\"]*)\" details$")
	public void i_enter_my_password_details(String password) throws Throwable {
			SignIn.Enter_Login_Password_Details(password);
	    }
	@And ("^I see the /Forgot your password\\?/ link is displayed$")
	public void i_see_the_Forgot_your_password_link_is_displayed() throws Throwable {
			SignIn.Check_Forgot_Password_Link_is_displayed();
		}

	@And ("^I see the /Keep me signed in on this device consent box/ is displayed below the sign in button$")
	public void i_see_the_Keep_me_signed_in_on_this_device_consent_box_is_displayed_below_the_sign_in_button() throws Throwable {
		SignIn.Check_Keep_Me_Signed_In_Consent_Box_is_displayed();
		}

	@When("^I click the Sign In Button$")
	public void i_click_the_Sign_In_Button() throws Throwable {
	SignIn.Click_Sign_In_Button();
	    }

	@And ("^I see My Rightmove Icon$")
	public void i_see_My_Rightmove_Icon() throws Throwable {
		SignIn.Check_That_My_Rightmove_Signed_In_Icon_is_displayed();
		}

	@And ("^I click My Rightmove Icon$")
	public void i_click_My_Rightmove_Icon() throws Throwable {
		SignIn.Click_My_Rightmove_Signed_In_Icon();
		}

	@Then("^I should know that I am Signed in to my account successfully$")
	public void i_should_know_that_I_am_Signed_in_to_my_account_successfully() throws Throwable {
		SignIn.Check_Sign_Out_Icon_is_visible();
	   }
	
	@And ("^I click /Rent/$")
	public void i_click_Rent() throws Throwable {
	   SignIn.Click_Rent_Icon();
		}

	@And ("^I click / Property to rent/$")
	public void i_click_Property_to_rent() throws Throwable {
	    SignIn.Click_Property_to_Rent_Icon();
		}
	
	@And ("^I see a /Advanced Property Search form/$")
	public void i_see_an_Advanced_Property_Search_form() throws Throwable {
		SignIn.Check_That_Letting_Search_Criteria_Form_is_visible();
	    }
	
	@And("^I choose  Location in the Location drop down box$")
	public void i_choose_Location_in_the_Location_drop_down_box() throws Throwable {
		hp.Choose_London_From_Dropdown_Box();
	    }

	@And("^I choose  number of miles radius in the Search Radius drop down box$")
	public void i_choose_number_of_miles_radius_in_the_Search_Radius_drop_down_box() throws Throwable {
		hp.Choose_40_Miles_From_Dropdown_Box();
	    }

	@And("^I choose  minimum price amount in the minimum price range drop down box$")
	public void i_choose_minimum_price_amount_in_the_minimum_price_range_drop_down_box() throws Throwable {
	   SignIn.Choose_Rent_Minimum_Price_Value_From_Dropdown_Box();
		}

	@And("^I choose  maximum price amount in the maximum price range drop down box$")
	public void i_choose_maximum_price_amount_in_the_maximum_price_range_drop_down_box() throws Throwable {
		SignIn.Choose_Rent_Maximum_Price_Value_From_Dropdown_Box();
		}

	@And("^I choose  /Nos\\. Of Bedroom/ in the minimum bedroom amount drop down box$")
	public void i_choose_Nos_Of_Bedroom_in_the_minimum_bedroom_amount_drop_down_box() throws Throwable {
	    hp.Choose_Minimum_Nos_Of_Bedrooms_Value_From_Dropdown_Box();
		}

	@And("^I choose   /Nos\\. Of Bedroom/ in the maximum bedroom amount drop down box$")
	public void i_choose_Nos_Of_Bedroom_in_the_maximum_bedroom_amount_drop_down_box() throws Throwable {
	    hp.Choose_Maximum_Nos_Of_Bedrooms_Value_From_Dropdown_Box();
		}

	@And("^I choose Houses/ in the Property type box$")
	public void i_choose_Houses_in_the_Property_type_box() throws Throwable {
	hp.Choose_Property_Type_From_Dropdown_Box();
		}

	@And("^I choose the added period duration in the Added to site drop down box$")
	public void i_choose_the_added_period_duration_in_the_Added_to_site_drop_down_box() throws Throwable {
	   hp.Choose_Maximum_Days_Since_Added_From_Dropdown_Box();
		}

	@And("^I click  Find Properties Button$")
	public void i_click_Find_Properties_Button() throws Throwable {
	    hp.Click_The_Find_Properties_Button();
		}

	@And("^I see a Search Results page$")
	public void i_see_a_Search_Results_page() throws Throwable {
	    hp.Check_Search_Result_Confirmation_is_Visible();
		}

	@And("^I click  Create Alert Icon$")
	public void i_click_Create_Alert_Icon() throws Throwable {
	   hp.Click_Create_Alert_Icon();
		}

	@And ("^I click on /Instantly$")
	public void i_click_on_Instantly() throws Throwable {
	   hp.Click_Instant_Alert();
		}
	
	@And ("^I click  on /Every Seven Days/ Alert$")
	public void i_click_on_Every_Seven_Days_Alert() throws Throwable {
	    SignIn.Click_Every_7_Days_Alert();
		}
	
	@And("^I click Create Alert Button$")
	public void i_click_Create_Alert_Button() throws Throwable {
	   hp.Click_Create_New_Alert_Button();
		}
	
	@And ("^I click the My Rightmove Icon$")
	public void i_click_the_My_Rightmove_Icon() throws Throwable {
	   hp.Click_My_Right_Move_Button();
		}
	
	@And("^I verify that My Seven days Alert is correctly shown$")
	public void i_verify_that_My_Seven_days_Alert_is_correctly_shown() throws Throwable {
	   SignIn.Check_Every_7_Days_Alert_is_Saved_And_Visisble();
		}

	@And ("^I see a Sign Out Icon$")
	public void i_see_a_Sign_Out_Icon() throws Throwable {
	    hp.Check_That_Sign_Out_Button_is_Visible();
		}

	@And("^I Click  Sign Out Icon$")
	public void i_Click_Sign_Out_Icon() throws Throwable {
	    hp.Click_Sign_Out();
		}

	@Then("^I should now be Signed Out$")
	public void i_should_now_be_Signed_Out() throws Throwable {
	    hp.Check_That_Sign_In_Icon_is_Visible();
		}


		}

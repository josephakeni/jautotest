package step_Definitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.TestBase;
import pageObjects.HomePage;
 
public class CreateAccountAndSearch extends TestBase {
	WebDriver driver = getDriver();
	HomePage home = new HomePage(driver); 
	HomePage hp = PageFactory.initElements(driver, HomePage.class);	
	int random;

	@Given("^I am on the Home Page$")
	public void i_am_on_the_Home_Page() throws Throwable {
		driver.navigate().to("http://www.rightmove.co.uk/");
	    driver.manage().window().maximize(); 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		}

	@And ("^I click The Sign In icon$")
	public void i_click_The_Sign_In_icon() throws Throwable {
		hp.click_Sign_In();
		}
	@And ("^I click the Create Account icon$")
	public void i_click_the_Create_Account_icon() throws Throwable {
		hp.click_Create_Account();
		}
	@When("^I see the Create Account form displayed$")
	public void i_see_the_Create_Account_form_displayed() throws Throwable {
			hp.check_Create_Account_Form_is_visible();
	    }
	@And ("^I enter my title  details$")
	public void i_enter_my_title_details() throws Throwable {
		hp.type_title_details();
		}
	@And ("^I enter my First Name details$")
	public void i_enter_my_First_Name_details() throws Throwable {
		hp.type_FirstName_details();
		 }
	@And ("^I enter my Surname details$")
	public void i_enter_my_Surname_details() throws Throwable {
		hp.type_Surname_details();
		}
	@And ("^I enter my Email details$")
	public void i_enter_my_Email_details() throws Throwable {
		hp.type_RegistrationEmail_details();
	    }
	@And ("^I enter my Password details$")
	public void i_enter_my_Password_details() throws Throwable {
		hp.type_Password_details();
	  }
	@And ("^I enter my Password Confirmation details$")
	public void i_enter_my_Password_Confirmation_details() throws Throwable {
		hp.type_Password_Confirmation_details();
	    }
	@And ("^I see the Rightmove can contact me with relevant properties, offers and news Consent Tick Box$")
	public void i_see_the_Rightmove_can_contact_me_with_relevant_properties_offers_and_news_Consent_Tick_Box() throws Throwable {
		hp.check_PropertiesAndOffers_Consent_Box_is_visible();
		}
	@When ("^I click the Create Account Button$")
	public void i_click_the_Create_Account_Button() throws Throwable {
		hp.click_Create_Account_Button();
	    }
	@And ("^I should be registered as a user$")
	public void i_should_be_registered_as_a_user() throws Throwable {
		hp.Confirm_New_User_Registration_Success();
	    }
	@And("^I click /Buy/$")
	public void i_click_Buy() throws Throwable {
		hp.click_Buy_Button();
	   }
	@And ("^I click /Property for sale/$")
	public void i_click_Property_for_sale() throws Throwable {
		hp.click_Property_For_Sale_Button();
	    }
	@And("^I see A Property Search form$")
	public void i_see_A_Property_Search_form() throws Throwable {
		hp.Check_Property_Search_Form_is_visible();
	    }
	@And ("^I enter Property search criteria /London/$")
	public void i_enter_Property_search_criteria_London() throws Throwable {
		hp.Type_Search_Criteria();
	   }
	@And ("^I click /Start Search/$")
	public void i_click_Start_Search() throws Throwable {
	    hp.Click_Start_Search_Button();
		}
	@And ("^I see an /Advanced Property Search form/$")
	public void i_see_an_Advanced_Property_Search_form() throws Throwable {
		hp.Check_That_Buying_Search_Criteria_Form_is_visible();
	    }
	@And ("^I choose a Location in the Location drop down box$")
	public void i_choose_a_Location_in_the_Location_drop_down_box() throws Throwable {
		hp.Choose_London_From_Dropdown_Box();
	   }
	@And ("^I choose a number of miles radius in the Search Radius drop down box$")
	public void i_choose_a_number_of_miles_radius_in_the_Search_Radius_drop_down_box() throws Throwable {
		hp.Choose_40_Miles_From_Dropdown_Box();
	   }
	@And ("^I choose a minimum price amount in the minimum price range drop down box$")
	public void i_choose_a_minimum_price_amount_in_the_minimum_price_range_drop_down_box() throws Throwable {
	    hp.Choose_Minimum_Price_Value_From_Dropdown_Box();
		}
	@And ("^I choose a maximum price amount in the maximum price range drop down box$")
	public void i_choose_a_maximum_price_amount_in_the_maximum_price_range_drop_down_box() throws Throwable {
		hp.Choose_Maximum_Price_Value_From_Dropdown_Box();
	   }
	@And ("^I choose a /Nos\\. Of Bedroom/ in the minimum bedroom amount drop down box$")
	public void i_choose_a_Nos_Of_Bedroom_in_the_minimum_bedroom_amount_drop_down_box() throws Throwable {
		hp.Choose_Minimum_Nos_Of_Bedrooms_Value_From_Dropdown_Box();
	    }
	@And ("^I choose a  /Nos\\. Of Bedroom/ in the maximum bedroom amount drop down box$")
	public void i_choose_a_Nos_Of_Bedroom_in_the_maximum_bedroom_amount_drop_down_box() throws Throwable {
		hp.Choose_Maximum_Nos_Of_Bedrooms_Value_From_Dropdown_Box();
	    }
	@And ("^I choose /Houses/ in the Property type box$")
	public void i_choose_Houses_in_the_Property_type_box() throws Throwable {
		hp.Choose_Property_Type_From_Dropdown_Box();
	    }
	@And ("^I choose an added period duration in the Added to site drop down box$")
	public void i_choose_an_added_period_duration_in_the_Added_to_site_drop_down_box() throws Throwable {
		hp.Choose_Maximum_Days_Since_Added_From_Dropdown_Box();
	    }
	@And ("^I click the Find Properties Button$")
	public void i_click_the_Find_Properties_Button() throws Throwable {
		hp.Click_The_Find_Properties_Button();
	   	}
	@And ("^I see the Search Results page$")
	public void i_see_the_Search_Results_page() throws Throwable {
		hp.Check_Search_Result_Confirmation_is_Visible();
		}
	@And ("^I click the Create Alert Icon$")
	public void i_click_the_Create_Alert_Icon() throws Throwable {
		hp.Click_Create_Alert_Icon();
	    }
	@And ("^I click  on /Instantly/$")
	public void i_click_on_Instantly() throws Throwable {
	   hp.Click_Instant_Alert();
	   }
	@And ("^I click on / Every Three Days/ Alert$")
	public void i_click_on_Every_Three_Days_Alert() throws Throwable {
	    hp.Click_Every_3_Days_Alert();
		}
	@And ("^I click the Create Alert Button$")
	public void i_click_the_Create_Alert_Button() throws Throwable {
		hp.Click_Create_New_Alert_Button();
	   }
	@And ("^I click on Rightmove Icon$")
	public void i_click_on_Rightmove_Icon() throws Throwable {
		hp.Click_My_Right_Move_Button();
	    }
	@And ("^I verify that My Three days Alert is correctly shown$")
	public void i_verify_that_My_Three_days_Alert_is_correctly_shown() throws Throwable {
	    hp.Check_Every_3_Days_Alert_is_Saved_And_Visisble();
		}
	@And ("^I see the Sign Out Icon$")
	public void i_see_the_Sign_Out_Icon() throws Throwable {
	    hp.Check_That_Sign_Out_Button_is_Visible();
		}
	@And ("^I Click the Sign Out Icon$")
	public void i_Click_the_Sign_Out_Icon() throws Throwable {
	  hp.Click_Sign_Out();
		}
	@Then("^I should be Signed Out$")
	public void i_should_be_Signed_Out() throws Throwable {
	    hp.Check_That_Sign_In_Icon_is_Visible();
		}

		}

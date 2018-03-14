package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class HomePage {

	int random;

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='sign-in']/span")
	public static WebElement SignIn;

	public void check_SignIn_button_is_visible() {
		SignIn.isDisplayed();
	}

	public void click_Sign_In() {
		SignIn.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='create-account']/h2")
	public static WebElement CreateAccount;

	public void check_Create_Account_Button_is_visible() {
		CreateAccount.isDisplayed();
	}

	public void click_Create_Account() {
		CreateAccount.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='create-account-content']")
	public static WebElement Create_Acccount_Form;

	public void check_Create_Account_Form_is_visible() {
		Create_Acccount_Form.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='registration-title']")
	public static WebElement Enter_Title_Details;

	public void type_title_details() {
		Enter_Title_Details.sendKeys("Mr");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='registration-firstName']")
	public static WebElement Enter_FirstName_Details;

	public void type_FirstName_details() {
		Enter_FirstName_Details.sendKeys("John");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='registration-lastName']")
	public static WebElement Enter_Surname_Details;

	public void type_Surname_details() {
		Enter_Surname_Details.sendKeys("Martin");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='registration-email']")
	public static WebElement Enter_RegistrationEmail_Details;

	public void type_RegistrationEmail_details() {
		random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
		System.out.println(random);
		Enter_RegistrationEmail_Details.sendKeys("JohnMartin" + random + "@yahoo.com");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='registration-password1']")
	public static WebElement Enter_Password_Details;

	public void type_Password_details() {
		Enter_Password_Details.sendKeys("London_bridge1");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='registration-password2']")
	public static WebElement Enter_Password_Confirmation_Details;

	public void type_Password_Confirmation_details() {
		Enter_Password_Confirmation_Details.sendKeys("London_bridge1");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='registration']/div[6]/div/i")
	public static WebElement Relevant_PropertiesAndOffers_Alert_Contact_Consent_Box;

	public void check_PropertiesAndOffers_Consent_Box_is_visible() {
		Relevant_PropertiesAndOffers_Alert_Contact_Consent_Box.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='create-account-button']")
	public static WebElement Create_Account_Button;

	public void click_Create_Account_Button() {
		Create_Account_Button.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='myrightmove']/div[1]/div")
	public static WebElement New_User_Registration_Success_Confirmation;

	public void Confirm_New_User_Registration_Success() {
		New_User_Registration_Success_Confirmation.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='globalHeader']/div[1]/nav/ul/li[1]/a")
	public static WebElement Buy_Button;

	public void click_Buy_Button() {
		Buy_Button.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='globalHeader']/div[1]/nav/ul/li[1]/div/ul[1]/li[1]/a")
	public static WebElement Property_For_Sale_Button;

	public void click_Property_For_Sale_Button() {
		Property_For_Sale_Button.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='initialSearch']/fieldset/div")
	public static WebElement Property_Search_Form;

	public void Check_Property_Search_Form_is_visible() {
		Property_Search_Form.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='searchLocation']")
	public static WebElement Enter_Search_Criteria;

	public void Type_Search_Criteria() {
		Enter_Search_Criteria.sendKeys("London");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='search']")
	public static WebElement Click_Start_Search;

	public void Click_Start_Search_Button() {
		Click_Start_Search.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='buyingsearchcriteria']")
	public static WebElement Buying_Search_Criteria_Form;

	public void Check_That_Buying_Search_Criteria_Form_is_visible() {
		Buying_Search_Criteria_Form.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='locationIdentifier']/option[1]")
	public static WebElement London_Option_In_Dropdown_Menu;

	public void Choose_London_From_Dropdown_Box() {
		London_Option_In_Dropdown_Menu.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='radius']")
	public WebElement Search_Radius_Dropdown_Menu;

	public void Choose_40_Miles_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='radius']")));
		dropdown.selectByVisibleText("Within 40 miles");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='minPrice']")
	public WebElement Minimum_Price_Value_Dropdown_Menu;

	public void Choose_Minimum_Price_Value_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='minPrice']")));
		dropdown.selectByVisibleText("210,000");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='maxPrice']")
	public WebElement Maximum_Price_Value_Dropdown_Menu;

	public void Choose_Maximum_Price_Value_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='maxPrice']")));
		dropdown.selectByVisibleText("3,000,000");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='minBedrooms']")
	public WebElement Minimum_Nos_Of_Bedrooms_Value_Dropdown_Menu;

	public void Choose_Minimum_Nos_Of_Bedrooms_Value_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='minBedrooms']")));
		dropdown.selectByVisibleText("2");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='maxBedrooms']")
	public WebElement Maximum_Nos_Of_Bedrooms_Value_Dropdown_Menu;

	public void Choose_Maximum_Nos_Of_Bedrooms_Value_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='maxBedrooms']")));
		dropdown.selectByVisibleText("4");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='displayPropertyType']")
	public WebElement Property_Type_Select_Dropdown_Menu;

	public void Choose_Property_Type_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='displayPropertyType']")));
		dropdown.selectByVisibleText("Houses");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='maxDaysSinceAdded']")
	public WebElement Maximum_Days_Since_Added_Dropdown_Menu;

	public void Choose_Maximum_Days_Since_Added_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='maxDaysSinceAdded']")));
		dropdown.selectByVisibleText("Last 14 days");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='submit']")
	public WebElement Find_Properties_Button;

	public void Click_The_Find_Properties_Button() {
		Find_Properties_Button.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='l-container']/div[2]/div[1]/div/div")
	public WebElement Search_Result_Confirmation;

	public void Check_Search_Result_Confirmation_is_Visible() {
		Search_Result_Confirmation.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='save-search-button']/div/span/i")
	public WebElement Create_Alert_Icon;

	public void Click_Create_Alert_Icon() {
		Create_Alert_Icon.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='saveSearch-offsetWrapper']/div[2]/div[2]/div/div/span[1]")
	public WebElement Instant_Alert;

	public void Click_Instant_Alert() throws InterruptedException {
		Instant_Alert.click();
		Thread.sleep(3000);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='saveSearch-offsetWrapper']/div[2]/div[2]/div/ul/li[2]/span")
	public WebElement Every_3_Days_Alert;

	public void Click_Every_3_Days_Alert() throws InterruptedException {
		Every_3_Days_Alert.click();
		Thread.sleep(2000);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='saveSearch-offsetWrapper']/div[2]/div[2]/a")
	public WebElement Create_New_Alert_Button;

	public void Click_Create_New_Alert_Button() throws InterruptedException {
		Create_New_Alert_Button.click();
		Thread.sleep(3000);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='globalHeader']/div/nav/div[2]/div[7]/a[2]/span")
	public WebElement My_Right_Move_Button;

	public void Click_My_Right_Move_Button() {
		My_Right_Move_Button.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='setupRSalert']")
	public static WebElement Every_3_Days_Alert_Verification;

	public void Check_Every_3_Days_Alert_is_Saved_And_Visisble() {
		Every_3_Days_Alert_Verification.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='signOutLink']")
	public static WebElement Sign_Out_Button;

	public void Check_That_Sign_Out_Button_is_Visible() throws InterruptedException {
		Sign_Out_Button.isDisplayed();
		Thread.sleep(5000);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='signOutLink']")
	public static WebElement Sign_Out_Icon;

	public void Click_Sign_Out() {
		Sign_Out_Icon.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='sign-in']/span")
	public static WebElement Sign_In_Icon;

	public void Check_That_Sign_In_Icon_is_Visible() throws InterruptedException {
		String ExpectedMessage = "Sign In";
		String ActualMessage = driver.findElement(By.xpath("//*[@id='sign-in']/span")).getText();
		Assert.assertEquals(ExpectedMessage, ActualMessage);
	}

}

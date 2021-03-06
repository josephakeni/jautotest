package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Sign_In_Page {

	WebDriver driver;

	public Sign_In_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='login-sign-in-content']")
	public static WebElement Sign_In_Form;

	public void Check_Sign_In_Form_is_visible() {
		Sign_In_Form.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='login-email']")
	public static WebElement Login_email_details;

	public void Enter_Login_Email_Details(String email) {
		Login_email_details.sendKeys(email);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='login-password']")
	public static WebElement Login_Password_Details;

	public void Enter_Login_Password_Details(String password) {
		Login_Password_Details.sendKeys(password);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='forgottenpw']")
	public static WebElement Forgot_Password_Link;

	public void Check_Forgot_Password_Link_is_displayed() {
		String ExpectedMessage = "Forgot your password?";
		String ActualMessage = driver.findElement(By.xpath("//*[@id='forgottenpw']")).getText();
		Assert.assertEquals(ExpectedMessage, ActualMessage);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='login']/fieldset/div[5]/div/i")
	public static WebElement Keep_me_signed_consent_box;

	public void Check_Keep_Me_Signed_In_Consent_Box_is_displayed() {
		Keep_me_signed_consent_box.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='loginbtn']")
	public static WebElement Sign_In_Button;

	public void Click_Sign_In_Button() {
		Sign_In_Button.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='my-rightmove']/span")
	public static WebElement My_Rightmove_Signed_In_Icon;

	public void Check_That_My_Rightmove_Signed_In_Icon_is_displayed() {
		My_Rightmove_Signed_In_Icon.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='signOutLink']")
	public static WebElement Sign_Out_Icon;

	public void Check_Sign_Out_Icon_is_visible() {
		Sign_Out_Icon.isDisplayed();
	}

	public void Click_My_Rightmove_Signed_In_Icon() {
		My_Rightmove_Signed_In_Icon.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='globalHeader']/div[1]/nav/ul/li[2]/a")
	public static WebElement Rent_Icon;

	public void Click_Rent_Icon() {
		Rent_Icon.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='globalHeader']/div[1]/nav/ul/li[2]/div/ul/li[1]/a")
	public static WebElement Property_to_Rent_Icon;

	public void Click_Property_to_Rent_Icon() {
		Property_to_Rent_Icon.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='lettingsearchcriteria']")
	public static WebElement Letting_Search_Criteria_Form;

	public void Check_That_Letting_Search_Criteria_Form_is_visible() {
		Letting_Search_Criteria_Form.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='minPrice']")
	public WebElement Rent_Minimum_Price_Value_Dropdown_Menu;

	public void Choose_Rent_Minimum_Price_Value_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='minPrice']")));
		dropdown.selectByVisibleText("1,200 PCM");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='maxPrice']")
	public WebElement Rent_Maximum_Price_Value_Dropdown_Menu;

	public void Choose_Rent_Maximum_Price_Value_From_Dropdown_Box() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='maxPrice']")));
		dropdown.selectByVisibleText("5,000 PCM");
	}

	@FindBy(how = How.XPATH, using = "//*[@id='saveSearch-offsetWrapper']/div[2]/div[2]/div/ul/li[3]/span")
	public WebElement Every_7_Days_Alert;

	public void Click_Every_7_Days_Alert() throws InterruptedException {
		Every_7_Days_Alert.click();
		Thread.sleep(3000);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='setupRSalert']")
	public static WebElement Every_7_Days_Alert_Verification;

	public void Check_Every_7_Days_Alert_is_Saved_And_Visisble() {
		Every_7_Days_Alert_Verification.isDisplayed();
	}

}

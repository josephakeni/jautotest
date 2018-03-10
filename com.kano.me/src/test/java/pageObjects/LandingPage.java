package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id='primary-nav-items']/li[3]/a/span")
	WebElement shop;
	public WebElement shop(){
		return shop;
	}
	
	@FindBy(xpath="//*[@id='ProductListing']/div/div[1]/div/div/a/div[3]/h3")
	WebElement computer_kit;
	public WebElement computer_kit(){
		return computer_kit;
	}
	
	@FindBy(xpath="//*[@id='ProductDisplay-actionPrimary--computer-kit']/span")
	WebElement buy_now;
	public WebElement buy_now(){
		return buy_now;
		
	}
	
	
	}

package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='nI-gNb-header__logo nI-gNb-company-logo']/img")
	WebElement naukariLogo;
	
	@FindBy(id="login_Layer")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	WebElement emailField;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement passwordField;
	
	@FindBy(xpath="//button[@class='btn-primary loginButton']")
	WebElement loginSubmitButton;
	
	@FindBy(xpath="//span[contains(text(),'Invalid details')]")
	WebElement loginErrorMessage;
	
	@FindBy(xpath="//span[@class='fullname']")
	WebElement profileName;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean isNaukariLogoDisplayed()
	{
		return naukariLogo.isDisplayed();
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void enterEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginSubmitButton()
	{
		loginSubmitButton.click();
	}
	public boolean displayErrorMessage()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions)
		return loginErrorMessage.isDisplayed();
	}
	
	public boolean profileDisplay()
	{
		return profileName.isDisplayed();
	}
}

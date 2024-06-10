package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	WebElement createNewAccountButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}

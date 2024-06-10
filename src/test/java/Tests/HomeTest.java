package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import utils.BaseTest;

public class HomeTest extends BaseTest{
	
	@Test
	public void verifyLogo()
	{
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isNaukariLogoDisplayed(), "Naukari Logo is displayed");
		
	}
	
	@DataProvider(name="loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {
			{"charukushwah108@gmail.com","Risky987@",true},
			{"","",false}
		};
	}
	
	@Test(dataProvider="loginData")
	public void testNaukariLogin(String email, String password,boolean value)
	{
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();
		homePage.enterEmail(email);
		homePage.enterPassword(password);
		homePage.clickOnLoginSubmitButton();
		if(value==false)
		{
			Assert.assertTrue(homePage.displayErrorMessage(),"Error message for invalid creds");
		}
		if(value==true)
		{
			Assert.assertTrue(homePage.profileDisplay(),"Logged in successfully");
		}
		
	}
}

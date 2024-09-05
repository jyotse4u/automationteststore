package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLogin;
import pageObjects.HomePage;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginTestDDT extends BaseClass{

	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class , groups={"DDT","Master"})
	public void verfiy_accout_login_ddt(String loginName, String password, String exp)
	{
		HomePage hp = new HomePage(driver);
		hp.loginRegisterBtn();
		logger.info("Clicked on Login/Registration button in Homepage");

		AccountLogin al = new AccountLogin(driver);
		al.setLoginName(loginName);
		al.setPassword(password);
		al.clickLogin();
		
		MyAccount mac = new MyAccount(driver);
		
		 String actualHeading = mac.myAccountPageHeading();
		    String expectedHeading = "MY ACCOUNT";
		    
		    if (exp.equalsIgnoreCase("valid")) {
		        Assert.assertEquals(actualHeading, expectedHeading, "Login failed, heading did not match for valid credentials");
		        mac.clickLogOffBtn();
		    } else if (exp.equalsIgnoreCase("invalid")) {
		        Assert.assertEquals(actualHeading, expectedHeading, "Login failed, heading not matched due to invalid credentials");
		    }
	}
}

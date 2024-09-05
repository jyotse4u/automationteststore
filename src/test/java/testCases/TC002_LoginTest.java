package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLogin;
import pageObjects.HomePage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups={"Regression", "Master"})
	void verify_account_login()
	{
		try {
		logger.info("**********Starting TC002_LoginTest*******");
		HomePage hp = new HomePage(driver);
		hp.loginRegisterBtn();
		logger.info("Clicked on Login/Registration button in Homepage");

		AccountLogin al = new AccountLogin(driver);
		al.setLoginName(prop.getProperty("loginName"));
		al.setPassword(prop.getProperty("password"));
		al.clickLogin();
		
		MyAccount mac = new MyAccount(driver);
		String targetPage= mac.myAccountPageHeading();
		
		Assert.assertEquals(targetPage, "MY ACCOUNT","Heading not matched");
		}catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("**********Finishing TC002_LoginTest*******");
	}

}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLogin;
import pageObjects.CreateAccount;
import pageObjects.HomePage;
import pageObjects.RegistrationSuccess;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups={"Sanity", "Master"})
	void verify_account_registration() {
		try {
			logger.info("**********Starting TC001_AccountRegistrationTest*******");
			HomePage hp = new HomePage(driver);
			hp.loginRegisterBtn();
			logger.info("Clicked on Login/Registration button in Homepage");

			AccountLogin al = new AccountLogin(driver);
			al.clickContinueBtn();
			logger.info("Clicked on Continue button in Account Login page");

			CreateAccount ca = new CreateAccount(driver);
			logger.info("Providing customer details");
			ca.setFirstName(randomString().toUpperCase());
			ca.setLastName(randomString().toUpperCase());
			ca.setEmail(randomString() + "@test.com");
			ca.setAddress("mandcomn76543");
			ca.setCity(randomString());
			ca.setState("Anglesey");
			ca.setZipcode("123698");
			ca.setCountry("United Kingdom");
			String userName= randomString();
			System.out.println(userName);
			ca.setLoginName(userName);
			String password = randomAlphanumeric();
			System.out.println(password);
			ca.setLoginPassword(password);
			ca.setConfirmLoginPassword(password);
			ca.selectTerms();
			ca.clickContinue();

			logger.info("Validation expected message in success page");
			RegistrationSuccess rs = new RegistrationSuccess(driver);
			String conmsg = rs.registrationSuccessText();
			if(conmsg.equals("YOUR ACCOUNT HAS BEEN CREATED!"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("test failed");
				logger.debug("Debug logs...");
				Assert.assertTrue(false);
				
			}
			//Assert.assertEquals(conmsg, "YOUR ACCOUNT HAS BEEN CREATED!");
		
		} catch (Exception e) {

			Assert.fail();
		}
		logger.info("**********Finished TC001_AccountRegistrationTest*******");
	}

}

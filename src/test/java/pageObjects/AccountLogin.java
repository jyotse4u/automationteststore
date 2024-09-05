package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogin extends BasePage {

	public AccountLogin(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//button[@title='Continue']")
	WebElement btnContinue;
	
	@FindBy(id="loginFrm_loginname")
	WebElement txtLoginName;
	
	@FindBy(id="loginFrm_password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@title=\"Login\"]")
	WebElement btnLogin;
	
	
	public void clickContinueBtn()
	{
		btnContinue.click();
	}
	
	public void setLoginName(String lName)
	{
		txtLoginName.sendKeys(lName);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
}

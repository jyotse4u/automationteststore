package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationSuccess extends BasePage{
	
	public RegistrationSuccess(WebDriver driver)
	{
		super(driver);
	}

	
	
	@FindBy(xpath="//h1[@class=\"heading1\"]")
	WebElement registrationSucessHeading;
	
	
	public String registrationSuccessText()
	{
		return registrationSucessHeading.getText();
	}
}

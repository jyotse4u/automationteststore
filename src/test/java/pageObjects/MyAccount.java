package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccount extends BasePage {

	public MyAccount(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[@class=\"maintext\"]")
	WebElement myAccountHeading;

	@FindBy(xpath = "//ul[@class=\"side_account_list\"]//li/a[contains(text(),' Logoff')]")
	WebElement btnLogOff;

	public String myAccountPageHeading() {
		try {
			return myAccountHeading.getText();
//			Assert.assertEquals(myAccountHeading.getText(), "MY ACCOUNT");
		} catch (Exception e) {
			e.printStackTrace();
			return "Heading not found";
		}
	}

	public void clickLogOffBtn() {
		btnLogOff.click();
	}
}

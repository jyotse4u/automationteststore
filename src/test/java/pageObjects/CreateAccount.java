package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage {

	public CreateAccount(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[@class=\"maintext\"]")
	WebElement msgPageHeading;
	@FindBy(id = "AccountFrm_firstname")
	WebElement txtFirstName;
	@FindBy(id = "AccountFrm_lastname")
	WebElement txtLastName;
	@FindBy(id = "AccountFrm_email")
	WebElement txtEmail;
	@FindBy(id = "AccountFrm_address_1")
	WebElement txtAddress;
	@FindBy(id = "AccountFrm_city")
	WebElement txtCity;
	@FindBy(id = "AccountFrm_zone_id")
	WebElement slctState;
	@FindBy(id = "AccountFrm_postcode")
	WebElement txtZipCode;
	@FindBy(id = "AccountFrm_country_id")
	WebElement slctCountry;
	@FindBy(id = "AccountFrm_loginname")
	WebElement txtLoginName;
	@FindBy(id = "AccountFrm_password")
	WebElement txtPassword;
	@FindBy(id = "AccountFrm_confirm")
	WebElement txtConfirmPassowrd;
	@FindBy(id = "AccountFrm_agree")
	WebElement chkdTerms;
	@FindBy(xpath = "//button[@title=\"Continue\"]")
	WebElement btnContinue;

	public void setFirstName(String fName) {
		txtFirstName.sendKeys(fName);
	}

	public void setLastName(String lName) {
		txtLastName.sendKeys(lName);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setAddress(String address) {
		txtAddress.sendKeys(address);
	}

	public void setCity(String city) {
		txtCity.sendKeys(city);
	}

	public void setState(String option) {
		Select select = new Select(slctState);
		select.selectByVisibleText(option);

	}

	public void setZipcode(String zipCode) {
		txtZipCode.sendKeys(zipCode);
	}

	public void setCountry(String option1) {
		Select select1 = new Select(slctCountry);
		select1.selectByVisibleText(option1);
	}

	public void setLoginName(String loginName) {
		txtLoginName.sendKeys(loginName);
	}

	public void setLoginPassword(String loginPassword) {
		txtPassword.sendKeys(loginPassword);
	}

	public void setConfirmLoginPassword(String confirmLoginPassword) {
		txtConfirmPassowrd.sendKeys(confirmLoginPassword);
	}

	public void selectTerms() {
		chkdTerms.click();
	}

	public void clickContinue() {
		// sol1
		btnContinue.click();

		// sol2
//		btnContinue.submit();

		// sol3
//		Actions act = new Actions(driver);
//		act.moveToElement(btnContinue).click().perform();

//		sol4
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", btnContinue);

		// sol5
//		btnContinue.sendKeys(Keys.RETURN);

//		sol6
//		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		myWait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();

	}
	public String getHeadingText()
	{
		try {
			return(msgPageHeading.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	}

}

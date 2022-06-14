package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopComRegisterPage {

	WebDriver driver;

	@FindBy(id="gender-female")
	WebElement genderFemaleRadioBtn;
	@FindBy(id="gender-male")
	WebElement genderMaleRadioBtn;
	@FindBy(id="FirstName")
	WebElement firstName;
	@FindBy(id="LastName")
	WebElement lastName;	
	@FindBy(name="DateOfBirthDay")
	WebElement dobDay; 
	@FindBy(name="DateOfBirthMonth")
	WebElement dobMonth; 
	@FindBy(name="DateOfBirthYear")
	WebElement dobYear; 
	
	@FindBy(name="Email")
	WebElement email; 
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id = "register-button")
	WebElement registerBtn;
	
	@FindBy(css=".result")
	WebElement resultat;
	
	public NopComRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectGenderFemale() {
		genderFemaleRadioBtn.isSelected();
	}
	public void selectGenderMale() {
		genderMaleRadioBtn.isSelected();
	}
	public void enterFirstname(String text) {
		firstName.sendKeys(text);
	}
	public void enterLastname(String text) {
		lastName.sendKeys(text);
	}
	public void enterDateOfBirth(int day, String month, int year) {
		dobDay.sendKeys(Integer.toString(day));
		dobMonth.sendKeys(month);
		dobYear.sendKeys(Integer.toString(year));
	}
	public void enterEmail(String text) {
		email.sendKeys(text);
	}
	public void enterPassword(String text) {
		password.sendKeys(text);
	}
	public void enterConfirmPassword(String text) {
		confirmPassword.sendKeys(text);
	}
	public void clickRegisterBtn() {
		registerBtn.click();
	}
	public String getResult() {
		return resultat.getText();
	}
}

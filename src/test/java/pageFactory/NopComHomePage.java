package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopComHomePage {

	WebDriver driver;

	
	@FindBy(linkText="Register")
	WebElement RegisterLink;
	
	public NopComHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegisterLink() {
		RegisterLink.click();
	}

}

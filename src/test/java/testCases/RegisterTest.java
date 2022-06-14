package testCases;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.NopComHomePage;
import pageFactory.NopComRegisterPage;


public class RegisterTest {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
	
	@Test
	public void register() throws Exception {
		driver.get("https://demo.nopcommerce.com/");
		NopComHomePage hp = new NopComHomePage(driver);
		hp.clickRegisterLink();
		NopComRegisterPage rp = new NopComRegisterPage(driver);
		//finir l'implementation de ce qui suit:
		rp.selectGenderFemale();
		rp.enterFirstname("Test");
		rp.enterLastname("M'test");
		rp.enterDateOfBirth(1, "January", 2000);
		String timestamp = Long.toString(new Date().getTime());
		rp.enterEmail("test"+ timestamp +"@test.com");
		rp.enterPassword("test123");
		rp.enterConfirmPassword("test123");
		rp.clickRegisterBtn();
		//verifier le chose vert.
		Thread.sleep(3000);
		Assert.assertEquals(rp.getResult(), "Your registration completed");
		Thread.sleep(3000);

	}

	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}

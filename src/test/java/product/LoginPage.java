package product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sTestEmail")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="sTestLoginBtn")
	WebElement submit;
	
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}

	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
//	
	public void submitButton() {
		submit.click();
	}
	

}

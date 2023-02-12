package product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContact {
	
	
	private WebDriver driver;

	public AddContact(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="sTest-contactsIcon")
	WebElement addContactIcon; 
	
	@FindBy(id="sTest-addContactBtn")
	WebElement addContact;
	
	
	@FindBy(id="sTest-contactFirstnameTxt")
	WebElement firstName;
	
	@FindBy(id="sTest-contactLastnameTxt")
	WebElement lastName;
	
	@FindBy(id="sTest-contactEmailTxt")
	WebElement email;
	
	@FindBy(id="sTest-contactContactnumberTxt")
	WebElement contact;
	
	@FindBy(id="sTest-contactAddBtn")
	WebElement contactSubmit;
	
	
	
	
	
  public void AddContactIcon() {
	  addContactIcon.click();
  }
  
  public void AddNewContact() {
	  addContact.click();
  }
  
  public void FirstName(String firstName) {
	  this.firstName.sendKeys(firstName);
  }
  
  public void LastName(String lastName) {
	  this.lastName.sendKeys(lastName);
  }
  
  public void Email(String email) {
	  this.email.sendKeys(email);
  }
  
  public void Contact(String contact) {
	  this.contact.sendKeys(contact);
  }
  
  public void ContactSubmit() {
	  contactSubmit.click();
  }


}

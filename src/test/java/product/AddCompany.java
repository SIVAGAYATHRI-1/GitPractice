package product;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCompany {
	
	 WebDriver driver;

	public AddCompany(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sTest-companiesIcon")
	WebElement addCompanyIcon; 
	
	@FindBy(id="sTest-addCompanyBtn")
	WebElement addCompany;
	
	@FindBy(id="sTest-companyNameTxt")
	WebElement companyName;

	@FindBy(id="sTest-companyWebsiteTxt")
	WebElement website;
	
	@FindBy(id="sTest-cContactFNameTxt")
	WebElement cFirstname;
	
	@FindBy(id="sTest-cContactLastNameTxt")
	WebElement cLastname;
	
	@FindBy(id="sTest-cContactDesignationTxt")
	WebElement cTitle;
	
	@FindBy(id="sTest-cContactNumberTxt")
	WebElement cContact;
	
	@FindBy(id="sTest-companySubmitBtn")
	WebElement companySubmit;
	
	
	
	
	
  void AddCompanyIcon() {
	  addCompanyIcon.click();
  }
  
  void AddNewCompany() {
	  addCompany.click();
  }
  
  void CompanyName(String companyName) {
	  this.companyName.sendKeys(companyName);
  }
  
  void Website(String website) {
	  this.website.sendKeys(website);
  }
  
  void CFirstname(String cFirstname) {
	  this.cFirstname.sendKeys(cFirstname);
  }
  
  void CLastname(String cLastname) {
	  this.cLastname.sendKeys(cLastname);
  }
  
  void CTitle(String cTitle) {
	  this.cTitle.sendKeys(cTitle);
  }
  
  void CContact(String cContact) {
	  this.cContact.sendKeys(cContact);
  }
  
  void CompanySubmit() {
	  companySubmit.click();
  }



}

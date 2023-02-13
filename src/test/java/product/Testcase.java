package product;





import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {

	ChromeDriver driver;

	@BeforeTest
	public void LoginToCRM() throws InterruptedException{


		String pass="Butterfly@001";
		String username="sivagayathri@recruitcrm.io";
		System.setProperty("webdriver.chrome.driver", ""C:\Users\Gayathri\Desktop\Drivers\chromedriver1.exe"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://dev.recruitcrm.io/");


		WebDriverWait webDriverWait = new WebDriverWait(driver,15);

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTestEmail"))));
		LoginPage loginPage=new LoginPage(driver);


		loginPage.enterEmail(username);
		loginPage.enterPassword(pass);
		loginPage.submitButton();

		
	}






	@Test(priority = 1)
	public void AddCandidateResumeParser() throws InterruptedException {
		AddCandidate candidate = new AddCandidate(driver);

		String Location = "C:\\Users\\Gayathri\\Desktop\\company documents\\IBM resume.pdf";

		TimeUnit.SECONDS.sleep(5);

		WebDriverWait webDriverWait = new WebDriverWait(driver,10);

		webDriverWait.until( ExpectedConditions.visibilityOfElementLocated((By.id("sTest-candidateIcon"))));

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-candidateIcon"))));




		candidate.AddCandidateIcon();

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-resumeParserBtn"))));
		candidate.ResumeParser();
		candidate.UploadFile(Location);

	}


	@Test(priority = 2)
	public void AddCompany() throws InterruptedException {
		AddCompany company = new AddCompany(driver); 
		String companyName="commm"; 
		String website="www.company1.com";
		String cFirstName="ryan", cLastName="Copper", cTitle="HR Manager", cContact="7777777777";
		String cEmail="ryan@bmw.com";
		String Industry="Accounting"; 

		WebDriverWait webDriverWait = new WebDriverWait(driver,10);

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-companiesIcon"))));




		TimeUnit.SECONDS.sleep(5);
		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-companiesIcon"))));
		company.AddCompanyIcon();
		company.AddNewCompany();
		company.CompanyName(companyName);
		company.Website(website);
		company.CFirstname(cFirstName);
		company.CLastname(cLastName);
		company.CTitle(cTitle);
		company.CContact(cContact);
		company.CompanySubmit();
	}

	@Test(priority = 3)
	public void Addcontacts() throws InterruptedException {
		AddContact contact = new AddContact(driver);
		String firstName="siva";
		String lastName="gayathri";
		String email="sivagayathri@gmail.com";
		String companyName="commm"; 
		String website="www.company1.com";
		String ccontact="9000000000";

		TimeUnit.SECONDS.sleep(5);
		WebDriverWait webDriverWait = new WebDriverWait(driver,10);

		webDriverWait.until( ExpectedConditions.elementToBeClickable(By.id("sTest-contactsIcon")));



		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-contactsIcon"))));


		contact.AddContactIcon();

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-addContactBtn"))));
		contact.AddNewContact();
		contact.FirstName(firstName);
		contact.LastName(lastName);
		contact.Email(email);
		contact.Contact(ccontact);
		contact.ContactSubmit();

	}

	@Test (priority = 4)
	public void AddJob() throws InterruptedException {
	
		AddJob job =new AddJob(driver);
		String jobName="software trainee", companyName="tcs";


		TimeUnit.SECONDS.sleep(5);

		WebDriverWait webDriverWait = new WebDriverWait(driver,10);

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-jobsIcon"))));



		job.AddJobIcon();
		job.AddNewJob();
		job.JobName(jobName);
		job.Company(companyName);
		
		job.JobSubmit();

	}

	@Test(priority = 5)
	public void CustomFieldsForCandidates () throws InterruptedException {



		AddCustomFieldsForCandidates customField =new AddCustomFieldsForCandidates(driver);
		TimeUnit.SECONDS.sleep(5);

		WebDriverWait webDriverWait = new WebDriverWait(driver,10);

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-adminSettingIcon"))));


		customField.Adminsetting();
		customField.CandidateFields();
		TimeUnit.SECONDS.sleep(3);
		customField.NewCustomField();
		customField.AddTextField();
		customField.AddLongText();
		customField.AddDate();
		customField.AddNumber();
		customField.AddCheckBox();
		customField.AddDropDown();
		customField.AddMutilselect();
		customField.AddPhoneNumber();	  
		customField.AddEmail();
		customField.AddFile();
		System.out.println("no error");

	}

	@AfterTest
	public void Logout() throws InterruptedException {




		WebDriverWait webDriverWait = new WebDriverWait(driver,15);
		webDriverWait.withMessage("waited for 10 sec , but ele not found");
		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-dpLinkInAppBtn")))); //visibilityOfElementLocated  

		LogoutPage job =new LogoutPage(driver);

		TimeUnit.SECONDS.sleep(5);
		webDriverWait.until( ExpectedConditions.visibilityOfElementLocated((By.id("sTest-dpLinkInAppBtn")))); //visibilityOfElementLocated   

		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-dpLinkInAppBtn")))); //visibilityOfElementLocated   

		job.Profile();
		webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-signOutInAppBtn")))); //visibilityOfElementLocated 

		job.Logout();

		driver.quit();

	}
}

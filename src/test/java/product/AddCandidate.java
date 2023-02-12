package product;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCandidate  {

	WebDriver driver;

	public AddCandidate(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="sTest-candidateIcon")
	WebElement addCandidateIcon; 
	
	@FindBy(id="sTest-resumeParserBtn")
	WebElement resumeParser;
	
	@FindBy(id="sTest-uploadFilesForResumeParser")
	WebElement uplaodFile;
	
  public void AddCandidateIcon() {
	  addCandidateIcon.click();
  }
  
  public void ResumeParser() {
	  resumeParser.click();
  }
  
  public void UploadFile(String Location) {
	  uplaodFile.sendKeys(Location);
  }

}

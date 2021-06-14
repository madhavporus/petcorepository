package pages;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PetcoLoginPage {
WebDriver driver;
	
	public PetcoLoginPage(WebDriver iDriver) {
		this.driver = iDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//button[@aria-label=\"My Account\"]")
	WebElement LoginLink;
	
	@FindBy(how = How.XPATH, using="//button[@data-track-value=\"Sub:Sign In\"]")
	WebElement LoginBtnOne;
	
	//@FindBy(how=How.ID, using="WC_AccountDisplay_FormInput_logonId_In_Logon_1")
	
	@FindBy(how = How.NAME,using="logonId")
	WebElement LoginInputBox;
	
	@FindBy(how=How.ID, using="WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")
	WebElement PasswordInputBox;
	
	@FindBy(how = How.ID, using="WC_AccountDisplay_links_2")
	WebElement LoginButton;
	
	public void clickLink() {
		LoginLink.click();
	}

	public void clickLoginBtnOne() {
		LoginBtnOne.click();
	}
	
	public void EnterUserID(String UID) {

		/*
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", LoginInputBox);
		executor.executeScript("arguments[0].sendKeys(UID);", LoginInputBox);
		*/
		
		LoginInputBox.click();
		LoginInputBox.sendKeys(UID);
		
	}
	
	public void EnterPassword(String pwd) {
		
		PasswordInputBox.sendKeys(pwd);
	}
	
	public void LoginToPetCo() {
		LoginButton.click();
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		
		return pageTitle;
		
	}

}

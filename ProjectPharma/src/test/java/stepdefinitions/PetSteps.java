package stepdefinitions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.PetcoLoginPage;

public class PetSteps {
	WebDriver driver =null;
	PetcoLoginPage PetcoLogin;
	
	@Given("^User launches browser$")
	public void user_launches_browser() {
		System.out.println(">>STEP 1");
		String DriverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", DriverPath+"/src/test/java/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PetcoLogin = new PetcoLoginPage(driver);
	}

	@And("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String arg1){
		System.out.println(">>STEP 2");		
		driver.get(arg1);
	}

	@When("^User logsin using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logsin_using_and(String userName, String Password){
		System.out.println(">>STEP 3:"+userName + Password);
		
		
		PetcoLogin.clickLink();
		PetcoLogin.clickLoginBtnOne();
		
		PetcoLogin.EnterUserID(userName);
		PetcoLogin.EnterPassword(Password);
		PetcoLogin.LoginToPetCo();
		
	}

	@Then("^User must be logged in to PetCo$")
	public void user_must_be_logged_in_to_PetCo() {
		System.out.println(">>STEP 4");
		String expectedTitle = "Pet Supplies, Pet Food, and Pet Products | Petco";
		String title = PetcoLogin.getPageTitle();
		System.out.println(">>title<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+title);
		Assert.assertEquals(expectedTitle, title);
		
		//driver.close();
		driver.get("https://int1-www.petco.com/shop/en/petcostore/product/credelio-chewable-tablet-for-dogs-44-6-lbs-3-month-supply-3378332");
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateOrderPage {
	
	WebDriver driver;
	
	public CreateOrderPage(WebDriver iDriver) {
		PageFactory.initElements(driver, this);	
	}
	

	@FindBy(how = How.XPATH, using="//button[text()=\"ADD TO CART\"]")
	WebElement AddToCartBtn;
	
	@FindBy(how=How.ID, using="continueReviewPage")
	WebElement ProceedToCheckOutBtn;
	
	@FindBy(how=How.XPATH, using="//button[text()=\"Save & Continue\"]")
	WebElement SaveAndContinuebtn;
	
	@FindBy(how=How.ID, using="prescription-verification-167545743")
	WebElement prescriptionList;
	
	@FindBy(how=How.XPATH, using="//option[@label= \"I want Petco to contact my vet (fastest option)\"]")
	WebElement IwantPetcoToContactMyVetItem;
	
	@FindBy(how=How.XPATH, using="//option[@label= \"I will mail the prescription myself\"]")
	WebElement IwillMailOptionMenuItem;
	
	
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void clickOnAddToCart() {
		AddToCartBtn.click();
	}
	
	public void clickOnProceedToCheckOutButton(){
		ProceedToCheckOutBtn.click();
	}
	
	public void clickOnSaveAndContinueButton(){
		SaveAndContinuebtn.click();
	}
	
	public void selectprescriptionType(){
		prescriptionList.click();
	}
	
	public void selectPrescriptionType(String prescriptionType){
		if (prescriptionType == "I want Petco to contact my vet (fastest option)") {
			IwantPetcoToContactMyVetItem.click();
		} else {
			IwillMailOptionMenuItem.click();
		}
	}
}

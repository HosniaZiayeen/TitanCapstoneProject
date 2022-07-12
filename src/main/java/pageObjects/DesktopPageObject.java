package pageObjects;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	//syntax for storing UI element in POM class using pageFactory implementation
	//@FubdBy(locator type = "locator")
	//Access modifier webelement nameOfElement
	
	@FindBy(xpath ="//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath= "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	
	@FindBy(tagName ="img")
	private List <WebElement> items;
	
	@FindBy(xpath = "//a[text()= 'HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityInput;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement hpLpsuccessmessage;

	@FindBy(xpath ="//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath ="//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id = "input-name")
	private WebElement yourName;

	@FindBy(xpath = "//*[@id='input-review']")
	private WebElement reviewTextBox;

	@FindBy(xpath = "//input[@name='rating' and @value='5']")
	private WebElement ratingRadionButton;
	
	@FindBy(id ="button-review")
	private WebElement ReviewContinueButton;
	
	@FindBy(xpath ="//*[@id=\"form-review\"]/div[2]/text()")
	private String reviewSubmissionMessage;
	
	@FindBy(xpath = "(//span[@class ='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement addToCartCanon5D;
	
	
	@FindBy(xpath = "//select[@id='input-option226']//child::option[@value='15']")
	private WebElement selectColorRed;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible' and @class='alert alert-success alert-dismissible']")
     private WebElement successMessageCanon;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewmessageisdisplay;
	
	public void clickonDesktopsTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktops).build().perform();
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
	}

	
	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}
	
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}
	/**
	 * This method will click on Add to Cart Button once the product is ready to add.
	 */
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public String successMessage() {
		String actualResult = "Success: You have added "+ hpLpsuccessmessage.getText()+" to your shopping cart!";
		return actualResult;
	}
	
	public boolean isSuccessMessagePresent() {
		if(hpLpsuccessmessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}
	
	public void clickOnReviewLink() {
		writeReviewLink.click();
	}
	
	public void selectRatingRadioButton() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		ratingRadionButton.click();
	}
	
	
	public void clickOnContinueButton() {
		ReviewContinueButton.click();
	}
	
	public void SelectName(String string) {
		yourName.sendKeys("hosnia");

	}
	
	public void sendReview(String review) {
		reviewTextBox.sendKeys(review);
	}
	
	public String reviewText() {
		return reviewSubmissionMessage;
	}
	// syntax for method
	// accessModifier returnType method name
    public void clickAddToCartCanon5D(){
    	addToCartCanon5D.click();
    }
//    public void clickColorFromDropDown(){
//    	colorFromDropDown.click();
//    }
    public void clickSelectColorRed(){
    	selectColorRed.click();
    }
    public boolean isSuccessMessageCanon(){
			if(successMessageCanon.isDisplayed())
				return true;
			else 
				return false;
		}
	public void reviewmessageisdisplay() {
		reviewmessageisdisplay.isDisplayed();
	}
    
    }
package stepDefinition;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.WebDriverUtility;


public class HomePageStepDefinition extends Base{
	HomePageObject homePage = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
	  	WebDriverUtility.hardWait();
		homePage.clickOnCurrencyButton();
		logger.info("User clicked on Currency ");
		WebDriverUtility.takeScreenShot();
	}
	@And("User Chose Euro from dropdown")
	public void user_Chose_Euro_from_dropdown(){
		homePage.clickOnEuroOption();
		logger.info("User clicked Euro from dropdown");
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_Euro(){
		WebDriverUtility.hardWait();
		homePage.isCurrencyValueChange();
		logger.info("currency value has been change to Euro");
	}
	@When("User click on shopping cart")
	public void  user_click_on_shopping_cart(){
		WebDriverUtility.hardWait();
	    homePage.clickOnShoppingCart();
		logger.info("user clicked on shopping cart");
	}
	@Then("'Your shopping cart is empty!' message should display")
	public void your_shopping_cart_is_empty_message_display(){
	       WebDriverUtility.hardWait();
        	homePage.isShoppingCartMessageDisplayed();
        	logger.info("message should display");
		    WebDriverUtility.takeScreenShot();
	}
}
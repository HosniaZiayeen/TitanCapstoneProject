package stepDefinition;

import java.util.List;

import java.util.Map;

import javax.rmi.CORBA.Util;
import javax.swing.text.Utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopStepDefinition extends Base{
    DesktopPageObject desktopPage = new DesktopPageObject();
    
    
   // /syntax: @tag("exact words of step from scenario")
    //pbulic void nameoFtheMethod
    
    //we are not doing first  step of scenario since we have did in retail page

    //for 
    //  //in order to validad list of an element we need to do 
	//1,,we need to store the element in  a list
	//2,, we need to iterate through the list
	//3,,we need to write an assertion to validate each element(index ) is present
    
	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopPage.clickonDesktopsTab();
		logger.info("user clicked on Desktops tab");
		WebDriverUtility.takeScreenShot();
	}
	
	@And("User click on Show all desktops")
	public void userClickOnShowAllDesktops() {
		
		desktopPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all desktops");
		
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws InterruptedException {
//		List<WebElement> desktopsElements = desktopPage.desktopsItems();
//		for(WebElement element:desktopsElements) {
//			Assert.assertTrue(element.isDisplayed());
//			logger.info(element.getAttribute("title")+ " is present");
		List<WebElement> items = desktopPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
			Thread.sleep(2000);
		}
}
	
	/*
	 * step 1 we need to store the element in a list
	 * step 2 we need to iterate through the list
	 * step 3 we need to write an assertion to validate each element (index)
	 * is present.
	 */

	
	@When("User click ADD TO CART option HP LP3065 item")
	public void user_click_add_to_cart_option_hp_lp3065_item() {
		desktopPage.clickOnHPLP3065Item();
		logger.info("user clicked Add to Cart Option");
	}
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPage.selectQuantity(string);
		logger.info("user selected quantity " +string);
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("user clicked add to cart button");
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
	//Assert.assertTrue(desktopPage.successMessage();
		Assert.assertTrue(desktopPage.isSuccessMessagePresent());
		logger.info(expectedSuccessMessage + " equals to "+desktopPage.successMessage() );
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();

	}
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickOnCanonEOS5DCamera();

	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnReviewLink();
	}
	@When("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> infoList = dataTable.asMaps(String.class, String.class);
		desktopPage.SelectName(infoList.get(0).get("youname"));
		desktopPage.sendReview(infoList.get(0).get("reviewtext"));
		desktopPage.selectRatingRadioButton();
	WebDriverUtility.hardWait();
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.clickOnContinueButton();
		logger.info("user clicked on continue Button");
	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) throws InterruptedException {
		desktopPage.reviewmessageisdisplay();
		logger.info("user can see the message");
		Thread.sleep(2000);
	}

	@And("User click ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem(){
		desktopPage.clickOnCanonEOS5DCamera();
		logger.info("user clicked add to cart option on canon EOS 5Ditem");
	}
	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_Red(){
		desktopPage.clickSelectColorRed();
		logger.info("user selected color from dropdown red");
	}
	@Then("User should see a message like {string}")
	public void user_should_see_a_message_like(String string) {
		desktopPage.isSuccessMessageCanon();
		logger.info("user should see a message like");
	}
	}


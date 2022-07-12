package stepDefinition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base{
	LaptopNoteBooksPageObject LaptopNoteBooksPage = new LaptopNoteBooksPageObject();
	
	
	@When("User click on Laptop & NoteBook tab")
	 public void user_click_on_Laptop_and_NoteBook_tab(){
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.clickOnLaptopAndNoteBookTab();
		logger.info("user clicked on Laptop & NoteBook tab");
	}
	@And("User click on Show all Laptop & NoteBook option")
	public void user_click_on_Show_all_Laptop_and_NoteBook_option(){
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.clickOnLaptopAndNoteBookOption();
		logger.info("User click on Show all Laptop & NoteBook option");
		WebDriverUtility.takeScreenShot();
	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		LaptopNoteBooksPage.clickOnMacBookItem();
		logger.info("User clicked on MacBook item");
	}
    @Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string) throws InterruptedException {
		Assert.assertTrue(LaptopNoteBooksPage.theSuccessMassage());
		logger.info("user should see a messagee");
		Thread.sleep(2000);
	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		LaptopNoteBooksPage.SeeOneItemInItemsOption();
		logger.info("user can see one Item in the items");
		Thread.sleep(2000);
	}

	@Then("User click on cart optionn")
	public void user_click_on_cart_optionn() throws InterruptedException {
	LaptopNoteBooksPage.ClickOnCartOption();
	logger.info("user click on item Button");
	Thread.sleep(2000);
	}
    
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		LaptopNoteBooksPage.clickOnRedXButton();
		logger.info("user click on red X button to remove the item from cart");
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.isCartItemChange(int1);
		logger.info("item should be removed and cart should show"+ int1 +"item");
		WebDriverUtility.takeScreenShot();
	}
	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.clickOnCopmarisonIconOnMackBook();
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.clickOnCopmarisonIconOnMackBookAir();
		logger.info("user clicked on product comparison icon");
	}
	@Then("User should see message {string}")
	public void user_should_see_message(String string) throws InterruptedException {
	Assert.assertTrue(LaptopNoteBooksPage.messageOfComparisonDisplayed());
	Thread.sleep(2000);
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		LaptopNoteBooksPage.clickOncomparisonLink();
		logger.info("user clicked on Product comparison link");
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.productComparisonChart();
		logger.info("user should see Product Comparison Chart");
		WebDriverUtility.takeScreenShot();
	}
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		LaptopNoteBooksPage.clickOnHeatIcon();
		logger.info("user clicked on heart icon to add laptop to wish list");
	}
	@Then("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vio_to_your_wish_list(){ 
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.isMessageForWishListDisplayed();
		logger.info("user should get a message");
		WebDriverUtility.takeScreenShot();
		
	}
	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		LaptopNoteBooksPage.clickOnMacProItem();
		logger.info("user clicked on"+ string +" item");
	}
	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.priceTagDisplayed();
		logger.info("user can see price tag "+string);
		WebDriverUtility.takeScreenShot();
	}
}

 



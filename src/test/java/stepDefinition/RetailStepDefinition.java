package stepDefinition;

import java.util.List;

import java.util.Map;
import org.junit.Assert;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.WebDriverUtility;


public class RetailStepDefinition extends Base {
	RetailPageObject retail = new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_Retail_website(){	
	Assert.assertTrue(retail.isLogoPresent());
	Assert.assertEquals("TEK SCHOOL", retail.getTitle());
	logger.info("user is on Retail website");
	WebDriverUtility.takeScreenShot();
	}
	
	@And("User click on MyAccount")
	public void user_click_on_my_account(){	
		retail.ClickOnMyAccount();
		logger.info("user clicked on MyAccount Option");	
	}
	@When("User click on Login")
	public void user_click_on_Login(){
		retail.clickOnLoginOption();
		logger.info("user clicked on Login Option");
		WebDriverUtility.takeScreenShot();
	}
	
	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password){
		retail.enterEmail(userName);
		logger.info("user enter the userName " + userName);
		retail.enterPassword(password);
		logger.info("user enter the password  " + password);
	}
	@And("User click on Login button")
	public void user_click_on_Login_button(){
		retail.clickOnLoginButtion();
		logger.info("user clicked on Login Option");
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard(){
			Assert.assertTrue(retail.MyAccountDashboardValidation());
			logger.info("user is on My Account dashboard");
			WebDriverUtility.takeScreenShot();
	}
	
	@When("User click on'Register for an Affiliate Account' link")
	public void user_click_on_Register_for_an_Affiliated_Account_link(){
		retail.clickOnAffiliateAccount();
		logger.info("user clicked on 'Register for an Affiliate Account' link" );
		
	}
	
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable){
		List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
		retail.enterCompany(information.get(0).get("company"));
		retail.enterWebSiteField(information.get(0).get("WebSite"));
		retail.enterTaxIdField(information.get(0).get("taxID"));
		retail.clickPaymentMethodcheque();
		retail.enterChequePayeeField("ChequePayee");
		logger.info("user filled the my account information field");
		WebDriverUtility.takeScreenShot();
	}
	
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box(){
		retail.clickOnAboutUsCheckBox();
		logger.info("user clicked on About us check box");
	}
	
	@And("User click on Continue button")
	public void user_click_on_Continue_button(){
		retail.clickOnContinueButton();
		logger.info("user clicked on Continue button");
	}
	
	@Then("User should see a success message1")
	public void user_should_see_a_success_message1(){
		logger.info("user should see a success message");
		WebDriverUtility.takeScreenShot();
	}
	
	 @When("User click on 'Edit your affiliate information' link")
	 public void user_click_on_edit_your_affiliate_information_link(){ 
		 retail.clickOnEditYourAffiliateInfo();
		 logger.info("User clicked on 'Edit your affiliate information' link");
	 }
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button(){
		retail.clickOnBankTransferButton();
		logger.info("User clicked on Bank Transfer radio button"); ;
	}
	
	@And("User fill Bank information with below information")
	public void user_fill_Bank_inforomation_with_below_information(DataTable dataTable){
	List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
		retail.enterBankName(information.get(0).get("bankName"));
		retail.enterAbaNumeber(information.get(0).get("abaNumber"));
		retail.enterSwiftCode(information.get(0).get("swiftCode"));
		retail.enterAccountName(information.get(0).get("accountName"));
		retail.enterAccountNumber(information.get(0).get("accountNumber"));
		logger.info("User filled Bank information field");
		WebDriverUtility.takeScreenShot();
	}
	
	@And("User click on Continue button1")
	public void user_click_on_continue_button1(){
		retail.clickOnContinueButtonForBankInfo();
		logger.info("User cliced on Continue button");
	}
	 @Then("User should see a success message")
	 public void user_should_see_a_Success_message(){
		 retail.aSuccessMessageForAccountInfo();
		 logger.info("User should see a success message");
		 WebDriverUtility.takeScreenShot();
	 }
	 
		@When("User click on Edit your account information link")
		public void user_click_on_edit_your_account_information_link() {
		 retail.clickOnEditYourAccountInfo();
		 logger.info("User clicked on 'Edit your account information' link");
	 }
	 
	 @And("User modify below information")
	 public void User_modify_below_information(DataTable dataTable){
	 List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
	 retail.enterFirstNameField(information.get(0).get("firstName"));
	 retail.enterLastNameField(information.get(0).get("lastName"));
	 retail.enterEmailFieldforAccountInfo(information.get(0).get("email"));
	 retail.enterTelephoneField(information.get(0).get("telephone"));
	 logger.info("User modified below information");
	 WebDriverUtility.takeScreenShot();
	 }
	 
	 @And("User click on continue button")
	 public void user_click_on_continue_Button(){
		 retail.clickOnContinueButtonForMyAccountInfo();
		 logger.info("User clicked on continue button");
	 }
	 @Then("User should see messages {string}")
	 public void user_should_see_messages(String string){
		 logger.info("user should can a message "+string);
		 WebDriverUtility.takeScreenShot();
	 }
}
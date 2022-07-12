package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObject extends Base {
	// sence we are using pom so we write a constructor

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	public WebElement testEnvironmentLogo;

	// its the time to write action method and ui element

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//h2[contains(text(), 'My Account')]")
	private WebElement MyAccountDashboard;
	
	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement affiliateAccount;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyField;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement WebSiteField;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIdField;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentMethodcheque;
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement ChequePayee;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiliateInfo;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferButton;
	
	@FindBy(xpath = "//input[@id ='input-bank-name']")
	private WebElement bankName ;
	
	@FindBy(xpath = "//input[@id ='input-bank-branch-number']")
	private WebElement abaNumber; 
	
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode ;
	
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;
	
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//input[@value = 'Continue']")
	private WebElement continueeButtonForBankInfo;
	
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessageForBank;
	
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editYourAccountInfo;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement emailFieldforAccountInfo;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButtonForMyAccountInfo;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageForAccountInfo;
	
	public void ClickOnMyAccount(){
		myAccountOption.click();
	}
	public void clickOnLoginOption(){
		loginOption.click();
	}
	
	public void enterEmail(String emailValue) {
		emailField.clear();
		emailField.sendKeys(emailValue);
	}

	public void enterPassword(String passwordValue) {
		passField.sendKeys(passwordValue);
	}
	public void clickOnLoginButtion(){
		LoginButton.click();
	}
	public void clickOnAffiliateAccount(){
		affiliateAccount.click();
	}
	
	public void enterCompany(String companyValue){
		companyField.sendKeys(companyValue);
	}
	
	public void enterWebSiteField(String WebSiteValue){
		WebSiteField.sendKeys(WebSiteValue);
	}
	
	public void enterTaxIdField(String taxIDValue){
		taxIdField.sendKeys(taxIDValue);	
	}
	
	public void clickPaymentMethodcheque(){
		paymentMethodcheque.click();
	}
	
	public void enterChequePayeeField(String ChequePayeeValue){
		ChequePayee.sendKeys(ChequePayeeValue);
	}
	
	public void clickOnAboutUsCheckBox(){
		aboutUsCheckBox.click();
	}
	public void clickOnContinueButton(){
		continueButton.click();
	}
	
	public String ActualsuccessMessage(){
		String actualText = WebDriverUtility.getText(successMessage);
		return actualText;
	}
	public boolean MyAccountDashboardValidation(){
		if(MyAccountDashboard.isDisplayed())
			return true;
		else
				return false;
		}
	
	public boolean isLogoPresent(){
		if(testEnvironmentLogo.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void clickOnEditYourAffiliateInfo(){
		editAffiliateInfo.click();
	}	
	public void clickOnBankTransferButton(){
		bankTransferButton.click();
	}
	
	public void enterBankName(String bankNameValue){
		bankName.sendKeys(bankNameValue);
	}
	
	public void enterSwiftCode(String swiftCodeValue){
		swiftCode.sendKeys(swiftCodeValue);
	}
	
	public void enterAbaNumeber(String abaNumberValue){
		abaNumber.sendKeys(abaNumberValue);
	}
	
	public void enterAccountName(String accountNameValue){
		accountName.sendKeys(accountNameValue);
	}
	
	public void enterAccountNumber(String accountNumberValue){
		accountNumber.sendKeys(accountNumberValue);
	}
	
	public void clickOnContinueButtonForBankInfo(){
		continueeButtonForBankInfo.click();
	}
	
	public void clickOnEditYourAccountInfo(){
		editYourAccountInfo.click();
	}
	
	public void enterFirstNameField(String firstNameValue){
		firstNameField.clear();
		firstNameField.sendKeys(firstNameValue);
	}
	public void enterLastNameField(String lastNameValue){
		lastNameField.clear();
		lastNameField.sendKeys(lastNameValue);
	}
	
	public void enterEmailFieldforAccountInfo(String emailValueforAccountInfo){
		emailFieldforAccountInfo.clear();
		emailFieldforAccountInfo.sendKeys(emailValueforAccountInfo);
	}
	
	public void enterTelephoneField(String telephoneValue){
		telephoneField.sendKeys(telephoneValue);
	}
	
	public void clickOnContinueButtonForMyAccountInfo(){
		continueButtonForMyAccountInfo.click();
	}
	
	public String aSuccessMessageForAccountInfo(){
		String successUpdate = WebDriverUtility.getText(successMessageForAccountInfo);
		return successUpdate;
	}
	public String successMessageForBank(){
		String successText = WebDriverUtility.getText(successMessageForBank);
		return successText;
	}
		
}
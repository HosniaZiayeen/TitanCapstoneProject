package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {
	public LaptopNoteBooksPageObject(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "(//a[text()='Laptops & Notebooks'])[1]")
	private WebElement laptopAndNoteBookTab;
	
	@FindBy(xpath = "(//a[text()='Show All Laptops & Notebooks'])[1]")
	private WebElement showAllLaptopAndNoteBookOption;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	
	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement theSuccessMassage;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement addToCartMessage;	
	
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cartOption;
	
	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement redXButton;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartItemRemoved;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement comparisonIconOnMacBook;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement comparisonIconOnMacBookAir;
	
	@FindBy(xpath ="//body/div[@id='product-category']/div[1]")
	private WebElement messageOfComparison;
	
	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement comparisonLink;
	
	@FindBy(xpath = "//div[@id='content']")
	private WebElement productComparisonChart;
	
	@FindBy(xpath ="(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIcon;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement messageForWishList;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement MacProItem;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[2]/li[1]")
	private WebElement priceTag;
	
	public void clickOnLaptopAndNoteBookTab(){
	laptopAndNoteBookTab.click();
	}
	public void clickOnLaptopAndNoteBookOption(){
		showAllLaptopAndNoteBookOption.click();
   }
	public void clickOnMacBookItem(){
		macBookItem.click();
	}public boolean isAddToCartMessage() {
		if(addToCartMessage.isDisplayed())
			return true;
		else 
			return false;
	}
	public boolean theSuccessMassage() {
		if (theSuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}
	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}
	public void clickOnRedXButton(){
		redXButton.click();
	}
	public boolean isCartItemChange(Integer int1){
		if(cartItemRemoved.equals(int1))
			return true;
		else
			return false;
	}
	public void clickOnCopmarisonIconOnMackBook() {
		comparisonIconOnMacBook.click();
	}
	public void clickOnCopmarisonIconOnMackBookAir() {
		comparisonIconOnMacBookAir.click();
	}
	public boolean messageOfComparisonDisplayed(){
		if(messageOfComparison.isDisplayed())
			return true;
		else 
			return false;
	}
	public void clickOncomparisonLink(){
		comparisonLink.click();
	}
	public boolean productComparisonChart(){
		if(productComparisonChart.isDisplayed())
			return true;
		else
			return false;	
	}
	public void clickOnHeatIcon(){
		heartIcon.click();
	}
	public boolean isMessageForWishListDisplayed(){
		if(messageForWishList.isDisplayed())
			return true;
		else 
			return false;
	}
   public void clickOnMacProItem(){
	   MacProItem.click();
   }
   public boolean priceTagDisplayed(){
	   if(priceTag.isDisplayed())
		   return true;
	   else
		   return false;
	   
   }
}
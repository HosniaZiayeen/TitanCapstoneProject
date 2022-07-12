package pageObjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{

	public HomePageObject(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement CurrencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement EuroOption;
	
	@FindBy(id = "cart-total")
	private WebElement currencyValueChange;
	
	@FindBy(id = "cart-total")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu pull-right']")
	private WebElement shoppingCartMessage;
	
	public void clickOnCurrencyButton(){
		CurrencyButton.click();
	}
	public void clickOnEuroOption(){
		EuroOption.click();
	}
	public boolean isCurrencyValueChange(){
	 if(currencyValueChange.isDisplayed()){
		 return true;
	 } else
		 return false;
	}
    
	public void clickOnShoppingCart(){
		shoppingCart.click();
	}
	public boolean isShoppingCartMessageDisplayed(){
		if(shoppingCartMessage.isDisplayed())
			return true;
		else
			return false;
	}
}

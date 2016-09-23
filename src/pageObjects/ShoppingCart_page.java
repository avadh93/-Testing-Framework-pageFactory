package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Core;

public class ShoppingCart_page extends Core{
	@FindBy(xpath="//h1[@id='cart_title']")
	public WebElement cartSummary;
	@FindBy(xpath="//p[@class='alert alert-warning']")
	public WebElement cartAlertMessage;
	@FindBy(xpath="//span[@class='heading-counter']")
	public WebElement cartheadingCounter;
	
	public void shoppingCartFunctionality(){
		String s=cartSummary.getText();
		if(s.equalsIgnoreCase("Shopping-cart summary")){
			System.out.println("shopping cart functionality working fantastic");
		}
	}
	
	public void ShoppingCartEmptyFunctionality(){
		String s=cartAlertMessage.getText();
		if(s.equalsIgnoreCase("Your shopping cart is empty.")){
			System.out.println("shopping cart Empty functionality working fantastic");
		}
	}
	public void ShoppingCartFilledFunctionality(){
		String s=cartheadingCounter.getText();
		if(s.equalsIgnoreCase("Your shopping cart contains:")){
			System.out.println("shopping cart Filled functionality working fantastic");
		}
	}

}

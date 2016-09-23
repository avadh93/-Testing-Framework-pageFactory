package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CreateAccount_page;
import pageObjects.ForgotPassword_page;
import pageObjects.Home_page;
import core.Core;
import core.Footer;
import core.Header;

public class TestCase1 extends Core{
	
	@Test(enabled= false)
	public void to_check_the_registration_functionality() throws Exception{
		hp= PageFactory.initElements(driver, Home_page.class);
		sp=hp.navigateToSignIn();
		sp.signup();
		cp= PageFactory.initElements(driver, CreateAccount_page.class);
		cp.createAccount();
		}
	
	
	@Test(enabled= false)
	public void To_Test_Login_Functionality() throws Exception{
		
		hp= PageFactory.initElements(driver, Home_page.class);
		sp= hp.navigateToSignIn();
		sp.login(testdat.getProperty("emailid"),testdat.getProperty("password"));
		}
	
	@Test(enabled=false)
	public void to_check_the_NewsLetter_Functionality() throws Exception{
		f=PageFactory.initElements(driver, Footer.class);
		f.NewsletterRegistrationCheck();
	}
	
	@Test(enabled=false)
	public void to_check_forgot_password_functionality() throws Exception{
		hp=PageFactory.initElements(driver, Home_page.class);
		sp=hp.navigateToSignIn();
		sp.forgotPass();
		fp= PageFactory.initElements(driver, ForgotPassword_page.class);
		fp.forgotPassAction();
		
	}

	@Test
	public void to_check_contactUs_functionality() throws Exception{
		h=PageFactory.initElements(driver, Header.class);
		cup=h.headerContactUs();
		cup.sendMessage();
	}
	
	@Test(enabled=false)
	public void to_check_the_search_functionality(){
		h=PageFactory.initElements(driver, Header.class);
		h.headerSearchTextBox();
		srchp=h.headerSearchButt();
		srchp.SearchFunction();
	}
	
	@Test(enabled=false)
	public void to_check_shopping_cart_functionality(){
		h=PageFactory.initElements(driver, Header.class);
		shopp=h.headerCart();
		shopp.shoppingCartFunctionality();
	}
	
	@Test(enabled=false)
	public void to_check_shopping_cart_empty_functionality(){
		h=PageFactory.initElements(driver, Header.class);
		shopp=h.headerCart();
		shopp.ShoppingCartEmptyFunctionality();
	}
	
	@Test(enabled=false)
	public void to_check_shopping_cart_filled_functionality(){
		h=PageFactory.initElements(driver, Header.class);
		shopp=h.headerCart();
		shopp.ShoppingCartFilledFunctionality();
	}
}


package core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObjects.ContactUs_page;
import pageObjects.Search_page;
import pageObjects.ShoppingCart_page;
import pageObjects.SignIn_page;

public class Header extends Core {
	
	@FindBy(xpath=".//*[@id='header_logo']/a/img")
	public WebElement headerlogo;
	@FindBy(xpath=".//*[@id='search_query_top']")
	public WebElement searchtextbox;
	@FindBy(xpath=".//*[@id='searchbox']/button")
	public WebElement searchbutt;
	@FindBy(xpath=".//*[@id='header']/div[3]/div/div/div[3]/div/a")
	public WebElement cart;
	@FindBy(xpath=".//*[@id='contact-link']/a")
	public WebElement contactus;
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	public WebElement signin;
	
	public void headerHome(){
		headerlogo.click();
	}
	public void headerSearchTextBox(){
		searchtextbox.sendKeys(testdat.getProperty("searchtext"));
	}
	public Search_page headerSearchButt(){
		searchbutt.click();
		return PageFactory.initElements(driver, Search_page.class);
	}
	public ShoppingCart_page headerCart(){
		cart.click();
		return PageFactory.initElements(driver, ShoppingCart_page.class);
	}
	public ContactUs_page headerContactUs(){
		contactus.click();
		return PageFactory.initElements(driver, ContactUs_page.class);
	}
	public SignIn_page headerSignIn(){
		signin.click();
		return PageFactory.initElements(driver, SignIn_page.class);
	}
	

}

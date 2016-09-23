package pageObjects;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Core;

public class Home_page extends Core{
	
	@FindBy(xpath="//a[@class='login']")
	 public WebElement signinBut;
	@FindBy(xpath="//a[@title='Contact Us']")
	public WebElement contactus;
	
	
	
	public SignIn_page navigateToSignIn(){
	signinBut.click();
	return  PageFactory.initElements(driver, SignIn_page.class);
	}
	
	
	
	
	
	public ContactUs_page navigateToContactUs(){
		contactus.click();
		return PageFactory.initElements(driver, ContactUs_page.class);
	}
	
	
	
}

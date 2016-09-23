package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Core;



public class SignIn_page extends Core {
	
	@FindBy(xpath=".//*[@id='email']")
	public WebElement email;
	@FindBy(xpath=".//*[@id='passwd']")
	public WebElement password;
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	public WebElement submitlogin;
	@FindBy(xpath=".//*[@id='email_create']")
	public WebElement emailCreate;
	@FindBy(xpath=".//*[@id='SubmitCreate']")
	public WebElement submitcreate;
	@FindBy (xpath="//a[@title='Recover your forgotten password']")
	public WebElement forgotpassword;

	
	public void login(String uname, String pass) {
		System.out.println("welcome");
		email.sendKeys(uname);
		password.sendKeys(pass);
		submitlogin.click();
	}
	
	public CreateAccount_page signup() throws Exception
	{	
		
		emailCreate.sendKeys(testdat.getProperty("newemailid"));
		submitcreate.click();
		Thread.sleep(10000);
		return PageFactory.initElements(driver, CreateAccount_page.class);
	}
	
	public ForgotPassword_page forgotPass(){
		forgotpassword.click();
		return PageFactory.initElements(driver, ForgotPassword_page.class);
		
	}
	
}




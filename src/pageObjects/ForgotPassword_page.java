package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Core;

public class ForgotPassword_page extends Core{
	@FindBy(xpath=".//*[@id='email']")
	public WebElement forpasEID;
	@FindBy(xpath="//button[@class='btn btn-default button button-medium']")
	public WebElement retrievePass;
	@FindBy(xpath="//li[contains(text(),'There is no account registered for this email address.')]")
	public WebElement fperrorMessage;
	
	public void forgotPassAction(){
		forpasEID.sendKeys(testdat.getProperty("emailid"));
		retrievePass.click();
		String s1=fperrorMessage.getText();
		
		if(fperrorMessage.getText().equalsIgnoreCase("There is no account registered for this email address.")){
			System.out.println(" ERROR TEXT :"+s1);
		}
		
	}

	
}

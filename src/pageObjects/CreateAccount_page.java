package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import core.Core;

public class CreateAccount_page extends Core{
	@FindBy(xpath=".//*[@id='id_gender1']")
	public WebElement mr ;
	@FindBy(xpath=".//*[@id='customer_firstname']")
	public WebElement fname;
	@FindBy(xpath=".//*[@id='customer_lastname']")
	public WebElement lname;
	@FindBy(xpath=".//*[@id='passwd']")
	public WebElement password;
	@FindBy(xpath=".//*[@id='days']")
	public WebElement days;
	@FindBy(xpath=".//*[@id='months']")
	public WebElement month;
	@FindBy(xpath=".//*[@id='years']")
	public WebElement years;
	@FindBy(xpath=".//*[@id='newsletter']")
	public WebElement newsletter ;
	@FindBy(xpath=".//*[@id='optin']")
	public WebElement optin;
	@FindBy(xpath=".//*[@id='firstname']")
	public WebElement fnFN;
	@FindBy(xpath=".//*[@id='lastname']")
	public WebElement ln;
	@FindBy(xpath=".//*[@id='company']")
	public WebElement comp;
	@FindBy(xpath=".//*[@id='address1']")
	public WebElement add1;
	@FindBy(xpath=".//*[@id='address2']")
	public WebElement add2;
	@FindBy(xpath=".//*[@id='city']")
	public WebElement city ;
	@FindBy(xpath=".//*[@id='id_state']")
	public WebElement state ;
	@FindBy(xpath=".//*[@id='postcode']")
	public WebElement zip;
	@FindBy(xpath=".//*[@id='other']")
	public WebElement other ;
	@FindBy(xpath=".//*[@id='phone']")
	public WebElement hp ;
	@FindBy(xpath=" .//*[@id='phone_mobile']") 
	public WebElement mp ;  
	@FindBy(xpath=" .//*[@id='alias']") 
	public WebElement alias;
	@FindBy(xpath=".//*[@id='submitAccount']")
	public WebElement submit;
	
	public void createAccount() throws Exception{
		mr.click();
		fname.sendKeys(testdat.getProperty("fname"));
		Select dropdown = new Select(days);
		dropdown.selectByValue(testdat.getProperty("day"));
		Thread.sleep(1000);
	}
	
	
	
	

}

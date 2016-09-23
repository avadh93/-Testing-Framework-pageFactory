package core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends Core {
	@FindBy(xpath=".//*[@id='newsletter-input']")
	public WebElement newsletter;
	@FindBy(xpath=".//*[@id='newsletter_block_left']/div/form/div/button")
	public WebElement newsletterbutt;
	@FindBy(xpath="//p[@class='alert alert-danger']")
	public WebElement newsletterAlertDanger;
	
	

	public void NewsletterRegistrationCheck() throws Exception{
		
		newsletter.sendKeys(testdat.getProperty("invalidemailid"));
		newsletterbutt.click();
		String s=newsletterAlertDanger.getText();
		System.out.println("alert text:"+s);
		if(s.equalsIgnoreCase("Newsletter : Invalid email address.")){
			System.out.println("News Letter Regidtraion Functionality working perfectly");
		}
		if(s.equalsIgnoreCase("Newsletter : This email address is already registered.")){
			System.out.println("News Letter Regidtraion Functionality working perfectly");
		}
		if(s.equalsIgnoreCase("Newsletter : You have successfully subscribed to this newsletter.')]")){
			System.out.println("News Letter Regidtraion Functionality working perfectly");
		}
		
		
	}
	
}

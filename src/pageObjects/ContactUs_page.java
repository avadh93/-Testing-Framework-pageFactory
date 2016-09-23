package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Core;

public class ContactUs_page extends Core{
	@FindBy(xpath=".//*[@id='fileUpload']")
	public WebElement attachfile;
	
	public void sendMessage() throws Exception{
		attachfile.sendKeys("C:\\Users\\avadh\\Desktop\\todotask.txt");
		Thread.sleep(10000);
	}

}

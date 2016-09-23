package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Core;

public class Search_page extends Core{
	
	@FindBy(xpath="//span[@class='heading-counter']")
	public WebElement headingCounter;
	@FindBy(xpath="//p[@class='alert alert-warning']")
	public WebElement invalidSearch;
	
	public void SearchFunction(){
		String s=headingCounter.getText();
		System.out.println("heading counter text:"+s);
		if(s.equalsIgnoreCase("1 result has been found.")){
			System.out.println("Seacrh Functionality working perfectly");
		}
		if(s.equalsIgnoreCase("0 result has been found.")){
			System.out.println("Search Functionality working perfectly");
		}
	}
}

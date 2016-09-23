package core;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageObjects.ContactUs_page;
import pageObjects.CreateAccount_page;
import pageObjects.ForgotPassword_page;
import pageObjects.Home_page;
import pageObjects.Search_page;
import pageObjects.ShoppingCart_page;
import pageObjects.SignIn_page;
import utility.Constants;

public class Core{
	public static WebDriver driver;
	public static Properties objrepo= new Properties();
	public static Properties testdat= new Properties();
	public static Properties config= new Properties();
	public static FileInputStream fis;
	public static Header h;
	public static Footer f;
	public static SignIn_page sp ;
	public static CreateAccount_page cp;
	public static Home_page hp;
	public static ForgotPassword_page fp;
	public static ContactUs_page cup;
	public static Search_page srchp;
	public static ShoppingCart_page shopp;
	
	@BeforeSuite
	public void beforeTest() throws Exception{
		
		fis = new FileInputStream("C:\\Users\\avadh\\eclipse\\AutomationPractice.com\\src\\properties\\objectRepositry.properties");
		objrepo.load(fis);
		fis = new FileInputStream("C:\\Users\\avadh\\eclipse\\AutomationPractice.com\\src\\properties\\testCaseData.properties");
		testdat.load(fis);
		fis = new FileInputStream("C:\\Users\\avadh\\eclipse\\AutomationPractice.com\\src\\properties\\confi.properties");
		config.load(fis);
		
		if(config.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
	  }
		else if (config.getProperty("browser").equalsIgnoreCase("ie")) { 
		  System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
	  } 
	  driver.get(Constants.URL); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
	  }

	/*@Test
	public void To_Test_Login_Functionality(){
		lp = PageFactory.initElements(driver, Login_page.class);
		lp.login(testdat.getProperty("emailid"),testdat.getProperty("password"));
	}*/
	
	 

	  @AfterSuite public void afterTest() {

			driver.quit();

		}

	}
package SeleniumSamplesDay3Day4;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Verify_Page_Title {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_account() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.nab.com.au/");
		
	}
	
	@Test
	public void verify_page_title() {
		
		String ActualTitle = driver.getTitle();
		
		String ExpectedTitle = "NAB Personal Banking - insurance, loans, accounts, credit cards - NAB";
		
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		
		//Another type of Assertion
		
		Assert.assertTrue("Title Mismatch", ActualTitle.contains("NAB"));
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}

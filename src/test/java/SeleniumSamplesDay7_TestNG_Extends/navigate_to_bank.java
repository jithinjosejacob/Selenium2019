package SeleniumSamplesDay7_TestNG_Extends;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class navigate_to_bank {
	
	public WebDriver driver;
	public String baseURL;
	public StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeSuite(alwaysRun = true)
	public void SetUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		driver = new ChromeDriver();
		baseURL = "https://www.nab.com.au/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test(priority = 1)
	public void testLogintoPage() throws Exception {
		
		driver.get(baseURL);
		
	}
	
	@AfterSuite(alwaysRun = true)
	public void teardown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
	
	
	

}

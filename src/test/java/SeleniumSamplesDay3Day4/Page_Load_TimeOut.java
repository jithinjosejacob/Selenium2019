package SeleniumSamplesDay3Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Page_Load_TimeOut {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_webpage() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Page Load Time Out
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		//Navigate to url
		driver.get("https://www.nab.com.au/");
	}
	
	@Test
	public void verify_page_title() {
		
		System.out.println("Test");
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}

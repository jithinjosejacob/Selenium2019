package SeleniumSamplesDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class headless_chrome {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		
	    ChromeOptions chromeOptions  = new ChromeOptions();
	    chromeOptions.addArguments("--headless");
	    driver = new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void navigate_to_site() {
		driver.get("https://www.nab.com.au/");
	}
	@AfterTest
	public void logout() {
		driver.quit();
	}	
}

package SeleniumSamplesDay3Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Thread_sleep {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_webpage() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Navigate to url
		driver.get("https://www.nab.com.au/");
	}
	
	@Test
	public void verify_page_title() throws InterruptedException {
		
		System.out.println("Test");
		Thread.sleep(8000);
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}

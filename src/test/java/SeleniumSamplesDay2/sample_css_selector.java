package SeleniumSamplesDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample_css_selector {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_account() {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	//Created an object of driver
	driver = new ChromeDriver();
	driver.manage().window().maximize();//Full Screen
	//Navigate to url
	driver.get("https://www.facebook.com/");

	}
	
	@Test
	public void enter_data_to_first_name() {
		
		driver.findElement(By.cssSelector("input[name^='fi']")).sendKeys("Christopher");
		
	}
	
	@AfterTest
	public void quit_page() {
		driver.quit();
	}
}

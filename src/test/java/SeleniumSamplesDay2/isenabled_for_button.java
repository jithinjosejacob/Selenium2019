package SeleniumSamplesDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class isenabled_for_button {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_account() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("http://omayo.blogspot.com/");
		
	}
	
	@Test
	public void button_check() {
		
		if(driver.findElement(By.cssSelector("#but1")).isEnabled())
			System.out.println("Button One is Enabled");
		else
			System.out.println("Button One is not Enabled");
		
		if (driver.findElement(By.cssSelector("#but2")).isEnabled())
			System.out.println("Button Two is Enabled");
		else
			System.out.println("Button Two is not Enabled");			
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}

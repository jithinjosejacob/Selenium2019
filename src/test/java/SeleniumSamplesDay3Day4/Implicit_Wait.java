package SeleniumSamplesDay3Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Implicit_Wait {
	
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
		try {
			driver.findElement(By.xpath("//span[contains(text(),'View interest rates')]"));
			System.out.println("Exception Not Raised");
		}
		catch (NoSuchElementException Exception) {
			System.out.println("Exception Raised");
		}
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

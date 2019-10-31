package SeleniumSamplesDay3Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Explicit_Wait {
	
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
	public void verify_explicit_wait() {
		
		//Explicit Wait
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		try {
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='login']"))));
		System.out.println("Explicit Wait Happened");
		}
		catch (NoSuchElementException Exception) {
			System.out.println("Exception Raised");
		}
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}


}

package SeleniumSamplesDay3Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Synchronization {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_webpage() throws InterruptedException {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		  // Page Load Time Out
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  // Implicit Wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  // Explicit Wait
		  WebDriverWait explicitWait = new WebDriverWait(driver, 30);
		  explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));
		  // Fluent Wait
		  @SuppressWarnings({ "deprecation", "unused" })
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		  // Waiting 30 seconds for an element to be present on the page, checking
		    .withTimeout(30, TimeUnit.SECONDS)
		    // for its presence once every 5 seconds.
		    .pollingEvery(5, TimeUnit.SECONDS)
		    .ignoring(NoSuchElementException.class);
		  // Thread.sleep()
		  Thread.sleep(3000);
		  driver.get("http://www.google.com");

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

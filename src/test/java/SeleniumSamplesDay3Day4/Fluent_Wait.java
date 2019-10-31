package SeleniumSamplesDay3Day4;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fluent_Wait {
	
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
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	@Test
	public void verify_explicit_wait() {
		
	// Fluent Wait
		
	@SuppressWarnings("deprecation")
	Wait fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	
	Object content = fluentWait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//button[@id='login']"));
		}
	});
			
	
	}
		
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}


}

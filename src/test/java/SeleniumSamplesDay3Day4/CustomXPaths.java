package SeleniumSamplesDay3Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomXPaths {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_account() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.harveynorman.com.au/");
		
	}
	
	@Test
	public void custom_xpaths() throws InterruptedException {
		
		
		// Class equals 'Text'
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(10000);
		
		// Class contains 'Full Text'
		driver.findElement(By.xpath("//input[contains(@class,'form-control input-lg ui-autocomplete-input')]")).sendKeys("Computers");
		Thread.sleep(7000);
		
		// Class contains Partial Text
		driver.findElement(By.xpath("//input[contains(@class,'form-control input-lg ui')]")).clear();
		Thread.sleep(7000);
		
		//Contains Text
		driver.findElement(By.xpath("//span[contains(text(),'Store finder')]")).click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
		
		//Starts with ClassName
		driver.findElement(By.xpath("//i[starts-with(@class,'icon-us')]")).click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
		
		//Ends with ClassName
		//Ends with found not working
		driver.findElement(By.xpath("//i[ends-with(@class,'on-user')]")).click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

	
}

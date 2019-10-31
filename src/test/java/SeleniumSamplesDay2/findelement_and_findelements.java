package SeleniumSamplesDay2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class findelement_and_findelements {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_account() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("http://book.theautomatedtester.co.uk/");
		
	}
	
	@Test
	public void find_element_and_elements() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		int size = links.size();
		
		driver.findElement(By.cssSelector("#q")).sendKeys(""+size);
		
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}

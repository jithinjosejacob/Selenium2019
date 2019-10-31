package samples2019;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class radiobuttonselection {
	
	WebDriver driver;
	@BeforeClass
	public void navigate_to_account() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.harveynorman.com.au");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Account")).click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Create an account')]")).click();
	}
	
	@Test
	//Loginin to Git
	public void clickandverify_on_radio_button() {

		
		driver.findElement(By.id("accept_terms")).click();
		assertTrue("Check box option is not selected",driver.findElement(By.id("accept_terms")).isSelected());
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}

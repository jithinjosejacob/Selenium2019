package SeleniumSamplesDay2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sendkeysmultiplelines {
	
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
		
	}
	
	@Test
	//Loginin to Git
	public void entervalueonsearch() {

		
		driver.findElement(By.xpath("//input[@class='form-control input-lg ui-autocomplete-input']")).sendKeys("Good Guys \n Line Two \n Last Line");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}

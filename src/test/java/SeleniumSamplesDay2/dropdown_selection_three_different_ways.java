package SeleniumSamplesDay2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class dropdown_selection_three_different_ways {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void navigate_to_account() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		
	    ChromeOptions options  = new ChromeOptions();
	    options.addArguments("--disable-popup-blocking");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    
	    
		//Created an object of driver
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	//Loginin to Git
	public void selectdropdown() throws InterruptedException {
		
		Select day = new Select (driver.findElement(By.id("day")));
		day.selectByVisibleText("16");
		Select month = new Select (driver.findElement(By.id("month")));
		month.selectByIndex(11);
		Select year = new Select (driver.findElement(By.id("year")));
		year.selectByValue("1989");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("day")).sendKeys("25");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closebrowser() {
		driver.navigate().to("https://www.nab.com.au/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.quit();
	}

}

package SeleniumSamplesDay7;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert_URL_Contains {
	
	WebDriver driver;
	@Test(priority=1,description="First Execution")
	public void login_to_app1() {
		
		System.out.println("First TestNG Class");
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Navigate to url
		driver.get("https://www.nab.com.au/");
		
		String currentURL = driver.getCurrentUrl();
		
		Assert.assertTrue(currentURL.contains("nab"));
	}
	
	@Test(priority=-4,description="Second Execution")
	public void login_to_app2() {
		System.out.println("Second TestNG Class");
	}
		
	@Test(priority=-3,description="Third Execution")
	public void login_to_app3() {
		System.out.println("Third TestNG Class");
	}


}

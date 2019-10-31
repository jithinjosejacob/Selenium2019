package SeleniumSamplesDay7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityAndDescription {
	
	WebDriver driver;
	@Test(priority=2,description="Second Execution")
	public void navigate_to_site() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Navigate to url
		driver.get("https://www.nab.com.au/");
		
		System.out.println("First TestNG Class");
	}
	
	@Test(priority=3,description="Third Execution")
	public void verify_page_title() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Second TestNG Class");
	}
		
	@Test(priority=1,description="First Execution")
	public void closebrowser() {
		System.out.println("Last TestNG Class");
	}


}

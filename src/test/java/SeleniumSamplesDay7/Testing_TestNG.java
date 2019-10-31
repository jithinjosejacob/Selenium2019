package SeleniumSamplesDay7;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing_TestNG {
	
	WebDriver driver;
	@Test
	public void navigate_to_site() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Implicit Wait
		 
		//Navigate to url
		driver.get("https://www.nab.com.au/");
		
		System.out.println("First TestNG Class");
	}
	
	@Test
	public void verify_page_title() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Second TestNG Class");
	}
		
	@Test
	public void closebrowser() {
		System.out.println("Last TestNG Class");
	}

}

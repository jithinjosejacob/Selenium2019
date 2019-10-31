package SeleniumSamplesDay7_TestNG_DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DifferentClass_DataProvider2 {
	
	WebDriver driver;
		

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String uname,String password) {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Navigate to url
		driver.get("https://www.facebook.com/");
		
		// clear email field
		driver.findElement(By.id("email")).clear();
		// Enter usename
		driver.findElement(By.id("email")).sendKeys(uname);
		// Clear password field
		driver.findElement(By.id("pass")).clear();
		// Enter password
		driver.findElement(By.id("pass")).sendKeys(password);

		
    }
    


}

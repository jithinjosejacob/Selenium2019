package SeleniumSamplesDay7_TestNG_DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClass_DataProvider {
	
	WebDriver driver;
		

    @Test(dataProvider = "data-provider")
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
    
    @DataProvider(name = "data-provider")
    public Object[][] TestDataFeed() {
    	// Create object array with 2 rows and 2 column- first parameter is row and second is //column
    	Object [][] facebookdata=new Object[2][2];
    	// Enter data to row 0 column 0
    	facebookdata[0][0]="Selenium1@gmail.com";
    	// Enter data to row 0 column 1
    	facebookdata[0][1]="Password1";
    	     	 
    	 
    	// Enter data to row 1 column 0
    	facebookdata[1][0]="Selenium2@gmail.com";
    	 
    	// Enter data to row 1 column 0
    	facebookdata[1][1]="Password2";
    	 
    	// return arrayobject to testscript
    	return facebookdata;

    }

}

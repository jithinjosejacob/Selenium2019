package SeleniumSamplesDay3Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BasicCommands {
	
	WebDriver driver;
	
	@BeforeTest
	public void navigate_to_site(){
		
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
			
		//Launch sampleSiteForSelenium
		driver.get("http://www.artoftesting.com/sampleSiteForSelenium.html");
	}
	
	@Test
	public void commands() throws InterruptedException {
		//Fetch the text "This is sample text!" and print it on console
		//Use the id of the div to locate it and then fecth text using getText() method
		String sampleText = driver.findElement(By.id("idOfDiv")).getText();
		System.out.println(sampleText);
			
		//Waiting for 3 seconds just for user to efficiently check automation
		//Its not mandatory though
		Thread.sleep(3000);
			
		//Using linkText locator to find the link and then using click() to click on it
		driver.findElement(By.linkText("This is a link")).click();
			
		Thread.sleep(3000);
		
		//Finding textbox using id locator and then using send keys to write in it
		driver.findElement(By.id("fname")).sendKeys("Kuldeep Rana");
			
		Thread.sleep(3000);
		
		//Clear the text written in the textbox
		driver.findElement(By.id("fname")).clear();
			
		Thread.sleep(3000);
		
		//Clicking on button using click() command
		driver.findElement(By.id("idOfButton")).click();
			
		Thread.sleep(3000);
			
		//Find radio button by name and check it using click() function
		driver.findElement(By.id("male")).click();
		
		//Find element by name
		driver.findElement(By.name("firstName")).sendKeys("Jithin Jose");
			
		Thread.sleep(3000);
			
		//Find checkbox by xpath and check it using click() function
		WebElement elem = driver.findElement(By.xpath("//input[@value ='Automation']"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", elem);
				
		Thread.sleep(3000);
			
		//Using Select class for for selecting value from dropdown
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
			
		Thread.sleep(20000);
		
	}
	
	@AfterTest
	public void closebrowser() {
			//Close the browser
			driver.close();
	
	}
		
}

package SeleniumSamplesDay7_TestNG_Extends;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basic_actions extends navigate_to_bank{
	
	
    public basic_actions(WebDriver driver) {
        this.driver = driver;
        
        System.out.println("here");
    }
    

	public void test_basic_actions() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'View interest rates')]")).isDisplayed();
		
	}

}

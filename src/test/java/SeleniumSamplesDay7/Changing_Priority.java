package SeleniumSamplesDay7;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Changing_Priority {
	
	WebDriver driver;
	@Test(priority=1,description="First Execution")
	public void login_to_app1() {
		
		System.out.println("First TestNG Class");
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

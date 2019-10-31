package SeleniumSamplesDay7;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Sample_Assertion {
	
	WebDriver driver;
	@Test(priority=1,description="First Execution")
	public void login_to_app1() {
		
		System.out.println("First TestNG Class");
		Assert.assertEquals("Integer Values do not match", 12, 13);
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

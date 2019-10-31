package SeleniumSamplesDay7;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNG_Dependencies {
	
	WebDriver driver;
	@Test
	public void login_to_app1() {
		
		System.out.println("First TestNG Class");
		Assert.assertEquals("Integer Values do not match", 12, 13);
	}
	
	@Test(dependsOnMethods ="login_to_app1")
	public void login_to_app2() {
		System.out.println("Second TestNG Class");
	}
		
	@Test(dependsOnMethods ="login_to_app2")
	public void login_to_app3() {
		System.out.println("Third TestNG Class");
	}


}

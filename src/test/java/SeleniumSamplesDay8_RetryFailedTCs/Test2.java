package SeleniumSamplesDay8_RetryFailedTCs;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void test2(){
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}
}

package SeleniumSamplesDay8;

import org.testng.annotations.Test;

public class Disable_TestCases_Using_TestNG {
	

	    @Test(enabled = true)
	    public void testMethodOne() {
	     System.out.println("Test method one.");
	    }
	   @Test(enabled = false)
	    public void testMethodTwo() {
	        System.out.println("Test method two.");
	    }
	    @Test
	    public void testMethodThree() {
	     System.out.println("Test method three.");
	    }


}

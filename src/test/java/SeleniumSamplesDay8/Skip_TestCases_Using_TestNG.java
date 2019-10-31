package SeleniumSamplesDay8;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip_TestCases_Using_TestNG {
	
	@Test 
	 public void skip_Ignore_Test (){
	 String a ="Skip / Ignore Test";
	 if(a.equals("Skip / Ignore Test"))
	 {
		 throw new SkipException("Skipping / Ignoring - Script not Ready for Execution ");
	 }
	 else
	 {
		 System.out.println("In else condition"); 
	 }
	 	System.out.println("Out of the if else condition");
	 }
	 @Test 
	 public void out_Of_Skip_Test(){
		 System.out.println("No need to skip / ignore test");
	 }


}

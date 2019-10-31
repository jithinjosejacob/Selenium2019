package SeleniumSamplesDay7_TestNG_DataProvider;

import org.junit.Test;

public class TwoDimensionalArray {
	
	@Test
	public void Test() {
		
		int StudentMarks [] [];
		StudentMarks = new int [3][3];
		
		StudentMarks[0][0] = 22;
		StudentMarks[0][1] = 33;
		StudentMarks[0][2] = 44;
		
		System.out.println(StudentMarks[0][0]);
		System.out.println(StudentMarks[0][1]);
		System.out.println(StudentMarks[0][2]);
		System.out.println("");
		
		StudentMarks[1][0] = 100;
		StudentMarks[1][1] = 200;
		StudentMarks[1][2] = 300;
		
		System.out.println(StudentMarks[1][0]);
		System.out.println(StudentMarks[1][1]);
		System.out.println(StudentMarks[1][2]);
		System.out.println("");
		
		StudentMarks[2][0] = 5;
		StudentMarks[2][1] = 55;
		StudentMarks[2][2] = 555;
		
		System.out.println(StudentMarks[2][0]);
		System.out.println(StudentMarks[2][1]);
		System.out.println(StudentMarks[2][2]);
	}

}

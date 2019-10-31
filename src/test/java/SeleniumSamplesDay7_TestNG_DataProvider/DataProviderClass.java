package SeleniumSamplesDay7_TestNG_DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
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

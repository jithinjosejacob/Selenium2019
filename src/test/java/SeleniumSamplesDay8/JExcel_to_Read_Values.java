package SeleniumSamplesDay8;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;


public class JExcel_to_Read_Values {
	
	
	public static void main(String args[]) throws Exception {	
		
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.facebook.com/");
		
		File src = new File("C:\\Users\\ADMIN\\Desktop\\Materials\\Day8-TestNG and ApachePOI\\SampleFile.xls");
		
		Workbook wb = Workbook.getWorkbook(src);
		
		jxl.Sheet sh = wb.getSheet("Sheet1");
		
		int totalrows = sh.getRows();
		
		
		for (int row=0; row < totalrows; row++) {
			
			driver.findElement(By.id("email")).sendKeys(sh.getCell(0,row).getContents());
			
			driver.findElement(By.id("pass")).sendKeys(sh.getCell(0,row).getContents());
			
		}
		
		
	}

}

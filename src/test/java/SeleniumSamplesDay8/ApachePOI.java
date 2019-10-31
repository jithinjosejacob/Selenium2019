package SeleniumSamplesDay8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		File source = new File("C:\\Users\\ADMIN\\Desktop\\Materials\\Day8-TestNG and ApachePOI\\SampleApache.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data = sheet1.getRow(14).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
	}

}

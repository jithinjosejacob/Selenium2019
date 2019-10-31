package SeleniumSamplesDay8;

import java.io.File;
import jxl.Workbook;


public class JExcel_to_Read_Excel {
	
	public static void main(String args[]) throws Exception {	
		
		File src = new File("C:\\Users\\ADMIN\\Desktop\\Materials\\Day8-TestNG and ApachePOI\\SampleFile.xls");
		
		Workbook wb = Workbook.getWorkbook(src);
		
		String cellvalue = wb.getSheet(0).getCell(0, 0).getContents();
		
		System.out.println(cellvalue);
		
		String columnvalue = wb.getSheet(0).getCell(1, 0).getContents();
		
		System.out.println(columnvalue);
		
		int Totalrows = wb.getSheet(0).getRows();
		
		System.out.println(Totalrows);
		
		int Totalcolumns = wb.getSheet(0).getColumns();
		
		System.out.println(Totalcolumns);
		
		
	}

}

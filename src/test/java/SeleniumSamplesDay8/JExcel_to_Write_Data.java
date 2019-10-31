package SeleniumSamplesDay8;

import java.io.File;


import jxl.Workbook;


public class JExcel_to_Write_Data {
	
	public static void main(String args[]) throws Exception {	
		
		File src = new File("C:\\Users\\ADMIN\\Desktop\\Materials\\Day8-TestNG and ApachePOI\\SampleFile.xls");
		
		Workbook wb = Workbook.getWorkbook(src);
		
		jxl.Sheet sh = wb.getSheet("Sheet1");
		
		int totalrows = sh.getRows();
		
		int totalcols = sh.getColumns();
		
		for (int row=0; row < totalrows; row++) {
			
			for (int col =0; col < totalcols; col++) {
			
				System.out.println(sh.getCell(col, row).getContents() + "\t");
			}
			System.out.println();
			
		}
		
		
	}

}

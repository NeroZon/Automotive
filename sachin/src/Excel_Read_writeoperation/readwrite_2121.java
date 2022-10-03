package Excel_Read_writeoperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readwrite_2121 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	String path = "C:\\Users\\Arohi\\eclipse-workspace\\sachin\\New Microsoft Excel Worksheet.xlsx";
	
	 File file = new File (path);
	 
	 FileInputStream fis = new FileInputStream (file); 
	 
	 XSSFWorkbook wb = new XSSFWorkbook (fis);
	 
	 XSSFSheet sheet =wb.getSheetAt(0);
	 
	 //int row = sheet.getLastRowNum();
	 
	// int cell = sheet.getRow(1).getLastCellNum();
	 
	// for ( int x=1 ;x<=row;x++)
	 //{
		// for (int y=1;y<row;y++) {
			 
			// String value = sheet.getRow(x).getCell(y).getStringCellValue();
			 
		// System.out.println(value+"!");
		 
		 
		 
		// }
		 //System.out.println();
		 
	// }
	 
	
	

	}

}

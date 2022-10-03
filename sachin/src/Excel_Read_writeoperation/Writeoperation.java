package Excel_Read_writeoperation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeoperation {
	
	
	static Workbook THworkbook = null;
    static Sheet THsheet = null;
    static Row row = null;



	
public void readCellValue (String filepath,String filename,String Sheetname,int rowvalue,int cellvalue) throws Exception{
	
	File file = new File(filepath+"\\"+filename);
	
	FileInputStream inputstream = new FileInputStream(file);
	
	String fileExtensionName = filename.substring(filename.indexOf("."));
	
	if (fileExtensionName.equals(".xlsx")){
		
		THworkbook = new XSSFWorkbook (inputstream);
		
		
		}
	
	else if (fileExtensionName.equals(".xls")) {
		
		THworkbook = new HSSFWorkbook(inputstream);
	}
		
		THsheet = THworkbook.getSheet("sheetname");
		
		int rowcount = THsheet.getLastRowNum()-THsheet.getFirstRowNum();
		
		System.out.println("Number of rows = "+rowcount);
		
		for (int i =0;i<rowcount+1;i++) {
			
			Row row = THsheet.getRow(i);
			
			for (int j = 0;j<row.getFirstCellNum();j++) {
				
				
				
				System.out.println(row.getCell(j).getStringCellValue()+"--");
				
			}
			
			System.out.println();
			}
		
}

  public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	  // create object & call class name
	  Writeoperation read = new  Writeoperation();
	  
	  String filepath = System.getProperty("user.dir");
	  
	  read.readvalue  (filepath,"sachin1.xlsx, "student" );

      read.readcellvalue (filepath,"sachin1.xlsx,"student");	

      read.readcellvalue (filepath,"sachin1.xlsx,"student");		
		
		

	}

}

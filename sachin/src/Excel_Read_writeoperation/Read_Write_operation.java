package Excel_Read_writeoperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import dev.failsafe.Call;

public class Read_Write_operation {
	
	public static void main (String []args) throws EncryptedDocumentException, IOException {
		

		
		FileInputStream file = new FileInputStream("C:\\Users\\Arohi\\eclipse-workspace\\sachin\\New Microsoft Excel Worksheet.xlsx");
	
		String value = WorkbookFactory.create(file).getSheet("password").getRow(5).getCell(0).getStringCellValue();
		
		System.out.println(value+"");
		
		
		
		
	}
	
	

	}



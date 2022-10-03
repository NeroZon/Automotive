package Excel_Read_writeoperation;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.agile.EncryptionDocument;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readprashantwrite {

	public static void excel(int row, int col )throws EncryptedDocumentException , IOException {
		
		 FileInputStream file = new FileInputStream ("C:\\\\Users\\\\Arohi\\\\eclipse-workspace\\\\sachin\\\\New Microsoft Excel Worksheet.xlsx");

		 String value = WorkbookFactory.create(file) .getSheet("login").getRow (row).getCell(col).getStringCellValue();
		 
		 System.out.println(value+"");
	}

}

package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read the data From IPL sheet
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("IPL");
	    Row row = sheet.getRow(7);
	    Cell cell = row.getCell(0);
	    String data = cell.getStringCellValue();
	    System.out.println(data);
	
	}

}

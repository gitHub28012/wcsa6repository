package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {
	
	// write data into "IPL" sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("IPL");
	    Row row = sheet.getRow(1);
	    //create the new cell into 1st row
	    Cell cell = row.createCell(2);
	    // pass the value for cell
	    cell.setCellValue("Ranchi");
	    
	    // to write the data 
	    FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
	    wb.write(fos);
	}

}

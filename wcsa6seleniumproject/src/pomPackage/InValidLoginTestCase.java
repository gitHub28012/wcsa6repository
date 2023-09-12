package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
	  // refer the WebElemets of LoginPage by using POM class
		LoginPage lp = new LoginPage(driver);
		
	  // to read invalidUsername & password 
		Flib flib = new Flib();
		
		int rc = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);
		for(int i=1;i<=rc;i++)
		{	
		lp.inValidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME,i,0),flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i,1));
		}
		Thread.sleep(2000);
		bt.closeBrowser();
	}

}

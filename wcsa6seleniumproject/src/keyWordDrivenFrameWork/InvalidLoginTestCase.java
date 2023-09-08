package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// to open & close Browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//Read the invalid username & password from ActiTimeTestData Excel file
		Flib flib = new Flib();
		
		//get the last row count 
		int rc = flib.getLastRowCount(EXCEL_PATH,INVALID_SHEETNAME);
		Thread.sleep(2000);
		for(int i=1;i<=rc;i++)
		{
			
		// identify username text box pass invalid username
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH,INVALID_SHEETNAME, i,0));
		//identify password text box pass invalid password
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH,INVALID_SHEETNAME, i,1));
		//identify login Button and click
		driver.findElement(By.id("loginButton")).click();
		//clear the username text Box
		driver.findElement(By.name("username")).clear();
		}
		
		Thread.sleep(2000);
		bt.closeBrowser();

	}

}

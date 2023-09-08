package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// to open & close the Browser 
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		// to read the validUsername & validPassword 
		Flib flib = new Flib();
		// identify username Text Box and pass username
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"Username"));
		// identify password Text Box and pass password
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"Password"));
		//identify loginButton and click
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
		
	}

}

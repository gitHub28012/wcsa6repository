package pomPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// to open & close Browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		//perform valid Login Operation
		// refer the webElements from LoginPage pom
		LoginPage lp = new LoginPage(driver);
		// read the validUsername & validPassword
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
		Thread.sleep(2000);
	    bt.closeBrowser();
		
	}

}

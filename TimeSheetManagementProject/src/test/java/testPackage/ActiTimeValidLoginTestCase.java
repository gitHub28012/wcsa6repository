package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomeListener.class)
public class ActiTimeValidLoginTestCase extends BaseTest{
	
	@Test
	public void validLoginTestScript() throws IOException
	{
	   LoginPage lp = new LoginPage(driver);
	   Flib flib = new Flib();
	   lp.validLogin(flib.readPropertyData(PROP_PATH1,"Username"),flib.readPropertyData(PROP_PATH1,"Password"));
		
	}
	
	

}

package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;
import pagePackage.UsersPage;

public class ActiTimeDeleteTestCase extends BaseTest{
	@Test
	public void deleteTestScript() throws IOException {

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertyData(PROP_PATH1,"Username"),flib.readPropertyData(PROP_PATH1,"Password"));

		HomePage hp = new HomePage(driver);
		TasksPage tp = new TasksPage(driver);
		UsersPage up = new UsersPage(driver);
		
		hp.click_on_Tasks_Module();
		tp.deleteCust_ProjectMethod();
		
		hp.click_on_Users_Module();
		up.deleteManagerMethod();
		
	}
}

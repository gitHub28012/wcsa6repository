package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;
@Listeners(CustomeListener.class)
public class ActiTimeCreateManagers extends BaseTest {

	@Test
	public void createNewManagerTestScript() throws IOException {
		Flib flib = new Flib();

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		UsersPage up = new UsersPage(driver);

		lp.validLogin(flib.readPropertyData(PROP_PATH1, "Username"), flib.readPropertyData(PROP_PATH1, "Password"));
        hp.click_on_Users_Module();
        up.createManagerMethod(flib.readExcelData(EXCEL_PATH, USERS_SHEET_NAME,1,0),flib.readExcelData(EXCEL_PATH,USERS_SHEET_NAME,1,1),flib.readExcelData(EXCEL_PATH, USERS_SHEET_NAME, 1,2),flib.readExcelData(EXCEL_PATH, USERS_SHEET_NAME, 1, 3));
        up.managerAccessMethod();
	}

}

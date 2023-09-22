package dynamicScreenshot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(CustomeListener.class)

public class TestCase extends BaseTest {
	
	@Test
	public void loginMethod()
	{
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"tanmay!!");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("Login Done!!",true);
		//sa.assertAll();
	}
	
	@Test(dependsOnMethods = "loginMethod",alwaysRun = true)
	public void createUser()
	{
		Assert.fail();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		Reporter.log("User created!!",true);
		
	}
	
	@Test(dependsOnMethods = "createUser",alwaysRun = true)
	public void logoutMethod()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.partialLinkText("Logout")).click();
		
		Reporter.log("Logout done!!");
		
		
	}
  
}

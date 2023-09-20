package testNGAnnotations_Flags;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 {
 

	@Test(description = "Performs Login")
	public void loginMethod()
	{
		System.out.println("It is use to perform login!!");
	}
	
	@Test(description = "Performs create user",dependsOnMethods = "loginMethod")
	public void createUserMethod()
	{
		Assert.fail();
		System.out.println("user created!!");
	}
	
	@Test(description = "Performs logout",dependsOnMethods = "createUserMethod",alwaysRun = true)
	public void logoutMethod()
	{
		System.out.println("It is use perform logout!!");
	}
	
}

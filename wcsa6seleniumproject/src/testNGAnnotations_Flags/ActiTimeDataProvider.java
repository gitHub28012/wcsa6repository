package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProvider {
	static WebDriver driver;

	
	@Test(dataProvider = "actiTimeTestData")
	public void invalidLoginMethod(String usn,String pass) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-knl22f4g/login.do");

		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();

	}

	
	@DataProvider(name = "actiTimeTestData")
	public Object [] [] data()
	{
		Object [] [] testData= new Object [5] [2];

		        testData[0][0]="admin";
				testData[0][1]="     ";		

				testData[1][0]="     ";
				testData[1][1]="manager";		

				testData[2][0]="ad_min";
				testData[2][1]="mana_ger";		

				testData[3][0]="manager";
				testData[3][1]="admin";		

				testData[4][0]="admin123";
				testData[4][1]="manager456";
				
				return testData;
	}
}

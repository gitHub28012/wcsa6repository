package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	
	static WebDriver driver;
	
  @Parameters({"Browser","Url","Vusername","Vpassword"})
  @Test
  public void select_Browser_method(String browserValue,String url,String usn,String pass) throws InterruptedException 
  {
	  if(browserValue.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  
	  else if (browserValue.equalsIgnoreCase("firefox"))
	  { 
		  driver=new FirefoxDriver();
	  }
	  
	  else 
	  {
		  Reporter.log("Enter valid browserValue",true);
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(url);
//	  Thread.sleep(2000);
	  // identify usnTB
	  driver.findElement(By.name("username")).sendKeys(usn);
//	  Thread.sleep(2000);
	  //identify passTB
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  
//	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("loginButton")).click();
	  
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
  }
}

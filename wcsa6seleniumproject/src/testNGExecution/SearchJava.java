package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchJava {
	
  @Test
  public void java_serach_in_chrome() throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.get("https://www.google.com");
     
     
     driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
     
     Reporter.log("java",true);
     Thread.sleep(2000);
     
     driver.quit();
  
  }
}

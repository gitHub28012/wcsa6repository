package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchSelenium {
  @Test
  public void search_selenium_in_edge() throws InterruptedException {
	 WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://www.google.com");
	 
	 driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	 
	 Reporter.log("Selenium",true);
	 
	 Thread.sleep(2000);
	 driver.quit();
  }
}

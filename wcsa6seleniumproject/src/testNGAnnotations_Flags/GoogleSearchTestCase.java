package testNGAnnotations_Flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest{
	
  @Test
  public void search_for_java() {
	  
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  
  @Test
  public void search_for_selenium()
  {
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}

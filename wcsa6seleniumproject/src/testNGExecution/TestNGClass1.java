package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass1 {
  @Test
  public void method1() {
	  
	  Reporter.log("TestNGClass1 : Method1",true);
  }
  
  @Test
  public void method2() {
	  
	  Reporter.log("TestNGClass1 : Method2",true);
  }
}

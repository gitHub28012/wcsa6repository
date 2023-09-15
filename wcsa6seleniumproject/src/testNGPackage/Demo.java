package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1()
  {
	  Reporter.log("DEMO CLASS : Method1",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("DEMO CLASS : Method2",true);
  }
 
}

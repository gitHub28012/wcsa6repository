package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
  @Test(description = "Performs Login ")
  public void method1() {
	  Reporter.log("Method1",true);
  }
  
  @Test(description = "Performs Create user")
  public void method2() {
	  Reporter.log("Method2",true);
  }
  
  @Test(description = "Performs Log out")
  public void method3() {
	  Reporter.log("Method3",true);
  }
}

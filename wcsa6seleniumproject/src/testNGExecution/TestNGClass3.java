package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass3 {
	  @Test
	  public void method5() {
		  
		  Reporter.log("TestNGClass3 : Method5",true);
	  }
	  
	  @Test
	  public void method6() {
		  
		  Reporter.log("TestNGClass3 : Method6",true);
	  }
}

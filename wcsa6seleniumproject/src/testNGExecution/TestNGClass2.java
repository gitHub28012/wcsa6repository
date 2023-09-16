package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass2 {
	  @Test
	  public void method3() {
		  
		  Reporter.log("TestNGClass2 : Method3",true);
	  }
	  
	  @Test
	  public void method4() {
		  
		  int i=5;
		  int res=i/5;
		  Reporter.log("TestNGClass2 : Method4",true);
	  }
}

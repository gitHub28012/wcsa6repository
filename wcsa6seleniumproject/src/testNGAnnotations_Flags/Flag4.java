package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority = 0)
  public void f() {
	  
	  System.out.println("f");
  }
  
  @Test(priority = 5)
  public void g()
  {

	  System.out.println("g");  
  }
  
  @Test(priority = 7)
  public void h()
  {

	  System.out.println("h");
  }
  @Test(priority = 7)
  public void q()
  {

	  System.out.println("q");
  }
  @Test(priority = 1)
  public void c()
  {

	  System.out.println("c");
  }
  @Test(priority = 0)
  public void r()
  {

	  System.out.println("r");	  
  }
  @Test
  public void z()
  {

	  System.out.println("z");
  }
  @Test(priority = 2)
  public void a()
  {

	  System.out.println("a");
  }
  @Test(priority = 3)
  public void l()
  {

	  System.out.println("l");
  }
  @Test
  public void w()
  {

	  System.out.println("w");
  }
}

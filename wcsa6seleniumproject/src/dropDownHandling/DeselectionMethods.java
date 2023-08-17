package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {
	public static void main(String[] args) throws InterruptedException {
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/Automation/WebElement/MultiSelectDropDown.html");
	 	
	    WebElement dropDownEle = driver.findElement(By.name("menu"));	
	     Select sel = new Select(dropDownEle);
//	     // select single option from multiselect dropdown
//	     sel.selectByIndex(2);
//	     Thread.sleep(2000);
//	     // deselect single option from multiselect dropdown
//	     sel.deselectByIndex(2);
//	
	
//	     
//	     // select multiple options 
//	     for(int i=0;i<3;i++)
//	     {
//	    	 Thread.sleep(2000);
//	     	 sel.selectByIndex(i);
//	     }
//	     
//	     Thread.sleep(4000);
//	     // deselect multiple options
//	     for(int i=0;i<3;i++)
//	     {
//	    	 Thread.sleep(2000);
//	    	 // deselect the options according to index
//	    	 sel.deselectByIndex(i);
//	     }
//	     
//	     
	     
	     
//	     
//	     
////		 select multiple option from dropDown By using 
////	      selectByValue();
//	
//	String [] array=  {"v1","v2","v3","v4","v5","v6","v7","v8","v9"} ;
//	
//	for(int i=0;i<array.length;i++)
//	{
//		
//		Thread.sleep(2000);
//		sel.selectByValue(array[i]);
//	}
//	     
//	
//	Thread.sleep(4000);
//	// deselect By Value
//	for(int i=0;i<array.length;i++)
//	{
//		
//		Thread.sleep(2000);
//		sel.deselectByValue(array[i]);
//	}
	     
	// select the option from multiselect dropdown By using
	   // selectByVisibleText()
	     sel.selectByVisibleText("shankarpalya");
	     Thread.sleep(2000);
	     //sel.deselectByVisibleText("shankarpalya");
	     sel.deselectAll();
	     
           // select multiple options 
	     for(int i=0;i<3;i++)
	     {
	    	 Thread.sleep(2000);
	     	 sel.selectByIndex(i);
	     }
	     Thread.sleep(2000); 
	     sel.deselectAll();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}

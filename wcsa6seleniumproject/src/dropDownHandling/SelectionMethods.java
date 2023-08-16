package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {
	// static DropDown
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/Automation/WebElement/SingleSelectDropDown.html");
//         // handle dropdown by using Select class...
//		
//		// identify dropdown  
//		   // single select 
//		WebElement dropDownEle = driver.findElement(By.id("i1"));
//		
//		// create the obj of select class to access methods....
//		
//		Select sel = new Select(dropDownEle);
//		
//		// use Selection Methods
//		Thread.sleep(4000);
//		sel.selectByIndex(3); // selected option according to index value.
//		Thread.sleep(4000);
//		sel.selectByVisibleText("puran_poli");// selected option according to visible Text.
//		Thread.sleep(4000);
//		sel.selectByValue("v8");// selected option according to value.
//	
	// launch the Multiselect DropDown WebPage
		driver.navigate().to("file:///C:/Users/Qspiders%20Wakad/Desktop/Automation/WebElement/MultiSelectDropDown.html");
	    
		// identify dropDown
		  // Multi Select DropDown
		WebElement dropdownele1 = driver.findElement(By.id("i1"));
		 
		Select sel = new Select(dropdownele1);
		//sel.selectByIndex(3); 
		
		// select multiple options by using for loop
        for(int i=0;i<=3;i++)
        {
        	Thread.sleep(2000);
        	sel.selectByIndex(i);
        }
		
	}

}

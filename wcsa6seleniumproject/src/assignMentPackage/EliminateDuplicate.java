package assignMentPackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/Automation/WebElement/MultiSelectDropDown.html");

		WebElement dropDownElement = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDownElement);
		
		// to handle dropdown by eliminate duplicate we use HashSet
		
		    HashSet<String> hs = new HashSet<String>();
		    
	  // read all the options from dropDown
		  List<WebElement> allOps = sel.getOptions();
		  
		  // read list by eliminating duplicate
		  for(int i=0;i<allOps.size();i++)
		  {
			   // get the text of ops to add in set
			   String text = allOps.get(i).getText();
			   
			   // add text into HashSet
			   hs.add(text);
		  }
		  
		  
		  // read the HashSet...
		  
		  for(String opt:hs)
		  {
			  Thread.sleep(2000);
			  System.out.println(opt);
		  }
		

	}

}

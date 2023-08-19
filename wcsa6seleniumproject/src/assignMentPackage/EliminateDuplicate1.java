package assignMentPackage;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/Automation/WebElement/MultiSelectDropDown.html");
	   	
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		// handle the dropDown
		Select sel = new Select(dropDownElement);
		
		//remove duplicates from dropDown by using TreesSet
		TreeSet<String> ts = new TreeSet<String>();
		
		// read the options from dropDown 
		List<WebElement> allOps = sel.getOptions();
		// read the options 
		for(int i=0;i<allOps.size();i++)
		{
			// read the text of options
			String text = allOps.get(i).getText();
			
			// add text into treeSet  and maintain insertion order
			ts.add(text);
		}
		
		Thread.sleep(4000);
		
		// read the options from treeSet
		for(String opt:ts)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
		
		
	}

}

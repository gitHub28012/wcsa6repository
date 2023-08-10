package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com");
	   // switch the controls to activeElement.
	   driver.switchTo().activeElement().sendKeys("Poha");
	   // identify all the suggestions of poha element
	   Thread.sleep(2000);
	   List<WebElement> pohaSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	   Thread.sleep(2000);
	   // to print the list use looping statments .
//	   for(int i=0;i<pohaSuggestions.size();i++)
//	   {
//		   Thread.sleep(2000);
//		  System.out.println(pohaSuggestions.get(i).getText());
//		   
//	   }
//	 
	   // by using advance for loop read the list\
	   for (WebElement poha:pohaSuggestions)
	   {
		   Thread.sleep(2000);
		   System.out.println(poha.getText());
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}

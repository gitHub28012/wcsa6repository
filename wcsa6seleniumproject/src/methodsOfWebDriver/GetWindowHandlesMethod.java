package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		// address of parent window or browser
		String parentHandle = driver.getWindowHandle();
		
		
		Thread.sleep(3000);
		// scroll till open a popup window link
		WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
		
		// click on link
		childBrowser.click();
		
		
		// address of parent as well as child window or browser
		Set<String> allHandles = driver.getWindowHandles();
		
		System.out.println("address of parent window :"+parentHandle);
		System.out.println(" address of parent as well as child Window :"+allHandles);
		
		// get the address of only child window 
	
	       for(String wh:allHandles)
	       {
	    	   if(!parentHandle.equals(wh))
	    	   {
	    		   System.out.println("ADDRESS of Child window :"+ wh);
	    	   }
	       }
		
	}

}

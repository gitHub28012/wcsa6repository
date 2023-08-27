package javaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.selenium.dev/");
	    
	    // click on Read More Button Of SeleniumGrid
	    
	    Thread.sleep(5000);
	    // identify Read More Button
	    WebElement readMoreButton = driver.findElement(By.xpath("//a[contains(@class,'selenium-button selenium-g') ]"));
	
	    //explicit Typecast into JavaScriptExceutor
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	    jse.executeScript("arguments[0].click();",readMoreButton);
	}

}

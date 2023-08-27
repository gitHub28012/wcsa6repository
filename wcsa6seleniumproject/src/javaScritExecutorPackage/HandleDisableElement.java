package javaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/DisableWebElement.html");
	    
	   //identify Username Text Box
	    WebElement usn = driver.findElement(By.id("id1"));
	    usn.sendKeys("Admin");
	    
	    Thread.sleep(5000);
	    // password is a diasble Element handle it by using JavaScriptCode
	    //Explicit TypeCast into JavaScriptExecutor 
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("document.getElementById('id2').value='Manager';");
	    
        	
	}

}

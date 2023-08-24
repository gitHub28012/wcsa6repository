package javaScritExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev");
		 
		 //Explicit type casting Into JavaScriptExecutor
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		 Thread.sleep(4000);
		 
		 // perform scroll Down...
		 jse.executeScript("window.scrollBy(0,500)");
		
	}

}

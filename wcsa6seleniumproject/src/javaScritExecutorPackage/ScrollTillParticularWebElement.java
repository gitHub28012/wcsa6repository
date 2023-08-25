package javaScritExecutorPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillParticularWebElement {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev");
		 
		 // scroll Till particular WebElement
		   // webelement is NEWS text
		 
		 Thread.sleep(4000);
		 // identify NEWS WebElement
		 WebElement newsElement = driver.findElement(By.xpath("//h2[.='News']"));
		 
		 File src = newsElement.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/newsElemet.png");
		 
		 Files.copy(src, dest);
		 
		 
//		 Point loc = newsElement.getLocation();
////		 
//		 //perform scrolling till newsElement
//		 JavascriptExecutor jse = (JavascriptExecutor)driver;
//		 jse.executeScript("window.scrollBy("+loc.getX()+","+(loc.getY()-90)+")");
//	  
//		  // by passing the input as JS code 
//	//	 jse.executeAsyncScript("arguments[0].scrollIntoView(false)",newsElement);
//
//		 //take ss of newsElement
//		 
		
		 
		 
	
	}

}

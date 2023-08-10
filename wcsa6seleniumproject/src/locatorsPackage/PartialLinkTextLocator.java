package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		// parent browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// launch the webApplication
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		// identify the link to launch the child browser
		driver.findElement(By.partialLinkText("up window")).click();
	
		// use the close method
		driver.close();

		// use the quit() for close all browsers.
		//driver.quit();
	}

}

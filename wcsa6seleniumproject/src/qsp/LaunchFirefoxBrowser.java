package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		// To launch Firefox Browser create obj
		
		   WebDriver driver = new FirefoxDriver();
		   
		   // maximize firefox browser
		   driver.manage().window().maximize();
		   
		// stop the exceution of script for 2 sec
		   Thread.sleep(2000);
		   
		// close the browser by calling method of webdriver
		   driver.close();
	}

}

package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/webelements/SimpleLogin.html");
	   // identify Username TextBox by using tagName Locator
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		// identify Password TextBox by using tagName Locator
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Manager");
	}

}

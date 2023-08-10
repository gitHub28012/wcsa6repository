package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	// on instagram identify webelement by using name locator
      public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("tanmay@123");
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("idontknow");
	}	


}

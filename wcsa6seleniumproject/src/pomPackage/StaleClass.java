package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleClass {
	
	// to understand StaleElementReferenceException
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-knl22f4g/login.do");
	
		WebElement usnTB = driver.findElement(By.name("username"));     
		usnTB.sendKeys("admin");
//		WebElement passTB = driver.findElement(By.name("pwd"));
//		passTB.sendKeys("admin123");
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(2000);
//		usnTB.clear();
		
		System.out.println(usnTB);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usnTB.sendKeys("admin123");
		
	
		
		
	}

}

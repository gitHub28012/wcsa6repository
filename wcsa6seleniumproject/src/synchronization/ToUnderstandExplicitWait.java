package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandExplicitWait {
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// apply implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.shoppersstack.com/");
		
		// identify any one of the product and click
		driver.findElement(By.xpath("//img[@alt='jeans']")).click();
        
		//identify check delivery box and pass the inputs 
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		//identify check button and click
		//driver.findElement(By.id("Check")).click();
		
		// apply explicitly wait for check button
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();

	}



}

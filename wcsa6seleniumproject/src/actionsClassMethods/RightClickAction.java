package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
        
		// handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		
		//identify Rings option
		WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
		
		// perform right click on Rings
		Actions act = new Actions(driver);
		
		act.contextClick(target).perform();
	}

}

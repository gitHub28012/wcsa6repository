package assignMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		//Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("idontknow");
		
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap')]")).click();
	}

}

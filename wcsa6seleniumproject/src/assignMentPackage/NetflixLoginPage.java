package assignMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/Login");
		
		//identify email or phono text box
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("tanmay@123");
		// identify password text box
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("123456789");
		//identify Sign in button
		Thread.sleep(2000);
		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
	}

}

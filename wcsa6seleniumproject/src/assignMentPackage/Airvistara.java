package assignMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Airvistara{

	public static void main(String[] args) throws InterruptedException {
		
		//Handle Notification popup
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
	//	-------------------------------------------------
    
		 WebDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://www.airvistara.com/in/en/plantravel/flight-booking");
		 
		 // identify depart loc
		 driver.findElement(By.xpath("//input[@placeholder='Select Departure City' and (@name='flightSearchFrom')]")).sendKeys("pune",Keys.ENTER);
		// driver.findElement(By.xpath("//span[@class='scombobox-marker' and (text()='Pune')]")).click();
	      Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Kochi",Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.id("acceptAllBtn")).click();
		 driver.findElement(By.xpath("(//p[@class='label'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[text()='1 Adult']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("depart")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='31']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@monthname='Aug']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='ui-state-default' and (text()='5')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("pb-searchflight")).click();
		 Thread.sleep(2000);
		 driver.quit();
		  

	}
}



package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/Automation/WebElement/Alert.html");
		
		//generate the alert pop up
		WebElement button = driver.findElement(By.xpath("//button[text()='Click me!']"));
	    button.click();
	    //handle alert pop up by switching the controls to alert
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(2000);
	 //   al.accept(); to accept the pop up
   //     al.dismiss(); to dismiss the pop up
	     System.out.println(al.getText());
	     al.accept();
	    Thread.sleep(2000);
	    driver.close();
	  
	}

}

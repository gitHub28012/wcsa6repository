package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	
	// it is use to close parent browser
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// launch WebApplication
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		// close parent browser
		driver.close();
		
	}

}

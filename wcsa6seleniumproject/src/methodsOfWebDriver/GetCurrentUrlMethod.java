package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	
	// it is use to get the url of current webpage
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// launch the actiTIME
		driver.get("http://127.0.0.1/login.do");
		// Read the url of login page
		String urlOfloginPage = driver.getCurrentUrl();
		System.out.println(urlOfloginPage);
		
		
	}

}

package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourcesMethod {
	
	// it is use to get the source code of current webpage
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do");
		// read the source code of login page
		String loginPageSourcecode = driver.getPageSource();
		System.out.println(loginPageSourcecode);
	}

}

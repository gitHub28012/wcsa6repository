package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		// parent browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// launch the webApplication
		driver.get("https://www.selenium.dev/");
	}

}

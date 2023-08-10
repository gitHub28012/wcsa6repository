package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	
	// it is use to get the title of current webpage
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the instagram
		driver.get("https://www.instagram.com");
		// read the title of login page
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		driver.close();
	}

}

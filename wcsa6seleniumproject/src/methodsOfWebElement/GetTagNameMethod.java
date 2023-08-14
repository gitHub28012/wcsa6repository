package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		// To find the element on the Web Page
		WebElement usn = driver.findElement(By.name("username"));
		
		// To get the Tag Name of WebElement
		String usnTagName = usn.getTagName();
		System.out.println(usnTagName);
		
		String loginButton = driver.findElement(By.xpath("//button[@type='submit']")).getTagName();
		System.out.println(loginButton);

	}

}

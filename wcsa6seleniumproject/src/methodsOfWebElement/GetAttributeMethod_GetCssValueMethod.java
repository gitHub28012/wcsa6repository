package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttributeMethod_GetCssValueMethod {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// identify username textBox
		String attributeValue = driver.findElement(By.name("username")).getAttribute("class");
		
		System.out.println(attributeValue);
		//
		// identify login Button
		String cssValue = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("height");
	    System.out.println(cssValue);
	}

}

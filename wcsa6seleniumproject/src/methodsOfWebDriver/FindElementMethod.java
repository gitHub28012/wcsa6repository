package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-k0cq021/login.do");
		// identify username textbox and pass the inputs as admin
		// to identify we use findElement Method
		// once the webelent found it returns WebElement .(I) & address of WebElement
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		System.out.println(usernameTextBox);
		usernameTextBox.sendKeys("admin");
		// to identify  password TextBox we use findElement Method
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		System.out.println(passwordTextBox);
		passwordTextBox.sendKeys("manager");
		
		
		
		
	}

}

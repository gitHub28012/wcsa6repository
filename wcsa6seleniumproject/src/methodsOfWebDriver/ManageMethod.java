package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		// use manage method and maximize the browser
		driver.manage().window().maximize();
		
		//use manage method and set the size of browser
		Thread.sleep(2000);
		Dimension targetSize = new Dimension(450,250);
		driver.manage().window().setSize(targetSize);
		
		//use manage method and change the position of browser
		Point targetPosition = new Point(650,350);
		driver.manage().window().setPosition(targetPosition);
	    // fullScreen
		driver.manage().window().fullscreen();
	}

}

package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {
	
	// to generate print pop up by using Robot class
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
			Thread.sleep(2000);
		//press ctrl and p to generate print pop up
	    Robot robot = new Robot();
	    
	    //press ctrl button
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    //press p button
	    robot.keyPress(KeyEvent.VK_P);
	    // release ctrl button
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    //release p button
	    robot.keyRelease(KeyEvent.VK_P);
	    
	    Thread.sleep(2000);
	    // switch the controls to cancel Button
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
	    Thread.sleep(2000);
	    // hit enter button
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
	    
	    
		
	}

}

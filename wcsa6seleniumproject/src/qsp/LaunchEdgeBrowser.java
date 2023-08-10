package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// To launch Edge Browser create obj

		WebDriver driver=new EdgeDriver();

		// maximize firefox browser
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.close();
	}
}

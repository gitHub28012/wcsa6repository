package popUpHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-knl22f4g/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		// click on settings module
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		// click on 'Logo & Color Scheme'
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		Thread.sleep(2000);
		// select the radio button
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(4000);
		//Double click on choose file button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		// File Upload pop will get Open
		// handle the file Upload POP UP
		
		File file = new File("./autoitFiles/UploadFile.exe");
		String absPath = file.getAbsolutePath();
		Thread.sleep(2000);

		Runtime.getRuntime().exec(absPath);
		
		Thread.sleep(6000);

		Runtime.getRuntime().exec(absPath);
		
		//	driver.quit();
		
		
	}


}

package assignMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeSignIn {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg1VIg2GEOpB58kjNccu4DPVmzRDkcM8i4iY1ib3OJ3GkAAAAAQAAAABktkEKcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-3998534-1365235&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
	   //identify email text box
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("tanmay@123");
		
		//identify password text box
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("123456789");
		
		//identify sign in button
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
	}

}

package Alert_2022_24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alert {

	public static void main(String[] args) throws Exception{
			System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver ();

		driver .get("https://www.hyrtutorials.com/p/alertsdemo.html");
			
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			
			driver .findElement(By.id("confirmBox")).click();
			
			Alert a = driver .switchTo().alert();
			
			Thread.sleep(5000);
			a.dismiss();
			
		// a.accept();
			
	}

}	


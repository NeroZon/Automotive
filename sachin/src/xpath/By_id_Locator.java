package xpath;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class By_id_Locator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();

		driver .get("https://www.hyrtutorials.com/p/alertsdemo.html");
			
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			
			driver .findElement(By.id("confirmBox")).click();
			
			// by.id("confirmBox")
			
			Alert a = driver .switchTo().alert();
			
			Thread.sleep(5000);
			a.dismiss();
		

	}

}

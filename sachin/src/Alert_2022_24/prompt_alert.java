package Alert_2022_24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_alert {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver ();

		driver .get("https://www.hyrtutorials.com/p/alertsdemo.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			
			driver .findElement(By.id("promptBox")).click();
			
			Alert b = driver .switchTo().alert();
			
			String text = b.getText();
			
			b.sendKeys("sachin");
			Thread.sleep(5000);
			b.accept();
			
			System.out.println("Alert text is"+text);
			
			//b.dismiss();
			//b.accept();

	}

}

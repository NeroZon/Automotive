package Alert_2022_24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver ();

driver .get("https://www.hyrtutorials.com/p/alertsdemo.html");
	
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
	driver .findElement(By.id("alertBox")).click();
	
	Alert a = driver .switchTo().alert();
	a.accept();
	
	
	
}
}

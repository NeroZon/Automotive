package Alert_2022_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
	
		
		driver.findElement(By.xpath(""));
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

}

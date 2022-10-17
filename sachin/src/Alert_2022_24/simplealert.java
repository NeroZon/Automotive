package Alert_2022_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sachin1.webdriver;

public class simplealert {

	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.hyrtutorials.com/p/alertsdemo.html  ");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		//button[@id='alertBox']
		
	}
}

package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sachin1.webelement;

public class satarday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("automation");
		
		WebElement pw = driver.findElement(By.xpath("//input[@id='pass']"));
		pw .clear();
		pw.sendKeys("Testing");
		
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
		
		

	}

}

package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.xpath("//input[@id = 'email']"));
		
		un .clear();
		
		un.sendKeys("aarohi");
		
	WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
		
		pw .clear();
		
		pw.sendKeys("walke");
		
		

	}

}

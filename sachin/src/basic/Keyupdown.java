package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import sachin1.webelement;

public class Keyupdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
	
		WebElement year = driver.findElement(By.xpath("//*[@role='button'])[2]"));
		
		Actions act = new Actions(driver);
		
		act.click(year).perform();
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
	}

}

package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_up_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("WebDriver.chrome.driver","chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		 
		Actions action = new Actions (driver);
		
		action.keyDown(element,Keys.SHIFT).sendKeys("selenium").build().perform();


	}

}

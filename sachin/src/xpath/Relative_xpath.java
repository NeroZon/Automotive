package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {

	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/signup");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			WebElement FN = driver.findElement(By.xpath ("//input[@name= 'firstname']"));
			
			// "//input[@Attributename="Attributevalue"]"
			
			FN.click();
			FN.clear();
			FN.sendKeys("AUTOMATION");
			

	}

}

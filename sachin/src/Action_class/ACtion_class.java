package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACtion_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tatamotors.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		// we use action class method for mouse operation.
		Actions a = new Actions(driver);
		
   // perform mouse operation & build & perform. 
        
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		// we findout the locator for page scroll down
		WebElement ln = driver.findElement(By.xpath("//li[@class='haActive']"));
		
		
		//li[@class='haActive']
		
		
	//	action.keyDown(element,Keys.SHIFT).sendKeys("selenium").build().perform();

	}

}

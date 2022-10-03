package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import sachin1.webelement;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		WebElement source  = driver.findElement(By.xpath("//div[@id='draggable']")); ////input[@id='email']
		
		WebElement destination  = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source,destination).build().perform();
		
		
	}

}

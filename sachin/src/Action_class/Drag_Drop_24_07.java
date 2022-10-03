package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_24_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch Website
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//Perform Drag and Drop Action
		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement destination = driver.findElement(By.cssSelector("div[id='droppable']"));
		
		Actions a = new Actions(driver);	
		
	a.dragAndDrop(source, destination).build().perform();	
   
	}

}

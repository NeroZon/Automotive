import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class battery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // Setting up Chrome driver path.
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // Launching Chrome browser.
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.justdial.com/Bangalore/Bakeries");

        List<WebElement> bakeries = driver.findElements(By.className("store-name"));

       System.out.println(bakeries.size());

      for (WebElement webElement : bakeries) {
           String name = webElement.getText();
          System.out.println(name);
        }
    
	}
}

	



package Action_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nine_nine_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String actual = driver.getCurrentUrl();
		String expected = "https://www.onlinesbi.sbi/";
		
		if (actual.equals(actual)) {
			
			System.out.println("sbi site launch sucessful");
			
		

		} else {
				
				
				System.out.println("sbi site launch unsucessful");}
			
			
		}
		
		
		
		
		
		//driver.close();
		//driver.quit();
		
		

	}


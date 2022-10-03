package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Air_india {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://meesho.com/auth?redirect=https%3A%2F%2Fmeesho.com%2F&source=profile&entry=header&screen=HP");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String actual = driver.getCurrentUrl();
		String expected = "https://meesho.com/auth?redirect=https%3A%2F%2Fmeesho.com%2F&source=profile&entry=header&screen=HP";
	
	System.out.println("verify url");
	
	if (expected.contains (actual)) {
		
		System.out.println(" url launch sucessful");
		
	}
		
		else {
				System.out.println("url launch unsucessful");
				
	}
		
		
	}
}

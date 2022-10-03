package Screenshot_demo_24_07;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class paytmsnapshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty ("WebDriver.chrome.driver","chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
	    
	    driver.get("https://paytm.com/login");
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    
	    scrrenshot (driver,"screenshotdemo(1)/paytm.png");
	   }

	public static void scrrenshot(WebDriver driver, String filepath) throws IOException {
		// TODO Auto-generated method stub
		
	
		TakesScreenshot a =((TakesScreenshot)driver);
		
		File srcfile = a.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File (filepath);
		
		FileHandler.copy(srcfile, destfile);
		
	}

}

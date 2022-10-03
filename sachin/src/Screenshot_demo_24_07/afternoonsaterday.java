package Screenshot_demo_24_07;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class afternoonsaterday {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.cybage.com/");
		
		sachin (driver,"screenshotdemo(1)/cybage.png");

	}

	public static void sachin(WebDriver driver, String filepath) throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot a = ((TakesScreenshot)driver);
		
		File srcfile = a.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File (filepath);
		
		FileHandler.copy(srcfile, destfile);
	}

}

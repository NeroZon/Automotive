import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenshotDemo_212112 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("Webdriver.chrome.driver","chromedriver.exe" );
		
		WebDriver driver  = new ChromeDriver ();
		
		driver.get("https://github.com/");

		captureScrrenshot (driver, "screenshotdemo(1)/swara.png");

	}

	
	public static void captureScrrenshot(WebDriver driver, String filepath) throws Exception {
		// TODO Auto-generated method stub
		
		TakesScreenshot as = ((TakesScreenshot)driver);
		
		File Srcfile= as.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File(filepath);
		
		FileHandler.copy(Srcfile, destfile);
		
		
		
	}

}

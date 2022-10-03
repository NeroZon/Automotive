package Screenshot_demo_24_07;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrrenshot_1212 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
             System.setProperty("WebDriver.chbrome.driver","chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             driver.get("https://www.selenium.dev/");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
             
             // file save location 
             takesnapshot(driver,"screenshotdemo(1),testhub.png");


}
// adittional method use 
	private static void takesnapshot(WebDriver driver, String filepath) throws IOException {
		// TODO Auto-generated method stub

		// use takesscreenshot method
		TakesScreenshot a = ((TakesScreenshot)driver);
		
	  // source file address using screenshot method
		File srcfile = a.getScreenshotAs(OutputType.FILE);
		
		// destination address save file path
		File destfile = new File (filepath);
		
		
		// to handle the file source & destination
		
		FileHandler.copy(srcfile, destfile);
		
		
	}

}

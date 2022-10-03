import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2121 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe" );
		
		WebDriver driver  = new ChromeDriver ();
		
		driver.get("https://www.jiomart.com/customer/account/login?gclid=Cj0KCQjw54iXBhCXARIsADWpsG-EG4wiPCg3H04Glkq8JCyOgbYAVvch30-n65gEHQA0WZXBPUcYokYaAs2BEALw_wcB");

		Screenshot1 (driver,"screenshotdemo(1)/Thrusday.png") ;
	}

	public static void Screenshot1(WebDriver driver, String filewithpath) throws Exception{
		// TODO Auto-generated method stub
		
		
		TakesScreenshot as = ((TakesScreenshot)driver);
		
		File srcshot =as.getScreenshotAs(OutputType.FILE);
		
		File dstshot = new File (filewithpath);
		
		FileHandler.copy(srcshot, dstshot);
		


	}

}

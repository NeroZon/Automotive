package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.runtime.Runtime.GetPropertiesResponse;

public class propertyfile_26_07 {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			String filepath = System.getProperty("user.dir");
			
			String configfile ="configfilefolder26-07-2022/datafile.properties";
			
			String complitpath = filepath +"\\"+configfile;		
			
			File file = new File(complitpath);
			
			FileInputStream fis = new FileInputStream (file);
			
			
			Properties prop = new Properties();
			
			prop.load(fis);
			
			System.out.println(prop.getProperty("URL"));
			System.out.println(prop.getProperty("Driver"));
			
			
                //System.setProperty("WebDriver.chrome.driver", prop.getProperty("Driver"));
               // WebDriver driver = new ChromeDriver ();
               // driver.get(prop.getProperty("URL"));
                
               
                //WebElement fn = driver.findElement(By.xpath("//input[@id='email']"));
                //fn.clear();
                //fn.sendKeys(prop.getProperty("fn"));
                
                
               // WebElement pw = driver.findElement(By.xpath("//input[@id='pass']"));
               // pw.clear();
                //pw.sendKeys(prop.getProperty("pw"));
                
                
                
                
                
                
	}

}

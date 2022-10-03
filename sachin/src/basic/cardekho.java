package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cardekho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	
	// Webdriver is interface 
	
	
	WebDriver driver = new ChromeDriver ();
	
	driver.get(" https://www.cardekho.com/ ");
    
	driver.manage().window().maximize();
   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    List <WebElement> car =  driver.findElements (By.xpath("//div[@class='gsc_col-xs-12 holder truncate']"));
    
    System.out.println(car.size());
    
    
    for (WebElement WebElement : car) {
    	
    	String name = WebElement.getText();
    	
    	System.out.println(name);
    	
    	
    }
    
       
	}
   
    
   
  
	}



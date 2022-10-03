package Nerozone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_up_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get(" http://ec2-13-233-174-236.ap-south-1.compute.amazonaws.com/nerozon-backend/login ");
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		

     WebElement el = driver.findElement(By.xpath("//input[@id='email'] "));
     el.clear();
     el.sendKeys("admin@nerozon.com");

 
    WebElement pw = driver.findElement(By.xpath(" //input[@id='password']"));
    pw.clear();
    pw.sendKeys("123456");
    
    
    
    WebElement Rm  = driver.findElement(By.className("aiz-square-check"));
    Rm.click();
    
    
    WebElement ln  = driver.findElement(By.xpath("  //button[@type='submit'] "));
    ln.click();
    
    
  
		
	//Thread.sleep(50000);
		
		//driver.close();
		
		//driver.quit();
		

	}

}

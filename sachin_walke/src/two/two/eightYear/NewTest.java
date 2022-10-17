package two.eightYear;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.testng.annotations.AfterMethod;

public class NewTest {
	
	Webdriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("WebDriver.Chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
  }

  
  @Test
  public void f() {
  }   
  
  
  
  @AfterMethod
  public void afterMethod() {
  }

}

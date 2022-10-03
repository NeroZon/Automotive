package Listenerdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listenerdemo.listnerdemo1.class)
public class listenersdemo2 {
	static WebDriver driver;
	
  @Test
  public void browsersetup() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }
  
  @Test
  public void login() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");							
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");							
	  driver.findElement(By.id("btnLogin")).click();
  }
  
  
  @Test
  public void methodtofail() {
	  
	  Assert.assertTrue(false);
	  System.out.println("I am failed");
  }
  
  
  @Test(enabled=false)
  public void methodtoskip() {
	  System.out.println("I have skipped");
  }
  
  
  @Test
  public void endscript() {
	  driver.close();
  }
  
}

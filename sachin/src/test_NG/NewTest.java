package test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	 WebDriver driver;
	
  @Test(dataProvider = "setdata")
  public void f(String username, String password) {
	  
	  WebElement ele1= driver.findElement(By.id("txtUsername"));
	  ele1.clear();
	  ele1.sendKeys(username);
	  
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();	  
	  
  }
  
  
  @BeforeMethod
  public void Verifyloginpage() {
	  System.out.println("I am in @beforeMethod");
	  String expected = "OrangeHRM";
	  String actual =driver.getTitle();
	  if(expected.equalsIgnoreCase(actual)) {
		  System.out.println("User is on Login Page");
	  }
	  else {
		  System.out.println("User is not on Login Page");
	  }
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] setdata() {
	  
	  Object[][] obj = new Object[3][2];
	  
	  obj[0][0]="Admin";
	  obj[0][1] ="admin";
	  
	  obj[1][0]="admin";
	  obj[1][1]="admin123";
	  
	  obj[2][0]="Admin";
	  obj[2][1]="admin123";
	  
	  return obj; 
	  
	  
    
  }
  
  
  @BeforeClass
  public void maximizeandWait() {
	  System.out.println("I am in @Before Class");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void geturl() {
	  System.out.println("I am in @before test");
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void configureSetup () {
	  System.out.println("I am in @Before suite");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver= new ChromeDriver();
  }

  @AfterSuite
  public void afterSuite() {
	  //driver.close();
  }

}
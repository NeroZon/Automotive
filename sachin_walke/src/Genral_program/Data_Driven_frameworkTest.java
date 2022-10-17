package Genral_program;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Data_Driven_frameworkTest {
	
	//precondition of Annotation Starting @Before
  @BeforeSuite 
  public void setup  () {
	  System.out.println(" set up system property of chrome");
  }
  @BeforeClass
  
  public void launchBrowser() {
	  System.out.println("launch chrom browser");
  }
  

  @BeforeTest
  public void login() {
	  System.out.println("login to app");
	  
  }
  
  @BeforeMethod 
public void enterURL() {
	  //WebDriver driver = new chromedriver();
	  System.out.println("enter URL");
  }
  
  // Test cases-------starting with @Test
  @Test
  public void googleTitleTest() {
	  System.out.println("google Title Test");
	  
  }
  
  
//postcondition Starting with @Test
  
  @AfterMethod 
public void logout() {
	  
	  System.out.println("logout from app");
  }
  @AfterTest
  public void Deleteallcookies() {
	  System.out.println("Delete all cookies");
	  
  }
  
@AfterClass
  
  public void CloseBrowser() {
	  System.out.println("close chrome browser");
  }
@AfterSuite 
public void genrateTestReport  () {
	  System.out.println("Genrate Test Report");
}




  
  
}
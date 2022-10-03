package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Softassertion {
	WebDriver driver;
	
	SoftAssert as = new SoftAssert();
	

	  @BeforeSuite
	  public void beforeSuite() {
		  
		  System.out.println("i am in beforesuite");
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.out.println(" i am in beforetest");
		  
		  driver = new ChromeDriver();
	  }
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.out.println("i am in before class");
		  
		  driver.get("https://demo.activeitzone.com/ecommerce/login?_ga=2.180707810.434637013.1659806001-1133032007.1659806001");
		  driver.manage().window().maximize();
	  }

	 @Test
  public void f() {
	  String expected = "Active eCommerce | Demo of Active eCommerce CMS";	  
	  String Actual = driver.getTitle();
	 //Assert.assertEquals(expected, Actual); 
	 
	// System.out.println("is verification done");
	  as.assertEquals(expected, Actual, "Title is not matched");
	  
	  System.out.println("is verification done ");
	  System.out.println("is verification done ");
	  System.out.println("is verification done ");
	  System.out.println("is verification done ");
	  System.out.println("is verification done ");
	  
	  as.assertAll();
	  System.out.println("i will not run");
	  }
  }

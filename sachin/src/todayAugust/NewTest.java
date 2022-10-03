package todayAugust;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test (priority=1)
  public void f() {
	  System.out.println("i am automation engg");
  }
  
  @Test(priority=2)
  public void f1() {
	  System.out.println("i am automation engg");
  }
  
  @Test (priority=3)
  public void f2() {
	  System.out.println("i am automation engg");
  }
  
  @Test(priority=4)
  public void f3() {
	  System.out.println("i am automation engg");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am before automation engg");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am after automation engg");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am before automation engg");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am after automation engg");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am before automation engg");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am after automation engg");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am before automation engg");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am after automation engg");
  }

}

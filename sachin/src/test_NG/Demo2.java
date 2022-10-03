package test_NG;

import org.testng.annotations.Test;

public class Demo2 {
  @Test (groups ="smoke")
  public void ADemo2f() {
	  System.out.println("I am in ADemo2f()" );
	  
	  }
  @Test (priority = 4,groups ="smoke")
  public void BDemo2f() {
	  System.out.println("I am in BDemo2f()" );
	  
	  }
  
  @Test (priority = 5,groups ="Regression")
  public void CDemo2f() {
	  System.out.println("I am in CDemo2f()" );
	  }
  

  @Test (priority = 6,invocationCount = 10)
  public void DDemo2f() {
	  System.out.println("I am in DDemo2f()" );
	 
	  
	  }
  

  @Test 
  public void EDemo2f() {
	  System.out.println("I am in EDemo2f()" );
	 
	  }
  

  @Test (enabled = false)
  public void FDemo2f() {
	  System.out.println("I am in FDemo2f()" );
	 
	  
	  }
  
  
  
}

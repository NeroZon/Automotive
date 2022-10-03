package sachin1;

import java.util.Scanner;

public class webdriverdriverisequaltochromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		System.out.println("enter your a ");
	    a = sc.nextInt();
	    System.out.println("enter your b");
	    b = sc.nextInt();
	    System.out.println("enter your c ");
	    c = sc.nextInt();
	    if (a>b & a>c) {
	    	System.out.println("a is greater");	    	
	    	
	    }
	    else if(b>c && b>a)  {
	    	
	    	System.out.println("b is greater");
	    }
	    else {
	    	
	    	System.out.println("c is greater");
	    
	    
	    }

	}

}

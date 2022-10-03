package sachin1;

import java.util.Scanner;


public class ifelseif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
             int a,b,c;
             System.out.println("enter number a");
             a = sc.nextInt();
             System.out.println("enter number b");
             b= sc.nextInt();
             System.out.println("enter number c");
             c=sc.nextInt();
             if (a>b &a>c)
             {
            	 System.out.println("a number is greater");
            	 
             }
             else if(b>c && b>a)             {
            	 
            	 System.out.println("b number is greater");
             }
             else
             {
            	 
            	 System.out.println("c number is greater");
             }
	
	
	
	}

}

package two.eightYear;

import java.util.Scanner;

public class if_else_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int w,b,c ;
		System.out.println("Enter your number w");
		w = sc.nextInt();
		System.out.println("Enter your number b");
		b = sc.nextInt();
		System.out.println("Enter your number c");
		c = sc.nextInt();
		if (w>b & w>c)
		{ 
			System.out.println("w is greater than another");
		}
		
		
		else if (b>w&b>c)
			
			
			{ 
				System.out.println("b is greater than another");
			}
			else {
				
				System.out.println("c is greater than another");
				
		}
		
		

	}

}

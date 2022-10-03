package sachin1;

import java.util.Scanner;

public class ifstatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int age;
		System.out.println ("ENTER YOUR AGE ");
		age = sc.nextInt ();
		
		if (age<10)
		{
			System.out.println("eligibel to polio");
			
			
		}
		
		else {
			
			System.out.println("not eligibel to polio");
		}

	}

}

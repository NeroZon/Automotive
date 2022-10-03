package sachin1;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int payment;
		System.out.println("Enter your payment");
		payment = sc.nextInt();
		
		if (payment>20000) {
			
			System.out.println("your are elizibel to credit card  ");
			
		}
		else {
			
			System.out.println("your are notelizibel to credit card ");
		}

	}

}

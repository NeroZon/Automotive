package sachin1;
import java.util.Scanner;

public class ifelseifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		System.out.println("enter 1 st number");
		a =sc.nextInt();
		System.out.println("enter 2nd number");
		b =sc.nextInt();
		System.out.println("enter 3 rd number");
		c=sc.nextInt();
		if (a>b & a>c) {
			
			System.out.println(a+"number is greater");
		}
		
		else if (b>a && b>c) {
			
			System.out.println(b+"number is greater");
		}
		else {System.out.println(c+"number is greater");
		
		}
		

	}

}

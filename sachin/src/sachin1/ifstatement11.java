package sachin1;
import java.util.Scanner;


public class ifstatement11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int serialno ;
		
		System.out.println("enter your serialno");
		
		serialno =sc.nextInt()	;
		
		if (serialno>15)
			
		{
			System.out.println("you are eligibel to interview");
			
			
		}
		
		else 
		System.out.println("you are not eligibel to interview");
		

	}

}

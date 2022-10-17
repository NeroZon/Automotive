package Genral_program;

public class Testng_reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4674;
		int s=0;
		int t;
		
		while(n>1)
		{
			t=n%10;
			s=s*10+t;
			n=n/10;
			
		}
		
		System.out.print(s);

	}

}

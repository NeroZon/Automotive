package Genral_program;

public class DATA_HYBRID_FRAMEWORK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2031;
		int s = 0;
		int t;
		
		while (n>0) {
			
			t=n%10;
			s=s*10+t;
			n=n/10;
		}
		
		System.out.println(s);
			
			
		}

	}



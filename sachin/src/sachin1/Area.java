package sachin1;

import java.io.BufferedReader;

public class Area {
	public void area ()throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println ("Enter Radius");
		float r = Float.parseFloat(br.readline());
		System.out.println("Enter value of pi :");
		float pi = Float.parseFloat(br.readline());
		System.out.println("AREA ="+2*pi*r*r);
	}

	public static void main(String[] args) throws Exception {
		
		InputUsingMethod i = new InputUsingMethod ();
		i.area();
		// TODO Auto-generated method stub

	}

}

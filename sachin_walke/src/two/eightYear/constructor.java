package two.eightYear;

public class constructor {

	int x,y;
	
	constructor (){
		x=10;
		y=20;
		System.out.println("Default constructor");
		}
	public void Display () {
		System.out.println("x = "+x+ "y="+y);
	}
	
	public static void main (String[]args ) {
		
	constructor c = new constructor ();
	c.Display();
		
		
		
	}
}
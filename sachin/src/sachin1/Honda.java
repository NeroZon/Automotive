package sachin1;
class Bike
{
	public void run() {
		System.out.println("running");
		
	}
	
}
public class Honda extends Bike 
{
   public void run ()
   {
	   System.out.println("running saftly 50 km/hr");
	   
   }

   public static void main (String args[])
   {
	   Bike b;
	   b=new Bike();
	   b.run();
	   b= new Honda();
	   b.run();
	   }

}

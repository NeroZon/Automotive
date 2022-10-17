package two.eightYear;

import java.util.Scanner;

public class if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in) ;
int x,y,z;
System.out.println("Enter your number x");
x = sc.nextInt();
System.out.println("Enter your number y");
y = sc.nextInt();
System.out.println("Enter your number z");
z = sc.nextInt();
if (x>y&x>z)

{
System.out.println("x is greater than another");
}
else if (y>x & y>z){
System.out.println("y is greater than another");}
else  {
System.out.println("z is greater than another");


}


	}

}

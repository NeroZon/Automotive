package Genral_program;

import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Stack <Integer>a = new Stack<> ();
          
          a.add(100);
          a.add(101);
          a.add(200);
          a.add(300);
          
          System.out.println("addition:"+a);
          
          a.remove(100);
          
          System.out.println("remove:"+a);
	}

}

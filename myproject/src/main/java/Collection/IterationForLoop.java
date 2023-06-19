package Collection;

import java.util.*;

public class IterationForLoop {
	public static void main(String[] args)
	 {
		 ArrayList<String> al= new ArrayList<String>();
		 al.add("Red");
		 al.add("Orange");
		 al.add("White");
		 System.out.println(al);
		 System.out.println("Iteration using for loop:");
		 
		 for(int i=0; i<al.size();i++) {
			 System.out.print(al.get(i));
			 System.out.print(",");
		 }
	 }

}



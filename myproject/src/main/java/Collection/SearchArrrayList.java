package Collection;

import java.util.*;

public class SearchArrrayList {
	public static void main(String[] args)
	 {
		 ArrayList<String> al= new ArrayList<String>();
		 al.add("Red");
		 al.add("Orange");
		 al.add("White");
		 al.add("Green");
		 System.out.println(al);
		 if(al.contains("Yellow")) {
			 System.out.println("found the element");
			 
		 }
		 else {
			 System.out.println("no such element");
		 }
}
}

package Collection;

import java.util.ArrayList;

public class RemoveFromArraylist {
	public static void main(String[] args)
	 {
		 ArrayList<String> al= new ArrayList<String>();
		 al.add("Red");
		 al.add("Orange");
		 al.add("White");
		 al.add("Green");
		 System.out.println(al);
		 al.remove(2);
		 System.out.println("After removing new list is :" +al);
		 
}
}
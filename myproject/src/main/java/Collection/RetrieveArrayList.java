package Collection;
import java.util.*;
public class RetrieveArrayList {

		 public static void main(String[] args)
		 {
			 ArrayList<String> al= new ArrayList<String>();
			 al.add("Red");
			 al.add("Orange");
			 al.add("White");
			 System.out.println(al);
			String element = al.get(0);
			System.out.println("First Element is :" +element);
		 }

}

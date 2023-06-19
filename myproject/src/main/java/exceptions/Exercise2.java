package exceptions;
import java.util.*;
import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String args[]) {
	      int[] arr = {897, 56, 78, 90, 12};
	      System.out.println("Elements in the array are:: ");
	      System.out.println(Arrays.toString(arr));
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the index of the required element ::");
	      
	      try {
	    	  int element = sc.nextInt();
	          System.out.println("Element in the given index is :: "+arr[element]);
	      }catch (ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("The Array is out of Bound");
	          
	      }
	}
}

	      



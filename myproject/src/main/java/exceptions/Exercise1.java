package exceptions;

public class Exercise1 {
	public static void main(String[] args) {
	    try {
	      int a = 10;
	      int b = 0;
	      int c = 0;

	      c = a / b;

	      System.out.println("Division is: " + c);
	    } catch (ArithmeticException e) {
	      System.out.println("Exception: " + e);
	    }

	    System.out.println("Division by zero is not possible");
	  }
}

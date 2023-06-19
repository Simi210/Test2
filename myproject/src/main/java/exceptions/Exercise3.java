package exceptions;

public class Exercise3 {
	static void checkAge(int age) {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted");
	    }
	  }

	  public static void main(String[] args) {
	    checkAge(16); 
	  }
}

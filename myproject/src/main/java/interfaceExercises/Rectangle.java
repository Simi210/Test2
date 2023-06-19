package interfaceExercises;

interface Polygon{
	 public void getArea(int length,int breadth);	
}

public class Rectangle implements Polygon {
	
	public void getArea(int length,int breadth){
		System.out.println("Area of the rectangle is: " +(length*breadth));
	}
 

public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.getArea(5, 6);
}
}
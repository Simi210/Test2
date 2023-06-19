package interfaceExercises;


interface Printable{
	void Print();
}
interface Showable{
	void Print();
}

public class Test implements Printable,Showable {
	public void Print() {
		System.out.println("Helllo");
	}
	public static void main(String[] args) {
		Test obj= new Test();
		obj.Print();
	}
}

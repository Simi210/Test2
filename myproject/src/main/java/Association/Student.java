package Association;

public class Student {
int rollNo;
String name;
Address add;

public Student(int rollNo,String name,Address add) {

super();
this.rollNo= rollNo;
this.name=name;
this.add=add;	
}
void display() {
	System.out.println("Name: "+name +","+"RollNO: "+rollNo );
	System.out.println(add.hName + " "+add.city 	+ " "+add.pinCode);
}

public static void main(String[] args) {
	Address address1= new Address("SIMI VILLA","MVK",123);
	Student st= new Student (3, "Simi",address1);
	st.display();
}
}
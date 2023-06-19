package Association;

public class Employee1 {
	String empName;
	int empId;
	Car1 car;
	Bike bike;
public Employee1(String empName,int empId,Car1 car,Bike bike) {
	this.empName=empName;
	this.empId=empId;
	this.car=car;
	this.bike=bike;
}
public String getEmpName() {
	return empName;
}
public int getEmpId() {
	return empId;
}
public Car1 getCar() {
	return car;
}
public Bike getBike() {
	return bike;
}
public static void main(String[] args) {
	Car1 c = new Car1("red","swift",123);
	Bike b = new Bike("Honda",4311);
	Employee1 e= new Employee1("Simi",4376,c,b);
	
	
	System.out.println("Employee Details: ");
	System.out.println("Employee Name: "+e.getEmpName());
	System.out.println("Employee id: " +e.getEmpId());
	System.out.println("Employee's Car Colour: "+e.getCar().getColour());
	System.out.println("Employee's Car Name: "+e.getCar().getCarName());
	System.out.println("Employee's Car Reg.No: "+e.getCar().getRegNo());
	System.out.println("Employee's Bike Name: "+e.getBike().getBikeName());
	System.out.println("Employee's Bike Reg.No: "+e.getBike().getBikeRegNo());
	
}
}

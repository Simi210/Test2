package Association;

public class Employee {
String empName;
int empId;
Car car;

public Employee(String empName,int empId,Car car)
{
	this.empName=empName;
	this.empId=empId;
	this.car=car;
	
}

public String getEmpName() {
	return empName;
}

public int getEmpId() {
	return empId;
}

public Car getCar() {
	return car;
}
public static void main(String[] args) {
	Car car1= new Car("Red","TIDA",1234);
	Employee emp= new Employee("Simi",437631,car1);
	
	System.out.println("Employee Details: ");
	System.out.println("Employee Name: "+emp.getEmpName());
	System.out.println("Employee Id: "+emp.getEmpId());
	System.out.println("Car Colour: "+emp.getCar().getColour());
	System.out.println("Car Name: "+emp.getCar().getCarName());
	System.out.println("Reg. No: "+emp.getCar().getRegNo());
}
}
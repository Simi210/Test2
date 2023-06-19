package Association;

public class Car {
	String colour;
	String carName;
	int regNo;
	
public Car (String colour,String carName,int regNo) {
	this.colour=colour;
	this.carName=carName;
	this.regNo=regNo;
}

public String getColour() {
	return colour;
}

public String getCarName() {
	return carName;
}

public int getRegNo() {
	return regNo;
}

}

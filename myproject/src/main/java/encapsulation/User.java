package encapsulation;

public class User extends Bank{
	public void check()
	{
		super.getPin(1212);
	}

public static void main(String[] args) {
	
	User obj =new User();
	obj.check();
}

}

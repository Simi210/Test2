package interfaceExercises;

public interface RBI {
	public static final int interest=10;
	public abstract void recurringDeposit(int amount,int duration);

}


public class HDFC implements RBI{
	public  void recurringDeposit(int amount,int duration)
	{
		int interamount=(amount*duration*interest)/100;
		int total=amount+interamount;
		System.out.println("Interest amount : "+interamount);
		System.out.println("After " +duration+ " years you will get total amount : "+total);
	}
public static void main(String[] args) {
	HDFC ob=new HDFC();
	ob.recurringDeposit(250000,5);		
}
}

		
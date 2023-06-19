package encapsulation;

public class Bank {
	int pin,curbal=5000,widamt=1000,newbal;
	public void getPin(int n)
		{
			this.pin=n;
			if((pin==1001) || (pin==1212) ||(pin==1234))
				{
					System.out.println("Valid Pin");
					if(curbal>=widamt)
						{
							System.out.println("Transaction Progressing.Please Collect your money.");
							newbal=curbal-widamt;
							System.out.println("Balance Amount : " +newbal);
						}
				}
			else
				{
				System.out.println("Invalid Pin");
				}
		}

}

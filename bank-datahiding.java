package datahiding;

public class bank {

	private int accountnumber;
	private int pin;
	private int balance;
	
	public bank(int accountnumber,int pin,int amount)
	{
		this.accountnumber=accountnumber;
		this.pin=pin;
		this.balance=amount;
	}
	public void returnbalance(int accountnumber,int pin)
	{
		if(this.accountnumber==accountnumber&&this.pin==pin)
		{
			System.out.println(this.balance);
		}
	}
	public void addbalance(int accountnumber,int pin,int amount)
	{
		if(this.accountnumber==accountnumber&&this.pin==pin)
		{
	   balance+=amount;
		}
	}
	
}
 class customer {

	public static void main(String[] args)
	{
		bank c1=new bank(1,2345,1000);
		bank c2=new bank(2,2375,10000);
		
		bank c3=new bank(3,2445,10400);
		
		bank c4=new bank(4,2345,10030);
		c1.returnbalance(1, 2345);
		c2.returnbalance(2, 2375);
		c3.returnbalance(3, 2445);
		c4.returnbalance(4, 2345);
		c1.addbalance(1, 2345,5678);
		c1.returnbalance(1, 2345);
		
		
		
		
	}
 }
		// TODO Auto-

	


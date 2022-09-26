package encapsulation;
public class bank {

	private int balance=1000;
	public void addbalance(int amount,int pin)
	{
		if(pin==1111)
			{this.balance+=amount;	}
		}
	public Object getbalance(int pin)
	{
		if(pin==1111)
		{
		return this.balance;}
		else 
		{
			return "invalid";
		}
	}
	public static void main(String[] args) {
		bank person1=new bank();
		System.out.println(	person1.getbalance(1111));
		person1.addbalance(1000, 1111);
		System.out.println(	person1.getbalance(1111));
		
	}

}


	
	
	
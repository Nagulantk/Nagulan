package abstractclass;
//abstractclass example 1

public class car {

	public static void main(String[] args)
	{
		swift s=new swift();
		s.printme();
		
	}

}
 abstract class secretcar {

	abstract void startengine();
	void printme()
	{
		System.out.println("Secret car");
	}

}
  class swift extends secretcar{

		public void startengine()
		{
			System.out.println("new tech engine starts");
		}

	}

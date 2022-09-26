package methodoverloading;

public class methodover {

	public void m1(int a)
	{
		System.out.println("int");
	}
	public void m1(long a)
	{
		System.out.println("long");
	}
	public void m1(double a)
	{
		System.out.println("double");
	}

}
class main44{
	public static void main(String[] args)
	{
		methodover a=new methodover();
		a.m1(8);
		a.m1(6.7);
		a.m1(6.7f);
		a.m1(90484803L);
		a.m1('a');
	}
}

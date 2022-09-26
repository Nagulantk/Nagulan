package methodoveriding;

public class methodrid {

	public  void m1(int a, int b)
	{
		System.out.println(a+b);
	}

}
 class methodorid extends methodrid{
	public  void m1(int a,int b)
	{
		System.out.println(a*b);
	}
	
	
}
 class main44{
	 public static void main(String[] args)
	 {
		 methodrid m=new methodrid();
		 methodorid s=new methodorid();
		 methodrid f=new methodorid();
		 s.m1(2, 3);
		 m.m1(2, 3);
		 f.m1(2, 3);
	 }
 }

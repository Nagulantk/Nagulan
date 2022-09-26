package interfacen;

public interface students {
	
	public void name(String name);
	public void rollnumber(int n);
	public void returnname();
	public void returnrollnumber();

}
 abstract class s1 implements students{
	 String name;
	 int rollnumber;
	 public void name(String name) {
		 this.name=name;
	 }
	 public void rollnumber(int n)
	 {
		 rollnumber=n;
	 }
	
}
   class s2 extends s1{
	   
	  public void returnname()
	  {
		  System.out.println(name);
	  }
	  public void returnrollnumber() {
		  System.out.println(rollnumber);
	  }
	}
	class main22{
	  public static void main(String[] args)
	  {
		s2 s=new s2();
		s.name("nagulan");
		s.rollnumber(45);
		s.returnname();
		s.returnrollnumber();
	  }
  }

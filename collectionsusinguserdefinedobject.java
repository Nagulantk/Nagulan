package udo;
//collection (using user defined object)
import java.util.*;
public class p {
int number;
String name;

	public p(int n,String a) {
		name=a;
		number=n;
		// TODO Auto-generated constructor stub
	}
	public int g()
	{
		return number;
	}
	public String t()
	{
		return name;
	}

}
class main44{
	public static void main(String[] args)
	{
		p s1=new p(1,"aa");
		p s2=new p(2,"bb");
		p s3=new p(3,"cc");
		p s4=new p(4,"dd");
		LinkedList<p> l=new LinkedList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.addFirst(s4);
		for(p k:l)
		{
			System.out.println(k.g());
			System.out.println(k.t());
			
		}
	}
}

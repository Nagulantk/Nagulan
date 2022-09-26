package stream;
import java.util.*;
public class streamforeach {
	
	public static void main(String[] args)
	{
		
		List<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		list1.stream().forEach(x->{System.out.println(x);
		System.out.println(x*x);});
	}

	

}

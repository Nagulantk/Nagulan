package stream;
import java.util.*;
import java.util.stream.Collectors;


public class arrayliststream {

	public static void main(String[] args)
	{
		List<Integer> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		Set<Integer> set1=new HashSet<>();
		List<Integer> list4=new ArrayList<>();
		list1.add(10);
		list1.add(45);
		list1.add(54);
		list1.add(98);
		list1.add(10);
		List<Integer> list5=list1.stream().map(x->x*x*x).collect(Collectors.toList());
		System.out.println(list5);
		Set<Integer> set3=list1.stream().map(x->x*x*x).collect(Collectors.toSet());
		System.out.println(set3);
		 list4=set3.stream().sorted().collect(Collectors.toList());
		 System.out.println(list4);
		list2.add("chennai");
		list2.add("punjab");
		list2.add("kolkata");
		list2.add("mumbai");
		List<String> list3=list2.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
		System.out.println(list3);
		
	}

}

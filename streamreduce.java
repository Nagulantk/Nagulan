package stream;
import java.util.*;
import java.util.stream.Collectors;
public class streamreduce {

	public static void main(String[] args) {
		//product of elements in a list using stream reduce
		LinkedList<Integer> list1=new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(10);
		int product=list1.stream().reduce(1,(ans,i)->ans*i);
		System.out.println(product);
		
		
		
	}

}

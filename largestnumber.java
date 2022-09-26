package program1;
import java.util.Scanner;
public class largestnumber {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int array1[]=new int[10];
	int i;
	int l=0;
	for(i=0;i<10;i++)
	{
		array1[i]=sc.nextInt();
		if(l<array1[i])
		{
			l=array1[i];
		}

	
	}
System.out.println(l);
}
}

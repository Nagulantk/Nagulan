package characterarray;
import java.util.Scanner;
public class chararr {

	public static void main(String[] args)
	{
		char [] c=new char[10];
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<10;i++)
		{
			c[i]=sc.next().charAt(0);
		}
		for(i=0;i<10;i++)
		{
			System.out.println(c[i]);
		}
	}

}

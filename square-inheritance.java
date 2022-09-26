package inheritance;

public class square {
int length;
int breath;
	public square(int l,int b) {
		length=l;
		breath=b;
		// TODO Auto-generated constructor stub
	}
	public void returnarea(){
		System.out.println(length*breath);
		
	}

}
 class cube extends square{
	int depth;
	public cube (int l,int b,int h)
	{
		super(l,b);
		depth=h;
	}
	public void returnvolume()
	{
		System.out.println(length*breath*depth);
	}
	
}
 class calculation{
	 public static void main(String[] args)
	 {
		 square s1=new square(8,9);
		 cube c1=new cube(5,4,3);
		 c1.returnvolume();
		 s1.returnarea();
	 }
 }
 

package basic;

public class Copy_constructor {
	int u,i;
	public  Copy_constructor(int x)
	{
		u = x;
		
	}
	
	public  Copy_constructor(Copy_constructor y )
	{
		i = y.u;
		this.u = y.u;
	}
	
	void show()
	{
		System.out.println(u);
		System.out.println(i);
	}

	public static void main(String[] args) {
		 Copy_constructor o = new  Copy_constructor(5);
		 Copy_constructor ob1 = new  Copy_constructor(o);
		   o.show();
		   ob1.show();
	}

}

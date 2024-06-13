package basic;

public class Constructor {
     
    int a, b;
	public Constructor()
	{
		a =5;
		b = 6;
	    System.out.println("9");
	}
	void cal()
	{
		System.out.println(a+b);
	}
	
	void set()
	{
		
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		
          Constructor ob = new Constructor();
          ob.cal();
          ob.cal();
          ob.cal();
          ob.cal();
          ob.set();
          Constructor ob1 = new Constructor();
          ob1.cal();
          ob1.cal();
          ob1.cal();
          ob1.cal();
          ob1.set();
	}

}

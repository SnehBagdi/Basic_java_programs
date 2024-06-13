package basic;

interface Methods
{ 
	public static final int i = 4;
	default void show()
	{
		System.out.print("this is default method " + " ");
		System.out.println(" the number in dm is -> " + i);
		show2();
	}
	
	static void show1()
	{
		System.out.print("this is static method " + " ");
		System.out.println(" the number in sm is -> " + i);
	}
	
	private void show2()
	{
		System.out.print("this is private method " + " ");
		System.out.println(" the number in pm is -> " + i);
	}
}
public class Methods_Interface implements Methods {
	public static void main(String[] args) {
          
		Methods_Interface ob = new Methods_Interface();
		ob.show();
		Methods.show1();
		System.out.println(i);
		


	}

}

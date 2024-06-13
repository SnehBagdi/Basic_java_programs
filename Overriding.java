package basic;
import java.util.Scanner;

class Cal
{
	 void area(int l, int b)
	 {
		 int area = l * b;
		 System.out.println("area of rect is -> " + area);
		
	 }
}

class Are extends Cal
{
	@Override
	void area(int l, int b)
	{
		int add = l + b;
		System.out.println("addition of two numbers is : " +  add );
	}
}

public class Overriding extends Cal {
	
	@Override
	void area(int l, int b)
	{
		int area = 2*(l+b);
		 System.out.println("perim of rect is -> " + area);
		
	}

	
	public static void main(String[] args) {
		Overriding ob = new Overriding();
		ob.area(3, 4);
		Are ob1 = new Are();
		ob1.area(3, 4);
			
	}

}

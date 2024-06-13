package basic;
import java.util.Scanner;

abstract class Inner
{
	abstract void set(int a, int b);
}

public class Anony_InnerClass{
	
	public static void main(String[] args) 
	{
		Inner ob = new Inner()
		{
		@Override
		void set(int a, int b)
		{
			int mean = (a + b)/2;
			System.out.println(mean);
		}
					
		};
		ob.set(5,6);

	}

}

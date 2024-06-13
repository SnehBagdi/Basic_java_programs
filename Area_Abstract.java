package basic;
import java.util.Scanner;


abstract class Areas
{
	int l, b, ar;
	Scanner ip = new Scanner(System.in);
	
	
	void set()
	{
		System.out.println("enter value of l ->");
		l = ip.nextInt();
		System.out.println("enter the value for b ->");
		b = ip.nextInt();
		ar = l*b;
	}
	
	abstract void area();
}
public class Area_Abstract extends Areas {

	@Override
	void area()
	{
		System.out.println(ar);
	}
	public static void main(String[] args) {
		Area_Abstract ob = new Area_Abstract();
		ob.set();
		ob.area();

	}

}

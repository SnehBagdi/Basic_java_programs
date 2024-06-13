package basic;
import java.util.Scanner;

 class Set{
	float area,r, pi = 3.14f;
	Scanner id = new Scanner(System.in);
	void cal()
	{
		System.out.println("enter the radius : ");
		r = id.nextFloat();
		area = pi * r * r;
		System.out.println("area is =  " + area);
	}
}
public class Area {

	public void set()
	{
		System.out.println(" i am being called from package basic ");
	}
	public static void main(String[] args) {
		Set ob = new Set();
		ob.cal();
	}
	
	

}

package basic;
import java.util.Scanner;

class Mean
{
	int mean(int a, int b)
	{
	
	return (a+b)/2;
	}
}
public class Inheritance_mean extends Mean {
 
	int a , b;
	Scanner id = new Scanner(System.in);
	
	void cal()
	{
		System.out.println("enter value of a : ");
		 a = id.nextInt();
		System.out.println("enter value of b : ");
		 b = id.nextInt();
	}
	
	int set()
	{
		return mean(a,b);
	}
	public static void main(String[] args) {
		Inheritance_mean ob = new Inheritance_mean();
		ob.cal();
		System.out.println(ob.set());
		
		
  
	}

}

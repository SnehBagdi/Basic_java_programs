package basic;
import java.util.Scanner;

public class Loop4_fact {

	int i, n,fact = 1;
	Scanner id  = new Scanner(System.in);
	
	void set()
	{
		System.out.println("Enter the num you want to find the fact: ");
		n = id.nextInt();
	}
	
	void cal()
	{
		for(i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("factorial of " + n + " terms is : " + fact);
	}
	public static void main(String[] args) {
		Loop4_fact ob = new Loop4_fact();
		ob.set();
		ob.cal();

	}

}

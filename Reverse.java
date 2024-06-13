package basic;
import java.util.Scanner;

public class Reverse {

	int i, n, n1=0;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the number to be reversed : ");
		n = id.nextInt();
	}
	
	void cal()
	{
		while(n>0)
		{
			i = n%10;
			n1 = n1*10 + i;
			n = n/10;
		}
		System.out.println("reverse is : " + n1);
		
	}
	
	public static void main(String[] args) {
		Reverse ob = new Reverse();
		ob.set();
		ob.cal();
	}

}

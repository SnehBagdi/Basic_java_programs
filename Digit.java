package basic;
import java.util.Scanner;

public class Digit {
 
	int n, count;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the number ");
		n = id.nextInt();
	}
	
	void cal()
	{
		while(n==0)
		{
			System.out.println("Total digits are : 1");
			break;
		}
		
		while(n>0)
		{
			count++;
			n = n/10;
		
		if(n==0)
		{
		System.out.println("Total digits are : " + count);
		}
		}
	}
	public static void main(String[] args) {
		Digit ob = new Digit();
		ob.set();
		ob.cal();
		

	}

}

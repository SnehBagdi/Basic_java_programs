package basic;
import java.util.Scanner;

public class Loop5_prime {

	int i, n, count=0;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the number : ");
		n  =id.nextInt();
	}
	void cal()
	{
		for(i = 2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count == 1)
		{
			System.out.println( n + " is not prime");
		}
		
		else
		{
			System.out.println( " it is prime ");
		}
	}
	
	public static void main(String[] args) {
		Loop5_prime ob = new Loop5_prime();
		ob.set();
		ob.cal();
         
	}

}

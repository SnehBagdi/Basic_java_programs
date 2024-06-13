package basic;
import java.util.Scanner;

public class Loop3_sum {
	
	int n, i, sum=0;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the number till you want to find the sum : ");
		n = id.nextInt();
		
	}
	
	void cal()
	{
		for(int i=1; i<=n; i++)
		{
			sum = sum + i;
		}
		
		System.out.println("sum of " + n + " terms is : " + sum);
	}
	
	

	public static void main(String[] args) {
		Loop3_sum ob = new Loop3_sum();
		ob.set();
		ob.cal();
	}

}

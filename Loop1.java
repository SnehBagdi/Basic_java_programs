package basic;
import java.util.Scanner;

public class Loop1 {
	int  i, n;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("Enter the number till you want to print ");
		n = id.nextInt();
		
	}
	
	void cal()
	{
		for(i = 1; i<=n; i++)
		{
			if(i%2!=0)
			{
				System.out.print("-" + i + " ");
			}
			
			else
			{
				System.out.print("+" + i + " ");
			}
		}
	}

	public static void main(String[] args) {
	     Loop1 ob = new Loop1();
	     ob.set();
	     ob.cal();
	}

}

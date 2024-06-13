package basic;
import java.util.Scanner;

public class Loop2 {
	
	int n, i;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the number till you want to print : ");
		n = id.nextInt();
	}
	
	void cal()
	{
		for(i = 1; i<=n; i++)
		{
			if(i!=n)
			{
			System.out.print(" 1 / " + i + " + ");
			}
			
			else
			{
				System.out.println(" 1 / " + i );
			}
		}
	}

	public static void main(String[] args) {
		Loop2 ob = new Loop2();
		ob.set();
		ob.cal();
	}

}

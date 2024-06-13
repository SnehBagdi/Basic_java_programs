package basic;
import java.util.Scanner;

public class Linear_search {

	int a[] = new int[5];
	int i, n;
	Scanner id = new Scanner(System.in);
	
	
	void set()
	{
		for(i = 0; i<a.length; i++)
		{
			System.out.println("enter the element of array at index " + i + " : ");
			a[i] = id.nextInt();
		}
		
		System.out.println("enter the number to find");
		n = id.nextInt();
	}
	
	void cal()
	{
		for(i = 0; i<a.length; i++)
		{
			if( a[i] == n)
			{
				
				System.out.println("number " + n + " found at index : " + i );
				break;
			}
		}
		
		if(a[i] != n)
		{
			System.out.println(" number not found ");
		}
		
	}
	public static void main(String[] args) {
		Linear_search ob = new Linear_search();
		ob.set();
		ob.cal();
	}

}

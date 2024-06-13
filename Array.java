package basic;
import java.util.Scanner;

public class Array{
	
	int a1[] = new int[5];
	int a2[] = new int[5];
	Scanner id = new Scanner(System.in);
	
	void set()
	{
	for(int i =0; i<a1.length; i++)
	{
		System.out.println("enter element of array 1 at index  " + i + " : ");
		a1[i] = id.nextInt();
	}
	
	for(int i =0; i<a2.length; i++)
	{
		System.out.println("enter element of array 2 at index  " + i + " : ");
		a2[i] = id.nextInt();
	}
	}
	
	void cal()
	{
		int max1 = a1[0];
		
		for(int i =1; i<a1.length; i++)
		{
			if(max1<a1[i])
			{
				max1 = a1[i];
			}
		}
		
		int max2 = a2[0];
		
		for(int i =1; i<a2.length; i++)
		{
			if(max2<a2[i])
			{
				max2 = a2[i];
			}
		}
		
		if(max1 > max2)
		{
			System.out.println("larger number is from array 1 : " + max1);
		}
		
		else
		{
			System.out.println("larger number is from array 2 : " + max2);
		}
	}
	
	public static void main(String arg[])
	{
		Array ob = new Array();
		ob.set();
		ob.cal();
		
	}
}

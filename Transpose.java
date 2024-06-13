package basic;
import java.util.Scanner;

public class Transpose {

	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter elements of array : ");
		for(int i =0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				System.out.println("enter elements of array at index " + i + j + " : " );
				a[i][j] = id.nextInt();
			}
		}
		
		for(int i =0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				b[i][j] = a[j][i];
			}
		}
	}
	
	void cal()
	{
		System.out.println("original matrix is : ");
		
		for(int i =0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				System.out.print( a[i][j] + " \t");
			}
			
			System.out.println();
		}
		
		System.out.println("tranposed matrix is : ");
		for(int i =0; i<b.length; i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				System.out.print( b[i][j] + " \t");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Transpose ob = new Transpose();
		ob.set();
		ob.cal();

	}

}

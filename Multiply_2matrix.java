package basic;
import java.util.Scanner;


public class Multiply_2matrix {

	int a[][] = new int[2][2];
	int b[][] = new int[2][2];
	int c[][] = new int[2][2], sum = 0;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the elements of array1 ->");
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
				System.out.println("enter the elements of array1 at index " + i + j + " : ");
				a[i][j] = id.nextInt();
			}
		}
		
		System.out.println("\n" + "enter the elements of array2 ->");
		for(int i =0; i<b.length; i++)
		{
			for(int j =0; j<b.length; j++)
			{
				System.out.println("enter the elements of array2 at index " + i + j + " : ");
				b[i][j] = id.nextInt();
			}
		}
	}
	
	void cal()
	{
		System.out.println(" the matrix 1 is ->");
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println(" the matrix 2 is ->");
		for(int i =0; i<b.length; i++)
		{
			for(int j =0; j<b.length; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println(" the final matrix after multiplying 1 & 2 is ->");
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length;j++)
			{
				for(int k = 0; k<a.length; k++)
				{
					sum = sum + (a[i][k] * b[k][j]);
				}
				
				c[i][j] = sum;
				sum = 0;
			}
		}
		
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length;j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Multiply_2matrix ob = new Multiply_2matrix();
		ob.set();
		ob.cal();

	}

}

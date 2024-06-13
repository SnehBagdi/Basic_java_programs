package basic;
import java.util.Scanner;

public class Sparse {

	int  a[][] = new int[3][3], count =0;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the elements of matrix ->");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				System.out.println("enter the element of array at index " + i + j + " : ");
				a[i][j] = id.nextInt();
			}
		}
	}
	
	void cal()
	{
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				if(a[i][j] == 0)
				{
					count++;
				}
			}
		}
		
		if(count>((a.length*a.length)/(2)))
			System.out.println("Since, count " + count + " > " + ((a.length*a.length)/(2)) + " given array is a sparse matrix");
		else
			System.out.println("Since, count " + count + " !> " + ((a.length*a.length)/(2)) + " given array is not a sparse matrix");
	}
	public static void main(String[] args) {
		Sparse ob = new Sparse();
		ob.set();
		ob.cal();

	}

}

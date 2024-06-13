package basic;
import java.util.Scanner;

public class Diagonals {
	
	int a[][] = new int[3][3];
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the elements of array ->");
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
			System.out.println("enter the elements of array at index " + i + j + " : ");
			a[i][j] = id.nextInt();
			}
		}
	}
    
	void cal()
	{
		System.out.println("top left to bottom right diagonal elements of array are ->");
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
				if(i==j)
					System.out.print(a[i][j] + " ");	
			}
		}
		
		System.out.println(" \n" + "top right to bottom left diagonal elements of array are ->");
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
				if(i+j == a.length-1 || j+i == a.length-1)
					System.out.print(a[i][j] + " ");	
			}
		}
		
	}
	public static void main(String[] args) {
		Diagonals ob = new Diagonals();
		ob.set();
		ob.cal();

	}

}

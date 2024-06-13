package basic;
import java.util.Scanner;


class Table
{ 
	
	void table(int num)
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(num + " X " +  i + " = " + (num * i)); 
		}
	}
}

public class Inheritance_table extends Table {
	int n;
	void set()
	{
		Scanner id = new Scanner(System.in);
		System.out.println("enter the number we have to find table of : ");
		n = id.nextInt();
	}
	
	void cal()
	{
		System.out.println(" required table is : ");
		table(n);
	}

	public static void main(String[] args) {
		Inheritance_table ob = new Inheritance_table();
		ob.set();
		ob.cal();

	}

}

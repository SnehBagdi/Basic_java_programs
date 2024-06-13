package basic;
import java.util.Scanner;

class Odd
{
	int num, choice;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("Enter the number");
		num = id.nextInt();
		choice = num % 2;
	}
	
	void cal()
	{
		switch(choice)
		{
		case 0: System.out.println("it's a even number");
		break;
		
		case 1: System.out.println("it's a odd number");
		break;
		
		default:System.out.println("enter a valid number");
		}
	}
}
public class Even {

	public static void main(String[] args) {
		Odd ob = new Odd();
		ob.set();
		ob.cal();

	}

}

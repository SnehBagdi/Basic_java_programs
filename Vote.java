package basic;
import java.util.Scanner;

public class Vote {

	Scanner id = new Scanner(System.in);
	int age;
	
	void set()
	{
		
		System.out.println("Enter the age : ");
		age = id.nextInt();	
		
	}
	
	void cal()
	{
		if(age >= 18)
		{
			System.out.println("you can vote");
		}
		
		else
		{
			System.out.println("you can't vote");
		}
	}

}

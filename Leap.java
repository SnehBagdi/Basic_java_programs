package basic;
import java.util.Scanner;

public class Leap {
     
	int year;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("Enter the year : ");
		year = id.nextInt();
		
	}
	
	void cal()
	{
		if(year%4 == 0 && ( year%100 != 0 || year%400 == 0))
		{
			System.out.println("year is a leap year");
		}
		
		else
		{
			System.out.println("not a leap year");
		}
	}
	
	public static void main(String[] args) {
		Leap ob = new Leap();
		ob.set();
		ob.cal();
	}

}

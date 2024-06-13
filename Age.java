package basic;
import java.util.Scanner;

public class Age {
	
	void cal()
	{
		Scanner id = new Scanner(System.in);
		int year, days, month;
		System.out.println("enter the total no of days : ");
		days = id.nextInt();
		year = days/365;
		days = days%365;
		month = days/30;
		days = days%30;
		System.out.println("enter the total no of years : " + year);
		System.out.println("enter the total no of months : " + month);
		System.out.println("enter the total no of days : " + days);
		
		
	}
	
	public static void main(String arg[])
	{
		Age ob = new Age();
		ob.cal();
	}

}

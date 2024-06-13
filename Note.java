package basic;
import java.util.Scanner;

public class Note {
	
	int n500, n200, n100, n50, n20, n10, n5, amt;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("Enter the total amount : ");
		amt = id.nextInt();
		
	}
	
	void cal()
	{
		if(amt >= 500)
		{
		n500 = amt/500;
		System.out.println("number of 500rs is : " + n500);
		amt = amt%500;
		}
		if ( amt >= 200)
		{
		n200 = amt/200;
		System.out.println("number of 200rs is : " + n200);
		amt = amt%200;
		}
		if ( amt >= 100)
		{
		n100 = amt/100;
		System.out.println("number of 100rs is : " + n100);
		amt = amt%100;
		}
		if( amt >= 50 )
		{
		n50 = amt/50;
		System.out.println("number of 50rs is : " + n50);
		amt = amt%50;
		}
		if( amt >= 20)
		{
		n20 = amt/20;
		System.out.println("number of 20rs is : " + n20);
		amt = amt%20;
		}
		if(amt >= 10)
		{
		n10 = amt/10;
		System.out.println("number of 10rs is : " + n10);
		amt = amt%10;
		}
		if(amt >=5)
		{
		n5 = amt/5;
		System.out.println("number of 5rs is : " + n5);
		amt = amt%5;
		}
		if(amt >=1)
		{
		System.out.println("number of 1rs is : " + amt);
		}
	}

	public static void main(String[] args) {
		Note ob = new Note();
		ob.set();
		ob.cal();

	}

}

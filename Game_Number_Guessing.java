package basic;
import java.util.Random;
import java.util.Scanner;


class Num
{
	int x;
	public Num()
	{
	  Random rn = new Random();
	  x = rn.nextInt(1,10);
	
	  System.out.println("enter the number to guess you have 3 chances : ");
	
	}
	
    int num()
    {
    	return x;
    }
}


public class Game_Number_Guessing extends Num {
	static int n, flag, count;
 
 
	void set()
	{   
		  Scanner id = new Scanner(System.in);
		  n = id.nextInt();
	}
	
	int cal()
	{
		if(n == x)
		{
			System.out.println("number guessed");
			return flag++;
		}
		
		else if(n < x)
		{
			System.out.println("number guessed is smaller");
			return count--;
		}
		
		else
		{
			System.out.println("number guessed is bigger");
			return count--;
		}
	}
 

	public static void main(String[] args) {
		char ch;
		do
		{
			Game_Number_Guessing ob = new Game_Number_Guessing();
			flag = 0; count = 3;
		do
		
		{
		ob.num();	
		ob.set();
		ob.cal();
		if(flag == 0 && count > 0)
		{
		System.out.println("you have " + count + " chance left");
		}
		}while( flag == 0 && count >0 );
		
		
		if(flag == 1)
		{
			System.out.println("Hurray !! You won the game :) ");
		}
		else
		{
			System.out.println(" Game over :( ");
			System.out.println(" Try again ");
		}
		
		System.out.println("Press Y if you want to play again?");
		  Scanner id = new Scanner(System.in);
	      ch = id.next().charAt(0);
	}while(ch == 'y' || ch == 'Y');

	}

}

package basic;
import java.util.Scanner;


public class Bank {

	int amt, bal = 5000, ch;
	char choice;
	Scanner id = new Scanner(System.in);
	
	void deposit()
	{
		System.out.println("enter the amt to be deposited : ");
		amt = id.nextInt();
		
		if(amt>0)
		{
			bal +=amt;
			System.out.println(" total balance in account is : " + bal );
		}
		
		else
		{
			System.out.println("enter the valid amt ");
		}
	}
	
	void withdrawal()
	{
		System.out.println("enter the amt to be withdraw : ");
		amt = id.nextInt();
		
		if(amt>0 && amt <= bal)
		{
			bal -=amt;
			System.out.println(" total balance in account is : " + bal );
		}
		
		else
		{
			System.out.println("enter the valid amt ");
		}
	}
	
	void check()
	{
		System.out.println(" total balance in account is : " + bal );
	}
	
	void menu()
	{
		Bank ob = new Bank();
		do
		{
			System.out.println(" press 1 to deposit the amount :  ");
			System.out.println(" press 2 to withdraw the amount : " );
			System.out.println(" press 3 to check the balance : ");
			
			ch = id.nextInt();
			
			switch(ch)
			{
			case 1: 
				ob.deposit();
				break;
			case 2:
				ob.withdrawal();
				break;
			case 3:
				ob.check();
				break;
			default:
				System.out.println("enter the valid number");
			}
			
			System.out.println("if you want to continue press 'y' ");
			choice = id.next().charAt(0);
			
		}while(choice == 'y' || choice == 'Y');	
		
		if(choice != 'y' || choice != 'Y')
		{
			System.out.println("stop");
		}
	}
	public static void main(String[] args) {
		
		Bank ob1 = new Bank();
		ob1.menu();
		

	}

}

package basic;
import java.util.Scanner;

class Books extends Login
{
	void rt()
	{
		Books ob1 = new Books();
	
	ob1.cal();
	ob1.set();
	}
	
	
}

class Login
{
	String user = "admin" ;
	String pass = "admin@123";
	Scanner id = new Scanner(System.in);
	String u , p;
	void cal()
	{
		System.out.println(" Enter the credential:  ");
		System.out.println(" USER ID ->  ");
		 u =  id.nextLine();
		System.out.println(" PASSWORD ->  ");
	     p = id.nextLine();
	}

	void set()
	{
		if( u.equals(user) && p.equals(pass))
		{
			System.out.println(" Successfulley logged in ");
		}
		
		else
		{
			 System.out.println(" invalid credentials ");
		}
	
}
}



public class Library extends Books {

	public static void main(String[] args) 
	{
		Library ob = new Library();
		ob.rt();
	
	}
	

}


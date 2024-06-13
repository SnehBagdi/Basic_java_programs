package basic;
import java.util.Scanner;
import java.util.Random;

class RBI
{ 
	int si;
	Scanner id = new Scanner(System.in) ;
	void set( int p, int r, int t)
	{
		si = (p*r*t)/100;
	}
}

class SBI extends RBI 
{
	void set(int p, int t)
	{
   
	Random i = new Random();
	int r = i.nextInt(6,7);
	System.out.println("Currently the rate applied by SBI is " + r);
	set(p,r,t);
	System.out.println("therefore, intrest offer by SBI is " + si);
	
	}
}

class HDFC extends RBI 
{
	void set(int p, int t)
	{
     
	Random i = new Random();
	int r = i.nextInt(8,9);
	System.out.println("Currently the rate applied by HDFC is " + r);
	Scanner id = new Scanner(System.in) ;
	set(p,r,t);
	System.out.println("therefore, intrest offer by HDFC is " + si);
	
	}
}
public class Bank_Hierarchical extends RBI{

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in) ;
		System.out.println("enter the amount to be deposited : " );
		int p = id.nextInt();
		System.out.println("enter the time period : " );
		int t = id.nextInt();
		
		System.out.println("If you wanna check intreset applied by SBI Bank, type 'y'?");
		char l = id.next().charAt(0);
		if(l == 'y' || l == 'Y')
		{
		SBI ob = new SBI();
		ob.set(p, t);
		}
		
		System.out.println("\nIf you wanna check intreset applied by HDFC Bank, type 'y'?");
		char o = id.next().charAt(0);
		if(o == 'y' || o == 'Y')
		{
		HDFC ob1 = new HDFC();
		ob1.set(p ,t);
		}
	}

}

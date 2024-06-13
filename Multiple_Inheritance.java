package basic;
import java.util.Scanner;

class Percent
{
	float p;
	float per(int phy,int chem,int math,int eng,int comp)
	{
		 p = (phy+chem+math+eng+comp)/5;
		 return p;
	}
}

class Grade extends Percent
{
	void cal()
	{
	if(p >=0 && p<33)
	{
		System.out.println("is failed");
	}
	
	else if(p >=33 && p<45)
	{
		System.out.println("passed in III division");
	}
	
	else if(p >=45 && p<75)
	{
		System.out.println("passed in II division");
	}
	
	else if(p >=75 && p<=100)
	{
		System.out.println("passed in I division");
	}
	}
	
}

class Student extends Grade
{
	
	String u = "admin";
	String p = "admin1234";
	Scanner id = new Scanner(System.in);
	
	
	void set()
	{
		
		System.out.println("Enter student credentials ");
		
		System.out.println(" user name : ");
		String user = id.nextLine();
		
		System.out.println(" password : ");
		String pass = id.nextLine();
		
	if( user.equals(u) && pass.equals(p) )
	{
		System.out.println(" Successfully logged in ");
	}
	
	else
	{
		System.out.println(" Invalide credentials, please Try Again ");
		System.out.println(" press y to enter the credentials again");
		char ch = id.next().charAt(0);
		id.nextLine();
		if( ch == 'y' || ch == 'Y')
		{
			
			set();
		}
		
	}
	}
	
}
public class Multiple_Inheritance extends Student{
	public static void main(String[] args) 
	{   
		Scanner id = new Scanner(System.in);
		Multiple_Inheritance ob = new Multiple_Inheritance();
		ob.set();
		System.out.println(" Enter marks for respective subject ");
		System.out.print("1. Physics : ");
        int p = id.nextInt();
        System.out.print( "2. Chemistry : ");
        int c = id.nextInt();
        System.out.print( "3. Math : ");
        int m = id.nextInt();
        System.out.print( "4. English : ");
        int e = id.nextInt();
        System.out.print( "5. Computer Science : ");
        int cs = id.nextInt();
        
        ob.per(p,c,m,e,cs);
        ob.cal();
	}
}


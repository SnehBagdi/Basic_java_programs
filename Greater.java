package basic;
import java.util.Scanner;

public class Greater {
	
	int a, b, c, ch;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		
	   System.out.println("enter different number a, b and c resp : ");
	   a = id.nextInt();
	   b = id.nextInt();
	   c = id.nextInt();
	   
	}
	
	void cal()
	{
		ch = (a>b?1:0);
		
		switch(ch)
		{
		case 1:
			ch = (a>c?1:0);
			switch(ch)
			{
			case 1: System.out.println("a is greater");
			break;
			
			
			case 0: 
			  System.out.println("c is greater");
			  break;
			 }
		break;
			
			
		case 0:
			ch = (b>c?1:0);
			switch(ch)
			{
			case 1: System.out.println("b is greater");
			break;
			
			
			case 0: 
			    System.out.println("c is greater");
				break;
			 }
			break;
			
		}
	}

	public static void main(String[] args) 
	{
	     Greater ob = new Greater();
	     ob.set();
	     ob.cal();

	}

}

package basic;
import java.util.Scanner;

public class Symbol {
	
	char alpha;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("Enter the char : ");
		alpha = id.next().charAt(0);
	}
	
	void cal()
	{
		if((alpha>='a' && alpha<='z') || (alpha>='A' && alpha<='Z')) 
		{
			if(alpha == 'a' || alpha == 'A' || alpha == 'e' || alpha == 'E' || alpha == 'i' || alpha == 'I' || alpha == 'o' || alpha == 'O' || alpha == 'u' || alpha == 'U')
			{
				System.out.println("it's a vowel");
			}
			
			else
			System.out.println("it's a consonent");
		}
		
		else if(alpha>='0' && alpha<='9')
		{
			System.out.println("its a number");
		}
		
		else
		{
			System.out.println("it's a symbol");
		}
	}

	public static void main(String[] args) {
		Symbol ob = new Symbol();
		ob.set();
		ob.cal();

	}

}

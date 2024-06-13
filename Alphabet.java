package basic;
import java.util.Scanner;

public class Alphabet {

	char alpha;
	int m;
	Scanner id = new Scanner(System.in);
	
	void set()
	{
		System.out.println("enter the alphabet : ");
		alpha = id.next().charAt(0);
	}
	
	void cal()
	{
		m = alpha;
		if(alpha>= 'a' && alpha<= 'z')
		{
			m = m - 32;
			alpha = (char) m;
		}
		else
		{
			m = m + 32;
			alpha = (char) m;
		}
		
		System.out.println("the converted alphabet is : " + alpha);
		
	}
	public static void main(String[] args) {
		Alphabet ob = new Alphabet();
		ob.set();
		ob.cal();

	}

}

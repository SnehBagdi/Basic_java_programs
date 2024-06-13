package basic;
import java.util.Scanner;

class Ar{
	
	void cal()
	{
		Scanner id = new Scanner(System.in);
		float f, c;
		System.out.println("Enter temp in fahrenheit  : ");
		f = id.nextFloat();
		c = (f-32)*5/9;
		System.out.println("Temp in celsius : " + c);	
		
	}	
	
}

public class Temp {

	public static void main(String[] args) {
		Ar ob = new Ar();
		ob.cal();

}
}

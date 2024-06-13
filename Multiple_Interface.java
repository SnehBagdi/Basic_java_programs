package basic;
import java.util.Scanner;

public class Multiple_Interface implements I2 {

@Override
public void set()
{
	System.out.println("this is set of i1");		
}
@Override 
public void cal()
{
	
}

	public static void main(String[] args) {
		Multiple_Interface ob = new Multiple_Interface();
		ob.set();
		ob.cal1();

	}

}

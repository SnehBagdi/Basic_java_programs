package basic;
import java.util.Scanner;

public class Thiskey {

	int a, b;
	Scanner id = new Scanner(System.in);
	
	void set(int a ,int b)
	{
		this.a = a;
		this.b = b;
		
		System.out.println(" value of a is : " + a + " and value of b is : " + b);
	}

	public static void main(String[] args) {
		Thiskey ob = new Thiskey();
		ob.set(3, 4);

	}

}

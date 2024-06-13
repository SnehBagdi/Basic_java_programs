package basic;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
		int a, b;
		System.out.println("ENTER THE NUMBERS A AND B : ");
		a = id.nextInt();
		b = id.nextInt();
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("Swapped a is :" + a + " and swapped b is : " + b);
		
	}

}

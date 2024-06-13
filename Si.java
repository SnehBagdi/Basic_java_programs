package basic;
import java.util.Scanner;

public class Si {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
		int si, p,r,t;
		p = id.nextInt();
		r = id.nextInt();
		t = id.nextInt();
		si = (p*r*t)/100;
		System.out.println("the simple interest is : " + si);
		
				

	}

}

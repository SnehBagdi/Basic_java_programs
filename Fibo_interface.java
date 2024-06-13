package basic;
import java.util.Scanner;
@FunctionalInterface
interface Fibo
{
	public abstract void set(int a);
}
public class Fibo_interface implements Fibo {
    int f1,f2,f, i;
    
    Fibo_interface()
    {
    	f1 = -1;
    	f2 = 1;
    	i = 0;
    }
    
	@Override
	public void set(int a)
	{
		while(i <= a)
		{
		f = f1 + f2;
		System.out.print(f + " , ");
		f1 = f2;
		f2 = f;
		i++;
		}
		
	}
	public static void main(String[] args) {
		Fibo_interface ob = new Fibo_interface();
		ob.set(6);

	}

}

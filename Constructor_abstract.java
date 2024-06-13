package basic;

public class Constructor_abstract extends Show {
	
	Constructor_abstract()
	{
		System.out.println("this is constructor of the child class ");
	}
    
public static void main(String[] args) {
	Constructor_abstract ob = new Constructor_abstract();
		Show.square();
	}

}

abstract class Show
{
	public Show()
	{
		 System.out.println("this is constructor of the parent class ");
	}
	
	static void square() {
		System.out.println("i am static method call using class name ");
	}
	
	static
	{
		System.out.println("i am static");
	}
	
}
package basic;
import java.util.Scanner;

public class Hcf_constructor {
	
	 int min, max, n1,n2;
	
	public Hcf_constructor(int n1, int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
		 min = n1<n2?n1:n2;
		 max = n1>n2?n1:n2;
	}
	
	void cal()
	{
		int count = 0;
		
		for(int i = 1; i<=min/2; i++)
		{
			if(n1%i == 0 && n2 %i == 0)
			{
				if(i==min/2)
				{
					if(max%min==0)
					{
						count = min;
					}
					else
					{
						count= i;
					}
				}
				
				else
				{
					count = i;
				}
				 
			}
			
			
		}
		
		 System.out.println("hcf is : " + count);
	}
	public static void main(String[] args) {
		 Scanner id = new Scanner(System.in);
		 System.out.println("enter the first number : ");
		 int n1 = id.nextInt();
		 System.out.println("enter the second number : ");
		 int n2 = id.nextInt();
		 Hcf_constructor ob = new  Hcf_constructor(n1, n2);
		 ob.cal();
		 
		

	}

}

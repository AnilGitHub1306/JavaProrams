package number;

public class FactorialOfAnyNumber 
{
	public static void main(String[] args)
	{
		int x=10;
		int Factorial=1;
		
		for(int i=1; i<=10; i++)
		{ 	
			Factorial=Factorial*i;
		}
		
		System.out.println(Factorial);
	}
}

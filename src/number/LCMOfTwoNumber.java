package number;

public class LCMOfTwoNumber
{
	public static void main(String[] args)
	{
		{
			int a = 20;
			int b = 25;
			int GCD=1;
			for(int i=1; i<=a; i++)
			{
				if(a%i==0 && b%i==0)
				{
					GCD=i;
				}
			}
			int LCM=a*b/GCD;	
			System.out.println("LCM of "+ a +" , " + b + " is -> " + LCM);
		}	
	}
}

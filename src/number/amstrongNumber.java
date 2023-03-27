package number;

public class amstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=153;
		int rem=0;
		int rev=0;
		int temp=num;
		
		while(temp>0)
			{
			rem=temp%10;
			rev=rem*rem*rem+rev;
			temp=temp/10;
			}
		if(rev==num)
		{
			System.out.println(num+" is a amstrong number.");
		}
		else
		{System.out.println(num+" is not a amstrong number.");}
	}
}

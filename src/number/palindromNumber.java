package number;

public class palindromNumber 
{
	public static void main(String[] args)
	{
		int num=1551;
		int rem=0;
		int rev=0;
		int temp=num;
		
		while(temp>0)
			{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			}
		if(rev==num)
		{System.out.println(num+" is pallindrom number.");}
		else
		{System.out.println(num+" is not pallindrom number.");}
	}
}

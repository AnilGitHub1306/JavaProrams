package number;

public class reverseTheNumber 
{
	public static void main(String[] args) 
	{
		int num=154;
		int temp=num;
		int rev=0;
		int rem=0;
		
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(" reverse of "+num+" is = "+ rev);
	}
}

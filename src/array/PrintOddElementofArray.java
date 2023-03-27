package array;

public class PrintOddElementofArray 
{
	public static void main(String[] args)
	{
		int a[]= {1,4,6,8,9,56,34,78,3,323,15,66,77,44,555,88,785};
		for(int i=0; i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}
	}
}

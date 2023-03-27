package array;

public class ArrayInReverseOrder 
{
	public static void main(String[] args)
	{
		int a[]= {1,345,2,3,22,4,5,55,6,7,45,8,9,13,56,74};
		
		for(int i=a.length-1; i>=0; i--)
		{
		System.out.println(a[i]);
		}
	}
}

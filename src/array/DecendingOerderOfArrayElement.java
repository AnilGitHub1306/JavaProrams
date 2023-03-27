package array;

import java.util.Arrays;

public class DecendingOerderOfArrayElement 
{
	public static void main(String[] args) 
	{
		int a[]= {3,7,8,2,42,56,88,55,33,74,97};
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--)
			{
			System.out.println(a[i]);
			}
	}

}

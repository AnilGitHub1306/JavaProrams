package array;

import java.util.Arrays;

public class assendingOrderOfArrayElement 
{
	public static void main(String[] args) 
	{
		int a[]  = {4,6,2,9,7,8,3,5};
		Arrays.sort(a);
			
		for(int i=0;i<a.length;i++)
			{
			System.out.println(a[i]);
			}	
	} 
}

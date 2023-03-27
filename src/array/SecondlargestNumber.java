package array;

import java.util.Arrays;

public class SecondlargestNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {1,4,3,6,7,5,8,2,89,9,56};
		Arrays.sort (a);
		int x = a.length-2;
		System.out.println (a[x]);
	}

}

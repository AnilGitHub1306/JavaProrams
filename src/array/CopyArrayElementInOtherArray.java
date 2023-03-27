package array;

public class CopyArrayElementInOtherArray 
{
	public static void main(String[] args)
	{
		int a [] = {11,12,13,14,15};
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			b[i] = a[i];
			System.out.println(b[i]);
		}
	} 
}

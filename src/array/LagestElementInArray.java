package array;

public class LagestElementInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,35,2,3,22,4,5,545,6,47,445,8,9,13,56,75};
		
		int largest=a[0];
		
			for(int i=0; i<a.length; i++)
			{
				if (a[i] > largest)
				{
					largest = a[i];
				}	
			}
			System.out.println(largest);
	}

}

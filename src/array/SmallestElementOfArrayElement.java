package array;

public class SmallestElementOfArrayElement 
{
	public static void main(String[] args) 
	{
		int a[]= {65,345,2,3,22,4,5,55,6,7,45,8,9,13,56,74};
		
		int smallest=a[0];
		
			for(int i=0; i<a.length; i++)
			{
				if (a[i] < smallest)
				{
					smallest = a[i];
				}
			}
			System.out.println(smallest);
	}		

}

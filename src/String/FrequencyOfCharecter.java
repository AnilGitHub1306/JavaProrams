package String;

public class FrequencyOfCharecter 
{
	public static void main(String[] args) 
	{
		String x= "ashitosh";
		char ch='s';
		int temp=0;
		for(int i=0; i<=x.length()-1;i++)
		{
			if(ch==x.charAt(i))
			{temp++;}
		}
		
		System.out.println(temp);
	}
}

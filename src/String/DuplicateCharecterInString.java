package String;

public class DuplicateCharecterInString 
{
	public static void main(String[] args) 
	{
		String x= "my name is ashitosh khurana";
		
		for(int i=0; i<=x.length()-1;i++)
		{
			for(int j=i+1;j<=x.length()-2;j++)
			{
				if(x.charAt(i)==x.charAt(j))
				{
					char ch=x.charAt(i);
					System.out.println(ch);
				}
			}
		}
	}
}

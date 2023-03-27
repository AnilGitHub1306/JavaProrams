package String;

public class CountTheTotalOvelAndConsonentInString 
{
	public static void main(String [] args)
	{
		String srt = "Hi my name is Shushant Sing Rajput";
		int Countovel=0;
		int CountCons=0;
		for(int i=0; i<srt.length();i++)
		{	
			if(srt.charAt(i)=='A' || srt.charAt(i)=='a' || 
			   srt.charAt(i)=='E' || srt.charAt(i)=='e' || 
			   srt.charAt(i)=='I' || srt.charAt(i)=='i' || 
			   srt.charAt(i)=='O' || srt.charAt(i)=='o' || 
			   srt.charAt(i)=='U' || srt.charAt(i)=='u')
			{Countovel++;}
			else 
			{CountCons++;}
		}
		System.out.println("Total ovels in String are - "+ Countovel++);
		System.out.println("Total consonents in String are - "+ CountCons++);
	}
}